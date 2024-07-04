import java.util.*;

public class CountRealNumbers_01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //прочитаме масив от конзолата
        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        //създаваме си празен МАП -> ключ-реални числа -> стойности-цели числа
        Map<Double, Integer> numbersMap = new TreeMap<>();

        //foreach -> преминаваме през всички числа от масива
        for(double number : numbers){

            if(!numbersMap.containsKey(number)){
                //това е първото срещане на ключа
                numbersMap.put(number, 1);//добяваме number като ключ и 1 като стойност, защото това първото срещане на този ключ
            }else {
                /*int occurrences = numbersMap.get(number); вземаме срещанията на ключа
                occurrences++;
                numbersMap.put(number, occurrences);
                */
                 numbersMap.put(number, numbersMap.get(number) + 1);

            }
        }


        for (Map.Entry<Double, Integer> entry: numbersMap.entrySet()){

            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }



    }
}
