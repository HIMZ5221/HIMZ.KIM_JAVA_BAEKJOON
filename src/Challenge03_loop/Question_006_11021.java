package Challenge03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Question_006_11021 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))).append('\n');
		}
		br.close();
        
		System.out.println(sb);
		
	}
}