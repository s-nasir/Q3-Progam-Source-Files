import java.util.Scanner;

public class keyboard{
    public int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        return id;
    }
}
