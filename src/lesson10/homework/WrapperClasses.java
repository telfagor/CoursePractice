package lesson10.homework;

public class WrapperClasses {
    public static void castAndUnboxing() {
        String[] strings = {"tRue", "120", "32000", "147895632", "987654321987654321", "4444.5d", "2354.56f"};
        boolean bool = Boolean.parseBoolean(strings[0]);
        byte b = Byte.valueOf(strings[1]);
        short s = Short.parseShort(strings[2]);
        int value = Integer.valueOf(strings[3]);
        long bigValue = Long.parseLong(strings[4]);
        double d = Double.valueOf(strings[5]);
        float f = Float.parseFloat(strings[strings.length - 1]);
        System.out.println(bool);
        System.out.println(b);
        System.out.println(s);
        System.out.println(value);
        System.out.println(bigValue);
        System.out.println(d);
        System.out.println(f);
    }
}
