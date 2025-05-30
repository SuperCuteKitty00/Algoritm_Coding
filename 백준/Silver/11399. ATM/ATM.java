import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(time);
        
        for(int i = 1; i < N; i++) {
            time[i] += time[i - 1];
        }
        
        int totalTime = 0;
        for(int t : time) {
            totalTime += t;
        }
        
        System.out.println(totalTime);
    }
}
