public class CharacterClassExample {
    public static void main(String[] args) {
//        char ch = 'A';
//        System.out.println(ch + " " + (int)ch);
//        System.out.println("97 " + (char)97);
//        Сделайте преобразование CHAR -> INT
//        Using ASCII value
//        Using valueOf()
//        Using getNumericValue()
        int numASCII = ' ';
        int numValueOf = Integer.valueOf('A');
        String str = String.valueOf(65);
        long l = Long.valueOf("A");
        int numNumericValue = Character.getNumericValue('A');

        System.out.println(numASCII);
        System.out.println(numValueOf);
        System.out.println(numNumericValue);

    }
}
