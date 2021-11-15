import java.util.Scanner;

class Palindrome {
    public String solution(String str) {
        String answer = "NO";

        //str의 모든 요소를 대문자로 변경 후, A-Z 값이 아닌 것들을 모두 "" 처리
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        //뒤집어진 문자열 변수 생성
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome P = new Palindrome();

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(P.solution(str));
    }
}