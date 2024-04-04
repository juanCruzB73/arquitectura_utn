package ejercicio2;

import java.util.Random;

public class Proceso extends Thread{
    private static int tamaño=8;
    private static int[]vec=new int[tamaño];
    private int inicio,fin;
    public Proceso(int inicio,int fin){
        this.inicio=inicio;
        this.fin=fin;
    }
    public void run(){
        for(int i=inicio;i<fin;i++){
            vec[i]+=10;
        }
    }
    public static void main(String[] args){
        Random rand=new Random(System.nanoTime());
        Proceso pro1=new Proceso(0,4);
        Proceso pro2=new Proceso(4,8);

        for(int i=0;i<vec.length;i++){
            vec[i]=rand.nextInt(10);
            System.out.println(vec[i]);
        }
        pro1.start();
        pro2.start();
        try{
            pro1.join();
            pro2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        for (int i=0;i<vec.length;i++){
            System.out.println(vec[i]);
        }
    }
}
