package o;

import kotlinx.serialization.SerializationException;
import o.InterfaceC7717dCt;

/* renamed from: o.dDr  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7742dDr<K, V, R> implements dBT<R> {
    private final dBT<V> a;
    private final dBT<K> e;

    public /* synthetic */ AbstractC7742dDr(dBT dbt, dBT dbt2, C8627dsp c8627dsp) {
        this(dbt, dbt2);
    }

    protected final dBT<V> a() {
        return this.a;
    }

    protected abstract K b(R r);

    protected abstract R c(K k, V v);

    protected final dBT<K> d() {
        return this.e;
    }

    protected abstract V e(R r);

    private AbstractC7742dDr(dBT<K> dbt, dBT<V> dbt2) {
        this.e = dbt;
        this.a = dbt2;
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, R r) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        InterfaceC7719dCv e = interfaceC7721dCx.e(e());
        e.b(e(), 0, this.e, b((AbstractC7742dDr<K, V, R>) r));
        e.b(e(), 1, this.a, e(r));
        e.d(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dBP
    public R b(InterfaceC7720dCw interfaceC7720dCw) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        R r;
        C8632dsu.c((Object) interfaceC7720dCw, "");
        InterfaceC7707dCj e = e();
        InterfaceC7717dCt c = interfaceC7720dCw.c(e);
        if (c.h()) {
            r = (R) c(InterfaceC7717dCt.d.d(c, e(), 0, d(), null, 8, null), InterfaceC7717dCt.d.d(c, e(), 1, a(), null, 8, null));
        } else {
            obj = C7763dEl.d;
            obj2 = C7763dEl.d;
            Object obj5 = obj;
            Object obj6 = obj2;
            while (true) {
                int h = c.h(e());
                if (h == -1) {
                    obj3 = C7763dEl.d;
                    if (obj5 == obj3) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    obj4 = C7763dEl.d;
                    if (obj6 == obj4) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r = (R) c(obj5, obj6);
                } else if (h == 0) {
                    obj5 = InterfaceC7717dCt.d.d(c, e(), 0, d(), null, 8, null);
                } else if (h == 1) {
                    obj6 = InterfaceC7717dCt.d.d(c, e(), 1, a(), null, 8, null);
                } else {
                    throw new SerializationException("Invalid index: " + h);
                }
            }
        }
        c.e(e);
        return r;
    }
}
