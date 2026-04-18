class Foo {
    private boolean firstb;
    private boolean secondb;
    public Foo() {
        this.firstb=false;
        this.secondb=false;
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        
        printFirst.run();
        firstb=true;
        notifyAll();        
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (firstb==false ){
            wait();
        }
        
        printSecond.run();
        secondb=true;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        
        while(secondb==false){
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}