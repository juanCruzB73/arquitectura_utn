package EjerciciosEnJavaDeProcesosConHilosTarea.InterruptAndInterrupted;

public class Main {
    public static void main(String[] args){
        Thread elThread= new MiThread();
        elThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){};
        elThread.interrupt();
    }
}
