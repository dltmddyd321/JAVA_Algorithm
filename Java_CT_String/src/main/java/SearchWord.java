import java.util.Locale;
import java.util.Scanner;

class SearchWord {
    public int solution(String str, char t) {
        int answer = 0;

        //대소문자의 구분 처리를 없애기 위해 모두 대문자로 통일
        str = str.toUpperCase();

        //문자 한 개를 대문자로 변경
        t = Character.toUpperCase(t);

        //첫 번째 풀이 : 전체 문자열을 순회하고 각 요소가 t와 일치하는 검사
        /*for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == t) {
                //일치한다면 Cnt 증가
                answer += 1;
            }
        }*/

        //forEach 구문 검사
        //toCharArray -> 문자열을 문자 요소로 나누어 배열로 변환
        for(char x : str.toCharArray())
            if(x == t) {
                answer += 1;
            }

        return answer;
    }


    public static void main(String[] args){
        SearchWord S = new SearchWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.print(S.solution(str, ch));
    }
}