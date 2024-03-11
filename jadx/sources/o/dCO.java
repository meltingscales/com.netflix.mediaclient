package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import o.dDO;

/* loaded from: classes5.dex */
public final class dCO<T> implements dDN<T> {
    private final dCS<dDO<T>> a;
    private final drX<InterfaceC8660dtv<Object>, List<? extends dtH>, dBT<T>> d;

    /* JADX WARN: Multi-variable type inference failed */
    public dCO(drX<? super InterfaceC8660dtv<Object>, ? super List<? extends dtH>, ? extends dBT<T>> drx) {
        C8632dsu.c((Object) drx, "");
        this.d = drx;
        this.a = new dCS<>();
    }

    @Override // o.dDN
    public Object b(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dtH> list) {
        Object obj;
        int d;
        ConcurrentHashMap concurrentHashMap;
        Object e;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) list, "");
        obj = this.a.get(drI.e(interfaceC8660dtv));
        C8632dsu.a(obj, "");
        dDD ddd = (dDD) obj;
        T t = ddd.c.get();
        if (t == null) {
            t = (T) ddd.c(new drO<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // o.drO
                public final T invoke() {
                    return (T) new dDO();
                }
            });
        }
        dDO ddo = (dDO) t;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (dtH dth : list) {
            arrayList.add(new C7744dDt(dth));
        }
        concurrentHashMap = ddo.a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.c cVar = Result.e;
                e = Result.e(this.d.invoke(interfaceC8660dtv, list));
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                e = Result.e(C8556dpz.a(th));
            }
            obj2 = Result.b(e);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, obj2);
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        C8632dsu.a(obj2, "");
        return ((Result) obj2).c();
    }
}
