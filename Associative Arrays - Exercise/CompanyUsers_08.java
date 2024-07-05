package maps;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //компания -> списък с id-та на служители
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            //input = "{companyName} -> {employeeId}".split(" -> ")
            //["{companyName}", "{employeeId}"]
            String companyName = input.split(" -> ")[0]; //име на компанията
            String employeeId = input.split(" -> ")[1];  //id на служителя

            //1. имаме записана тази комапния
            if (companyEmployees.containsKey(companyName)) {
                List<String> currentEmployees = companyEmployees.get(companyName); //текущи служители
                //!!!! добавяме служител само ако го няма
                if (!currentEmployees.contains(employeeId)) {
                    currentEmployees.add(employeeId);
                }
            }
            //2. нямаме записана тази компания
            else {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }

        //map: компания (key) -> списък със служители (value)

        companyEmployees.entrySet().forEach(entry -> {
            //entry
            //entry.getKey -> име на компания (String)
            //entry.getValue -> списък със служители (List<String>)
            System.out.println(entry.getKey());

            //начин 1 за отпечатване на списък
            //entry.getValue().forEach(employee -> System.out.println("-- " + employee));

            //начин 2 за отпечатване на списък
            for (String employee : entry.getValue()) {
                System.out.println("-- " + employee);
            }
        });
    }
}
