public class count_digitts {
    public static void main(String[] args) {
        int num=12354;
        int count=0;
        while (num!=0)
        {
            num=num/10;  //1235
            count++;
        }
        System.out.println("number of digits: "+count);

    }
}
