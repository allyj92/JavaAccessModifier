package package1;
import package2.*;

public class B extends C {
    public static void main(String[] args){
        C c = new C();
//        System.out.println(c.protectedMessage);//error
    }
}
