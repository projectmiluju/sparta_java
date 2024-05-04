package level2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Algo46 {

    private static List<String> list = new ArrayList<>();

    public int solution(String[][] relation) {
        int answer = 0;

        int n = relation[0].length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i = 1; i <= n; i++){
            boolean[] visited = new boolean[n];
            combination(arr, n, i, 0, visited);
        }

        List<String> unique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isUnique(list.get(i), relation)){
                unique.add(list.get(i));
            }
        }

        List<String> minimum = new ArrayList<>(unique);
        for (int i = 0; i < unique.size(); i++) {
            String s = unique.get(i);
            for (int j = 0; j < unique.size(); j++) {
                String t = unique.get(j);

                if (s.equals(t)) {
                    continue;
                }
                int cnt = 0;
                for (char c : s.toCharArray()) {
                    if (t.contains(String.valueOf(c))) {
                        cnt++;
                    }
                }
                if (cnt == s.length()){
                    minimum.remove(t);
                }
            }
        }
        answer = minimum.size();
        return answer;
    }

    public boolean isUnique(String s, String[][] relation) {
        Set<String> set = new HashSet<>();
        for (String[] record : relation) {
            String value = "";
            for (char c : s.toCharArray()) {
                value += record[Integer.parseInt(String.valueOf(c))];
            }
            set.add(value);
        }
        if (set.size() == relation.length) {
            return true;
        }
        return false;
    }

    public void combination(int[] arr, int n, int r, int i, boolean[] visited) {
        if (i == r){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < visited.length; j++){
                if (visited[j]){
                    sb.append(arr[j]);
                }
            }
            if (!sb.isEmpty() && !list.contains(sb.toString())){
                list.add(sb.toString());
            }
            return;
        }
        visited[i] = true;
        combination(arr, n, r, i + 1, visited);
        visited[i] = false;
        combination(arr, n, r, i + 1, visited);
    }

    public static void main(String[] args) {
        Algo46 algo46 = new Algo46();

        String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        int res = 2;
        System.out.println(algo46.solution(relation));
        if (algo46.solution(relation) == res) System.out.println("Y"); else System.out.println("N");
    }
}
