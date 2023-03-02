import java.util.HashMap;

public class MorseCode {
    //프로그래머스 : 모스부호
    public static String solution(String letter) {
        String answer = "";
        String[] morse = {
                ".-","a",
                "-...","b",
                "-.-.","c",
                "-..","d",
                ".","e",
                "..-.","f",
                "--.","g",
                "....","h",
                "..","i",
                ".---","j",
                "-.-","k",
                ".-..","l",
                "--","m",
                "-.","n",
                "---","o",
                ".--.","p",
                "--.-","q",
                ".-.","r",
                "...","s",
                "-","t",
                "..-","u",
                "...-","v",
                ".--","w",
                "-..-","x",
                "-.--","y",
                "--..","z"
                };
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i< morse.length-1; i +=2){
            map.put(morse[i],morse[i+1] );
        }

        for (String item : letter.split(" ")){
            answer += map.get(item);
        }
        return answer;
    }

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }
}
