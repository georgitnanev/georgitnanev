package MobilePhone;

import java.util.ArrayList;
import java.util.Date;

public class GSMTest {
    public static void main(String[] args) {
        ArrayList<GSM> gsms = new ArrayList<>();
        gsms.add(new GSM("Iphone10", 2000, new PhoneBattery("LIION", 1000, 500),
                new Display(5.5, 12000)));
        gsms.add(new GSM("Iphone11", 2500, new PhoneBattery("LIION", 2000, 700),
                new Display(6.5, 14000)));
        gsms.add(new GSM("Iphone12", 2000, new PhoneBattery("LIION", 3000, 900),
                new Display(7.5, 18000)));

        for (GSM gsm : gsms) {
            System.out.println(gsm.toString());
            System.out.println("     ");
        }
        GSM.printNokiaN95();
        GSM testCallGsm = new GSM("Top", 2000);
        testCallGsm.makeCall(new Call(new Date(), 6));
        testCallGsm.makeCall(new Call(new Date(), 8));
        testCallGsm.makeCall(new Call(new Date(), 65));
        testCallGsm.makeCall(new Call(new Date(), 69));
        testCallGsm.callHistory();
        testCallGsm.calcCallsPrice(0.37);
        System.out.println(".........");
        testCallGsm.deleteLongestCall();
        testCallGsm.callHistory();
        testCallGsm.calcCallsPrice(0.37);
        System.out.println(".........");
        testCallGsm.deleteCall(2);
        testCallGsm.callHistory();
        testCallGsm.calcCallsPrice(0.37);
    }
}
