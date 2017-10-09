package module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        System.err.println(line);
        int read = bufferedReader.read();
        char symbol = (char)read;
        System.out.println("Symbol : " + symbol);

        int t = 0b101011;
        System.out.println("intger : " + t);
    }
}
