public class Rectangle {
    float height;
    float width;

    public float calculateArea() {
        return (height * width);
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        myRectangle.height = 5.5f;
        myRectangle.width = 2.5f;

        float area = myRectangle.calculateArea();
        System.out.println("Area: " + area);
    }
}
