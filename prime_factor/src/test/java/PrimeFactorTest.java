import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {

    @Test @Ignore
    public void should_return_empty_when_number_is_1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(), primeFactor.of(1));
    }

    @Test @Ignore
    public void should_return_2_when_number_is_2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(2), primeFactor.of(2));
    }

    @Test @Ignore
    public void should_return_3_when_number_is_3() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(3), primeFactor.of(3));
    }

    @Test @Ignore
    public void should_return_2_2_when_number_is_4() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(2, 2), primeFactor.of(4));
    }

    @Test @Ignore
    public void should_return_2_3_when_number_is_6() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(2, 3), primeFactor.of(6));
    }

    @Test @Ignore
    public void should_return_2_2_2_when_number_is_8() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(2, 2, 2), primeFactor.of(8));
    }

    @Test @Ignore
    public void should_return_3_3_when_number_is_9() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(3, 3), primeFactor.of(9));
    }

    @Test @Ignore
    public void should_return_3_3_3_when_number_is_27() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(list(3, 3, 3), primeFactor.of(27));
    }


    private List<Integer> list(int ... input) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i: input) {
            list.add(i);
        }
        return list;
    }

}
