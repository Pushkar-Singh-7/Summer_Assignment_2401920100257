class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a=mat.length;
        int b=mat[0].length;
        if(a*b!=r*c)
        return mat;
        int[][]reshaped = new int[r][c];
        int count = 0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++)
            {
                reshaped[count/c][count%c]=mat[i][j];//hint
                count ++;            }
        }
        return reshaped;
    }
}
