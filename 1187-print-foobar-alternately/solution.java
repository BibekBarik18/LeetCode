class FooBar {
    private int n;
    private boolean fooTurn = true; // A flag to alternate between "foo" and "bar"

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!fooTurn) { // Wait if it's not foo's turn
                wait();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            fooTurn = false; // Set the turn to bar
            notify();        // Notify the other thread
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (fooTurn) { // Wait if it's not bar's turn
                wait();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooTurn = true; // Set the turn to foo
            notify();       // Notify the other thread
        }
    }
}

