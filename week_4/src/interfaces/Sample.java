package interfaces;


interface Nsam{
        void cse_dept();
        void com_dept();
}

class Students implements Nsam{

    @Override
    public void cse_dept() {
        System.out.println("Students from cse dept");
    }

    @Override
    public void com_dept() {
        System.out.println("students from com dept");
    }
}


class Faculties implements Nsam{

    @Override
    public void cse_dept() {
        System.out.println("faculties from cse dept");
    }

    @Override
    public void com_dept() {
        System.out.println("faculties from com dept");
    }
}

public class Sample {
    public static void main(String[] args) {
        Students s = new Students();
        s.com_dept();
        s.cse_dept();
        Faculties f = new Faculties();
        f.com_dept();
        f.cse_dept();
    }
}
