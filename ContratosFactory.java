public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Corola(100, "cheio", "azul");
        } else if ("B".equals(requestedGrade)) {
            return new Audi(100, "cheio", "preto");
        }else {
            return null;
        }
    }

}
