public class Pen {
    private boolean capOn = true;
    private Color color = Color.RED;

    public Pen(Color color) {
        this.color = color;
    }

    public Pen() {

    }

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    // your code here
    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public String draw() {
        if (capOn) return "";
        return "Drawing " + color;
    }

    public void changeColor(Color color) {
        if (capOn) {
            this.color = color;
        }
    }
}