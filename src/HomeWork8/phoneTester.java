package HomeWork8;

public class phoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone();

        iphone.brandName="apply";
        iphone.model="14";
        iphone.storage=512;
        iphone.includescharger=false;
        iphone.givesSignal();

        Phone Pixel=new Phone();

        Pixel.brandName="google";
        Pixel.model="Pixel6";
        Pixel.storage=256;
        Pixel.includescharger=true;
        Pixel.crashes();

        Phone Samsung=new Phone();

        Samsung.brandName="Samsung";
        Samsung.model="A51";
        Samsung.storage=128;
        Samsung.includescharger=true;
        Samsung.crashes();
    }
}
