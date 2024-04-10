package EjerciciosEnJavaDeProcesosConHilosTarea.MetodoCurrentThread;

public class Cliente extends Thread{
    public void run(){
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){};
    }
    public class Recurso {
        static synchronized void uso() {
            //Thread t = Thread.currentThread();
            System.out.println("soy " + Thread.currentThread().getName());
        }
    }
}

