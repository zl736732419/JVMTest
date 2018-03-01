import java.util.ArrayList;
import java.util.List;

/**
 *	vm args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 	-Xms 最小堆内存
 * 	-Xmx 最大堆内存
 */
public class HeapOutOfMemoryTest {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		while(true) {
			list.add(new Object());
		}
	}
}