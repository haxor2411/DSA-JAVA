package Companies.Capgemini;
//Valleys in a Hiking Path
public class P7 {
    public static void main(String[] args) {
        String path = "DDUUDDUDUUUD";

        int level = 0;
        int valleyCounter = 0;

        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U') level++;
            else{
                if(level == 0) valleyCounter++;
                level--;
            }
        }

        System.out.println(valleyCounter);
    }
    
}
