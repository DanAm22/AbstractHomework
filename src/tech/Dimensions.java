package tech;

public class Dimensions {
    private final int width;
    private final int length;
    private final int depth;

    public Dimensions(int width, int length, int depth){
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public String toString(){
        return "its dimensions are: \n -width: " + this.width + "\n -length: " + this.length + "\n -depth: " + this.depth;
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

        Dimensions other = (Dimensions) obj;
        if(this.depth == other.depth && this.length == other.length && this.width == other.width){
            return true;
        }
        return false;
    }

    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + this.width;
        result = prime * result + this.length;
        result = prime * result + this.depth;
        return result;
    }
}
