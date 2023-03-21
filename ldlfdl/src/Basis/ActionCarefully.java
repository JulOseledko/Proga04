package Basis;

import Dop.Body;
import Dop.Clarify;

public class ActionCarefully extends Action {

    public static void lower(Protagonists n, Protagonists wsh) {
        Body b = Body.LEGS;
        System.out.println(wsh.toString() + " осторожно опустили персонажа " + n.toString() + " " + b + " на землю");
    }
    public static void guide(Protagonists wsh, Protagonists n) {
        Clarify cf = new Clarify() {
            @Override
            public void clarifyDetails() {
                System.out.println(", бережно поддерживая под руки");
            }
        };
        System.out.print(wsh.toString() + " потихоньку повели персонажа " + n.toString());
        cf.clarifyDetails();
    }
}
