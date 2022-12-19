// Practice1
// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순성 o, 중복 x)의 각 결과를 출력하시오!

import java.util.Arrays;

public class permutationPractice {

    //-------------------solution 1---------------------

    //depth는 자릿수를 뜻함
    void solution1(int[] arr, int depth, int n, int r){

        // 재귀함수의 탈출 조건
        if(depth == r){
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        // 재귀를 이용해 sawp을 진행하면서 바꾸기.
        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            solution1(arr, depth + 1, n ,r);
            swap(arr, depth, i);
        }
    }

    void swap(int[] arr, int depth, int idx){
        int tmp = arr[depth];
        arr[depth] =arr[idx];
        arr[idx] = tmp;
    }


    // ----------------------solution2-----------------------------
    void solution2 (int[] arr, int depth, int n, int r, boolean[] visited, int[] out){
        // 재귀함수 탈출 조건
        if(depth ==r) {
            System.out.println(Arrays.toString(out));
            return;
        }

        // visited 배열을 기준으로 방문했을 때, 출력
        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                solution2(arr, depth+1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        // Test code
        int[] arr ={1, 2, 3, 4};
        int n = 4;
        int r = 3;
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        permutationPractice p = new permutationPractice();
        p.solution1(arr,0,n, r);
        p.solution2(arr,0, n, r, visited, out);

    }
}


