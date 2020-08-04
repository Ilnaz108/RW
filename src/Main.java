import java.io.File;
import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "abcdfjhijklmnopqrstuvwxyz";
        print(string.getBytes("windows-1251"));
        print(string.getBytes("koi8-r"));
    }
    private static void print(byte[] bytes) {
        for(int i = 0; i < bytes.length; i++) {
            System.out.print(asBinary(bytes[i]) + " ");
        }
        System.out.println();
    }

    private static String asBinary(int v) {
        return String.format("%&s",Integer.toBinaryString(v)).replace(' ', '0');
    }
}