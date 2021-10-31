import java.util.*;

class UpperLower {
    //대문자는 소문자로, 소문자는 대문자로
    public String solution(String str) {
        String answer = "";

        //문자열 요소를 나누어 배열로 변환
        for(char x: str.toCharArray()) {
            //isLowerCase 또는 isUpperCase 통해 대소문자 판별 가능
            /*if(Character.isLowerCase(x))
                answer += Character.toUpperCase(x);
            else
                answer += Character.toLowerCase(x); */

            //아스키코드 값을 이용한 풀이
            //소문자라면
            if(x>=97 && x<=122) {
                answer += (char)(x-32);
            }
            else {
                answer += (char)(x+32);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        UpperLower U = new UpperLower();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(U.solution(str));
    }
}