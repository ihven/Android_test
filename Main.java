import java.util.*;
import java.math.*;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {

        List<RGB> rgbList = new ArrayList<RGB>();

        for (int i = 0; i < 9; i++) rgbList.add(new RGB());

        Collections.sort(rgbList);

        System.out.println("List : " + rgbList);
    }
}
