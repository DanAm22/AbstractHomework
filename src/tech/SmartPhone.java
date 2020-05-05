package tech;

import java.util.ArrayList;

public class SmartPhone {

    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;

    public SmartPhone(int noPixels, int width, int length, int depth, int speakerMaxVolume, int microphoneMaxVolume) {
        this.theScreen = new Screen(noPixels, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVolume);
        this.theMicrophone = new Microphone(microphoneMaxVolume);
    }

    public SmartPhone(int noPixels, int width, int length, int depth, int speakerMaxVolume, int microphoneMaxVolume, int speakerCrtVolume, int microphoneCrtVolume) {
        this.theScreen = new Screen(noPixels, width, length, depth);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVolume, speakerCrtVolume);
        this.theMicrophone = new Microphone(microphoneMaxVolume, microphoneCrtVolume);
    }

    public void pressVolumeUp() {
        this.theCase.pressVolumeUp();
        this.theSpeaker.increaseVolume();
    }

    public void pressVolumeDown() {
        this.theCase.pressVolumeDown();
        this.theSpeaker.decreaseVolume();
    }

    public void setPixel(int index, String color) {
        this.theScreen.setPixel(index, color);
    }

    public void colorScreen(String color) {
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume() {
        this.theMicrophone.increaseVolume();
    }

    public void decreaseMicrophoneVolume() {
        this.theMicrophone.decreaseVolume();
    }

    public void muteMicrophone() {
        this.theMicrophone.muteMicrophone();
    }

    public void setSilenceMode() {
        this.theSpeaker.setSilenceMode();
    }

    public void printScreenColors(){
        for(Pixel p: theScreen.getPixels()){
            System.out.print(p.getColor() + " ") ;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Smartphone components specifications are: \n" +  this.theScreen + "\n" + this.theSpeaker + "\n" + this.theMicrophone + "\n";
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

        SmartPhone other = (SmartPhone) obj;
        if (this.theScreen.equals(other.theScreen) && this.theMicrophone.equals(other.theMicrophone) && this.theSpeaker.equals(other.theSpeaker) && this.theCase.equals(other.theCase)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = result * prime + ((this.theCase == null) ? 0 : this.theCase.hashCode());
        result = result * prime + ((this.theSpeaker == null) ? 0 : this.theSpeaker.hashCode());
        result = result * prime + ((this.theMicrophone == null) ? 0: this.theMicrophone.hashCode());
        result = result * prime + ((this.theScreen == null) ? 0 : this.theScreen.hashCode());
        return result;
    }
}