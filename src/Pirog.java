public class Pirog implements Bekend{

    private String razmer;

    private String vkus;

    public Pirog(String razmer, String vkus) {
        this.razmer = razmer;
        this.vkus = vkus;
    }

    @Override
    public void Nankana() {
        System.out.println("made from dough");
    }

    @Override
    public String toString() {
        return "Pirog" +"\n"+
                "razmer= " + razmer + "\n" +
                "vkus= " + vkus;
    }
}
