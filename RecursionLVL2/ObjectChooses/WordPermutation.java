package RecursionLVL2.ObjectChooses;

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
        
    }
}
