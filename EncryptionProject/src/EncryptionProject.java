// ----------------------------------------------------------------
//                         EncryptionProject.java
// ----------------------------------------------------------------
//File: EncryptionProject
//Name: Gabriel Lasut


public class EncryptionProject {
    static String encrypt(String input, int param) {
        String output = new String();
        int ascii;
        for (int i = 0; i < input.length(); i++) {
            ascii = input.charAt(i);
            output += (char) (ascii + param);
        }
        return output;
    }

    static String decrypt(String input, int param) {
        String output = new String();
        int ascii;
        for (int i = 0; i < input.length(); i++) {
            ascii = input.charAt(i);
            output += (char) (ascii - param);
        }
        return output;
    }

    public static void main(String[] args) {
        String mode = "enc";
        String key = "0";
        String data = "";
        for (int i = 0; i < args.length; i++) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            }
            if ("-key".equals(args[i])) {
                key = args[i + 1];
            }
            if ("-data".equals(args[i])) {
                data = args[i + 1];
            }
        }
        switch (mode) {
            case "enc":
                System.out.println(encrypt(data, Integer.parseInt(key)));
                break;
            case "dec":
                System.out.println(decrypt(data, Integer.parseInt(key)));
                break;
            default:
                break;
        }
    }
}

