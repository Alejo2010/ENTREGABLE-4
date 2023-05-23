import java.security.cert.TrustAnchor;

public class Main {
    public static void main(String[] args) {

        SmarthPhone Iphone6 = new SmarthPhone("Iphone", 2000, true, 80, 6.9, 4, "blanco");
        Iphone6.Encender(false);
        System.out.println(Iphone6);

        SmartWatch HuaweiBand = new SmartWatch("Huawei", 2019, false, 39, 4.5, "negro", true);
        HuaweiBand.Encender(true);
        System.out.println(HuaweiBand);
    }
}
