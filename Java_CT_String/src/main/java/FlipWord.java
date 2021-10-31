import java.util.*;

class FlipWord {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        /*for(String x :str) {
            //StringBuilder 통해 문자 요소를 받아 역순으로 바꾸고 저장
            String tmp = new StringBuilder(x).reverse().toString();

            //answer ArrayList에 저장
            answer.add(tmp);
        } */

        for(String x: str) {
            char[] s = x.toCharArray();

            int lt = 0, rt = x.length() -1;

            //문자 위치가 서로 반전될때까지 반복
            while (lt<rt) {
                //값 교환
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                //값 교환에 따른 증감 처리
                lt += 1;
                rt -= 1;
            }
            //배열을 다시 문자열로 변환
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipWord F = new FlipWord();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];

        //입력된 값 n 만큼 배열에 요소를 입력
        for(int i = 0; i<n; i++) {
            str[i] = sc.next();
        }
        for(String x: F.solution(str)) {
            System.out.println(x);
        }

    }
}