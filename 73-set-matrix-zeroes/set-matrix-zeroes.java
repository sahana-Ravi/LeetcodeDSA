class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        List<Pair<Integer, Integer>> zeroPositions = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    zeroPositions.add(new Pair<Integer, Integer>(row, col));
                }
            }
        }

        for (Pair<Integer, Integer> positions : zeroPositions) {
            int row = positions.getKey();
            int col = positions.getValue();

            for (int x = 0; x < cols; x++) {
                matrix[row][x] = 0;
            }

            for (int y = 0; y < rows; y++) {
                matrix[y][col] = 0;
            }
        }
    }
}