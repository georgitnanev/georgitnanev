package MobilePhone;

import java.util.ArrayList;

public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private PhoneBattery phoneBattery = new PhoneBattery();
    private Display display = new Display();
    private static GSM nokiaN95 = new GSM("N95", 1100,
            new PhoneBattery("LIION",200,300),new Display(18,16000));
    private final ArrayList<Call> calls = new ArrayList<Call>();

    public GSM(String model, double price)
    {
        this.model = model;
        this.price = price;
    }

    public GSM(String model, double price, PhoneBattery phoneBattery,
                     Display display)
    {
        this.model = model;
        this.price = price;
        this.phoneBattery = phoneBattery;
        this.display = display;
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public double getPrice()
    {
        return price;
    }

    public String getOwner()
    {
        return owner;
    }

    public PhoneBattery getBattery()
    {
        return  phoneBattery;
    }

    public Display getDisplay()
    {
        return display;
    }

    @Override
    public String toString()
    {
        return "Model: " + this.model + "\nPrice: " + this.price
                + "\nBattery: " + phoneBattery.getModel() + ", "
                + phoneBattery.getHoursTalk() + "\nDisplay: " + display.getSize()
                + ", " + display.getColours();
    }

    public static void printNokiaN95()
    {
        System.out.println("Model: " + nokiaN95.model + "\nPrice: "
                + nokiaN95.price + "\nBattery: " + nokiaN95.phoneBattery.getModel()
                + ", " + nokiaN95.phoneBattery.getHoursTalk() + "\nDisplay: "
                + nokiaN95.display.getSize() + ", "
                + nokiaN95.display.getColours());
    }

    public void makeCall(Call call)
    {
        calls.add(call);
    }

    public void callHistory()
    {
        if (calls.isEmpty())
        {
            System.out.println("There is no calls in history!");
        }
        else
        {
            for (Call call : calls)
            {
                System.out.println(call);
            }
        }

    }

    public void deleteCall(int callNumber)
    {
        calls.remove(callNumber);
    }

    public void clearHistory()
    {
        calls.clear();
    }

    public void calcCallsPrice(double callPrice)
    {
        double callPriceSum = 0;
        for (Call call : calls)
        {
            callPriceSum += call.getCallDuration() * callPrice;
        }
        System.out.println("The price of your calls is: " + callPriceSum
                + "lv");
    }

    public void deleteLongestCall()
    {
        double longestCall = 0;
        int indexOfLongestCall = 0;
        int counterIndex = 0;
        for (Call call : calls)
        {
            if (call.getCallDuration() > longestCall)
            {
                longestCall = call.getCallDuration();
                indexOfLongestCall = counterIndex;
            }
            counterIndex++;
        }
        calls.remove(indexOfLongestCall);
    }
}




