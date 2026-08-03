package inheritance;
//Parent
class Nitte{
    void details(){
        System.out.println("from NItte");
    }
}
//child-1
class Nsam extends Nitte{
    void nsam_Details(){
        System.out.println("degree clg");
    }
}
//child-2
class Nmamit extends Nitte{
    void nmamit_Details(){
        System.out.println("engg clg");
    }
}
//child-3
class JKs extends Nitte{
    void jks_Details(){
        System.out.println("mba clg");
    }
}
public class Main_heri {
    public static void main(String[] args) {
        JKs j=new JKs();
        j.details();
        j.jks_Details();
        Nsam n=new Nsam();
        n.details();
        n.nsam_Details();
    }

}
