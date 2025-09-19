import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Alerta {
    String getMissatge();

    default int getMinuts() {
        return 0;
    }

    int getSegons();
}

class Temporitzador {
    List<Thread> threadList = new ArrayList<>();

    Temporitzador programar(Alerta alerta) {
        threadList.add(Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(alerta.getSegons() * 1000);
            } catch (Exception _) {
            }
            System.out.println("¡ALERTA! " + alerta.getMissatge());
        }));

        return this;
    }

    public void esperarQueAcabenLesAlertes() throws InterruptedException {
        for (Thread thread : threadList) thread.join();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Temporitzador temporitzador = new Temporitzador();
        while (true) {
            System.out.println("Mensaje: ");
            String m = sc.nextLine();
            System.out.println("Tiempo: ");
            int s = sc.nextInt();
            if(m.isBlank()){
                break;
            }


                    temporitzador
                            .programar(new Alerta() {
                        @Override
                        public String getMissatge() {
                               return m;
                        }

                        @Override
                        public int getSegons() {
                            return s;
                        }
                    });
        }
        temporitzador.esperarQueAcabenLesAlertes();


    }

}