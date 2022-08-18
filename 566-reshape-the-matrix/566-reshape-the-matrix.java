class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row*col != r*c){
        return mat;
        }
        int out[][] = new int[r][c];
        int x = 0;
        int y = 0;
        for(int i = 0; i < r;i++){
            for(int j = 0; j < c; j++){
                if(y == col){
                    x++;
                    y = 0;
                }
                
                out[i][j] = mat[x][y];
                y++;
            }
        }
        return out;
        
        
    }
}