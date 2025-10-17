import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<String>lista= Arrays.asList("Sevilla","Cuenca","Lisboa","Madrid","Logroño");
       Collections.sort(lista, (o1, o2) -> o1.charAt(1)-o2.charAt(1));
        System.out.println(lista);
    }
}
