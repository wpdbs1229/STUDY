import java.util.ArrayList;

class practiceSet {

    ArrayList<Integer> list = new ArrayList<>();

    practiceSet(int[] arr){
        for (int num : arr)
            this.list.add(num);
    }


    public void add(int num){

        //중복 방지
        if(this.list.contains(num))
            return;
        else
            this.list.add(num);
    }

    //교집합
    public ArrayList<Integer> intersection(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();

        //list를 순회하다가, 같은 값이 존재하면 result에 삽입
        for (int num : list) {
            if (this.list.contains(num)){
              result.add(num);
            }
        }

        return result;
    }

    //합집합
    public ArrayList<Integer> union(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        //add 에서 알아서 중복을 제거하기 때문에 this.list에 삽입
        for (int num : this.list){
            result.add(num);
        }

        for (int num : list){
            result.add(num);
        }
        return result;
    }


    //차집합
    public ArrayList<Integer> Difference(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : this.list){
            result.add(num);
        }

        for (Object num : list){

            /*
            num이 Object형인 이유는 ArrayList의 remove는 Object o 넘겨줄시 해당 객체를 삭제하지만,
            int index를 넘겨줄시 해당하는 주소의 객체를 삭제하기 때문에, Object로 사용했다.
             */
            if (result.contains(num))
               result.remove(num);

        }

        return result;
    }

}

public class Set {
    public static void main(String[] args) {
        practiceSet listA = new practiceSet(new int[]{1,2,3,4,5,6});
        practiceSet listB = new practiceSet(new int[]{1,3,5,7,9,11});


        System.out.println(listA.list);

        System.out.println("-----교집합-----");
        System.out.println(listA.intersection(listB.list));
        System.out.println("-----합집합-----");
        System.out.println(listA.union(listB.list));
        System.out.println("-----차집합-----");
        System.out.println(listA.Difference(listB.list));


    }


}