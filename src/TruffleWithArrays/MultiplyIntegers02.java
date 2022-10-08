package TruffleWithArrays;

import java.util.Arrays;

public class MultiplyIntegers02 {
    public static void main(String[] args) {
        int a = 456, b = 345;
        int n = Integer.toString(a).length() + Integer.toString(b).length();
        int[] ans = new int[n];
        int g = 0;
        while(a > 0){
            int[] buff = solution(a % 10, b);
            a = a / 10;

            for (int i = buff.length - 1, j = ans.length - 1; i >= 0 ; i--, j--) {
                ans[j - g] += buff[i];

            }
            g++;
        }
        System.out.println(Arrays.toString(ans));

        int c = 0;
        for (int i = ans.length - 1; i >= 0; i--) {
            int d = (ans[i]) / 10;
            ans[i] = (ans[i] + c) % 10;
            c = d;
        }

        System.out.println(Arrays.toString(ans));
    }
    public static int[] solution(int x, int y) {
        int n = Integer.toString(y).length() + 1; 
        int[] ans = new int[n]; int c = 0, i = n - 1;

        while(y > 0) {
            int t = y % 10; y = y / 10;
            ans[i--] = (x * t + c) % 10;
            c = (x * t + c) / 10;
            // System.out.println(ans);
        }
        return ans;
        
    }
}
