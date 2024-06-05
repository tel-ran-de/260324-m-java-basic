package org.example;

public class InnerClassTest {
    private int num;
//    anonymous inner class
    private Thread thread = new Thread() {
        @Override
        public void run() {
            System.out.println("Thread");
        }
    };

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void print() {
        System.out.println("Java");
//        inner local class
        class InnerLocalClass {
            private int num = 10;
            public int getNum() {
                return num;
            }
        }
    }


//    inner class
    class InnerClass {
        int innerNum;

        public int getInnerNum() {
            return innerNum;
        }

        public void setInnerNum(int innerNum) {
            this.innerNum = innerNum;
        }
}
    //    inner static class
    static class InnerStaticClass {
        int innerNum;

        public int getInnerNum() {
            return innerNum;
        }

        public void setInnerNum(int innerNum) {
            this.innerNum = innerNum;
        }
    }
}
