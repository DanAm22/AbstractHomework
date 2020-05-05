package tech;

public class Pixel {

    private String color;

    public Pixel(){
        this.color = "#FFFFFF";
    }

    public Pixel(String color){
        this.color = color;
    }

    public void setPixel(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "Pixel color is: " + this.color;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Pixel other = (Pixel) obj;
        if(this.color.equals(other.color)){
            return true;
        }
        return false;
    }

    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + ((this.color == null) ? 0 : this.color.hashCode());
        return result;
    }
}
