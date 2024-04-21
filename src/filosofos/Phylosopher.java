package filosofos;

import java.security.PublicKey;

public class Phylosopher extends Thread{
    private Table table;
    private int phylosopherIndex;
    private String phylosopher;

    public Phylosopher(Table table,String phylosopher,int phylosopherIndex){
        this.table=table;
        this.phylosopher=phylosopher;
        this.phylosopherIndex=phylosopherIndex;
    }
    public void run(){
        while (true){
            this.thinking();
            this.table.takeFork(this.phylosopherIndex);
            this.eating();
            System.out.println(phylosopher+" dejo de comer"+" los tenedores "+(this.table.rightFork(this.phylosopherIndex)+1)+ " y "+(this.table.leftFork(phylosopherIndex)+1)+" quedaron libres");
            this.table.letFork(this.phylosopherIndex);
        }
    }
    public void thinking(){
        System.out.println("el filosofo "+phylosopher+" esta pensando");
        try {
            sleep((long)(Math.random()*1000));
        }catch (InterruptedException e){
            System.out.println("problemas en thinking");
        }
    }
    public void eating(){
        System.out.println("el filosofo "+phylosopher+" esta comiendo");
        try {
            sleep((long)(Math.random()*1000));
        }catch (InterruptedException e){
            System.out.println("problemas en eating");
        }
    }
}
