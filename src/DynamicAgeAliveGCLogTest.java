/**
 * 动态对象年龄判定
 * 只要同一年龄对象内存总和>=Survivor区的一半，age>=当前年龄的对象将会进入老年代
 * -vm args: -verbose:gc -Xmx20m -Xms20m -Xmn10m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:MaxTenuringThreshold=15
 * @Author zhenglian
 * @Date 2018/3/1 14:21
 */
public class DynamicAgeAliveGCLogTest {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        byte[]allocate1, allocate2, allocate3, allocate4;
        allocate1 = new byte[_1MB / 4]; //256k
        allocate2 = new byte[_1MB / 4]; //256k
        allocate3 = new byte[4 * _1MB]; //4m
        allocate4 = new byte[4 * _1MB]; //4m
        allocate4 = null;
        System.gc();
    }
}
