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

    public double convertLiteratureType(){
        switch (literatureType){
            case "BI", "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;
        }
    }



}
