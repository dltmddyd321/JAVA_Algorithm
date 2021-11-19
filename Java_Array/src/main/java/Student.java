import java.util.*;

class Student {
    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];

        for(int i = 1; i<n; i++) {
            //뒤 학생이 앞 학생보다 키가 크다면
            if(arr[i]> max) {
                //cnt 증가
                answer ++;

                //다음 학생으로 이동
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Student T = new Student();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}