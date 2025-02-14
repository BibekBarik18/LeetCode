class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        // Try 4 different rotations (0°, 90°, 180°, 270°)
        for (int r = 0; r < 4; r++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            rotate90(mat); // Rotate mat by 90° clockwise
        }
        return false;
    }

    // Function to rotate matrix by 90 degrees (in-place)
    private void rotate90(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp;
            }
        }
    }

    private boolean areMatricesEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

