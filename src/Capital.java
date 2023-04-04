public class Capital extends City{
    private String monument;

    public Capital() {
        super();
        monument = "aucun";
    }
    public Capital(String name, int hab, String country, String monument){
        super(name,hab,country);
        this.monument = monument;
    }

    public String getMonument() {
        return monument;
    }

    public void setMonument(String monument) {
        this.monument = monument;
    }

    @Override
    public String toString(){
        String txt = "";
        txt = super.toString() + "\n  \t ==> " + this.monument+" en est un monument";
        return txt;
}
}
