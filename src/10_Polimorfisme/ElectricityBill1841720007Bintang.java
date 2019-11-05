
public class ElectricityBill1841720007Bintang implements Payable1841720007Bintang{
    private int kwh;
    private String category;

    public ElectricityBill1841720007Bintang(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhBintang() {
        return kwh;
    }

    public void setKwhBintang(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryBintang() {
        return category;
    }

    public void setCategoryBintang(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountBintang(){
    return kwh*getBasePriceBintang();
    }
    public int getBasePriceBintang(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    public String getBillInfoBintang(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceBintang()+" per kWH)\n";
    } 
}
