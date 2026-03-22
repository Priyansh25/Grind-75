package graphs.easy.floodFill;

import java.util.Arrays;

class Solution {
    public void util(int[][] image, int row, int col, int color, int value,int m,int n){
        if(row < 0 || row > m-1 || col < 0 || col > n-1)return;
        if(image[row][col]==color)return;
        if(image[row][col]==value){
            image[row][col]=color;
            util(image,row,col+1,color,value,m,n);
            util(image,row+1,col,color,value,m,n);
            util(image,row,col-1,color,value,m,n);
            util(image,row-1,col,color,value,m,n);
        }
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        util(image,sr,sc,color,image[sr][sc],image.length,image[0].length);
        return image;

    }

    public static void main() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println("Output Image "+ Arrays.deepToString(new Solution().floodFill(image, sr, sc, color)));

    }
}