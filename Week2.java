import java.util.Scanner;

public class Week2 {
    public static int age;
    public static String category;

    public static void task1(int age)
    {
        if (age<=3){
            System.out.println("Baby");
        }
        if (age>=4 && age<=12){
            System.out.println("Child");
        }
        if (age>=13 && age<=19){
            System.out.println("Teen");
        }
        if (age>=20 && age<=50){
            System.out.println("Adult");
        }
        if (age>=51){
            System.out.println("Elder");
        }
    }

    public static void task2(String category)
    {
        switch (category) {
            case "baby":
                category = "0-3 years";
                break;
            case "child":
                category = "4-12 years";
                break;
            case "teen":
                category = "13-19 years";
                break;
            case "adult":
                category = "20-50 years";
                break;
            case "elder":
                category = "51+ years";
                break;
            default:
                category = "Unknown age category";
        }
        System.out.println(category);
    }

    public static void task3(int start, int end, int step)
    {
        if (start < end) {
            for (int i = start; i <= end; i += step) {
                System.out.println(i);
            }
        } else if (start > end) {
            for (int i = start; i >= end; i -= step) {
                System.out.println(i);
            }
        } else {
            System.out.println(start);
        }
    }

    
    public static void main(String[] args) {
        System.out.println("Enter task: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num==1){
            task1(22);
        }
        if (num==2){
            task2("adult");
        }
        if (num==3){
            task3(1,11,3);  
        }
    }
}