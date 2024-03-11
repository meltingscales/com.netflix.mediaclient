package o;

import java.util.Iterator;

/* renamed from: o.dCu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7718dCu<Element, Collection, Builder> implements dBT<Collection> {
    public /* synthetic */ AbstractC7718dCu(C8627dsp c8627dsp) {
        this();
    }

    protected abstract int a(Builder builder);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Builder b(Collection collection);

    protected abstract void b(Builder builder, int i);

    protected abstract void b(InterfaceC7717dCt interfaceC7717dCt, int i, Builder builder, boolean z);

    protected abstract Collection c(Builder builder);

    protected abstract void c(InterfaceC7717dCt interfaceC7717dCt, Builder builder, int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int d(Collection collection);

    protected abstract Builder d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator<Element> e(Collection collection);

    private AbstractC7718dCu() {
    }

    public final Collection a(InterfaceC7720dCw interfaceC7720dCw, Collection collection) {
        Builder d;
        C8632dsu.c((Object) interfaceC7720dCw, "");
        if (collection == null || (d = b((AbstractC7718dCu<Element, Collection, Builder>) collection)) == null) {
            d = d();
        }
        int a = a(d);
        InterfaceC7717dCt c = interfaceC7720dCw.c(e());
        if (!c.h()) {
            while (true) {
                int h = c.h(e());
                if (h == -1) {
                    break;
                }
                b(this, c, a + h, d, false, 8, null);
            }
        } else {
            c(c, d, a, d(c, d));
        }
        c.e(e());
        return c(d);
    }

    @Override // o.dBP
    public Collection b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        return a(interfaceC7720dCw, null);
    }

    private final int d(InterfaceC7717dCt interfaceC7717dCt, Builder builder) {
        int b = interfaceC7717dCt.b(e());
        b(builder, b);
        return b;
    }

    public static /* synthetic */ void b(AbstractC7718dCu abstractC7718dCu, InterfaceC7717dCt interfaceC7717dCt, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractC7718dCu.b(interfaceC7717dCt, i, obj, z);
    }
}
