import java.util.Scanner;

public class CourseRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of enquiries per day at Vemu College: ");
        int enquiries = sc.nextInt();

        String rating;

        if (enquiries >= 30 && enquiries < 50) {
            rating = "**";
        } else if (enquiries >= 50 && enquiries < 70) {
            rating = "***";
        } else if (enquiries >= 70 && enquiries <= 100) {
            rating = "****";
        } else if (enquiries > 100) {
            rating = "*****";
        } else {
            rating = "*";
        }

        System.out.println("===============================");
        System.out.println("Number of Enquiries: " + enquiries);
        System.out.println("Course Rating: " + rating);
        System.out.println("===============================");

        sc.close();
    }
}
