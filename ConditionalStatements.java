public class ConditionalStatements{
    public static void main(String[] args){
        System.out.println("Conditional Statements in Java");
        int age =17;
        // if statement
        if(age % 2 ==0)
        {
            System.out.println("Age is even");
        }    
        else
        {
            System.out.println("Age is odd");
        }

        if(age>=18){
            System.out.println("You are an Adult");

        }
        // if-else statement
        if (age>=18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You cannot vote yet!");
        }
        // if-else-if ladder
        if (age<13){
            System.out.println("You are a child");
        }else if(age>=13 && age<20){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are an adult");

        }
        //Ternary operator
        String result = (age>=18) ? "You are an adult" : "You are a minor";
        System.out.println("Ternary operator: " + result);

        // switch statement
        int day = 7;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}