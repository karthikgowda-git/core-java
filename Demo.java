class Demo {

    static void message() {
        System.out.println("This is Static Method 1.");
    }

    static void display() {
        System.out.println("Static method is calling another static method.");
        message();
    }

    public static void main(String[] args) {
        System.out.println("Program for Static to Static Method Invocation");
        display();
    }
}