package shapes;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height) {
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight() {
        System.out.println("shapes.Rectangle height is: " + this.height);
    }

    @Override
    public int getSize() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "shapes.Rectangle: height is: " + this.height + ", width is: " + this.width + ", made of steel, contains the text: \"Yellow rectangle\".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Rectangle other = (Rectangle) obj;
        if (super.equals(other) && this.width == other.width && this.height == other.height) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = result + this.width + this.height;
        return result;
    }
}
