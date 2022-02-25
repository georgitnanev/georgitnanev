package MobilePhone;

public class PhoneBattery {
    private  String model;
    private  int idleTime;
    private  int hoursTalk;

    public PhoneBattery() {
        this.model = null;
        this.idleTime = 0;
        this.hoursTalk = 0;
    }
    public PhoneBattery(String model, int idleTime, int hoursTalk) {
        this.model = model;
        this.idleTime = idleTime;
        this.hoursTalk = hoursTalk;

    }
    public String getModel() {
        return model;
    }
    public int getIdleTime() {
        return idleTime;
    }
    public int getHoursTalk() {
        return hoursTalk;
    }
}
