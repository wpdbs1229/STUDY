import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1931 {

    static class Time implements Comparable<Time>{
        int start;
        int end;

        public Time(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o){
            if(this.end == o.end) return this.start - o.start; //자기자신이 앞에오면, 내림차순, 파라미터가 앞에오면 내림차순
            else return this.end - o.end;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());

        ArrayList<Time> timeList = new ArrayList<>();
        for (int i = 0; i <size; i++) {
            st = new StringTokenizer(br.readLine()," ");
            Time time = new Time(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            timeList.add(time);
       }
        Collections.sort(timeList);

        int count = 0;
        int prev_end_time =0;
        for (int i = 0; i <size; i++) {

            if (prev_end_time <= timeList.get(i).start){
                prev_end_time = timeList.get(i).end;
                count++;
            }

        }
        System.out.println(count);
    }
}
