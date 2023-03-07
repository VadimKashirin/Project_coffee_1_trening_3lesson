public class Coffee_Store {
    private  CoffeeValue coffeeValue;

    public Coffee_Store(CoffeeValue coffeeValue) {
        this.coffeeValue = coffeeValue;
    }

    public boolean coffe_Sale200(){
        System.out.println("Название кофе: " + coffeeValue.name()+ "\n Объем: "+ coffeeValue.valume200()+"\n Цена: "+coffeeValue.price200()+"\n Описание: "+coffeeValue.description());
        return false;
    }
    public boolean coffe_Sale300(){
        System.out.println("Название кофе: " + coffeeValue.name()+ " Объем: "+ coffeeValue.valume300()+" Цена: \n"+coffeeValue.price300()+" Описание: "+coffeeValue.description());

        return false;
    }
    public boolean coffe_Sale400(){
        System.out.println("Название кофе: " + coffeeValue.name()+ " Объем: "+ coffeeValue.valume400()+" Цена: "+coffeeValue.price400()+" Описание: "+coffeeValue.description());
        return false;
    }
    public void coffe_value(){
        System.out.println("Выберите объем коффе ");
    }

}
