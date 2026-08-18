class Demo1 {

    static void message() {
        System.out.println("This is a Static Method.");
    }

    void display() {
        System.out.println("Non-static method is calling a static method.");
        message();
    }

    public static void main(String[] args) {
        System.out.println("Program for Non-static to Static Method Invocation");
        Demo d = new Demo();
        d.display();
    }
}