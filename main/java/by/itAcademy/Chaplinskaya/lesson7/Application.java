package by.itAcademy.Chaplinskaya.lesson7;


public class Application {
    public static void main(String[] args) {

        String str = "I like Java!!!";
        String str1 = "Java";
        printSymbol(str);
        endString(str);
        startLine(str);
        checkContent(str);
        position(str, str1);
        changeSymbol(str);
        upCase(str);
        lowCase(str);
        cutString(str);
        String str2 = "Кажется, никогда такого не было, но вот опять";
        System.out.println(searchAndCountOfSymbol(str2));
        newText(str2);
    }

    public static void printSymbol(String x) {
        int i = x.length() - 1;
        System.out.println(x.charAt(i));
    }

    public static void endString(String x) {
        System.out.println(x.endsWith("!!!"));
    }

    public static void startLine(String x) {
        System.out.println(x.startsWith("I" + " " + "like"));
    }

    public static void checkContent(String x) {
        System.out.println(x.contains("Java"));
    }

    public static void position(String x, String y) {
        System.out.println(x.indexOf(y));
    }

    public static void changeSymbol(String x) {
        System.out.println(x.replace('a', 'o'));
    }

    public static void upCase(String x) {
        System.out.println(x.toUpperCase());
    }

    public static void lowCase(String x) {
        System.out.println(x.toLowerCase());
    }

    public static void cutString(String x) {
        System.out.println(x.substring(7, 11));
    }

    public static int searchAndCountOfSymbol(String x) {
        int count = 0;
        char i = ',';
        for (int j = 0; j < x.length(); j++) {
            if (x.charAt(j) == i) {
                count++;
            }
        }
        return count;
    }

    public static void newText(String x) {
        String[] subStr = x.split("\\s+|,\\s* ");
        for (String str : subStr) {
            System.out.println(str);
        }
        for (int i = 0; i < subStr.length; i++) {
            String element = subStr[i];
            char literal = element.charAt(element.length() - 1);
            System.out.print(literal);
        }
    }
}




