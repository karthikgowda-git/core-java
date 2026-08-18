class Demo3 {

    void message() {
        System.out.println("This is Non-static Method 1.");
    }

    void display() {
        System.out.println("Non-static method is calling another non-static method.");
        message();
    }

    public static void main(String[] args) {
        System.out.println("Program for Non-static to Non-static Method Invocation");
        Demo d = new Demo();
        d.display();
    }
}