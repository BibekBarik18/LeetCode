class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length/2;j++){
                int t=image[i][j];
                image[i][j]=image[i][image[0].length-j-1];
                image[i][image[0].length-j-1]=t;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                image[i][j]=1-image[i][j];
            }
        }
        return image;
    }
}
