import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] dp = new int[N];
    
    if(N <= 2) {
      System.out.println(N);
      return;
    }
    
    dp[0] = 1;
    dp[1] = 2;
    
    for(int i=2; i<N; i++) {
      dp[i] = (dp[i-1] + dp[i-2]) % 10007;
    }
    
    System.out.println(dp[N-1]);
  }
}