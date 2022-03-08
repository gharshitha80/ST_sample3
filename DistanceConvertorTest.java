import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceConvertorTest{
    @Test
    public void kms_to_meters_test(){
        DistanceConvertor x = new DistanceConvertor();
        assertEquals( expected: 10000, a.kms_to_meters(10));
    }
}