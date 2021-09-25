package StringBuffer;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String str = "1234567.89";
        StringBuffer stringBuffer = new StringBuffer(str);

        for (int j = stringBuffer.lastIndexOf(".") - 3; j > 0; j -= 3) {
            stringBuffer = stringBuffer.insert(j,",");
        }
        System.out.println(stringBuffer);
    }
}
