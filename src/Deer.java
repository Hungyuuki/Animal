public class Deer {
    public Deer() {
        System.out.print("Deer");
        System.out.println("-run first");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns()+ "-run third");
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
        System.out.println("-run second");
    }

    public boolean hasHorns() {
        return true;
    }
}

