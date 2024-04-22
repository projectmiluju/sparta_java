package level2;

import java.util.*;


public class Algo35 {
    public int[] solution(int[] fees, String[] records) {

        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer> feeMap = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            feeMap.put(records[i].split(" ")[1], 0);
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < feeMap.size(); i++) {
            list.add(feeMap.keySet().toArray()[i].toString());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < records.length; j++) {
                if (list.get(i).equals(records[j].split(" ")[1])){
                    map.put(records[j].split(" ")[2], records[j].split(" ")[0]);
                    if (map.containsKey("OUT")) {
                        if (!feeMap.containsKey(list.get(i))) {
                            feeMap.put(list.get(i), realtime(map.get("OUT")) - realtime(map.get("IN")));
                            map.clear();
                        }else {
                            feeMap.put(list.get(i), feeMap.get(list.get(i)) + realtime(map.get("OUT")) - realtime(map.get("IN")));
                            map.clear();
                        }
                    }
                }

            }
            if (map.containsKey("IN")){
                feeMap.put(list.get(i), realtime("23:59") + feeMap.get(list.get(i)) - realtime(map.get("IN")));
                map.clear();
            }

        }
        int[] answer = new int[feeMap.size()];
        List<String> keySet = new ArrayList<>(feeMap.keySet());
        Collections.sort(keySet);

        for (int i = 0; i < keySet.size(); i++) {
            for (int j = 0; j < feeMap.size(); j++) {
                if (keySet.get(i).equals(feeMap.keySet().toArray()[j])){

                    answer[i] = realfee(feeMap.get(feeMap.keySet().toArray()[j]),fees);
                }
            }
        }

        return answer;
    }

    public int realtime(String s) {
        int answer = (Integer.parseInt(s.split(":")[0])*60) + Integer.parseInt(s.split(":")[1]);
        return answer;
    }

    public int realfee(int a, int[] fees) {
        int answer = 0;
        if (a-fees[0] > 0) {
            if (((a-fees[0]) % fees[2]) !=0 ) {
                answer = fees[1] + (((a- fees[0])/fees[2])+1 )*fees[3];
            }else {
                answer = fees[1] + ((a- fees[0])/fees[2])*fees[3];
            }
        }else {
            answer = fees[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Algo35 algo35 = new Algo35();

        int[] fees1 = {180, 5000, 10, 600};
        String[] records1 = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        int[] result1 = {14600, 34400, 5000};
        System.out.println(Arrays.toString(algo35.solution(fees1, records1)));
        if (Arrays.equals(algo35.solution(fees1, records1), result1)) System.out.println("Y"); else System.out.println("N");

        int[] fees2 = {120, 0, 60, 591};
        String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        int[] result2 = {0, 591};
        System.out.println(Arrays.toString(algo35.solution(fees2, records2)));
        if (algo35.solution(fees2, records2) == result2) System.out.println("Y"); else System.out.println("N");

        int[] fees3 = {1, 461, 1, 10};
        String[] records3 = {"00:00 1234 IN"};
        int[] result3 = {14841};
        System.out.println(Arrays.toString(algo35.solution(fees3, records3)));
        if (algo35.solution(fees3, records3) == result3) System.out.println("Y"); else System.out.println("N");

    }
}
