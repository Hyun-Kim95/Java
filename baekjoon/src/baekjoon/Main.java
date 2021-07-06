package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;	// 공백 단위로 데이터 나눠받기
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());	// 공백 단위로 데이터 나눠받기
			bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		bw.flush();	// 남아있는 데이터를 모두 출력
		bw.close();
	}
}