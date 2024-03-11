package o;

import java.util.Iterator;
import java.util.Map;
import o.InterfaceC7717dCt;

/* loaded from: classes5.dex */
public abstract class dDE<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC7718dCu<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final dBT<Value> c;
    private final dBT<Key> e;

    public /* synthetic */ dDE(dBT dbt, dBT dbt2, C8627dsp c8627dsp) {
        this(dbt, dbt2);
    }

    public final dBT<Key> b() {
        return this.e;
    }

    @Override // o.dBT, o.dBZ, o.dBP
    public abstract InterfaceC7707dCj e();

    public final dBT<Value> h() {
        return this.c;
    }

    private dDE(dBT<Key> dbt, dBT<Value> dbt2) {
        super(null);
        this.e = dbt;
        this.c = dbt2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: a */
    public final void c(InterfaceC7717dCt interfaceC7717dCt, Builder builder, int i, int i2) {
        C8654dtp g;
        C8646dth d;
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) builder, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        g = C8657dts.g(0, i2 * 2);
        d = C8657dts.d(g, 2);
        int d2 = d.d();
        int e = d.e();
        int a = d.a();
        if ((a <= 0 || d2 > e) && (a >= 0 || e > d2)) {
            return;
        }
        while (true) {
            b(interfaceC7717dCt, i + d2, builder, false);
            if (d2 == e) {
                return;
            }
            d2 += a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7718dCu
    /* renamed from: d */
    public final void b(InterfaceC7717dCt interfaceC7717dCt, int i, Builder builder, boolean z) {
        int i2;
        Object d;
        Object e;
        C8632dsu.c((Object) interfaceC7717dCt, "");
        C8632dsu.c((Object) builder, "");
        Object d2 = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), i, this.e, null, 8, null);
        if (z) {
            i2 = interfaceC7717dCt.h(e());
            if (i2 != i + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (builder.containsKey(d2) && !(this.c.e().b() instanceof AbstractC7709dCl)) {
            InterfaceC7707dCj e2 = e();
            dBT<Value> dbt = this.c;
            e = dqE.e(builder, d2);
            d = interfaceC7717dCt.d(e2, i3, dbt, e);
        } else {
            d = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), i3, this.c, null, 8, null);
        }
        builder.put(d2, d);
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, Collection collection) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        int d = d(collection);
        InterfaceC7707dCj e = e();
        InterfaceC7719dCv b = interfaceC7721dCx.b(e, d);
        Iterator<Map.Entry<? extends Key, ? extends Value>> e2 = e(collection);
        int i = 0;
        while (e2.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = e2.next();
            Key key = next.getKey();
            Value value = next.getValue();
            b.b(e(), i, b(), key);
            b.b(e(), i + 1, h(), value);
            i += 2;
        }
        b.d(e);
    }
}
