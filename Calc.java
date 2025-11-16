//CW3: DAC MyCalc with member functions add(5, 6), add(5, 6, 7)
class MyCalc {
    public void add(int x, int y) {
        System.out.println(x + y);
    }

    public void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }
}

class Main {
    public static void main(String[] args) {
        MyCalc obj = new MyCalc();
        obj.add(5, 6);
        obj.add(5, 6, 7);
    }
}

