import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N == 1) {
      System.out.println(1);
      return;
    } else if(N == 2) {
      System.out.println(3);
      return;
    }
    
    int[] dp = new int[N+1];
    dp[1] = 1;
    dp[2] = 3;
    
    for(int i=3; i<=N; i++) {
      dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
    }
    
    System.out.println(dp[N]);
  }
}