import java.util.*;

class Kababo {
    public String solution(int n, int[] a, int[]b) {
        String answer = "";

        for(int i = 0; i<n; i++) {
            //비겼을 경우
            if(a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1&&b[i]==3) {
                //A가 이겼을 경우만 계산하고 나머지를 B의 승리로 취급
                answer += "A";
            } else if(a[i] == 2&&b[i]==1) {
                answer += "A";
            }else if(a[i] == 3&&b[i]==2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Kababo T = new Kababo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        //a가 낸 가위바위보 선택 배열
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        //b가 낸 가위바위보 선택 배열
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        //하나씩 결과 추출을 위해 charArray 변환 후 줄바꿈
        for( char x: T.solution(n,a,b).toCharArray()) System.out.println(x);
    }
}