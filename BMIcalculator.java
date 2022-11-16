import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
    Scanner utv=new Scanner(System.in); //Scanner
    System.out.print("Enter your Name: ");//Input personal details
    String name=utv.nextLine();
    System.out.print("Enter your Age: ");
    int age=utv.nextInt();
    System.out.println("Choose your Gender");
    System.out.println("1.Male");
    System.out.println("2.Female");
    int gender=utv.nextInt();
    switch (gender) {
        case 1:
            System.out.println("Male");
            break;
        case 2:
        System.out.println("Female");    
            break; 
        default:
        System.out.println("Wrong Input");
            break;
    }
    System.out.print("Enter Your Weight: ");
    float w=utv.nextFloat();
    System.out.print("Enter your Height: ");
    float h=utv.nextFloat();
    float BMI;
    BMI=w/(h*h);//BMI calculate
 
    //BMI value situation
    if (BMI<19) {
        System.out.println("You are Underweight. ");
        System.out.println("You are not Healthy.Get more nutritions....");
    } else if (BMI<25){
        System.out.println("You are Normal. ");
        System.out.println("You are Healthy.Keep it up...");
      }
        else{
            System.out.println("You are Overweight. ");
            System.out.println("You are not Healthy.You can do more workouts...");
        }

        
    }

    }


    

