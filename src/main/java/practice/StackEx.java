package practice;
// 스택의 특징
//후입선출 (LIFO : Last In First Out) 구조 : 먼저 들어온 데이터가 나중에 빠져나가는 구조
//단방향 입출력 구조 : 데이터의 들어오는 방향과 나가는 방향이 같다.
//데이터를 하나씩만 넣고 뺄 수 있다.
//깊이 우선 탐색(DFS)에 이용된다.
//재귀 함수의 동작 흐름과 같은 구조를 가진다. //

import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer>  stackInt = new Stack<>();
//        Stack<String> stackStr = new Stack<>();
//        Stack<Boolean> stackBool = new Stack<>();

        // 값 추가 push()
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        // 1, 2, 3 순으로 값 추가

        // 값 제거
        stackInt.pop();
        stackInt.pop();
//        stackInt.pop();
        // 3, 2, 1 순으로 값 제거

        // 값 추가 add()
//        stackInt.add(1);
//        stackInt.add(2);
//        stackInt.add(3);
        // 1, 2, 3 순으로 값 추가

        // 값 모두 제거
//        stackInt.clear();
        System.out.println(stackInt);
    }
}
