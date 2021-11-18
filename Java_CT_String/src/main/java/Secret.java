import java.util.Scanner;

class Secret {
    public String solution(int n ,String str) {
        String answer = "";

        for(int i =0; i<n; i++) {
            //문자열을 추출하고 각 부분을 변경
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');

            //2진수를 10진수로 변환
            int num = Integer.parseInt(tmp, 2);

            answer += (char)num;

            //뒤의 이어진 부분도 계속 출력되도록 설정
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Secret S = new Secret();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.nextLine();
        System.out.print(S.solution(n, str));
    }
}