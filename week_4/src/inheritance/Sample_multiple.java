package inheritance;
//Parent-1
interface cse_dept{
    void cse_details();
}
//Parent-2
interface com_dept{
    void com_Details();
}
//child-1
class Nsam1 implements cse_dept, com_dept{

    @Override
    public void com_Details() {
        System.out.println("from com interface-com_details()");
    }

    @Override
    public void cse_details() {
        System.out.println("from cse interface-cse_details()");
    }
}
public class Sample_multiple {
            public static void main(String[] args) {
                Nsam1 n1=new Nsam1();
                n1.com_Details();
                n1.cse_details();
            }
}
