import java.util.Scanner;

public class Solution
{
    public static String restoreString(String s, int[] indices)
    {
        char[] answer = new char[s.length()];
        for(int i=0; i<indices.length; i++)
        {
            answer[indices[i]] = s.charAt(i);
        }
        return new String(answer);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int indices[] = new int[s.length()];
        for(int i=0; i<indices.length; i++)
        {
            indices[i] = sc.nextInt();
        }
        System.out.println(restoreString(s, indices));
    }
}