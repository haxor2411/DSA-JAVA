package RecursionLVL2.ObjectChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WordPermutation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] spots = new char[str.length()];
        HashMap<Character, Integer> lastOccurence = new HashMap<>();
        for(char ch : str.toCharArray()){
            lastOccurence.put(ch, -1);
        }
        generateWords(0, str, spots, lastOccurence);
    }
    public static void generateWords(int currentChar, String str, char[] spots, HashMap<Character, Integer> lastOccurence){
        if(currentChar == str.length()){
            System.out.println(new String(spots));
            return;
        }
        char currentCharacter = str.charAt(currentChar);
        for(int idx = lastOccurence.get(currentCharacter) + 1; idx < spots.length; idx++){
            if(spots[idx] == '\u0000'){
                spots[idx] = currentCharacter;
                lastOccurence.put(currentCharacter, idx);
                generateWords(currentChar + 1, str, spots, lastOccurence);
                spots[idx] = '\u0000';
                lastOccurence.put(str.charAt(idx), -1);
            }
        }
    }
}
