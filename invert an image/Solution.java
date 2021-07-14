import java.util.Arrays;
import java.util.Scanner;

class Solution
{

    static int[][] flipAndInvertImage(int[][] image)
    {
        int start = 0;
        int length = image[0].length;
        int end = length-1;
        int temp = 0;
        for (int[] section : image) 
        {
            while(start - end <= 0)
            {
                temp = Math.abs(section[start]-1);
                section[start] = Math.abs(section[end]-1);
                section[end] = temp;
                start++;
                end--;
            }
            start = 0;
            end = length - 1;   
        }
        return image;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        image = flipAndInvertImage(image);
        for (int[] is : image) {
            System.out.println(Arrays.toString(is));
        }
    }
}