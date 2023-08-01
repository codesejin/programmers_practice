package LV_1.같은숫자는싫어;

import java.util.Stack;

public class Solution2 {
    // stack 풀이
    public int[] solution(int [] arr) {

        Stack<Integer> stack = new Stack<>();

        // arr의 크기 만큼 반복하면서 스택의 마지막으로 들어간 숫자를 확인(peek)하여
        // 이전에 들어간 숫자와 같지 않으면 스택에 쌓아준다 (push)
        for (int i = 0; i < arr.length; i++) {
            // 주의 : stack에 값이 없는 상태에서 peek()메소드 사용시 Exception발생하기에 사이즈 체크 조건을 사용
            if (stack.size() == 0 || arr[i] != stack.peek()) stack.push(arr[i]);
        }
        // return 할 answer배열의 사이즈를 스택의 크기로 생성한다
        int [] answer = new int[stack.size()];

        // 생성된 배열에 마지막 idx부터 데이터를 set한다
        // 스택은 후입선출의 선행구조를 가지고 있기에 pop()은 최상위 요소롤 반환한다
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
