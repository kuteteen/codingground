import android.util.Base64;

public class HelloWorld{

     public static void main(String []args){
         String s1="A93reRTUJHsCuQSHR+L3GxqOJyDmQpCgps102ciuabc=";  
         byte[] barr=s1.getBytes(); 
         byte[] encryptionKey = Base64.decode(barr, 2);

       //  byte[] encryptionIV = copyOfRange(this.barr, 0, 16);

        System.out.println(encryptionKey);
     }
}