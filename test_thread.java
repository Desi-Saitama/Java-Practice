class even implements Runnable{
    even(){
        new Thread(this, "Even").start();
    }
    public void run(){
        int count = 10;
        int i=0;
        try{
            while(i<count){
                if(i%2==0){
                    System.out.println("Even Thread " + i+" ");
                    Thread.sleep(1000);
                }
                i++;
            }
        }
        catch(InterruptedException e){
            System.out.println("Even thread interrupted.");
        }
    }
}

class odd implements Runnable{
    odd(){
        new Thread(this, "odd").start();
    }
    public void run(){
        int count = 10;
        int i=0;
        try{
            while(i<count){
                if(i%2!=0){
                    System.out.println("Odd Thread "+i+" ");
                    Thread.sleep(1000);
                }
                i++;
            }
        }
        catch(InterruptedException e){
            System.out.println("odd thread interrupted.");
        }
    }
}

public class test_thread {
 public static void main(String[] args) {
 new even();
 new odd();
 }
}