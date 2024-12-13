public class Main {
    public static void main(String[] args) {
        Thread tren1 = new Thread(new Trenes("Pepe",1));
        Thread tren2 = new Thread(new Trenes("Jose",2));
        Thread tren3 = new Thread(new Trenes("Juan",3));
        Thread tren4 = new Thread(new Trenes("July",4));
        Thread tren5 = new Thread(new Trenes("Sabino",5));


        try {
            tren1.start();
            tren1.interrupt();
            tren1.join();
            tren2.start();
            tren2.join();
            tren3.start();
            tren3.join();
            tren4.start();
            tren4.join();
            tren5.start();
            tren5.join();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
}
