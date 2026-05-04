class Solution {
    public void rotate(int[][] matrix) {
        int length=matrix.length;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                int c=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=c;
            }
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length/2;j++){
                int c=matrix[i][j];
                matrix[i][j]=matrix[i][length-j-1];
                matrix[i][length-j-1]=c;
            }
        }

        
    }
}
