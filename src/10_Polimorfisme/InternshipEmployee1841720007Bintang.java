
public class InternshipEmployee1841720007Bintang extends Employee1841720007Bintang{
    private int length;

    public InternshipEmployee1841720007Bintang(String name,int length) {
        this.length = length;
        this.name = name;
    }

    public int getLengthBintang() {
        return length;
    }

    public void setLengthBintang(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoBintang(){
        String info=super.getEmployeeInfoBintang()+"\n";
        info += "Registerd as internship employee for "+length+" month/s\n";
        return info;
    }   
}
