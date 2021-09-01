package HomeWork;

public class Address {

    public String a, b, c, d, e, f;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }


    public static void main (String[] args){

        Address address = new Address();

        address.setA("Idex is 01001");
        address.setB("County is Ukraine");
        address.setC("City is Kyiv");
        address.setD("Street is Куриловская");
        address.setE("House is 51A");
        address.setF("Apartament is 13");

        System.out.println();
        System.out.println(address.getA());
        System.out.println(address.getB());
        System.out.println(address.getC());
        System.out.println(address.getD());
        System.out.println(address.getE());
        System.out.println(address.getF());
    }
}
