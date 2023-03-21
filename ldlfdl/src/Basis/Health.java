package Basis;

import Dop.Body;
import Dop.Clarify;

public class Health implements Clarify {
    private String Name;

    public Health(String name) {
        this.Name = name;
    }

    public static class Emotional {
        public static void emotionalIntoxication(Protagonists P) {
            System.out.println("свежий воздух опъянил персонажа " + P.toString());
        }

        public static void tears() {
            Body b = Body.EYES1;
            System.out.println(b + " покатились слезы");
        }
    }

    public static class Physical {
        public static void energy() {
            System.out.print("силы снова возвращаются\n");
        }

        public static void notBreathe(Protagonists p) {
            System.out.println("у персонажа " + p.toString() + " захватило дыхание");
        }
    }

    @Override
    public void clarifyDetails() {
        System.out.println("сама собой");
    }

    @Override
    public String toString() {
        return this.Name;
    }

}
