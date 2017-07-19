import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatPhoneNumberTest {


    @Test @Ignore
    public void removeNonDigit_with_dash() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.removeNonDigit("00-44-4855558361");
        assertEquals("00444855558361", actualResult);
    }

    @Test @Ignore
    public void removeNonDigit_with_space() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.removeNonDigit("00 44 4855 558361");
        assertEquals("00444855558361", actualResult);
    }

    @Test @Ignore
    public void removeNonDigit_with_dash_and_space() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.removeNonDigit("00 44 4855-558-361");
        assertEquals("00444855558361", actualResult);
    }

    @Test @Ignore
    public void evenPhoneNumber() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("555372654");
        assertEquals("555-372-654", actualResult);
    }

    @Test @Ignore
    public void oddPhoneNumberOnlyLastGroup() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("004-448-555-583-61");
        assertEquals("004-448-555-583-61", actualResult);
    }

    @Test @Ignore
    public void oddPhoneNumberOnlyLast2Group() {
        FormatPhoneNumber formatPhoneNumber = new FormatPhoneNumber();
        String actualResult = formatPhoneNumber.solution("0 - 22 1985--324");
        assertEquals("022-198-53-24", actualResult);
    }

}
