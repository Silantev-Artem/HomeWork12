public class Main {
    public static void main(String[] args) {


        Author carroll = new Author("Lewis", "Carroll");
        Book alice = new Book("Alice through the Looking Glass", 2008, carroll);
        System.out.println(alice);

        Author salinger = new Author("Jerome", "Salinger");
        Book catcherRye = new Book("Catcer in the rye", 2010, salinger);
        System.out.println(catcherRye);

        Author murakami = new Author("Haruki", "Murakami");
        Book sputnik = new Book("Sputnik Sweetheart", 2001, murakami);
        System.out.println(sputnik);

        sputnik.setPublicationYear(2022);
        System.out.println(sputnik);


        ///System.out.println(carroll.equals(salinger));
        ///System.out.println(carroll.equals(murakami));
        ///System.out.println(salinger.equals(murakami));
        ///System.out.println(alice.equals(alice));
        ///System.out.println(alice.equals(catcherRye));
        ///System.out.println(alice.equals(sputnik));
        ///System.out.println(catcherRye.equals(sputnik));
    }
}