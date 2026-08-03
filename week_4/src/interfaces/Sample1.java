package interfaces;

interface Camera{
   void click_picture();
}
interface Music{
    void play();
}
class laptop implements Camera, Music{

    @Override
    public void click_picture() {
        System.out.println("from camera interface");
    }

    @Override
    public void play() {
        System.out.println("from music interface");
    }
}
public class Sample1 {
    public static void main(String[] args) {
//        Camera c=new Camera();
        laptop l=new laptop();
        l.click_picture();
        l.play();
    }
}
