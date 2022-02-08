import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {


    public static void main(String[] args) {

        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/getEmail", getFormHandler);

        app.post("/postEmail", postFormHandler);

    }

    public static Handler getFormHandler = ctx -> {

        ctx.render("form.jte");

    };

    public static Handler postFormHandler = ctx -> {

        String sender = ctx.formParam("sender");
        String receiver = ctx.formParam("receiver");
        String subject = ctx.formParam("subject");
        String contents = ctx.formParam("contents");

        ctx.result("You are sending " + receiver + " an email from " + sender + " \nSubject: " 
                    + subject + " \nContents: " + contents);

    };

}
