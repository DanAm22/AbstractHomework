package tech;

public class Speaker {
    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume / 4;
    }

    public Speaker(int maxVolume, int crtVolume){
        this(maxVolume);
        if(crtVolume > maxVolume){
            this.crtVolume = maxVolume;
        }
        else{
            this.crtVolume = crtVolume;
        }
    }

    public boolean increaseVolume(){
        if(crtVolume < maxVolume){
            crtVolume++;
            return true;
        }
        return false;
    }

    public boolean decreaseVolume(){
        if(crtVolume > 0) {
            crtVolume--;
            return true;
        }
        return false;
    }

    public void setSilenceMode(){
        this.crtVolume = 0;
    }

    public String toString(){
        return "This speaker's max volume is " + this.maxVolume + " and is set on " + this.crtVolume;
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

        Speaker other = (Speaker) obj;
        if(this.crtVolume == other.crtVolume && this.maxVolume == other.maxVolume){
            return true;
        }
        return false;
    }

    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + this.maxVolume;
        result = prime * result + this.crtVolume;
        return result;
    }
}
