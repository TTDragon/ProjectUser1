package com.company;

public class Main {

    public static void main(String[] args) {
        User us1 = new User("ooo", "jhkj");
        us1.setLogin("ghhh");
        System.out.println(us1.getLogin());

        var hm2 = new Humen("Kon", "Chan", " Yj", "Konb", "ccb12");
        System.out.println( hm2.getName() + " " + hm2.getFirstname() + " " + hm2.getSecondname());

        var uf3 = new UpFirstLetter("kon", "chan", "yj", "Konb", "ccb12");
        System.out.println( uf3.getUpname() + " " + uf3.getUpfirstname() + " " + uf3.getUpsecondname());

        var ac4 = new AuthirizationChecker("kon", "chan", "yj", "Konb", "ccb12");
        ac4.setPassword("ccb12");
        ac4.PasswordChecker(ac4.getNewPassword(), ac4.getNowPassword());
        System.out.println( ac4.getResultChecker());
    }
}
