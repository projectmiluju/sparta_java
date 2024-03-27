package level2;

import java.math.BigInteger;

public class Algo29 {

    public long solution(int w, int h) {

        if (w == h){
            return ((long) w*h)-w;
        }

        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);

    }

    public static void main(String[] args) {
        Algo29 algo29 = new Algo29();
        System.out.println(algo29.solution(8,12)); // 80
    }
}
