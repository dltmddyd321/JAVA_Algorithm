import java.util.Scanner;

class OverlapDelete {
    public String solution(String str) {
        String answer = "";

        for(int i=0; i<str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        OverlapDelete O = new OverlapDelete();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.print(O.solution(str));
    }
}