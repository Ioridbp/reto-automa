package co.com.choucair.certificacion.retoautoma.question;
import co.com.choucair.certificacion.retoautoma.interaction.Alert;
import co.com.choucair.certificacion.retoautoma.userinterfaces.DespliegueMenu;
import co.com.choucair.certificacion.retoautoma.userinterfaces.PagColorbib;
import co.com.choucair.certificacion.retoautoma.userinterfaces.Paginablaze;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certificacion.retoautoma.interaction.Alert.alergettext;
/*
public class Verificar implements Question{
    public static Verificar resultado(){
        return new Verificar();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagColorbib.LBL_TITULO).viewedBy(actor).asString();
    }
}
*/

public class Verificar implements Question<Boolean>{
    private String question;

    public Verificar (String question){
        this.question = question;
    }

    public static Verificar resultado(String question) {
        return new Verificar(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String nomPagina = Text.of(PagColorbib.LBL_TITULO).viewedBy(actor).asString();

        if (question.trim().equals(nomPagina)){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}







