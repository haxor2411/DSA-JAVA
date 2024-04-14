package RecursionLVL2.BoxChooses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combination {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no_of_boxes = Integer.parseInt(br.readLine()); 
        int no_of_objects = Integer.parseInt(br.readLine()); 
        printCombination(1, no_of_boxes, 0, no_of_objects, "");
    }
    public static void printCombination(int current_box, int no_of_boxes, int selection_so_far, int totalSelection, String combination){
        if(current_box > no_of_boxes){
            if(selection_so_far == totalSelection){
                System.out.println(combination);
            }
            return;
        }
        printCombination(current_box + 1, no_of_boxes, selection_so_far + 1, totalSelection, combination + "i");
        printCombination(current_box + 1, no_of_boxes, selection_so_far, totalSelection, combination + "-");

    }
}
