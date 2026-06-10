public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Creta(100, "cheio", "branco");
        } else if ("B".equals(requestedGrade)) {
            return new nivus(100, "cheio", "verde");
        } else {
            return null;
        }
    }
}
