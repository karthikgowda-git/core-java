class Hospital {

    static void admit(String patientName, int age,
                      String disease, boolean insurance) {

        if (patientName != null && age > 0 && disease != null) {

            System.out.println("Patient : " + patientName);
            System.out.println("Age : " + age);
            System.out.println("Disease : " + disease);
            System.out.println("Insurance : " + insurance);
            System.out.println("Admission Successful");
        } else {
            System.out.println("Invalid Details");
        }
    }
}