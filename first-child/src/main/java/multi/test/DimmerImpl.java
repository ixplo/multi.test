package multi.test;

public class DimmerImpl implements Dimmer {

    private String name;

    public DimmerImpl() {
        name = "default Dimmer";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
