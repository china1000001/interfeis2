public class Bulochka implements Bekend {
    private String razmer;
    private String vkus;

    public Bulochka(String razmer, String vkus) {
        this.razmer = razmer;
        this.vkus = vkus;
    }


    @Override
    public void Nankana() {
        System.out.println("made from dough");
    }

    @Override
    public String toString() {
        return "Bulochka "+"\n"+
                "razmer=" + razmer + "\n"+
                "vkus=" + vkus ;
    }
}
