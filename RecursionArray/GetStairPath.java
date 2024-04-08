package RecursionArray;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ns = sc.nextInt();
        ArrayList<String> path = getStairPath(ns);
        System.out.println(path);
    }
    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        if(n < 0){
            ArrayList<String> res = new ArrayList<>();
            return res;
        }
        ArrayList<String> myPath = new ArrayList<>();
        ArrayList<String> upOnePath = getStairPath(n - 1);
        for (String s : upOnePath){
            myPath.add("1" + s);
        }
        ArrayList<String> upTwoPath = getStairPath(n - 2);
        for (String s : upTwoPath){
            myPath.add("2" + s);
        }
        ArrayList<String> upThreePath = getStairPath(n - 3);
        for (String s : upThreePath){
            myPath.add("3" + s);
        }
        return myPath;
    }
}
