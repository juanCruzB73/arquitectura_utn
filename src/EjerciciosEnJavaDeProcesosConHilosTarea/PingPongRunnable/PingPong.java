package EjerciciosEnJavaDeProcesosConHilosTarea.PingPongRunnable;

import static java.lang.Thread.sleep;

public class PingPong implements Runnable{
    private String word;
    private int delay;
    public PingPong(String whatToSay, int delayTime){
        word = whatToSay; delay = delayTime; };
    public void run(){
        while(true){
            System.out.print(word + "");
            try{
                sleep(delay);
            } catch(InterruptedException e){ return; }
        }
    }
}
