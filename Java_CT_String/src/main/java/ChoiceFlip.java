import java.util.*;

class ChoiceFlip {
    //대문자는 소문자로, 소문자는 대문자로
    public String solution(String str) {
        String answer = "";

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt<rt) {
            //문자가 알파벳인지 판단
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        ChoiceFlip C = new ChoiceFlip();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(C.solution(str));
    }
}