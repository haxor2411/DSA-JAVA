package RecursionLVL2.BoxChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int nobjects = Integer.parseInt(br.readLine());
        printPermutations(1, new int[nobjects], nboxes, 0, "");
    }
    public static void printPermutations(int current_box, int[] items, int nboxes, int selection_so_far, String Permutation){
        if(current_box > nboxes){
            if(selection_so_far == items.length){
                System.out.println(Permutation);
            }
            return;
        }
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx] == 0){ // item is unplaced
                items[idx] = 1;   // mark it as placed
                printPermutations(current_box + 1, items, nboxes, selection_so_far + 1, Permutation + (idx + 1));
                items[idx] = 0;   // backtrack - undo the placement
            }
        }
        printPermutations(current_box + 1, items, nboxes, selection_so_far, Permutation + "-");
    }
}
