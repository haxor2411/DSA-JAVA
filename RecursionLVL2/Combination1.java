package RecursionLVL2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combination1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int no_of_boxes = Integer.parseInt(br.readLine());
        int no_of_objects = Integer.parseInt(br.readLine());
        printCombination(new int[no_of_boxes], 1, no_of_objects, -1);
    }
    public static void printCombination(int[] boxes, int current_object, int no_of_objects, int last_box_idx){
        if( current_object > no_of_objects){
            for(int val : boxes){
                System.out.print(val != 0 ?"i" : "-");
            }
            System.out.println();
            return;
        }
        for(int bidx = last_box_idx + 1; bidx < boxes.length; bidx++){
            if(boxes[bidx] == 0){ // empty box
                boxes[bidx] = 1; // object placed
                printCombination(boxes, current_object + 1, no_of_objects, bidx);
                boxes[bidx] = 0; // backtracking
            }
        }
    }

}
