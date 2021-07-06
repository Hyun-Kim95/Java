# BufferedReader / BufferWriter

* 입출력 효율이 비교할 수 없을 정도로 좋아짐

* import java.io.BufferedReader; 

* import java.io.BufferedWriter; 

* import java.io.InputStreamReader; 

* import java.io.OutputStreamWriter;

  * Ctrl + Shift + O 누르면 알아서 import 됨

* BufferedReader

  * 엔터만 경계로 인식

  * 받은 데이터가 String으로 고정

  * Scanner 보다 빠름

  * 사용법

    ```java
    // 콘솔에서 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    // 형변환
    int num = Integer.parseInt(br.readLine());
    br.close();	// 입출력이 끝난 후 달아주기
    ```
    
  * 공백 단위로 데이터 나눠 받기

    ```java
    // 첫번째 방법
    StringTokenizer st = new StringTokenizer(s);//StringTokenizer인자값에 입력 문자열 넣음 int a = Integer.parseInt(st.nextToken()); //첫번째 호출
    int b = Integer.parseInt(st.nextToken()); //두번째 호출
    // 두번째 방법
    String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
    ```

* BufferWriter

  * 개행문자를 넣어줘야 줄바꿈이 됨

  * 사용법

    ```java
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("hello\n"); // 출력
    bw.newLine();	// 개행 즉 엔터 역할
    bw.write("I am writing\n");	// 개행과 함께 출력
    bw.flush();	// 남아있는 데이터를 모두 출력
    bw.close();	// 스트림
    ```

* 예제

  ```java
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
  		StringTokenizer st;
  		for(int i=1;i<=n;i++) {
  			st = new StringTokenizer(br.readLine());
  			bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
  		}
  		br.close();
  		bw.flush();
  		bw.close();
  	}
  }
  ```

  
