package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.ABTest;
import com.netflix.cl.model.ABTestAllocations;
import com.netflix.cl.model.context.TestAllocations;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.Vj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1274Vj {
    private static Long b;

    public static final void a(Logger logger, InterfaceC1280Vp interfaceC1280Vp, InterfaceC1545aFg interfaceC1545aFg, InterfaceC1287Vw interfaceC1287Vw) {
        C8632dsu.c((Object) logger, "");
        C8632dsu.c((Object) interfaceC1280Vp, "");
        C8632dsu.c((Object) interfaceC1545aFg, "");
        C8632dsu.c((Object) interfaceC1287Vw, "");
        logger.removeContext(b);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(interfaceC1280Vp.e());
        Map<Integer, Integer> b2 = interfaceC1545aFg.b();
        ArrayList arrayList2 = new ArrayList(b2.size());
        for (Map.Entry<Integer, Integer> entry : b2.entrySet()) {
            arrayList2.add(new ABTest(entry.getKey().intValue(), entry.getValue().intValue()));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(interfaceC1287Vw.b());
        if (!arrayList.isEmpty()) {
            b = Long.valueOf(logger.addContext(new TestAllocations(new ABTestAllocations((ABTest[]) arrayList.toArray(new ABTest[0])).toJSONObject())));
        }
    }
}
