package EjerciciosEnJavaDeProcesosConHilosTarea.Sleep;

public class SleepInterrupt extends Thread{
    public void run() {
        try {
            System.out.println("in run(): me duermo 20s");
            Thread.sleep(20000);
            System.out.println("in run(): me despierto");
        } catch (InterruptedException e) {
            System.out.println(
                    "in run(): interrumpida en sleep");
            return;
        }
        System.out.println("in run(): fin normal");
    }
    public static void main(String[] args) {
        SleepInterrupt si=new SleepInterrupt();
        Thread t=new Thread(si);
        t.start();
        try{
            Thread.sleep(2000);//con mas del tiempo que duerme termina normalmente
        }catch (InterruptedException e){};
        System.out.println("in main(): Intterupo a t");
        t.interrupt();//interrupt a sleep termina el thread
        System.out.println("in main(): termina");
    }
}
