import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validar = false;
        while (!validar) {
            System.out.println("A que hijo quieres llamar?\n" +
                    "1 mentiroso\n" +
                    "2 honesto");
            int num = sc.nextInt();
            System.out.println("Dame numero");
            int num2 = sc.nextInt();

            switch (num) {

                case 1:
                    System.out.println("Entrando al hijo mentiroso");
                    Mentiroso(num2);
                    break;
                case 2:
                    System.out.println("Entrando al hijo honesto");
                    Honesto(num2);
                    break;
                default:
                    System.out.println("Error.. saliendo");
                    validar = true;
                    break;
            }

        }



    }
    public static void Mentiroso(int num){
        ProcessBuilder proceso1 = new ProcessBuilder("C:\\Users\\USER\\Desktop\\DAM2\\PSP\\HijoMentiroso\\bin\\Release\\HijoMentiroso.exe");
        try {
            Process proceso = proceso1.start();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            writer.write(String.valueOf(num));
            writer.flush();
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

    public static void Honesto (int num){
        ProcessBuilder proceso2 = new ProcessBuilder("C:\\Users\\USER\\Desktop\\DAM2\\PSP\\HijoHonesto\\bin\\Release\\HijoHonesto.exe");
        try {
            Process proceso = proceso2.start();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(proceso.getOutputStream()));
            writer.write(String.valueOf(num));
            writer.flush();
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
