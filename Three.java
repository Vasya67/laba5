class Three extends Two {
    void methodThree() {
        super.methodOne();
        System.out.println("На вулиці Клепарівській навчання");
    }

    void methodThree(int param) {
        super.methodOne();
        System.out.println("Перевантажений метод у класі Three з параметром: " + param);
    }

    @Override
    void methodAbstract() {
        System.out.println("methodAbstract in Three class");
    }
}