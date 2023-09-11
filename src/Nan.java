public class Nan implements Bekend {
    private String razmer;

    private String vkus;

    @Override
    public void Nankana() {
        System.out.println("made from dough");
    }
    public Nan(String razmer, String vkus) {
        this.razmer = razmer;
        this.vkus = vkus;

    }

    @Override
    public String toString() {
        return "Nan" +"\n"+
                "razmer= " + razmer + "\n" +
                "vkus= " + vkus ;
    }
}
