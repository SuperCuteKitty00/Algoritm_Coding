import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] paper;	
	static int white = 0;
	static int blue = 0;
	
	public static boolean checkColor(int row, int col, int size) {
		int color = paper[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(color != paper[i][j]) return false;
			}
		}
		return true;
	}
	
	public static void divide(int row, int col, int size) {
		if(checkColor(row, col, size)) {
			if(paper[row][col] == 0) white++;
			else blue++;
			return ;
		}
		
		int newSize = size / 2;
		divide(row, col, newSize);
		divide(row, col + newSize, newSize);
		divide(row + newSize, col, newSize);
		divide(row + newSize, col + newSize, newSize);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}

}