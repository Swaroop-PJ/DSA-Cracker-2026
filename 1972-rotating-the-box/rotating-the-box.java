class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char matrix[][]=new char[n][m];
        for(int i=0;i<m;i++){
            int emptySlot=n-1;
            for(int j=n-1;j>=0;j--){
                int targetColumn=m-i-1;
                if(boxGrid[i][j]=='*'){
                    matrix[j][targetColumn]='*';

                    while(emptySlot>j){
                        matrix[emptySlot][targetColumn]='.';
                        emptySlot--;
                    }
                    emptySlot--;
                }
                else if(boxGrid[i][j]=='#'){
                    matrix[emptySlot][targetColumn]='#';
                    emptySlot--;
                }
            }
            while(emptySlot>=0){
                matrix[emptySlot][m-i-1]='.';
                emptySlot--;
            }
        }
        return matrix;
        
    }
}