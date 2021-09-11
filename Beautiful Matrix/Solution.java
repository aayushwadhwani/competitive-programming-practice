import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) 
    {
        int[][] arr = new int[5][5];
        int row = 0; 
        int col = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1){
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(Math.abs(3-row)+ Math.abs(3-col));
    }
}