package eu.lisasteendam.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "a7cljuPgOU19IJzFcGAABUbuYAiVk3Ect49jn2Js",
                "tBtum8EUm3DIUmd77wo9hHuW9jk6g2WDDXgeycIk");
    }
}
