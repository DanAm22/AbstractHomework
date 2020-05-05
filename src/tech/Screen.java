package tech;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private List<Pixel> pixels;
    private Dimensions dimensions;

    public Screen(int noPixels, int width, int length, int depth){
        this.pixels = new ArrayList<Pixel>(noPixels);
        for(int i = 0; i < noPixels; i++){
            pixels.add(new Pixel());
        }
        this.dimensions = new Dimensions(width,length,depth);
    }

    public void setPixel(int index, String color){
        if(index < 0 && index > pixels.size()){
            System.out.println("Indexul introdus este invalid!");
        }
        else {
            this.pixels.get(index).setPixel(color);
        }
    }

    public void colorScreen(String color){
        for(Pixel p : pixels){
            p.setPixel(color);
        }
    }

    public List<Pixel> getPixels(){
        return this.pixels;
    }

    public String toString(){
        return "Screen is composed of " + this.pixels.size() + " pixels and " + this.dimensions;
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

        Screen other = (Screen) obj;
        if(this.pixels.equals(other.pixels) && this.dimensions.equals(other.dimensions)){
            return true;
        }
        return false;
    }

    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = result * prime + ((this.dimensions == null) ? 0 : this.dimensions.hashCode());
        result = result * prime + ((this.pixels == null) ? 0 : this.pixels.hashCode());
        return result;
    }
}
