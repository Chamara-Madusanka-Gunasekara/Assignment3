import java.util.Scanner;

public class Demo9 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().strip();
        String redColor = "\u001B[31;1m";
        String blueColor = "\u001B[34;1m";
        String greenColor = "\u001B[32;1m";
        String resetColor = "\u001B[0m"; 

        if (name.length() > 0) {
            String newName = name;
        } else {
            System.out.println(redColor + "Invalid Name" + resetColor);
            System.exit(0);
        }

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine().strip());

        if (age < 10 | age > 18) {
            System.out.println(redColor + "Invalid Age" + resetColor);
            System.exit(0);
        } 

        String originalString = "SE-";
        System.out.print("Enter your Subject 1: ");
        String subject1 = scanner.nextLine().strip();

        boolean startsWithOriginalString = subject1.startsWith(originalString);

        if (startsWithOriginalString ==true){
        } else {
            System.out.println(redColor + "Check SE" + resetColor);
            System.exit(0);
        }

        System.out.print("Enter your marks1: ");
        double marks1 = Integer.parseInt(scanner.nextLine().strip());
        if (marks1<0 | marks1>100){
            System.out.println(redColor + "Invalid Marks " + resetColor);
            System.exit(0);
        } 


        System.out.print("Enter your Subject 2: ");
        String subject2 = scanner.nextLine().strip();
        boolean result2 = subject2.equals(subject1);
        
        if (result2==true){
            System.out.println(redColor + "Enter another subject" + resetColor);
            System.exit(0);
        } 

        boolean startsWithOriginalString2 = subject2.startsWith(originalString);

        if (startsWithOriginalString2 ==true){
        } else {
            System.out.println(redColor + "Check SE" + resetColor);
            System.exit(0);
        }
        System.out.print("Enter your marks2: ");
        double marks2 = Integer.parseInt(scanner.nextLine().strip());
        if (marks2<0 | marks2>100){
            System.out.println(redColor + "Invalid Marks " + resetColor);
            System.exit(0);
        } 



        System.out.print("Enter your Subject 3: ");
        String subject3 = scanner.nextLine().strip();
        boolean result3 = subject3.equals(subject1) || subject3.equals(subject2) ;
        
        if (result3==true){
            System.out.println(redColor + "Enter another subject" + resetColor);
            System.exit(0);
        } 

        boolean startsWithOriginalString3 = subject3.startsWith(originalString);

        if (startsWithOriginalString3 ==true){
        } else {
            System.out.println(redColor + "Check SE" + resetColor);
            System.exit(0);
        }
        System.out.print("Enter your marks3: ");
        double marks3 = Integer.parseInt(scanner.nextLine().strip());
        if (marks3<0 | marks3>100){
            System.out.println(redColor + "Invalid Marks " + resetColor);
            System.exit(0);
        } 


        double total = marks1+marks2+marks3;

        double avrg = (marks1+marks2+marks3)/3;
        String uppercaseName = name.toUpperCase();

        String newStatus1 ="";
        if (avrg > 75){
            newStatus1 =  blueColor+"Credit Pass"+resetColor;
            
        } else if (avrg > 55){ 
            newStatus1 =  greenColor+"Pass"+resetColor;
        } else {
            newStatus1 =  redColor+"Fail"+resetColor;
        }


        String newMark1 ="";
        if (marks1 > 75){
            newMark1 =  blueColor+"Credit Pass"+resetColor;
            
        } else if (marks1 > 55){ 
            newMark1 =  greenColor+"Pass"+resetColor;
        } else {
            newMark1 =  redColor+"Fail"+resetColor;
        }

        String newMark2 ="";
        if (marks2 > 75){
            newMark2 =  blueColor+"Credit Pass"+resetColor;
            
        } else if (marks2 > 55){ 
            newMark2 =  greenColor+"Pass"+resetColor;
        } else {
            newMark2 =  redColor+"Fail"+resetColor;
        }


        String newMark3 ="";
        if (marks3 > 75){
            newMark3 =  blueColor+"Credit Pass"+resetColor;
            
        } else if (marks3 > 55){ 
            newMark3 =  greenColor+"Pass"+resetColor;
        } else {
            newMark3 =  redColor+"Fail"+resetColor;
        }

        subject1 =String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
        subject2 =String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
        subject3 =String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));


        System.out.println("+--------------------------------------------------+");
        System.out.printf("|  Name: %-38s    |\n",uppercaseName);
        System.out.printf("|  Age: %s years old.                              |\n",age);
        System.out.printf("|  Status: %-22s                             |\n",newStatus1);
        System.out.printf("|  Total: %-10.2f    Average: %-14.2f    |\n",total, avrg);
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Subject       |      Marks       |    Status     |");
        System.out.println("+--------------------------------------------------+");
        System.out.printf("| %4s        |       %5.2f      | %-22s   |\n", subject1, marks1, newMark1);
        System.out.printf("| %4s        |       %5.2f      | %-22s   |\n", subject2, marks2, newMark2);
        System.out.printf("| %4s        |       %5.2f      | %-22s   |\n", subject3, marks3, newMark3);
        System.out.println("+--------------------------------------------------+");
    }
}
