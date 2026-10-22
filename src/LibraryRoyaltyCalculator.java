public class LibraryRoyaltyCalculator {

    public static void main(String[] args){

        //OBJEKTER
        Author author1 = new Author("J.K. Rowling");
        Title title1 = new PrintedBook("Harry Potter and the Prisoner of Azkaban", "SKØN", 40, 300);
        Title title2 = new PrintedBook("Harry Potter and the Goblet of Fire", "SKØN", 30, 280);
        Title title3 = new AudioBook("Harry Potter and the Half-Blood Prince", "SKØN", 20, 380);

        Author author2 = new Author("Suzanne Collins");
        Title title4 = new PrintedBook("The Hunger Games 1", "SKØN", 35, 270);
        Title title5 = new PrintedBook("The Hunger Games 2", "SKØN", 15, 370);
        Title title6 = new AudioBook("The Hunger Games 3", "SKØN", 45, 230);

        Author author3 = new Author("Jeff Kinney");
        Title title7 = new PrintedBook("Wimpy Kid 1", "TE", 50, 150);
        Title title8 = new PrintedBook("Wimpy Kid 2", "TE", 45, 130);
        Title title9 = new AudioBook("Wimpy Kid 3", "TE", 57, 170);

        //ADDTITLE
        author1.addTitle(title1);
        author1.addTitle(title2);
        author1.addTitle(title3);

        author2.addTitle(title4);
        author2.addTitle(title5);
        author2.addTitle(title6);

        author3.addTitle(title7);
        author3.addTitle(title8);
        author3.addTitle(title9);






        //CALCULATE ROYALTIES
        System.out.println("Name: " + author1.getName() + " | " + Math.round(author1.calculateRoyalties()) + "kr. ");
        System.out.println("Name: " + author2.getName() + " | " + Math.round(author2.calculateRoyalties()) + "kr. ");
        System.out.println("Name: " + author3.getName() + " | " + Math.round(author3.calculateRoyalties()) + "kr. ");



    }

}
