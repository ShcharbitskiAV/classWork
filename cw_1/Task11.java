public class Task11 {
    public static void main(String[] args) {
        double a, b, c;
        a = 1;
        b = 2;
        c = 3;
        double x1,x2;

        double discriminant = b*b - 4*a*c;
        if (discriminant == 0) {
            x1 = (-b) / (2 * a);
            x2 = x1;
        }

        else if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        }

        else {
            System.out.println("Net celogo resheniya: discrimenant < 0");
        }
    }
}
