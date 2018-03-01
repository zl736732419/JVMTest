/**
 * 长期存活的对象放老年代
 * -vm args: -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTenuringThreshold=1

 * @Author zhenglian
 * @Date 2018/3/1 14:04
 */
public class LongAliveGCLogTest {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[]allocate1, allocate2, allocate3;
        allocate1 = new byte[_1MB / 4]; //256k
        allocate2 = new byte[4 * _1MB]; //4m
        allocate3 = new byte[4 * _1MB]; //4m
        allocate3 = null;
        System.gc();
    }
}
