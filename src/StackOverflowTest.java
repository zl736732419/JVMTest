/**
 * VM args: -Xss128k
 *
 * @Author zhenglian
 * @Date 2018/2/27 11:56
 */
public class StackOverflowTest {

    public int stackLength = 1;

    public static void main(String[] args) {
        StackOverflowTest obj = new StackOverflowTest();
        obj.stackLack();
    }

    public void stackLack() {
        stackLength++;
        stackLack();
    }
}
