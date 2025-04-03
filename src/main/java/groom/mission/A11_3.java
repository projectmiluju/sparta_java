package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//아이템 교환
public class A11_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        String[] goorm = br.readLine().split(" ");
        Set<String> setGoorm = new HashSet<>(Arrays.asList(goorm).subList(0, N));

        String[] friend = br.readLine().split(" ");
        Set<String> setFriend = new HashSet<>(Arrays.asList(friend).subList(0, N));


        String[] item;
        for (int i = 0; i < M; i++) {
            item = br.readLine().split(" ");
            String a = item[0];
            String b = item[1];

            if (setGoorm.contains(a) && setFriend.contains(b)) {

                setGoorm.remove(a);
                setFriend.remove(b);

                setGoorm.add(b);
                setFriend.add(a);
            }
        }

        List<String> itemList = new ArrayList<>(setGoorm);
        Collections.sort(itemList);

        for (String s : itemList) {
            System.out.print(s + " ");
        }


    }
}
