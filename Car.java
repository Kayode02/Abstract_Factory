public abstract class Car {
    private int horsePower;
    private String fuelScurce;
    private String color;


    public  Car(int horsePower, String fuelScurce, String color) {
        this.horsePower = horsePower;
        this.color = color;
        this.fuelScurce = fuelScurce;
    }

    public void startEndine(){
        System.out.println("O " + fuelScurce + " O motor foi ligado, e esta pronto para se utulizado com a potencia de " + horsePower + " cavalos" );
    }
    public void clean(){
        System.out.println("Seu "+ getClass().getSimpleName());
        System.out.println("esta limpo e a sua cor é " + color);
    }
    public void mechaninCheck(){
        System.out.println("Mecanica do carro conferida");
    }
    public void fuelCar(){
        System.out.println("O carro foi abastecido com " + fuelScurce.toLowerCase());
    }
}
