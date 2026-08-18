class Demo2 {

    void message() {
        System.out.println("This is a Non-static Method.");
    }

    static void display() {
        System.out.println("Static method is calling a non-static method.");
        Demo d = new Demo();
        d.message();
    }

    public static void main(String[] args) {
        System.out.println("Program for Static to Non-static Method Invocation");
        display();
    }
}