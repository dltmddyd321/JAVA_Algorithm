import java.util.Scanner;

class MostShort {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int p = 1000;

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p ++;

                answer[i] = p;
            }
        }

        p=1000;
        for(int i= str.length() -1; i>= 0; i--) {
            if(str.charAt(i) == c) {
                p = 0;
            } else {
                p ++;

                //기존 값과 새로운 값 중 작은 값을 넣기
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MostShort M = new MostShort();

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        //문자 1개 읽기
        char c = sc.next().charAt(0);

        for(int x: M.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}