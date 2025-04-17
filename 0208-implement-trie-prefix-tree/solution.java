class Node{
    Node[] trie;
    boolean flag;

    public Node() {
        trie = new Node[26];
        flag = false;
    }

    boolean contains(char a){
        if(trie[a-'a']==null)
        return false;
        return true;
    }
    void add(char a,Node node){
        trie[a-97]=node;
    }
    Node get(char a){
        return trie[a-97];
    }
}
class Trie {
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            if(!temp.contains(a))
            temp.add(a,new Node());
            temp=temp.get(a);
        }
        temp.flag=true;
    }
    
    public boolean search(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char a=word.charAt(i);
            if(!temp.contains(a)) return false;
            temp=temp.get(a);
        }
        return temp.flag;
    }
    
    public boolean startsWith(String prefix) {
        Node temp=root;
        for(int i=0;i<prefix.length();i++){
            char a=prefix.charAt(i);
            if(!temp.contains(a)) return false;
            temp=temp.get(a);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
