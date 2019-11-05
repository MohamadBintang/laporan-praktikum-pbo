
public class Tester41841720007Bintang {
    public static void main(String[] args) {
        Owner1841720007Bintang ow =new Owner1841720007Bintang();
        ElectricityBill1841720007Bintang eBill = new ElectricityBill1841720007Bintang(5, "R-1");
        ow.payBintang(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720007Bintang pEmp =new PermanentEmployee1841720007Bintang("Bintang", 600);
        ow.payBintang(pEmp);
        System.out.println("-----------------------------");
        
        InternshipEmployee1841720007Bintang iEmp = new InternshipEmployee1841720007Bintang("Satriavi", 6);
        ow.showMyEmployeeBintang(pEmp);
        System.out.println("---------------------------------------");
        ow.showMyEmployeeBintang(iEmp);
    }
}
