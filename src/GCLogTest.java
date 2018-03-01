/**
 * 老年代作内存分配担保
 * vm args: -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:+UseSerialGC
 * @Author zhenglian
 * @Date 2018/3/1 11:47
 */
public class GCLogTest {
    private static final int _1MB = 1024*1024;
    public static void main(String[] args) {
        byte[] allocate1, allocate2, allocate3, allocate4;
        allocate1 = new byte[2*_1MB];
        allocate2 = new byte[2*_1MB];
        allocate3 = new byte[_1MB];
        allocate4 = new byte[3*_1MB];
    }
}
