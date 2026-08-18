class PanCard {

    static void apply(String firstName, String lastName, String middleName,
                      char gender, String dob, long mobileNumber,
                      String address, String email) {

        System.out.println("Running apply in PanCard");

        if (firstName != null && lastName != null && middleName != null &&
            (gender == 'M' || gender == 'F' || gender == 'O' ||
             gender == 'm' || gender == 'f' || gender == 'o') &&
            dob != null && mobileNumber > 999999999L &&
            address != null && email != null) {

            System.out.println("First Name : " + firstName);
            System.out.println("Last Name  : " + lastName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Gender     : " + gender);
            System.out.println("DOB        : " + dob);
            System.out.println("Mobile     : " + mobileNumber);
            System.out.println("Address    : " + address);
            System.out.println("Email      : " + email);
            System.out.println("Application Submitted Successfully");
        } else {
            System.out.println("Invalid Details");
        }
    }
}