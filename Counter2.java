class WithoutStaticKey {
    int count = 0;//will get memory each time when the instance is created

    WithoutStaticKey() {
        count++;
        System.out.println(count);
    }
}

public class Counter2 {
    public static void main(String[] args) {
        WithoutStaticKey k = new WithoutStaticKey();
        WithoutStaticKey k1 = new WithoutStaticKey();
        WithoutStaticKey k2 = new WithoutStaticKey();

    }
}
