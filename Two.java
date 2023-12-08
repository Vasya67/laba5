class Two extends One {
    void methodTwo() {
        super.methodOne();
        System.out.println("На вулиці Борканюка ДТП");
    }

    @Override
    void methodOne() {
        System.out.println("Перевизначений метод у класі Two");
    }

    @Override
    void methodAbstract() {
        System.out.println("methodAbstract in Two class");
    }
}