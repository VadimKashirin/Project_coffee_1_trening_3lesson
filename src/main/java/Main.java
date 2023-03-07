import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        System.out.println("Добро пожаловать в CoffeeStore");
        System.out.println(" Нажмите 1:Latte \n Нажмите 2:Capuccino \n Нажмите 3:Raff \n");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input){
            case 1:
                CoffeeValue latte = context.getBean("latte",Latte.class);
                Coffee_Store coffee_store = new Coffee_Store(latte);
                System.out.println("Выберите объем кофе");
                System.out.println(" Нажмите 1:200 \n Нажмите 2:300 \n Нажмите 3:400 \n");
                int input_valume = in.nextInt();
                switch (input_valume){
                    case 1:
                        System.out.println(coffee_store.coffe_Sale200());
                        break;
                    case 2:
                        System.out.println(coffee_store.coffe_Sale300());
                        break;
                    case 3:
                        System.out.println(coffee_store.coffe_Sale400());
                        break;
                }
                break;
            case 2:
                CoffeeValue capuccino = context.getBean("capuccino",Capuccino.class);
                Coffee_Store coffee_store1 = new Coffee_Store(capuccino);
                System.out.println("Выберите объем кофе");
                System.out.println(" Нажмите 1:200 \n Нажмите 2:300 \n Нажмите 3:400 \n");
                int input_valume_capuccino = in.nextInt();
                switch (input_valume_capuccino){
                    case 1:
                        System.out.println(coffee_store1.coffe_Sale200());
                        break;
                    case 2:
                        System.out.println(coffee_store1.coffe_Sale300());
                        break;
                    case 3:
                        System.out.println(coffee_store1.coffe_Sale400());
                        break;
                }
                break;
            case 3:
                CoffeeValue raff = context.getBean("raff",Raff.class);
                Coffee_Store coffee_store2 = new Coffee_Store(raff);
                System.out.println("Выберите объем кофе");
                System.out.println(" Нажмите 1:200 \n Нажмите 2:300 \n Нажмите 3:400 \n");
                int input_valume_raff = in.nextInt();
                switch (input_valume_raff){
                    case 1:
                        System.out.println(coffee_store2.coffe_Sale200());
                        break;
                    case 2:
                        System.out.println(coffee_store2.coffe_Sale300());
                        break;
                    case 3:
                        System.out.println(coffee_store2.coffe_Sale400());
                        break;
                }
                break;


        }
        context.close();
    }
}
