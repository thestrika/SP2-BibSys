public class AudioBook extends Title{
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    public double calculatePoints(){
        return (durationInMinutes * 0.5) * copies * convertLiteratureType();
    }

}
