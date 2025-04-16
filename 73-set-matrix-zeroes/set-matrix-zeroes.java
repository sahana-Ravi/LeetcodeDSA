class Solution {

    public void zeros(int[][] matrix, int i, int j){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int k=0;k<c;k++){
            matrix[i][k] =0;
        }
        for(int k=0; k<r;k++){
            matrix[k][j] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
       int r = matrix.length;
       int c = matrix[0].length;
       Stack<Integer> a = new Stack<Integer>();
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(matrix[i][j] == 0){
                a.add(i);
                a.add(j);
            }
        }
       }
        while(a.size()>0){
           int y = a.pop();
           int x = a.pop();
           System.out.println(x);
           zeros(matrix, x,y);
        }
       }
}