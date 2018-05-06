package multi.test;

public class HighBeamImpl implements HighBeam {

    private String name;

    public HighBeamImpl() {
        name = "default HighBeam";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
