import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {



    public OddEvenSets(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            String[] nums = sc.nextLine().split(" ");
            Set<String> set = new TreeSet<String>(Arrays.asList(nums));
            for (String s : set){
                if (s.)
            }
        }
    }
}
