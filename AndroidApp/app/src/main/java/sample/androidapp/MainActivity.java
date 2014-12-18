package sample.androidapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import javamodule.Foo;
import sample.androidlibrary.Bar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.example_text_field);
        Foo foo = new Foo();
        Bar bar = new Bar();
        String four = String.valueOf(foo.getNumber());
        String five = String.valueOf(bar.getNumber());
        textView.setText("Set in MainActivity: " + four + " " + five);
    }

}
