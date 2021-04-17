# 마크다운 활용

## 1. 헤더

* "#"의 갯수로 H1 ~ H6까지 크기지정 가능

  > ''# h1"
  >
  > "## h2"

## 2. 블럭인용문자

* ">" 를 이용하여 인용문자 사용

  > ">"
  >
  > > ">>"

## 3. 목록

1. 순서있는 목록

   * 숫자. 으로 사용

     > 1. 첫번째
     > 2. 두번째

2. 순서없는 목록

   * *, +, - 로 사용

     > * 별
     >   + 더하기
     >     - 빼기

## 4. 코드블럭

* " ``` " + " 언어이름 " 으로 사용

  > "```python"
  >
  > ```python
  > print("Hello World..!!!")
  > ```
  >
  > "```java"
  >
  > ```java
  > public class haha{
  >  public class void main(String[] args){
  >      System.out.println("Hello World..!!!")
  >  }
  > }
  > ```

## 5. 수평선

> "*" x 3
>
> ***
>
> "*" X 5
>
> *****
>
> "---" X ?
>
> ---

## 6. 링크

1. 참조링크

   > Link: [Google] [googlelink]	(사이 띄어쓰기 없애면 됨)
   >
   > [googlelink]: https://google.com "Go google"
   >
   > Link: [Google][googlelink]
   >
   > [googlelink]: https://google.com "Go google"
   >
   > 

2. 외부링크

   > [Title] (link, "링크설명")
   >
   > [Google](https://google.com, "google link")

3. 자동연결

   * 외부링크: <주소>

     >  <http://example.com/>

   * 이메일링크: <이메일>

     > <address@example.com>

## 7. 강조

* 글자 앞뒤로 넣어주기: *, _, **, __, ~~

  > *별1*
  >
  > _언더바1_
  >
  > **별2**
  >
  > __언더바2__
  >
  > ~~물결2~~

## 8. 이미지

* ![제목 없음3] (C:\Users\User\Desktop\새 폴더\제목 없음3.png)

* > ![제목 없음3](https://user-images.githubusercontent.com/75933619/115117922-de3b1400-9fdb-11eb-8456-80445b11c5b2.png)

* 사이즈 조절 기능은 없음

  * ```
    <img src="C:\Users\User\Desktop\새 폴더\제목 없음3.png" width="350px" height="200px" title="px(픽셀) 크기 설정" alt="hoho"></img><br/>
    ```

  * <img src="https://user-images.githubusercontent.com/75933619/115117922-de3b1400-9fdb-11eb-8456-80445b11c5b2.png" width="350px" height="200px" title="px(픽셀) 크기 설정" alt="hoho"></img> 

### Issues 에서 New Issues에 이미지 드롭해 놓으면 나오는 주소를 이미지 주소로 사용하면 됨

### 크기 조절에는 주소부분에 붙혀넣고 앞에 ![제목없음] 이랑 전체 괄호 없애주면 됨

## 9. 줄바꿈

* 문장 마지막 칸에서 3칸 이상 띄어쓰기를 하면 줄이 바뀜

  > 문장 마지막.   이렇게
