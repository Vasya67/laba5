class Four extends Two {
    void methodFour() {
        super.methodTwo();
        System.out.println("пожежа ліквідована");
    }

    void test() {
        FourDemo fd = new FourDemo();
        fd.methodFourDemo();
    }

    class FourDemo {
        void methodFourDemo() {
            System.out.println("method fourDemo does something");
            methodFour();
        }
    }

    @Override
    void methodAbstract() {
        System.out.println("methodAbstract in Four class");
    }
}
