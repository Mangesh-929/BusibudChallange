public static int SearchingChallenge(String[] stArr) {
    int numRows = stArr.length;
    int numCols = stArr[0].length();
    int[][] matrix = new int[numRows][numCols];
    int regionCount = 0;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            matrix[i][j] = stArr[i].charAt(j) - '0';
        }
    }


    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            if (matrix[i][j] == 0) {
                regionCount++;
                exploreRegion(matrix, i, j, numRows, numCols);
            }
        }
    }

    return regionCount;
}

private static void exploreRegion(int[][] matrix, int row, int col, int numRows, int numCols) {
    if (row < 0 || row >= numRows || col < 0 || col >= numCols || matrix[row][col] != 0) {
        return;
    }

    matrix[row][col] = -1;

  
    exploreRegion(matrix, row - 1, col, numRows, numCols); 
    exploreRegion(matrix, row + 1, col, numRows, numCols);
    exploreRegion(matrix, row, col - 1, numRows, numCols); 
    exploreRegion(matrix, row, col + 1, numRows, numCols); 
}
