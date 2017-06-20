/**
 * Created by Lena on 20.06.2017.
 */
public class MemoryPool
{

    private static MemoryPool memoryPool;

    private MemoryPool()
    {
    }

    public static MemoryPool createMemoryPool()
    {

                if (memoryPool == null)
                    memoryPool = new MemoryPool();
        return memoryPool;
    }

}