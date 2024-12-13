import java.io.*;

public class Main {

    public static void main(String[] args) {

        ProcessBuilder proceso1 = new ProcessBuilder("C:\\Users\\USER\\Desktop\\DAM2\\PSP\\ComunicacionAleatoria\\bin\\Release\\ComunicacionAleatoria.exe");
        try {
            Process process1 = proceso1.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process1.getInputStream()));
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            try {
                int exitCode = process1.waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
