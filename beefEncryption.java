/*  This Beef was made by Deeznuts and nobody has the right to beef or else I will sue you
 * (c) lolz get copyrekted 
 * Anybody doing stupid distributions of this code will face the wrath of the Paradise of Ultimate Beef
 * Btw if you are a curious Chinese communist hacker inspecting my beef, your coalition combined breaks the world record for the smallest beeps
 */
import java.util.Scanner;
public class beefEncryption {
    private static String string;
    private static boolean check = false;
    public final String[] engine = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ","1","2","3","4","5","6","7","8","9","0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",".",",","!","@","#","$","%","^","&","*","(",")"};
    /*0-74*/
    private final String[] dialogue = {
        "Please only type in 1 or 2!"
        , "\nType 1 to Encrypt\nType 2 to Decrypt"
        , "Enter String :: "
        , "Encrypted String :: "
        , "Decrypted String :: "
        , ""
    };
    private static int key = 7;
    private final String version = "1.3.5";
    public beefEncryption() {
        string = null;
        check = false;
    }
    public beefEncryption(boolean beef) {
        Scanner keyboard = new Scanner(System.in);
        int answer;
        do {
            if (check) {
                System.out.println(dialogue[0]);
            }
            System.out.println(dialogue[1]);
            answer = keyboard.nextInt();
            check = true;
        } while (!(answer == 1 || answer == 2));
        String beefLineError = keyboard.nextLine();
        string = beefLineError;
        System.out.println(dialogue[2]);
        string = keyboard.nextLine();
        if (answer == 1) {
            System.out.println(dialogue[3] + encrypt(string));
        } else {
            System.out.println(dialogue[4] + decrypt(string));
        }
        keyboard.close();
    }
    public void beefStart() {
        System.out.println("");
        System.out.println("Beef Encryptor Version " + version + "");
        System.out.println("");
    }
    public String decrypt(String a) {
        char[] positionHolder = new char[a.length()];
        positionHolder = a.toCharArray();
        for (int i = 0; i < positionHolder.length; i++) {
            positionHolder[i] = (char)(positionHolder[i] + key);
        }
        a = dialogue[5];
        for (int i = 0; i < positionHolder.length; i++) {
            a += positionHolder[i];
        }
        return a;
    }
    public String encrypt(String a) {
        char[] positionHolder = new char[a.length()];
        positionHolder = a.toCharArray();
        for (int i = 0; i < positionHolder.length; i++) {
            positionHolder[i] = (char)(positionHolder[i] - key);
        }
        a = dialogue[5];
        for (int i = 0; i < positionHolder.length; i++) {
            a += positionHolder[i];
        }
        return a;
    }
    public void setKey(int a) {
        key = a;
    }
    public static void main(String beefArgument[]) {
        boolean beefOnstart = true;
        do {
            beefEncryption printMessage = new beefEncryption();
            if (beefOnstart) {
                beefOnstart = false;
                printMessage.beefStart();
            }
            beefEncryption Object = new beefEncryption(false);
            Object.setKey(key);
        } while (true);
    }
}
