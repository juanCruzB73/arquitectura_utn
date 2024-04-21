package filosofos;

public class Table {
    private boolean[] forks;

    public Table(int numForks){
        this.forks=new boolean[numForks];

    }

    public int leftFork(int phylosopherIndex){
        return phylosopherIndex;
    }
    public int rightFork(int phylosopherIndex){
        if(phylosopherIndex==0){
            return this.forks.length-1;
        }else {
            return phylosopherIndex-1;
        }
    }
    public synchronized void takeFork(int phylosopherIndex){
        while (forks[leftFork(phylosopherIndex)] || forks[rightFork(phylosopherIndex)]){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("error al tomar el tenedor");
            }
        }
        forks[leftFork(phylosopherIndex)]=true;
        forks[rightFork(phylosopherIndex)]=true;
    }
    public synchronized void letFork(int phylosopherIndex){
        forks[leftFork(phylosopherIndex)]=false;
        forks[rightFork(phylosopherIndex)]=false;
        notifyAll();
    }
}
