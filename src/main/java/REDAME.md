
<h1>JAVA 알고리즘 기본 문법</h1>

1. 입출력 (Input & Output) <br>

    ✅ 기본 출력 (print)
    ```angular2html
        System.out.println("Hello, World!");  // 줄바꿈 포함 출력
        System.out.print("Hello ");           // 줄바꿈 없이 출력
        System.out.printf("숫자: %d\n", 10);   // 형식 지정 출력
    ```

    ✅ 기본 입력 (Scanner 사용)
    ```angular2html
        import java.util.Scanner;  // Scanner 가져오기

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in); // Scanner 객체 생성
                int num = sc.nextInt(); // 정수 입력받기
                String str = sc.next(); // 단어 입력받기, 공백 전까지 한 단어 입력
                String line = sc.nextLine(); // 한 줄 입력받기, 엔터(줄바꿈)까지 한 줄 입력

                System.out.println("입력된 숫자: " + num);
                System.out.println("입력된 단어: " + str);
                System.out.println("입력된 문장: " + line);
            }
        }
    ```
   ✅ 기본 입력 (BufferReader 사용)
    ```angular2html
        import java.io.BufferedReader; // BufferedReader 가져오기
        import java.io.InputStreamReader;

        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
                
                // 정수 입력
                int num = Integer.parseInt(br.readLine()); 
                System.out.println("입력된 숫자: " + num);

                // 문자열 입력
                String str = br.readLine();
                System.out.println("입력된 문자열: " + str);
            }
        }
    ```
   - br.readLine() -> 한 줄 입력 받음(문자열 형태)
   - 숫자를 입력받을 땐 Integer.parseInt()를 사용해 문자열을 정수로 변환
   - 예외 처리를 위해 throw Exception 필요

2. 변수와 데이터 타입
   ```angular2html
        int num = 10;       // 정수
        double pi = 3.14;   // 실수
        boolean flag = true;// 참/거짓
        char letter = 'A';  // 문자
        String name = "Java"; // 문자열

        System.out.println(num + ", " + pi + ", " + flag + ", " + letter + ", " + name);
    ```
   
3. 조건문(if, switch)

   ✅ if-else 문
    ```angular2html
        int x = 10;
        if (x > 0) {
            System.out.println("양수");
        } else if (x < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0입니다");
        }
    ```
   
    ✅ switch 문
    ```angular2html
    int num = 2;
    switch (num) {
        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        default:
            System.out.println("Other");
    }
    ```
   - break를 써야 다음 case로 넘어가지 않음.

4. 반복문(for,while)

   ✅ for 문 (반복 횟수 지정)
    ```angular2html
    for (int i = 1; i <= 5; i++) {
        System.out.println("반복: " + i);
    }
    ```

   ✅ while 문 (조건 만족 시 반복 )
    ```angular2html
    int i = 1;
    while (i <= 5) {
        System.out.println("while 반복: " + i);
        i++;
    }
    ```
   
5. 배열과 리스트

   ✅ 배열(고정된 크기)
    ```angular2html
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(arr[0]); // 첫 번째 요소 출력
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    ```
   ✅ 리스트(가변 크기 - ArrayList)
    ```angular2html
    import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10); // 요소 추가
            list.add(20);
            list.remove(0); // 첫 번째 요소 삭제
    
            System.out.println(list.get(0)); // 첫 번째 요소 출력
            System.out.println("크기: " + list.size()); // 리스트 크기 출력
        }
    }

    ```
   
6. 문자열 다루기
   ```angular2html
   String s = "Hello, Java!";
   System.out.println(s.length());       // 문자열 길이
   System.out.println(s.charAt(0));      // 특정 문자 가져오기
   System.out.println(s.substring(0, 5)); // 부분 문자열
   System.out.println(s.toUpperCase());  // 대문자로 변환
   System.out.println(s.toLowerCase());  // 소문자로 변환
   System.out.println(s.replace("Java", "World")); // 문자열 치환
   ```
   
7. 함수(메서드)

   ✅ 기본 메서드
   ```angular2html
   public class Main {
    public static void main(String[] args) {
        sayHello(); // 함수 호출
        int sum = add(3, 5);
        System.out.println("합계: " + sum);
    }

    // 리턴값이 없는 함수
    public static void sayHello() {
        System.out.println("Hello!");
    }

    // 두 수의 합을 리턴하는 함수
    public static int add(int a, int b) {
        return a + b;
        }
   }
   ```
   
8. 정렬 (오름차순 정렬)
   ```angular2html
   import java.util.Arrays;
   public class Main {
        public static void main(String[] args) {
            int[] arr = {5, 2, 8, 1, 3};
            Arrays.sort(arr); // 배열 정렬
            System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 8]
        }
   }

   ```
   
9. 기본적인 수학 연산
   ```angular2html
   import java.util.Arrays;
   public class Main {
        public static void main(String[] args) {
            System.out.println(Math.max(10, 20)); // 큰 값 찾기
            System.out.println(Math.min(10, 20)); // 작은 값 찾기
            System.out.println(Math.abs(-5));     // 절대값
            System.out.println(Math.pow(2, 3));   // 2^3 = 8
            System.out.println(Math.sqrt(16));    // 제곱근 (4.0)
        }
   }

   ```