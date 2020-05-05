package shapes;

public abstract class Shape {

    private String text;
    private String material;

    public Shape() {

    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public abstract int getSize();

    @Override
    public String toString() {
        return "Made of plastic, contains the text : \" Math is easy\".";
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

        Shape other = (Shape) obj;
        if (other.text == null || other.material == null) {
            return false;
        }
        return this.text.equals(other.text) && this.material.equals(other.material);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((this.text == null) ? 0 : this.text.hashCode());
        result = prime * result + ((this.material == null) ? 0 : this.material.hashCode());
        return result;
    }
}
