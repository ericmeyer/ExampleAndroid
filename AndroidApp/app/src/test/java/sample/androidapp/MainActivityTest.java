package sample.androidapp;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)

// See http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/
// for running in the IDE. Otherwise, run from the command line.

public class MainActivityTest {

    @Test
    public void testSeeFourAndFive() {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        TextView textView = (TextView) mainActivity.findViewById(R.id.example_text_field);
        assertThat(textView.getText().toString(), equalTo("Set in MainActivity: 4 5"));
    }

}
