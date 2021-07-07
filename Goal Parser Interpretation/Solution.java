import java.util.Scanner;

public class Solution
{
    public static String interpret(String command)
    {
        String answer = "";
        int length = 0, commandLength = command.length();

        while(length < commandLength )
        {
            if(command.charAt(length) == '(' && command.charAt(length+1) == ')')
            {
                answer += "o";
                length += 2;
            }
            else if(command.charAt(length) == '(' && command.charAt(length+1) == 'a')
            {
                answer += "al";
                length += 4;
            }
            else
            {
                answer += "G";
                length++;
            }
        }
        return answer;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        System.out.println(interpret(command));   
    }
}