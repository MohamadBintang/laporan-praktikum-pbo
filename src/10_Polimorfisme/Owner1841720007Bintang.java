
public class Owner1841720007Bintang {
    public void payBintang(Payable1841720007Bintang p) {
        System.out.println("Total payment = "+p.getPaymentAmountBintang());
        if(p instanceof ElectricityBill1841720007Bintang){
            ElectricityBill1841720007Bintang eb = (ElectricityBill1841720007Bintang)p;
            System.out.println(""+eb.getBillInfoBintang());
        }else if(p instanceof PermanentEmployee1841720007Bintang){
            PermanentEmployee1841720007Bintang pe = (PermanentEmployee1841720007Bintang) p;
            pe.getEmployeeInfoBintang();
            System.out.println(""+pe.getEmployeeInfoBintang());
        }
    }
    
    public void showMyEmployeeBintang(Employee1841720007Bintang e){
        System.out.println(""+e.getEmployeeInfoBintang());
        if (e instanceof PermanentEmployee1841720007Bintang) 
            System.out.println("You Have to pay her/him monthly!!!");
        else 
            System.out.println("No need to pay him/her :)");
    }
}
