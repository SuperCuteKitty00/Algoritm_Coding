import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferdWriter bw = new BufferdWriter(new OutputStreamWriter(System.out));
    
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    int[] dp = new int[N];
    for(int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    if(N == 1) {
      System.out.println(arr[0]);
      return;
    }
    if(N == 2) {
      System.out.println(arr[0] + arr[1]);
      return;
    }
    
    dp[0] = arr[0];
    dp[1] = arr[0] + arr[1];
    dp[2] = Math.max(dp[1], Math.max(arr[0] + arr[2], arr[1] + arr[2]));
    
    for(int i=3; i<N; i++) {
      dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]));
    }
    
    System.out.println(dp[N-1]);
  }
}