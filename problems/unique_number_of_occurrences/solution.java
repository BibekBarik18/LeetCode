import java.util.Arrays;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] v = new int[arr.length];
        int[] vi = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;

            // Count occurrences of the current element
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }

            v[idx++] = cnt;
        }

        Arrays.sort(v);
        vi=Arrays.stream(v).filter(num -> num != 0).toArray();
        
        for (int i = 1; i < vi.length; i++) {
            if (vi[i] == vi[i - 1]) {
                return false;
            }
        }

        return true;
    }
}