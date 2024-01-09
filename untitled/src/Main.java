import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer");
    int numb = scanner.nextInt();
    scanner.close();

        digitalRoot(numb);

        public void digitalRoot(int n){
            int temp = 0;
            while (n<=0) {
                temp += n%10;
                n/=10;

            }
            return temp<10? temp: digitalRoot(temp);
        }
    }
}