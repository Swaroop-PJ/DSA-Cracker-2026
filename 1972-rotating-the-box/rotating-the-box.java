class Solution {
    char[][] rotateClockwise(char [][]Matrix){
        char [][]T_matrix=new char[Matrix[0].length][Matrix.length];
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                T_matrix[j][i]=Matrix[i][j];
            }
        }
        for(int i=0;i<T_matrix.length;i++){
            for(int j=0;j<T_matrix[0].length/2;j++){
                char tmp=T_matrix[i][j];
                T_matrix[i][j]=T_matrix[i][T_matrix[0].length-j-1];
                T_matrix[i][T_matrix[0].length-j-1]=tmp;
            }
        }
        return T_matrix;
    }
    public char[][] rotateTheBox(char[][] boxGrid) {
        char T[][]=rotateClockwise(boxGrid);
        for(int j=0;j<T[0].length;j++){
            int i,emptyslot;
            i=emptyslot=T.length-1;
            for(;i>=0;i--){
                if(T[i][j]=='*') emptyslot=i-1;
                else if(T[i][j]=='#'){
                    char tmp= T[emptyslot][j];
                    T[emptyslot][j]=T[i][j];
                    T[i][j]=tmp;
                    emptyslot--;
                }
            }
        }
        return T;
    }
}