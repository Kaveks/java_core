public class Loops{
    public static void main(String[] args){
        System.out.println("Loops in Java");
        System.out.println("For loop:");

        //for loop
        for(int i=0; i<=10; i++){
            // odd numbers
            if(i%2!=0){
                System.out.println(i);
            }
            
        }
        // for loop in reverse order
        System.out.println("Reverse order:");
        for( int i=10;i>=0; i--){
            // odd numbers
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
        // while loop, give the output only when the condition is true

        System.out.println("While loop:");
        int j=1;
        while(j<=5){
            System.out.println(" j= "+j);
            j++;
        }

        // do-while loop, give the output atleats once even when the condition is false
        System.out.println("Do-while loop:");
        int k=10;
        do{
            if(k%2!=0){
                System.out.println("Odd number: "+k);
            }
            // System.out.println(" k= "+k);
            k++;
        }
        while(k<=20);

    }
}