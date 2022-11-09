package mypackage;

class MyOwnException extends Exception{
    MyOwnException(String msg){
        super(msg);
    }
}
public class UserDefException {
    public static void main(String[] args) {
       try{
           int age=15;
           if(age<18){
               throw new MyOwnException("you cant vote");
           }else{
               System.out.println("you can vote");
           }
       }catch (Exception e){
           System.out.println(e);
       }
    }


}
