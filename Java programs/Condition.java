import java.util.*;
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            
            case1: System.out.println("Hello");
            break;
            case2: System.out.println("Namaste");
            break;
            case3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}
