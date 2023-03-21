package Basis;

import Dop.Clarify;
import Dop.Compare;
import Dop.LetGoException;

public class ActionLetGo extends Action {

    private String letgo;

    public ActionLetGo(String letgo){
        this.letgo = letgo;
    }
    public String getName(){
        return this.letgo;
    }

    public static void letGoRocket(Protagonists protagonist, Protagonists p) {
        Clarify cl = new Clarify() {
            @Override
            public void clarifyDetails() {
                System.out.println("стали спускаться по металлической лестничке");
            }
        };
        System.out.print(protagonist.toString() + " вынесли персонажа " + p.toString() + " из рокеты и ");
        cl.clarifyDetails();
    }

    public void letGo(Protagonists protagonist, Protagonists p, ActionLetGo a) throws LetGoException {
        if (this.letgo.equals(a.getName())){
            Compare c = Compare.AS;
            System.out.println(c + " " + protagonist.toString() + " боятся отпустить его");
        }else {
            throw new LetGoException(protagonist.toString() + " отпустили персонажа " + p.toString());
        }
    }

}
