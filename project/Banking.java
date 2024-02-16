import java.util.Scanner;
public class Banking{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("eneter the number of customer you want to add");
        int customer=input.nextInt();
        System.out.println("***Banking application***");
        for (int i=0;i<customer;i++){
            input.nextLine();
            System.out.println("enetr couster name");
            String name=input.nextLine();
            System.out.println("enetr account no");
            int accno=input.nextInt();
        }
        System.out.println("enetr your choice");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                System.out.println("your have eneter 1");
                break;
            case 2:
                System.out.println("your have enetre option2");
                break;
            case 3:
                System.out.println("you have eneter option 3");
                break;
            case 4:
                System.out.println("you have enetre option 4");
                break;
            default:
                System.out.println("error");
        }
        input.close();
    }
}
