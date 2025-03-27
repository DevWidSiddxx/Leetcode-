class Solution {
    public void setZeroes(int[][] matrix) {
        int rowlength=matrix.length;
        int columnlength=matrix[0].length;

        int[] row = new int[rowlength];
        int[] col=new int[columnlength];

        for(int i=0;i<rowlength;i++){
            for(int j=0;j<columnlength;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<columnlength;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
