import java.util.Scanner;

class Oapchuk {
    public String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;

        for(int i =0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt ++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Oapchuk O = new Oapchuk();

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.print(O.solution(str));
    }
}