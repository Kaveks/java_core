
// Data types in Java
// This program demonstrates the use of primitive data types in Java
//Primitive  -> Integers(byte, short, int, long)-> short(2 bytes), int(4 bytes), long(8 bytes),byte(1 byte) 
//           -> calculating bytes  1byte = -2^7 to 2^7-1, 2 bytes = -2^15 to 2^15-1, 4 bytes = -2^31 to 2^31-1, 8 bytes = -2^63 to 2^63-1
//           -> Float(float, double)-> float(4 bytes), double(8 bytes)
//           -> Characters-> char(2 bytes)
//           -> Booleans(true or false)-> boolean(1 bit)
public class DataTypes {
    public static void main(String[] args){
        System.out.println("Data Types in Java");
        int a = 10;
        int b = 20;
        short c = 30;
        long d = 40l;
        byte e = 100;

        float m=10.5f;
        double k = 20.5;

        char ch = 'A';
        boolean flag = true;
        //casting(explicit conversion)
        int x = (int) m; //casting float to int
     
        
       //System.out.println(a + " plus " + b + " = " + (a + b));
       // playing with bytes
       //byte byte1 = 127; // maximum value for byte
       byte byte1= 127; // incrementing byte value to see overflow
       int byte2 = byte1; // assigning int value to byte variable

       int l=500;
       byte byte3 = (byte) l; // casting int to byte, will cause overflow

       //System.out.println("Byte value: " + byte3);

       //playing with float
       float float1 = 10.5f;
       int int1 = (int) float1; // casting float to int, will truncate
       System.out.println("Float value: " + float1 + ", Int value after casting: " + int1);

       // type promotion
       int num1 = 10;
       float num2 = 20.5f;
       float result = num1 + num2; // num1 is promoted to float before addition
       System.out.println("Result of addition: " + result);

       byte byte4 = 10;
       byte byte5 = 40;
       int result2=byte4*byte5; // byte4 is promoted to int before multiplication
       System.out.println("Result of multiplication: " + result2);
}
}