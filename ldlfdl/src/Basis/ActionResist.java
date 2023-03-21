package Basis;
import Dop.Body;

public class ActionResist extends Action {
    public static void escape(Protagonists p) {
        Body b = Body.HAND;
        System.out.println("персонаж " + p.toString() + " принялся вырываться " + b);
    }
    public static void hit(Protagonists p){
        System.out.println("пытался ударить персонажа " + p.toString());
    }
}
