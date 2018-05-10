/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolpattern;

import builderpattern.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiante
 */
public class PooledObjectPool {

    private static long expTime = 6000;//6 seconds
    public static HashMap<MakeAMovie, Long> available = new HashMap<MakeAMovie, Long>();
    public static HashMap<MakeAMovie, Long> inUse = new HashMap<MakeAMovie, Long>();

    public synchronized static MakeAMovie getObject() {
        long now = System.currentTimeMillis();
        if (!available.isEmpty()) {
            for (Map.Entry<MakeAMovie, Long> entry : available.entrySet()) {
                if (now - entry.getValue() > expTime) { //object has expired
                    popElement(available);
                } else {
                    MakeAMovie po = popElement(available, entry.getKey());
                    push(inUse, po, now);
                    return po;
                }
            }
        }

        // either no PooledObject is available or each has expired, so return a new one
        return createPooledObject(now);
    }

    private synchronized static MakeAMovie createPooledObject(long now) {
        MakeAMovie po = new MakeAMovie(new Rambo());
        push(inUse, po, now);
        return po;
    }

    private synchronized static void push(HashMap<MakeAMovie, Long> map,
            MakeAMovie po, long now) {
        map.put(po, now);
    }

    public static void releaseObject(MakeAMovie po) {
        cleanUp(po);
        available.put(po, System.currentTimeMillis());
        inUse.remove(po);
    }

    private static MakeAMovie popElement(HashMap<MakeAMovie, Long> map) {
        Map.Entry<MakeAMovie, Long> entry = map.entrySet().iterator().next();
        MakeAMovie key = entry.getKey();
        //Long value=entry.getValue();
        map.remove(entry.getKey());
        return key;
    }

    private static MakeAMovie popElement(HashMap<MakeAMovie, Long> map, MakeAMovie key) {
        map.remove(key);
        return key;
    }

    public static void cleanUp(MakeAMovie po) {
        po.cleanUp();
    }
}
