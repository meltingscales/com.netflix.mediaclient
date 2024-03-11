package o;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.dyw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8796dyw<E> extends dAC<C8796dyw<E>> {
    private final C8793dyt<E> d;
    private final AtomicReferenceArray e;

    public C8796dyw(long j, C8796dyw<E> c8796dyw, C8793dyt<E> c8793dyt, int i) {
        super(j, c8796dyw, i);
        this.d = c8793dyt;
        this.e = new AtomicReferenceArray(C8794dyu.d * 2);
    }

    public final C8793dyt<E> a() {
        C8793dyt<E> c8793dyt = this.d;
        C8632dsu.d(c8793dyt);
        return c8793dyt;
    }

    @Override // o.dAC
    public int d() {
        return C8794dyu.d;
    }

    public final void b(int i, E e) {
        e(i, e);
    }

    public final E c(int i) {
        return (E) this.e.get(i * 2);
    }

    public final E b(int i) {
        E c = c(i);
        d(i);
        return c;
    }

    public final void d(int i) {
        e(i, (Object) null);
    }

    private final void e(int i, Object obj) {
        this.e.lazySet(i * 2, obj);
    }

    public final Object a(int i) {
        return this.e.get((i * 2) + 1);
    }

    public final void c(int i, Object obj) {
        this.e.set((i * 2) + 1, obj);
    }

    public final boolean d(int i, Object obj, Object obj2) {
        return Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(this.e, (i * 2) + 1, obj, obj2);
    }

    public final Object d(int i, Object obj) {
        return this.e.getAndSet((i * 2) + 1, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        r4 = a().e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r4 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        o.dAB.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // o.dAC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(int r4, java.lang.Throwable r5, o.dqZ r6) {
        /*
            r3 = this;
            int r5 = o.C8794dyu.d
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.c(r4)
        Le:
            java.lang.Object r1 = r3.a(r4)
            boolean r2 = r1 instanceof o.InterfaceC8783dyj
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof o.dyM
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            o.dAH r2 = o.C8794dyu.f()
            if (r1 == r2) goto L63
            o.dAH r2 = o.C8794dyu.j()
            if (r1 != r2) goto L28
            goto L63
        L28:
            o.dAH r2 = o.C8794dyu.m()
            if (r1 == r2) goto Le
            o.dAH r2 = o.C8794dyu.k()
            if (r1 != r2) goto L35
            goto Le
        L35:
            o.dAH r4 = o.C8794dyu.e()
            if (r1 == r4) goto L62
            o.dAH r4 = o.C8794dyu.e
            if (r1 != r4) goto L40
            goto L62
        L40:
            o.dAH r4 = o.C8794dyu.s()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unexpected state: "
            r4.append(r5)
            r4.append(r1)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L62:
            return
        L63:
            r3.d(r4)
            if (r0 == 0) goto L73
            o.dyt r4 = r3.a()
            o.drM<E, o.dpR> r4 = r4.e
            if (r4 == 0) goto L73
            o.dAB.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            o.dAH r2 = o.C8794dyu.f()
            goto L7f
        L7b:
            o.dAH r2 = o.C8794dyu.j()
        L7f:
            boolean r1 = r3.d(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.d(r4)
            r1 = r0 ^ 1
            r3.e(r4, r1)
            if (r0 == 0) goto L9a
            o.dyt r4 = r3.a()
            o.drM<E, o.dpR> r4 = r4.e
            if (r4 == 0) goto L9a
            o.dAB.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8796dyw.e(int, java.lang.Throwable, o.dqZ):void");
    }

    public final void e(int i, boolean z) {
        if (z) {
            a().d((this.b * C8794dyu.d) + i);
        }
        k();
    }
}
