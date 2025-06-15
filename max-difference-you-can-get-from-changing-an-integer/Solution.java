import java.util.ArrayList;

public class Solution {
    public static int maxDiff(int num) {
        int temp = num;
        ArrayList<Integer> decimals = new ArrayList<>();

        while(temp != 0) {
            decimals.add(temp%10);
            temp = temp/10;
        }

        int smallest = -1;
        int largest = -1;

        for(int i=decimals.size()-1; i>=0; i--) {
            int num1 = decimals.get(i);
            if(largest == -1 && num1 != 9) {
                largest = num1;
            }
            if(smallest == -1) {
                if(decimals.size()-1 == i) {
                    if(num1 != 1)
                        smallest = num1;       
                } else {
                    if(num1 != 0 && largest != num1)
                        smallest = num1;
                }
            }
            if(smallest != -1 && largest != -1) {
                break;
            }
        }

        if(smallest == -1) {
            smallest = 1;
        }

        if(largest == -1) {
            largest = 9;
        }

        
        int largestdecimal = 9;
        int smallestdecimal = 0;
        if(smallest == largest || decimals.get(decimals.size()-1) == smallest) {
            smallestdecimal = 1;
        }

        for(int i=0; i<decimals.size(); i++) {
            int num1 = decimals.get(i);
            if(num1 != smallest && num1 != largest) {
                decimals.set(i,0);
            } else if(largest == smallest) {
                decimals.set(i,8);
            }else if(smallest == num1) {
                decimals.set(i,num1-smallestdecimal);
            }else if(largest == num1) {
                decimals.set(i,largestdecimal-num1);
            }
        }

        int ans = 0;
        for(int i=0; i<decimals.size();i++) {
            ans += decimals.get(i)*Math.pow(10,i);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(123456));
    }
}
