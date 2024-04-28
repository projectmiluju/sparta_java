package level2;


import java.util.*;

public class Algo39 {

    static HashMap<String, List<Integer>> map;

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        map = new HashMap<>();

        for (String s : info) {
            String[] infoStr = s.split(" ");
            infoCase(infoStr, "", 0);
        }

        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }


        for (int i = 0; i < query.length; i++) {
            query[i] = query[i].replaceAll(" and ", "");
            String[] queryStr = query[i].split(" ");

            answer[i] = map.containsKey(queryStr[0]) ? binarySearch(queryStr[0], Integer.parseInt(queryStr[1])) : 0;
        }

        return answer;
    }

    public static int binarySearch(String key, int score) {
        List<Integer> list = map.get(key);
        int start = 0, end = list.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return list.size() - start;
    }

    public static void infoCase(String[] infoStr, String str, int cnt){
        if (cnt == 4){
            if (!map.containsKey(str)){
                List<Integer> list = new ArrayList<>();
                map.put(str, list);
            }
            map.get(str).add(Integer.parseInt(infoStr[4]));
            return;
        }
        infoCase(infoStr, str + "-", cnt+1);
        infoCase(infoStr, str + infoStr[cnt], cnt+1);
    }

    public static void main(String[] args) {
        Algo39 algo39 = new Algo39();

        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        System.out.println(Arrays.toString(algo39.solution(info, query)));
        if (Arrays.equals(algo39.solution(info, query), new int[]{1, 1, 1, 1, 2, 4})) System.out.println('Y');
            else System.out.println("N");
    }
}
