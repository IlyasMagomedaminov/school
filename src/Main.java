public class Main {
    public static void main(String[] args) {
//        gryffindor[] gryffindors = {
//                new gryffindor("Harry Potter", 100, 100, 100, 100, 100),
//                new gryffindor("Hermoine Granger", 85, 55, 68, 70, 30),
//                new gryffindor("Ron Weasley", 50, 60, 70, 80, 40)
//        };
//        hufflepuff[] puffleduis = {
//                new hufflepuff("Zakharia Smith", 50, 80, 60, 30, 20),
//                new hufflepuff("Cedrick Diggory", 65, 40, 70, 50, 80),
//                new hufflepuff("Justin Finch-Fletchlie", 10, 20, 30, 40, 50)
//        };
//        ravenclaw[] kogtevrans = {
//                new ravenclaw("Cho Chang", 90, 80, 70, 60, 50, 40),
//                new ravenclaw("Padma Patil", 60, 40, 50, 30, 70, 80),
//                new ravenclaw("Marcus Belbie", 70, 70, 60, 60, 70, 70)
//        };
//        slytherin[] slytherins = {
//                new slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100),
//                new slytherin("Graham Montague", 60, 70, 30, 20, 75, 60, 20),
//                new slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 69, 80),
//        };
        gryffindor harryPotter = new gryffindor("Harry Potter", 100, 100, 100, 100, 100);
        gryffindor hermioneGranger = new gryffindor("Hermoine Granger", 85, 55, 68, 70, 30);

        slytherin dracoMalfoy = new slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);
        slytherin gregoryGoyle = new slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);

        ravenclaw ChoChang = new ravenclaw("Cho Chang", 90, 80, 70, 60, 50, 40);
        ravenclaw MarcusBelbie = new ravenclaw("Marcus Belbie", 70, 70, 60, 60, 70, 70);

        hufflepuff ZakhariaSmith = new hufflepuff("Zakharia Smith", 50, 80, 60, 30, 20);
        hufflepuff CedrickDiggory = new hufflepuff("Cedrick Diggory", 65, 40, 70, 50, 80);

        hermioneGranger.compare(dracoMalfoy);

        hermioneGranger.compare(harryPotter);

        dracoMalfoy.compare(gregoryGoyle);

        CedrickDiggory.compare(ChoChang);

        MarcusBelbie.compare(ZakhariaSmith);


    }
}