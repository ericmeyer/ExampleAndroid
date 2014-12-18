package sample.androidlibrary;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class BarTest {

    @Test
    public void testGetNumber() {
        Bar bar = new Bar();
        assertThat(bar.getNumber(), is(equalTo(5)));
    }

}
