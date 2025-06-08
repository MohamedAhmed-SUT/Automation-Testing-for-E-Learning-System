public class Main {
    public static void main(String[] args) {
        // Running Registration Tests
        System.out.println("Running Registration Tests...");
        try {
            RegistrationTests.test1_SuccessfulRegistration();
            RegistrationTests.test2_InvalidEmail();
            RegistrationTests.test3_ExistingUser();
        } catch (Exception e) {
            System.out.println("Registration test case failed: " + e.getMessage());
        }
        System.out.println("All Registration Tests Completed.\n");

        // Running Login Tests
        System.out.println("Running Login Tests...");
        try {
            LoginTests.test1_SuccessfulLogin();
            LoginTests.test2_InvalidEmail();
            LoginTests.test3_WrongPassword();
        } catch (Exception e) {
            System.out.println("Login test case failed: " + e.getMessage());
        }
        System.out.println("All Login Tests Completed.\n");

        // Running User Creation Tests
        System.out.println("Running User Creation Tests...");
        try {
            UserCreationTests.test1_SuccessfulUserCreation();
            UserCreationTests.test2_InvalidEmailFormat();
            UserCreationTests.test3_EmailAlreadyExists();
        } catch (Exception e) {
            System.out.println("User Creation test case failed: " + e.getMessage());
        }
        System.out.println("All User Creation Tests Completed.");
    }
}