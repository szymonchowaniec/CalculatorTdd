import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void shoouldCountSumWhenEmptyString(){

        //given
        String s = "";

        //when
        int add = calculator.add(s);

        //then
        assertThat(add,is(0));

    }

    @Test
    public void shoouldCountSumWhenOneNumber(){

        //given
        String s = "1";

        //when
        int add = calculator.add(s);

        //then
        assertThat(add,is(1));

    }

    @Test
    public void shoouldCountSum(){

        //given
        String s = "1,2";

        //when
        int add = calculator.add(s);

        //then
        assertThat(add,is(3));
    }


}