import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter ur password: ");
        String password = a.nextLine();

        boolean isPassStrong = strongPassword(password);
        System.out.println("Strong Password: " + isPassStrong);


    }

    public static boolean strongPassword(String password){

        boolean digitCheck = false;
        boolean lowerCaseCheck = false;
        boolean upperCaseCheck = false;
        boolean specialCharCheck = false;
        boolean lengthCheck = (password.length() >= 6);
        String specialChar = "!@#$%^&*()-+";

        char pass[] = password.toCharArray();

        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(pass[i])) {
                digitCheck = true;

            }
            if (Character.isLowerCase(pass[i])) {
                lowerCaseCheck =true;

            }
            if (Character.isUpperCase(pass[i])) {
                upperCaseCheck = true;

            }
            if (specialChar.contains(Character.toString(pass[i]))){
                specialCharCheck = true;

            }
        }
        boolean strongPass = false;
        if ((lowerCaseCheck & upperCaseCheck & specialCharCheck & digitCheck & lengthCheck)){
            strongPass = true;
        }
        return strongPass;
    }
}

