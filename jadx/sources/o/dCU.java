package o;

import java.util.Iterator;
import o.InterfaceC7717dCt;

/* loaded from: classes5.dex */
public abstract class dCU<Element, Collection, Builder> extends AbstractC7718dCu<Element, Collection, Builder> {
    private final dBT<Element> e;

    public /* synthetic */ dCU(dBT dbt, C8627dsp c8627dsp) {
        this(dbt);
    }

    protected abstract void c(Builder builder, int i, Element element);

    @Override // o.dBT, o.dBZ, o.dBP
    public abstract InterfaceC7707dCj e();

    private dCU(dBT<Element> dbt) {
        super(null);
        this.e = dbt;
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, Collection collection) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        int d = d(collection);
        InterfaceC7707dCj e = e();
        InterfaceC7719dCv b = interfaceC7721dCx.b(e, d);
        Iterator<Element> e2 = e(collection);
        for (int i = 0; i < d; i++) {
            b.b(e(), i, this.e, e2.next());
        }
        b.d(e);
    }

    @Override // o.AbstractC7718dCu
    protected final void c(InterfaceC7717dCt interfaceC7717dCt, Builder builder, int i, int i2) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        if (i2 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            b(interfaceC7717dCt, i + i3, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7718dCu
    protected void b(InterfaceC7717dCt interfaceC7717dCt, int i, Builder builder, boolean z) {
        C8632dsu.c((Object) interfaceC7717dCt, "");
        c(builder, i, InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), i, this.e, null, 8, null));
    }
}
