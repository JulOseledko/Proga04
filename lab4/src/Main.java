import Basis.*;
import Dop.Compare;
import Dop.EarthException;
import Dop.LetGoException;

public class Main {
    public static void main(String[] args) {
        Protagonists nano = new Protagonists("Незнайка");
        Protagonists vish = new Protagonists("Винтик и Шпунтик");
        ActionLetGo.letGoRocket(vish,nano);
        Health.Physical.notBreathe(nano);
        Sky s = new Sky("небо");
        Epithets blue = new Epithets("голубое яркое");
        s.giveVibe(blue);
        Sky.Clouds.whiteClouds();
        Sky.Sun.shineSun();
        Health.Emotional.emotionalIntoxication(nano);
        ActionFail.floated(nano);
        Meadow l = new Meadow("Луг");
        l.greenMeadow();
        Meadow.Flowers f = l.new Flowers();
        f.flower();
        Meadow.Trees t = l.new Trees();
        t.tree();
        Meadow.Rivers r = l.new Rivers();
        r.river();
        nano.see();
        try{
            nano.stepEarth(vish);
        } catch (EarthException e) {
            Compare c = Compare.AS;
            System.out.println(c.toString() + " " + e.getMessage());
        }
        ActionFeel.worry(nano);
        ActionCarefully.lower(nano, vish);
        ActionCarefully.guide(vish,nano);
        nano.see();
        ActionLetGo lg = new ActionLetGo("отпустили");
        ActionLetGo gl = new ActionLetGo("боятся отпустить");
        try{
            gl.letGo(vish,nano,gl);
        }catch (LetGoException e){
            System.out.println(e.getMessage());
        }
        ActionResist.escape(nano);
        Protagonists schpyntic = new Protagonists("Шпунтик");
        ActionResist.hit(schpyntic);
        try{
            gl.letGo(vish,nano,lg);
        }catch (LetGoException e){
            System.out.println(e.getMessage());
        }
        Epithets uncertain = new Epithets("несколько неуверенных");
        nano.giveVibe(uncertain);
        ActionFail.collapsed();
        ActionFail fail = new ActionFail("упал");
        fail.clarifyDetails();
        nano.kiss();
        MinorCharacters hat = new MinorCharacters("шляпа");
        hat.fly(nano);
        Health.Emotional.tears();
        nano.whisper();
        MinorCharacters sun = new MinorCharacters("солнышко");
        Epithets red = new Epithets("красное");
        sun.giveVibe(red);
        MinorCharacters wind = new MinorCharacters("ветерок");
        wind.blowing(nano);
        ActionFeel.iron();
        ActionFeel.seems(nano);
        Feeling feel = new Feeling("чувство");
        Epithets over = new Epithets("огромное-преогромное");
        feel.giveVibe(over);
        ActionKnow.notKnow(nano);
        feel.named();
        ActionKnow.know(feel);
        nano.description("прижимал");
        MinorCharacters creature = new MinorCharacters("существо");
        creature.description("к родному близкому");
        ActionFeel.feel();
        fail.disappear();
        try{
            nano.stepEarth(nano);
        } catch (EarthException e) {
            System.out.println(e.getMessage());
        }
        Feeling.goodFeelings();
        nano.completion();
    }
}