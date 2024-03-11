package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* loaded from: classes5.dex */
final class dCT<T> implements dDN<T> {
    private final ConcurrentHashMap<Class<?>, dDO<T>> a;
    private final drX<InterfaceC8660dtv<Object>, List<? extends dtH>, dBT<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public dCT(drX<? super InterfaceC8660dtv<Object>, ? super List<? extends dtH>, ? extends dBT<T>> drx) {
        C8632dsu.c((Object) drx, "");
        this.b = drx;
        this.a = new ConcurrentHashMap<>();
    }

    @Override // o.dDN
    public Object b(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dtH> list) {
        int d;
        ConcurrentHashMap concurrentHashMap;
        Object e;
        dDO<T> putIfAbsent;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) list, "");
        ConcurrentHashMap<Class<?>, dDO<T>> concurrentHashMap2 = this.a;
        Class<?> e2 = drI.e(interfaceC8660dtv);
        dDO<T> ddo = concurrentHashMap2.get(e2);
        if (ddo == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(e2, (ddo = new dDO<>()))) != null) {
            ddo = putIfAbsent;
        }
        dDO<T> ddo2 = ddo;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (dtH dth : list) {
            arrayList.add(new C7744dDt(dth));
        }
        concurrentHashMap = ((dDO) ddo2).a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                Result.c cVar = Result.e;
                e = Result.e(this.b.invoke(interfaceC8660dtv, list));
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                e = Result.e(C8556dpz.a(th));
            }
            obj = Result.b(e);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, obj);
            if (putIfAbsent2 != null) {
                obj = putIfAbsent2;
            }
        }
        C8632dsu.a(obj, "");
        return ((Result) obj).c();
    }
}
