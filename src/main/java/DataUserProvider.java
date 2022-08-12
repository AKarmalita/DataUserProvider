import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataUserProvider {
    static List<String> listName= Arrays.asList("Anna","Bill","Mark","Maria");
    static List<Integer> listAge = Arrays.asList(30, 35, 40, 19, 65);

    public static String getName(){
        return listName.get(new Random().nextInt(listName.size()));
    }

    public static Integer getAge(){
        return listAge.get(new Random().nextInt(listAge.size()));
    }

}

