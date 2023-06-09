package method_overridding;

public class Test {
    /**
     * Test class to create objects and call the methods
     * Output:
     * SBI Rate of Interest: 8
     * ICICI Rate of Interest: 7
     * AXIS Rate of Interest: 9
     */

        public static void main(String[] args) {
            SBI s = new SBI();
            IcIc i = new IcIc();
            Axis a = new Axis();
            System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
            System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
            System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
        }
    }




