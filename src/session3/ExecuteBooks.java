package session3;

public class ExecuteBooks {

    public static void main(String[] args) {

        //Books fullInfo = new Books("Novel",100,"Fairy tail","US");

        //fullInfo.printInfo();

//        String type = fullInfo.getType();
//        fullInfo.setType("HOATHINH");


        Author tacGia = new Author("tran van A","1990","123456789","123 cong hoa");

        // create book object
        Books java21days = new Books("Java21days","edu",25.7f,1000, tacGia);

        Books java7days = new Books("Java7days","edu",10.5f,2000,tacGia);

        // print info of books
        java21days.print();
        java7days.print();

        // tinh tong tien cho ==> java21days (price*total)
        double calculate = java21days.totalPrice();
        System.out.println("The total price of java21days is : " + calculate);
    }
}
