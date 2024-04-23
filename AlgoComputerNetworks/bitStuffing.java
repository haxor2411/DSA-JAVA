package AlgoComputerNetworks;
public class bitStuffing {

    public static String BitStuffing(String data) {
        StringBuilder stuffedData = new StringBuilder();
        int count = 0;

        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                count++;
            } else {
                count = 0;
            }
            stuffedData.append(bit);
            if (count == 5) {
                stuffedData.append('0');
                count = 0;
            }
        }

        return stuffedData.toString();
    }

    public static void main(String[] args) {
        System.out.println(BitStuffing("11111111111111"));
    }
}