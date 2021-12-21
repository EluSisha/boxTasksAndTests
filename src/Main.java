
public class Main {

    public static void main(String[] args) {
        Box<Integer> box = new Box("My age", 20);
        System.out.println(box.getContent());

        Box<Double> box1 = new Box("My age", 20.2421);
        System.out.println(box1.getContent());

        Object str = "Hello";

        final String stringValue = getObject(str, String.class);
        System.out.println(stringValue);

        Canister<Vodka> canister2 = new Canister<>();


    }

    private static <TYPE> TYPE getObject(Object obj, Class<TYPE> typeClass) {
        return (TYPE) obj;
    }
}
