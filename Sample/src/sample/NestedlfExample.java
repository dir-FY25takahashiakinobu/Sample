package sample;

public class NestedlfExample{
    public static void main(String[] args) {
        int number = 30; //成績
       
       if(number >= 20) {
           System.out.println("20以上");
           
           if (number < 40) {
               System.out.println("20以上40未満");
               
               if(number == 30) {
                   System.out.println("ちょうど30");
                 }
               }
           }

    }

}
