package AlgoComputerNetworks;

import java.util.Arrays;
import java.util.Scanner;

public class HammingCode {

    public static int[] encode(int[] data) {
        int encodedLength = data.length + (data.length + 1) / 2;
        int[] encoded = new int[encodedLength];
        int k = 0;
        for (int i = 0; i < data.length; i += 2) {
            encoded[k++] = data[i];
            if (i + 1 < data.length) {
                encoded[k++] = data[i + 1];
                // Add parity bit for every two bits
                encoded[k++] = data[i] ^ data[i + 1];
            } else {
                // Only one data bit left, no parity added
                encoded[k++] = data[i];
            }
        }
        return encoded;
    }

    public static int[] decode(int[] encoded) {
        int dataSize = (2 * encoded.length) / 3;
        int[] data = new int[dataSize];
        int j = 0;
        for (int i = 0; i < encoded.length; i += 3) {
            data[j++] = encoded[i];
            if (i + 1 < encoded.length) {
                data[j++] = encoded[i + 1];
                // Assuming no errors for simplicity
            }
        }
        return data;
    }

    public static void detectError(int[] encoded, int[] received) {
        if (Arrays.equals(encoded, received)) {
            System.out.println("No errors detected.");
        } else {
            System.out.println("Error detected in received data!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the data bits (as a space-separated sequence):");
        String[] dataInput = scanner.nextLine().split(" ");
        int[] data = new int[dataInput.length];
        for (int i = 0; i < dataInput.length; i++) {
            data[i] = Integer.parseInt(dataInput[i]);
        }

        int[] encoded = encode(data);
        System.out.println("Encoded Data: " + Arrays.toString(encoded));

        System.out.println("Enter the received data (as a space-separated sequence):");
        String[] receivedInput = scanner.nextLine().split(" ");
        int[] received = new int[receivedInput.length];
        for (int i = 0; i < receivedInput.length; i++) {
            received[i] = Integer.parseInt(receivedInput[i]);
        }

        detectError(encoded, received);
        int[] decoded = decode(received);
        System.out.println("Decoded Data: " + Arrays.toString(decoded));

        scanner.close();
    }
}
