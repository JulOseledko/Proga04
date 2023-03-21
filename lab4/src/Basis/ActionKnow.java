package Basis;

public class ActionKnow extends Action{

    public static void notKnow(Protagonists p){
        System.out.print("персонаж " + p.toString() + " не знал, ");
    }
    public static void know(Feeling f){
        System.out.print("но знал: ");
        f.good();
    }
}

