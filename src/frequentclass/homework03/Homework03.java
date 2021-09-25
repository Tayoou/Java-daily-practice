package frequentclass.homework03;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Fan jun Cheng";
        System.out.println(NameChange.nameProgram(name));
    }
}

class NameChange {
    public static String nameProgram(String name) {
        int space_1 = name.indexOf(" ");
        int space_2 = name.indexOf(" ", space_1 + 1);
        char[] chars = name.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = space_2 + 1; i < chars.length; i++) {
            buffer.append(chars[i]);
        }
        buffer.append(",");
        for (int i = 0; i < space_1; i++) {
            buffer.append(chars[i]);
        }
        buffer.append(".");
        String f_name = new String(chars,space_1+1,1);
        buffer.append(f_name.toUpperCase());
        String result = new String(buffer);
        return result;
    }
}
