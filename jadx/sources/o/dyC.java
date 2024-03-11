package o;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o.C8797dyx;

/* loaded from: classes5.dex */
public class dyC<E> extends C8793dyt<E> {
    private final int b;
    private final BufferOverflow d;

    @Override // o.C8793dyt, o.dyI
    public Object a(E e, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return e((dyC) this, (Object) e, interfaceC8585dra);
    }

    public dyC(int i, BufferOverflow bufferOverflow, drM<? super E, dpR> drm) {
        super(i, drm);
        this.b = i;
        this.d = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + dsA.a(C8793dyt.class).b() + " instead").toString());
        } else if (i >= 1) {
        } else {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
    }

    @Override // o.C8793dyt
    protected boolean k() {
        return this.d == BufferOverflow.DROP_OLDEST;
    }

    static /* synthetic */ <E> Object e(dyC<E> dyc, E e, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        UndeliveredElementException d;
        Object b = dyc.b((dyC<E>) e, true);
        if (b instanceof C8797dyx.b) {
            C8797dyx.d(b);
            drM<E, dpR> drm = dyc.e;
            if (drm != null && (d = dAB.d(drm, e, null, 2, null)) != null) {
                C8553dpw.c(d, dyc.j());
                throw d;
            }
            throw dyc.j();
        }
        return dpR.c;
    }

    @Override // o.C8793dyt, o.dyI
    public Object d(E e) {
        return b((dyC<E>) e, false);
    }

    private final Object b(E e, boolean z) {
        return this.d == BufferOverflow.DROP_LATEST ? a((dyC<E>) e, z) : c((dyC<E>) e);
    }

    private final Object a(E e, boolean z) {
        drM<E, dpR> drm;
        UndeliveredElementException d;
        Object d2 = super.d((dyC<E>) e);
        if (C8797dyx.f(d2) || C8797dyx.i(d2)) {
            return d2;
        }
        if (z && (drm = this.e) != null && (d = dAB.d(drm, e, null, 2, null)) != null) {
            throw d;
        }
        return C8797dyx.b.d(dpR.c);
    }

    private final Object c(E e) {
        C8796dyw c8796dyw;
        dAH dah = C8794dyu.e;
        C8796dyw c8796dyw2 = (C8796dyw) C8793dyt.f.get(this);
        while (true) {
            long andIncrement = C8793dyt.l.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean j2 = j(andIncrement);
            long j3 = C8794dyu.d;
            long j4 = j / j3;
            int i = (int) (j % j3);
            if (c8796dyw2.b != j4) {
                C8796dyw e2 = e(j4, c8796dyw2);
                if (e2 != null) {
                    c8796dyw = e2;
                } else if (j2) {
                    return C8797dyx.b.a(j());
                }
            } else {
                c8796dyw = c8796dyw2;
            }
            C8796dyw c8796dyw3 = c8796dyw;
            int d = d(c8796dyw, i, e, j, dah, j2);
            if (d == 0) {
                c8796dyw3.c();
                return C8797dyx.b.d(dpR.c);
            } else if (d == 1) {
                return C8797dyx.b.d(dpR.c);
            } else {
                if (d == 2) {
                    if (j2) {
                        c8796dyw3.k();
                        return C8797dyx.b.a(j());
                    }
                    InterfaceC8783dyj interfaceC8783dyj = dah instanceof InterfaceC8783dyj ? (InterfaceC8783dyj) dah : null;
                    if (interfaceC8783dyj != null) {
                        a(interfaceC8783dyj, c8796dyw3, i);
                    }
                    a((c8796dyw3.b * j3) + i);
                    return C8797dyx.b.d(dpR.c);
                } else if (d == 3) {
                    throw new IllegalStateException("unexpected".toString());
                } else {
                    if (d == 4) {
                        if (j < i()) {
                            c8796dyw3.c();
                        }
                        return C8797dyx.b.a(j());
                    }
                    if (d == 5) {
                        c8796dyw3.c();
                    }
                    c8796dyw2 = c8796dyw3;
                }
            }
        }
    }
}
