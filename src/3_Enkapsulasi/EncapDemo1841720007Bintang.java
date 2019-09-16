
public class EncapDemo1841720007Bintang {

    private String name;
    private int age;

    public String getNameBintang() {
        return name;
    }

    public void setNameBintang(String newName) {
        name = newName;
    }

    public int getAgeBintang() {
        return age;
    }

    public void setAgeBintang(int newAge) {
        if (newAge > 30) {
            this.age = 30;
        } else if (newAge < 18) {
            this.age = 18;
        } else {
            age = newAge;
        }
    }

}
