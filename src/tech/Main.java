package tech;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone(7, 15, 25, 3, 100, 100, 40, 30);
        SmartPhone smartPhone2 = new SmartPhone(10,10,20,2,100,100);

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone1.hashCode());
        System.out.println(smartPhone2.hashCode());

        System.out.println(smartPhone1.equals(smartPhone2));
        System.out.println();

        smartPhone1.pressVolumeDown();
        smartPhone1.setPixel(5,"Blue");
        smartPhone1.increaseMicrophoneVolume();
        smartPhone1.printScreenColors();

        smartPhone2.pressVolumeUp();
        smartPhone2.colorScreen("Green");
        smartPhone2.decreaseMicrophoneVolume();
        smartPhone2.printScreenColors();

        System.out.println();

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone1.hashCode());
        System.out.println(smartPhone2.hashCode());


    }
}
