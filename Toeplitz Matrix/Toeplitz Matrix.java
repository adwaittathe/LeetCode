class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      int height = matrix.length;
    int width = matrix[0].length;
    for (int i = 1 - height; i < width; i++) {
        int x = i > 0 ? i : 0;
        int y = i < 0 ? -i : 0;
        while (x < width - 1 && y < height - 1) {
            if (matrix[y + 1][x + 1] != matrix[y++][x++]) {
                return false;
            }
        }
    }
    return true;
    }
}   