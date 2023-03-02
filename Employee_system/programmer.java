import java.util.Arrays;
public class programmer extends employee{
    private String[] languages;
    public programmer(String name,String surname, int id, String[] languages) {
        super(name,surname,id);
        this.languages=languages;
    }

    public void formatIt(String operatingSystem){
        System.out.println(getName() + " " + "sets up ~" + operatingSystem + " operating system.");
    }
    @Override
    public void display()   {
        super.display();
        System.out.println("Languages programmer know: " +  Arrays.toString(languages));
    }
}