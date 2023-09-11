public class Main {
    public static void main(String[] args) {
Bulochka bulochka = new Bulochka("14cm","vanil");
        System.out.println(bulochka);
        bulochka.Nankana();
        System.out.println("------------------");
        Nan nan = new Nan("15cm","dough");
        System.out.println(nan);
        nan.Nankana();
        System.out.println("------------------");
        Pirog pirog = new Pirog("17cm","klubnika");
        System.out.println(pirog);
        pirog.Nankana();
    }
}