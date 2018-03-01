/**
 * 大对象放老年代
 * vm args: -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 * @Author zhenglian
 * @Date 2018/3/1 13:47
 */
public class BigObjGCLogTest {
    private static final int _1MB=1024*1024;
    
    public static void main(String[] args) {
        byte[] allocate;
        allocate = new byte[4 * _1MB];
    }
}
