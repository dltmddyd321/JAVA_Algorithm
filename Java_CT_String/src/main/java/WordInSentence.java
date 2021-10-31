import java.util.*;

class WordInSentence {
    public String solution(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos;

        /*String[] s = str.split(" ");
        for(String x : s) {
            //각 단어의 길이를 저장
            int len = x.length();

            //기존 최대 길이보다 더 긴 길이를 검사
            if(len > m) {
                m = len;
                answer = x;
            }
        }*/

        //띄어쓰기를 발견하지 못하면 -1 반환
        while ((pos = str.indexOf(" "))!= -1) {
            //0 ~ pos 전까지 자르기
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if(len>m) {
                m = len;
                answer = tmp;
            }

            //단어로 잘라낸 요소를 제외한 문장을 다시 생성
            str = str.substring(pos+1);
        }
        //마지막 단어가 가장 길 경우에 대한 예외처리
        if(str.length() > m)
            answer =str;

        return answer;
    }

    public static void main(String[] args) {
        WordInSentence W = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(W.solution(str));
    }
}