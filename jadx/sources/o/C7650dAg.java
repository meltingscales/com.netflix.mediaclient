package o;

/* renamed from: o.dAg */
/* loaded from: classes5.dex */
public final class C7650dAg {
    private static final dAH e = new dAH("CLOSED");

    public static final <S extends dAC<S>> Object b(S s, long j, drX<? super Long, ? super S, ? extends S> drx) {
        while (true) {
            if (s.b >= j && !s.g()) {
                return dAG.b(s);
            }
            Object f = s.f();
            if (f == e) {
                return dAG.b(e);
            }
            S s2 = (S) ((AbstractC7647dAd) f);
            if (s2 == null) {
                s2 = drx.invoke(Long.valueOf(s.b + 1), s);
                if (s.c(s2)) {
                    if (s.g()) {
                        s.h();
                    }
                }
            }
            s = s2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.dAd] */
    public static final <N extends AbstractC7647dAd<N>> N a(N n) {
        while (true) {
            Object f = n.f();
            if (f == e) {
                return n;
            }
            ?? r0 = (AbstractC7647dAd) f;
            if (r0 != 0) {
                n = r0;
            } else if (n.i()) {
                return n;
            }
        }
    }
}
