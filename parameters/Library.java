class Library {

    static void issue(String studentName, String bookName,
                      int days, boolean returned) {

        if (studentName != null && bookName != null && days > 0) {

            System.out.println("Student : " + studentName);
            System.out.println("Book : " + bookName);
            System.out.println("Days : " + days);
            System.out.println("Returned : " + returned);
            System.out.println("Book Issued Successfully");
        } else {
            System.out.println("Invalid Details");
        }
    }
}