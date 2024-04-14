package RecursionLVL2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation1 {
    //object chooses
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int no_of_boxes = Integer.parseInt(br.readLine());
        int no_of_objects = Integer.parseInt(br.readLine());
        printPermutations(new int[no_of_boxes], 1, no_of_objects);
    }
    public static void printPermutations(int[] boxes, int current_object, int no_of_objects){
        if(current_object > no_of_objects){
            for(int val : boxes){
                System.out.print(val);
            }
            System.out.println();
            return;
        }
        for(int bidx = 0; bidx < boxes.length; bidx++){
            if(boxes[bidx] == 0){ //empty box
                boxes[bidx] = current_object; //object placed
                printPermutations(boxes, current_object + 1, no_of_objects); 
                boxes[bidx] = 0; //object unplaced
            }
        }
    }
}
