/* Given matrix, a rectangular matrix of integers...add up all the values that don't appear below a 0 */


int solution(int[][] matrix) {
    
    int sum = 0;
    for (int j = 0; j < matrix[0].length; j++) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] == 0) {
                break;
            }
            sum += matrix[i][j];
        }
    }
    
    return sum;

      
}
