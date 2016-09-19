package serialization;

public class Main {

    public static void main(String[] args) {
        SerializeDemo serializeDemo = new SerializeDemo();
        serializeDemo.serialize();

        System.out.println();
        DeserializeDemo deserial = new DeserializeDemo();
        deserial.deSerialize();
    }
}
