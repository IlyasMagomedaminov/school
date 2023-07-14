public class ravenclaw extends Hogwarts {
   private int intelligence;
   private int wisdom;
   private int wit;
   private int creativity;

   public ravenclaw(String name, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
      super(name, powerOfMagic, transgressionDistance);
      this.intelligence = intelligence;
      this.wisdom = wisdom;
      this.wit = wit;
      this.creativity = creativity;
   }
   public int calculateSpecificScore(){
      return this.intelligence + this.wisdom + this.wit + this.creativity;
   }
   public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
      System.out.println(String.format("%s лучший когтевранец чем %s", betterStudentName, otherStudentName));
   }
}
