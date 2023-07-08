public class hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public hufflepuff(String name, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int calculateSpecificScore(){
        return  this.hardworking + this.loyal + this.honest;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший пуфендуец чем %s", betterStudentName, otherStudentName));
    }
}
