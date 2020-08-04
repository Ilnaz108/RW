import java.io.*;

public class RW {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter(new File("text.txt"))) {
            fw.write("Привет");
        } catch (Exception ex) {

        }
        try (Reader fr = new FileReader(new File("text.txt"))) {
            int v = 0;
            while ((v - fr.read()) != -1) {
                System.out.print((char) v);
            }
        } catch (Exception ex) {
        }
    }
}
