package ejercicio2;

import java.util.Random;

public class Proceso2 extends Thread{
    private static int tamaño=8;
    private static int[][]matrix=new int[tamaño][tamaño];
    private int inicio,fin;
    public Proceso2(int inicio,int fin){
        this.inicio=inicio;
        this.fin=fin;
    }
    public void run(){
        for(int i=inicio;i<fin;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]+=10;
            }
        }
    }
    public static void main(String[] args){
        double tiempo_inicio=System.nanoTime();
        Random rand=new Random(System.nanoTime());
        Proceso2 pro1=new Proceso2(0,4);
        Proceso2 pro2=new Proceso2(4,8);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=rand.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        pro1.start();
        pro2.start();
        try{
            pro1.join();
            pro2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("");
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        double tiempo_final=System.nanoTime()-tiempo_inicio;
        System.out.println(tiempo_final/1000000);
    }
}

