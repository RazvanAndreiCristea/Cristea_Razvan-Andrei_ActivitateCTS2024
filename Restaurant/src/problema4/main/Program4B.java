package problema4.main;

import problema4.classes.ContClient;

public class Program4B {
    public static void main(String[] args) {
        ContClient contClient1 = new ContClient("Ionel", "ionel@java.com", 22);

        System.out.println(contClient1);

        ContClient contClient2 = (ContClient) contClient1.copiazaCont();

        contClient2.setNume("Angelescu");
        contClient2.setEmail("angelescu@python.ro");
        contClient2.setVarsta(45);

        System.out.println(contClient1);
        System.out.println(contClient2);
    }
}