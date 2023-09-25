class WithStaticKey {
    static int count = 0; //will get memory only once and retain its value

    WithStaticKey() {
        count++;
        System.out.println(count);
    }
}

public class Counter1 {
    public static void main(String[] args) {
        WithStaticKey k = new WithStaticKey();
        WithStaticKey k1 = new WithStaticKey();
        WithStaticKey k2 = new WithStaticKey();
    }

}

