package Lesson7.CrocodileTask;

import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCrocodile {
    Crocodile crocodile = new Crocodile();

    @Before
    public void SetUp() {
        crocodile.setColor("green");
        crocodile.setHungry(true);
        crocodile.setLength(100);
        crocodile.setName("Gena");
        crocodile.setSize(2);

    }

    @Test
    public void testCrocodile(){
        SoftAssertions softy = new SoftAssertions();
        softy.assertThat(crocodile.getColor()).isEqualTo("green");
        softy.assertThat(crocodile.getLength()).isEqualTo(100);
        softy.assertThat(crocodile.getName()).isEqualTo("Gena");
        softy.assertThat(crocodile.isHungry()).isEqualTo(true);
        softy.assertAll();
    }
    @After
    public void tearDown(){
        crocodile = null;
    }
}
