public class gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public gryffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший гриффиндорец чем %s", betterStudentName, otherStudentName));
    }
}
