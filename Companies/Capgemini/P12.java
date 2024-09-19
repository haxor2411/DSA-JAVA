package Companies.Capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();
        int minDiscount = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            String parts[] = new String[3];
            String line = sc.nextLine();

            parts = line.split(",");

            int amt = Integer.parseInt(parts[1]);
            int discount = Integer.parseInt(parts[2]);

            int less = (amt * discount) / 100;
            minDiscount = Math.min(minDiscount, less);

            hm.put(parts[0], less);
        }

        sc.close();

        System.out.println(hm);

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() == minDiscount) System.out.println(entry.getKey());
        }
    }
}
