import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        // При попытке удаления из изначального списка
        // Возникает ошибка UnsupportedOperationException
        // Я не смогла ее починить
        // Поэтому вместо удаления из изначального списка создается новый
        for (Integer value : intList) {
            if (value > 0 && value % 2 == 0)
                resultList.add(value);
        }
        resultList.sort(Comparator.naturalOrder());

        for (Integer i : resultList)
            System.out.println(i);
    }
}
