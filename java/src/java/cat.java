package java;
import java.io.*;

class Cat {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.exit(1);
        }

        String path = args[0];
        try {
            File file = new File(path);
            FileReader reader = new FileReader(file);

            int ch = reader.read();
            while (ch != -1) {
                System.out.print((char)ch);
                ch = reader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}