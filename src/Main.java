public class Main {
    public static void main(String[] args) {


        Author carroll = new Author("Lewis", "Carroll");
        Book alice = new Book("Alice through the Looking Glass", 2008, carroll);
        System.out.println(carroll.getFirstName() + " " + carroll.getLastName() +  " -- " + alice.getTitle() + " , " + alice.getPublicationYear());

        Author salinger = new Author("Jerome", "Salinger");
        Book catcherRye = new Book("Catcer in the rye", 2010, salinger);
        System.out.println(salinger.getFirstName() + " " + salinger.getLastName() + " -- " + catcherRye.getTitle() + " , " + catcherRye.getPublicationYear());

        Author murakami = new Author("Haruki", "Murakami");
        Book sputnik = new Book("Sputnik Sweetheart", 2001, murakami);
        System.out.println(murakami.getFirstName() + " " + murakami.getLastName() + " -- " + sputnik.getTitle() + " , " + sputnik.getPublicationYear());

        sputnik.setPublicationYear(2022);
        System.out.println(murakami.getFirstName() + " " + murakami.getLastName() + " -- " + sputnik.getTitle() + " , " + sputnik.getPublicationYear());



    }
}