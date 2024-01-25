import java.util.Scanner;
public class EncyptionDecryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackendWork newObj = new BackendWork();
        // Printing Welcome Message
        System.out.println("\n                                       *---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*");
        System.out.println("                                       *----------------------------WELCOME TO-----------------------------*");
        System.out.println("                                       *------------------ENCYPTION & DECRYPTION SYSTEM--------------------*");
        System.out.println("                                       *---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*---*\n");

        System.out.print("ENTER YOUR ID: ");
        String IDOfUser = scanner.next();
        int countID = 0;
        for(int i = 0 ; i < BackendWork.userDetails.length; i++) {
            if (IDOfUser.equals(BackendWork.userDetails[i][0])){
                System.out.print("ENTER YOUR PASSWORD: ");
                String userPass = scanner.next();
                int countPASS = 0;
                for(int j = 0; j < 2; j++){
                    if(userPass.equals(BackendWork.userDetails[i][1])){
                        newObj.displayOptions();
                        break;
                    }
                    else{
                        newObj.wrongPass(countPASS);
                        countPASS++;
                    }
                }
            }
            else{
                newObj.wrongID(countID);
                countID++;
            }
        }
    }
}

class BackendWork{
    static Scanner scanner = new Scanner(System.in);
    static char[][] symbols = {{'A', '&'}, {'B', '2'}, {'C', 'y'}, {'D', 'q'}, {'E', 'P'}, {'F', 'K'}, {'G', 'b'}, {'H', '{'}, {'I', 'c'}, {'J', 't'}, {'K', 'O'}, {'L', 'j'}, {'M', 'G'}, {'N', 's'}, {'O', 'N'}, {'P', 'R'}, {'Q', 'V'}, {'R', 'W'}, {'S', '6'}, {'T', 'B'}, {'U', 'M'}, {'V', '_'}, {'W', 'a'}, {'X', '$'}, {'Y', '1'}, {'Z', 'F'}, {'a', '%'}, {'b', 'Z'}, {'c', 'u'}, {'d', '7'}, {'e', 'I'}, {'f', 'D'}, {'g', '='}, {'h', 'g'}, {'i', 'm'}, {'j', '8'}, {'k', '*'}, {'l', '4'}, {'m', 'J'}, {'n', 'x'}, {'o', 'e'}, {'p', '3'}, {'q', 'Q'}, {'r', 'f'}, {'s', 'h'}, {'t', 'Y'}, {'u', 'o'}, {'v', '5'}, {'w', 'E'}, {'x', '+'}, {'y', 'X'}, {'z', 'C'}, {'0', 'l'}, {'1', '0'}, {'2', 'd'}, {'3', 'U'}, {'4', 'n'}, {'5', ')'}, {'6', 'S'}, {'7', 'i'}, {'8', '('}, {'9', '9'}, {'*', 'A'}, {'+', 'W'}, {'=', '!'},{' ','?'},{',','~'},{'.','^'}};
    static String[][] userDetails = {{"ANKUSH0016", "A6ANKUSH"},{"SARVESH0019", "A6SARVESH"}, {"ADITI0001", "A6ADITI"}, {"RAJVI0008", "A6RAJVI"}};

    // Method Which count the wrong password. We check whole array first than if we did not find password. Then we throw invalid password response.
    void wrongPass(int count){
        if(count == 1){
            System.out.println("INVALID USER PASSWORD! PLEASE TRY AGAIN");
        }
    }

    // Method Which count the wrong ID. We check whole array first than if we did not find ID. Then we throw invalid password response.
    void wrongID(int count){
        if(count == userDetails.length - 1 ){
            System.out.println("INVALID USER ID! PLEASE TRY AGAIN");
        }
    }

    // When user successfully entered ID and Password. This Method is called ehich display the options for the user.
    void displayOptions(){
        boolean loop = true;
        do{

            System.out.println("\nPRESS 1 TO ENCRYPT YOUR MESSAGE.");
            System.out.println("PRESS 2 TO DECRYPT YOUR MESSAGE.");
            System.out.print("PRESS 3 TO EXIT THE PROGRAM.\nENTER YOUR CHOICE: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    // TO ENCRYPT YOUR MESSAGE.
                    System.out.println("\nENTER YOUR MESSAGE YOU WANT TO ENCRYPT");
                    scanner.nextLine();
                    System.out.print("--> ");
                    String toEncryptMessage = scanner.nextLine();
                    // After get the message from user, we pass that message in our method. Which is going to encrypt that.
                    String encryptedMessage = getEncryptedValue(toEncryptMessage);
                    System.out.println("\nYOUR ENCRYPTED MESSAGE IS ");
                    System.out.println("--> "+encryptedMessage);
                    break;

                case 2:
                    // TO DECRYPT YOUR MESSAGE.
                    System.out.println("\nENTER YOUR MESSAGE YOU WANT TO DECRYPT");
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("--> ");
                    String toDecryptMessage = scanner.nextLine();
                    // Call the method for decryption:
                    String decryptedMessage = getDecryptedValue(toDecryptMessage);
                    System.out.println("\nYOUR DECRYPTED MESSAGE IS ");
                    System.out.println("--> " + decryptedMessage);
                    break;

                case 3:
                    // TO EXIT THE PROGRAM.
                    System.out.println("\n              HAVE A GREAT DAY!              ");
                    System.out.println("THANK YOU FOR USING ENCYPTION DECRYPTION SYSTEM\n                 EXITING...\n");
                    loop = false;
                    break;

                default:
                    // default: To Tackle Invalid Choice (Number)
                    System.out.println("INVALID CHOICE, PLEASE TRY AGAIN...\n");
                    break;
            }

        }while(loop);
    }

    // This method is executed when we choice option 1 (Encrytion).
    public String getEncryptedValue(String toEncryptMessage){
        StringBuffer encryptedMessage = new StringBuffer();
        for(int i =0; i < toEncryptMessage.length();i++) {
            char ch = toEncryptMessage.charAt(i);
            // After get a character from the passed string we pass that charater to method which return a encrypted symbol for that charater.
            encryptedMessage.append(getEncryptedCodes(ch));
        }
        return encryptedMessage.toString();
    }

    // This method is executed when we choice option 2 (Decrytion).
    public String getDecryptedValue(String toDecryptMessage){
        StringBuffer decryptedMessage = new StringBuffer();
        for(int i =0; i < toDecryptMessage.length();i++) {
            char ch = toDecryptMessage.charAt(i);
            // After get a character from the passed string we pass that charater to method which return a encrypted symbol for that charater.
            decryptedMessage.append(getDecryptedCodes(ch));
        }
        return decryptedMessage.toString();
    }

    // This method is going to use to get the specific symbol for passed charater. This specific symbols is present in 2D array called symbol.
    public static char getEncryptedCodes(char ch) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i][0] == ch) {
                return symbols[i][1];
            }
        }
        return ch;
    }

    // This method is going to use to Decrypt the passed charater
    public static char getDecryptedCodes(char ch) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i][1] == ch) {
                return symbols[i][0];
            }
        }
        return ch;
    }

}

