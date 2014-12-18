package javamodule;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FooTest {

    @Test
    public void testEqualsFour() throws Exception {
        Foo foo = new Foo();
        assertThat(foo.getNumber(), is(equalTo(4)));

    }

}
