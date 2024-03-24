package LV_0.배열만들기6;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> rowMap = new HashMap<>();// 문자와 행 위치(키보드 위치)
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                rowMap.put(c, i);
            }
        }
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (isValidWord(word.toLowerCase(), rowMap)) {
                result.add(word);
            }
        }
        List<String> list = Arrays.asList("홍길동","신용권","감자바");
        Stream<String> stream = list.stream();
        stream.forEach( name -> System.out.println(name));
        return result.toArray(new String[0]);
    }

    // 단어가 한 행에 속하는지 확인하는 함수
    private static boolean isValidWord(String word, HashMap<Character, Integer> rowMap) {

        int row = rowMap.get(word.charAt(0)); // 문자열의 첫번째 글자의 위치 가져오기
        for (char c : word.toCharArray()) {
            if (rowMap.get(c) != row) {
                return false; // 현재 글자의 저장된 위치와 첫 글자의 위치가 다를 경우
            }
        }

        return true; // 모든 글자가 같은 위치
    }
//        HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
//        map.put(1,List.of("q","w","e","r","t","y","u","i","o","p"));
//        map.put(2,List.of("a","s","d","f","g","h","j","k","l"));
//        map.put(3,List.of("z","x","c","v","b","n","m"));
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            boolean flag = true;
//            String lowerCase = words[i].toLowerCase();
//            System.out.println("문자 : " + lowerCase);
//            for (int j = 0; j < lowerCase.length(); j++) {
//                String word = String.valueOf(lowerCase.charAt(i));
//                for (int k = 1; k <= map.size(); k++) {
//                    if (!map.get(k).contains(word)) {
//                        flag = false;
//                        break;
//                    } else {
//                        flag = true;
//                    }
//                }
//                if (!flag) break;
//            }
//            if (flag) result.add(words[i]);
//        }
//        System.out.println(result);
//        return result.toArray(new String[0])

    public static void main(String[] args) {
        Test T = new Test();
        String[] words1 = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(T.findWords(words1)));
    }
}
