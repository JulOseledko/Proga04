package Basis;
import Dop.Body;
import Dop.Clarify;

public class ActionFail extends Action implements Clarify {
    private String Name;
    public ActionFail(String s){
        this.Name = s;
    }
    public static void collapsed(){
        Body b = Body.BREAST;
        System.out.print("рухнул " + b + ", ");
    }
    public void disappear(){
        Health disease = new Health("болезнь");
        System.out.print(disease + " пропадает ");
        disease.clarifyDetails();
    }
    public static void floated(Protagonists p){
        Body b = Body.EYES2;
        System.out.println("все поплыло у персонажа " + p.toString() + " " + b + ":");
    }

    @Override
    public void clarifyDetails() {
        Body b = Body.FACE;
        System.out.println(this.Name + " " + b + " вниз");
    }
}
