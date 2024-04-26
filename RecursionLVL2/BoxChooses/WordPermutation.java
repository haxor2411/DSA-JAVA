package RecursionLVL2.BoxChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WordPermutation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(freqMap.containsKey(ch)){
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
            else{
                freqMap.put(ch, 1);
            }
        }
        generateWords(freqMap, 1, str.length(), "");
    }
    public static void  generateWords(HashMap<Character, Integer> freqMap, int currentSelection, int totalSelection, String str){
        if(currentSelection > totalSelection){
            System.out.println(str);
            return;
        }
        for(char ch : freqMap.keySet()){
            int freq = freqMap.get(ch);
            if(freq > 0){
                freqMap.put(ch, freq - 1);
                generateWords(freqMap, currentSelection + 1, totalSelection, str + ch);
                freqMap.put(ch, freq);
            }
        }
    }
}
