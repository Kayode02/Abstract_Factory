public class Custumer {
    private String gradeResquest;
    private boolean hasCompanyContract;

    public Custumer(String gradeResquest, boolean hasCompanyContract) {
        this.gradeResquest = gradeResquest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean HasCompanyContract(){
        return hasCompanyContract;
    }
    public String getGradeResquest(){
        return gradeResquest;
    }
}
