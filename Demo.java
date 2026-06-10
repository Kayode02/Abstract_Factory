public class Demo {
    static void main(String[] args) {
        Custumer cliente = new Custumer("A", true);
        Factory factory = getClass(cliente);
        Car car = factory.creat(cliente.getGradeResquest());
        car.startEndine();
    }

    private static Factory getClass(Custumer cliente) {
        if (cliente.HasCompanyContract()){
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }

}
