public abstract class Title {
    private String title;
    private String literatureType;
    public final static double RATE = 0.067574;

    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty(){
        return 0;
    }

    public abstract double calculatePoints();

    public double convertLiterature(){
        return 0;
    }


}
