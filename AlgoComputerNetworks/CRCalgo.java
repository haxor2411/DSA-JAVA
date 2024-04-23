package AlgoComputerNetworks;

public class CRCalgo {

    public static int[] generateCRCTable(int polynomial) {
        int[] table = new int[256];
        for (int i = 0; i < 256; i++) {
            int crc = i;
            for (int j = 0; j < 8; j++) {
                if ((crc & 1) == 1) {
                    crc = (crc >>> 1) ^ polynomial;
                } else {
                    crc = (crc >>> 1);
                }
            }
            table[i] = crc;
        }
        return table;
    }

    public static int calculateCRC(int[] table, byte[] data) {
        int crc = 0;
        for (byte b : data) {
            crc = (crc >>> 8) ^ table[(crc ^ b) & 0xFF];
        }
        return crc;
    }

    public static void main(String[] args) {
        int polynomial = 0x1021; // generator polynomial
        int[] table = generateCRCTable(polynomial);

        byte[] data = "Hello, World!".getBytes();
        int crc = calculateCRC(table, data);

        System.out.println("CRC: " + Integer.toHexString(crc));
    }
}