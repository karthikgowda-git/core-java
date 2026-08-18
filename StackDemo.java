class StackDemo {

    static void display() {
        System.out.println("Calling display() method again...");
        display();
    }

    public static void main(String[] args) {
        System.out.println("Program to demonstrate StackOverflowError");
        display();
    }
}