/**
 * @(#)Tester.java
 * @Author:  
 * @version 1.00 2020/11/18
 */

public class Tester {

    public static void main(String[] args) {
        Email email = new Email("nmessa@sau16.org");
        System.out.println(email.getUser());
        System.out.println(email.getDomain());
        System.out.println(email.validEmail(email));
    }
}

//Output
//nmessa
//sau16.org
//true