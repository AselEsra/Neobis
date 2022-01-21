import java.util.Scanner;

public class PasswordsValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            boolean ans = checkString(in.nextLine());
            if (in.nextLine().equals("EOF")){
                break;
            }
            if (ans){
                System.out.println("Senha valida.");
            }
            else {
                System.out.println("Senha invalida.");
            }
        }
    }
    private static boolean checkString(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;
        boolean length = false;

        if (input.length() >= 6 && input.length() <= 32 && !input.contains(" ")){
            length = true;
        }
        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                isDigit = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                isUpperCase = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                isLowerCase = true;
            }else if (specialChars.contains(String.valueOf(currentCharacter))) {
                isSpecialChar = true;
            }

        }
        return
                isDigit && isUpperCase && isLowerCase && !isSpecialChar && length;
    }
}