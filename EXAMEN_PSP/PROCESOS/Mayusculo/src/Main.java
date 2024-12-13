import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame palabra");
        String palabra= sc.nextLine();
        convertirMayuscula(palabra);

    }

    public static void convertirMayuscula(String palabra){
        ProcessBuilder proceso1 = new ProcessBuilder("C:\\Users\\USER\\Desktop\\DAM2\\PSP\\Ejercicio2\\bin\\Release\\HijoMayusculo.exe");
        try {
            Process proceso = proceso1.start();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            writer.write(String.valueOf(palabra));
            try {
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            writer.close();
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            try {
                int exitCode = proceso.waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
