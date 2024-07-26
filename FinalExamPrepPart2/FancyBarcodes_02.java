package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // \ или \\ -> се ескпейва символ в regex101
        // \\ -> се ескейпва символ в java

        String regex = "[@][#]+[A-Z][A-Za-z0-9]{4,}[A-Z][@][#]+"; //текста на шаблона
        Pattern pattern = Pattern.compile(regex);

        int countBarcodes = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countBarcodes; count++) {
            String textBarcode = scanner.nextLine(); //"@#FreshFisH@#"
            Matcher matcher = pattern.matcher(textBarcode);
            //matcher съхранявам всички текстове, които отговарят на шаблона
            //matcher = ["@#FreshFisH@#"]

            //проверка дали е валиден
            if (matcher.find()) {
                //въведения баркод е валиден
                String productGroup = getProductGroup(textBarcode);
                System.out.println("Product group: " + productGroup);
            } else {
                //въведения баркод не е валиден
                System.out.println("Invalid barcode");
            }
        }
    }

    private static String getProductGroup(String textBarcode) {
        //textBarcode = "@##Che4s6E@##"
        StringBuilder sbDigits = new StringBuilder(); //ще допеляме само цифрите
        for (char symbol : textBarcode.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sbDigits.append(symbol);
            }
        }
        //sbDigits -> текст с цифри
        //sbDigits е празен -> в баркода няма цифри
        //sbDigits не е празен -> в баркода има цифри

        //return sbDigits.isEmpty() ? "00" : sbDigits.toString(); -> тернарен оператор

        if (sbDigits.isEmpty()) {
            return "00";
        } else {
            return sbDigits.toString();
        }
    }
}
