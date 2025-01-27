package Television;

public class Television {
    int channel;
    int maxChannel = 10;
    boolean isOn = false;
    public void setChannel(int channel) {
        if (channel == maxChannel+1) {
            channel = 1;
            this.channel = channel;
        } else if (channel <= maxChannel+1) {
            this.channel = channel;
        }
    }
    public void pressOnOff() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }
    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }
}
