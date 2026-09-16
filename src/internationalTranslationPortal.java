import java.util.Scanner;

public class internationalTranslationPortal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Translation Portal Started. Type 'exit' to quit.");
        while (true) {
            System.out.print("Enter Term: ");
            String englishTerm = input.nextLine();

            String translation;
            if (englishTerm.equalsIgnoreCase("exit")) {
                break;
            } else if (englishTerm.equalsIgnoreCase("CyberSecurity")) {
                translation = "សន្តិសុខសាយប័រ";
            } else if (englishTerm.equalsIgnoreCase("Artificial Intelligence")) {
                translation = "បញ្ញាសិប្បនិម្មិត";
            } else if (englishTerm.equalsIgnoreCase("Algorithm")) {
                translation = "ក្បួនដោះស្រាយ";
            } else if (englishTerm.equalsIgnoreCase("Encryption")) {
                translation = "ការអុីនគ្រីប";
            } else if (englishTerm.equalsIgnoreCase("Software")) {
                translation = "កម្មវិធី";
            } else if (englishTerm.equalsIgnoreCase("Hardware")) {
                translation = "សម្ភារៈកុំព្យូទ័រ";
            } else if (englishTerm.equalsIgnoreCase("Cloud Computing")) {
                translation = "គណនាលើពពក";
            } else {
                translation = null;
            }

            if (translation != null) {
                System.out.println("Translation: " + translation);
            } else {
                System.out.println("Translation not found in dictionary");
            }
        }
        System.out.println("Portal Closed!");
    }
}