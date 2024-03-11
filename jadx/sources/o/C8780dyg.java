package o;

import kotlin.Pair;

/* renamed from: o.dyg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8780dyg<T> extends dAE<T> {
    private final ThreadLocal<Pair<dqZ, Object>> a;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8780dyg(o.dqZ r3, o.InterfaceC8585dra<? super T> r4) {
        /*
            r2 = this;
            o.dyl r0 = o.C8785dyl.e
            o.dqZ$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            o.dqZ r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.a = r0
            o.dqZ r4 = r4.getContext()
            o.dqY$b r0 = o.dqY.d
            o.dqZ$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof o.dwQ
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = o.dAO.c(r3, r4)
            o.dAO.b(r3, r4)
            r2.b(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8780dyg.<init>(o.dqZ, o.dra):void");
    }

    public final void b(dqZ dqz, Object obj) {
        this.threadLocalIsSet = true;
        this.a.set(dpD.a(dqz, obj));
    }

    public final boolean y() {
        boolean z = this.threadLocalIsSet && this.a.get() == null;
        this.a.remove();
        return !z;
    }

    @Override // o.dAE, o.AbstractC8730dwk
    public void a_(Object obj) {
        if (this.threadLocalIsSet) {
            Pair<dqZ, Object> pair = this.a.get();
            if (pair != null) {
                dAO.b(pair.b(), pair.c());
            }
            this.a.remove();
        }
        Object e = dwN.e(obj, this.e);
        InterfaceC8585dra<T> interfaceC8585dra = this.e;
        dqZ context = interfaceC8585dra.getContext();
        Object c = dAO.c(context, null);
        C8780dyg<?> b = c != dAO.b ? dwP.b(interfaceC8585dra, context, c) : null;
        try {
            this.e.resumeWith(e);
            dpR dpr = dpR.c;
        } finally {
            if (b == null || b.y()) {
                dAO.b(context, c);
            }
        }
    }
}
