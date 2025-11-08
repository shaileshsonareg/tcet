class Hi extends Thread {

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000); //1000 millisecond => 1 sec
            } catch( Exception e) {}
        }
    }

}

class Huku extends Thread {

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Huku");
            try {
                Thread.sleep(1000); //1000 millisecond => 1 sec
            } catch( Exception e) {}
        }
    }

}

// https://github.com/shaileshsonareg/tcet.git
class Main {
    static public void main(String args[]) {
        Hi hiobj = new Hi();
        Huku hukuobj = new Huku();

        hiobj.start();
        hukuobj.start();

        // hiobj.run();
        // hukuobj.run();
    }

}