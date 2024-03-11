package o;

import java.util.Collections;

/* renamed from: o.df  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8156df<K, A> extends AbstractC5913cN<K, A> {
    private final A c;

    @Override // o.AbstractC5913cN
    public void c(float f) {
        this.d = f;
    }

    @Override // o.AbstractC5913cN
    float e() {
        return 1.0f;
    }

    public C8156df(C8912ff<A> c8912ff) {
        this(c8912ff, null);
    }

    public C8156df(C8912ff<A> c8912ff, A a) {
        super(Collections.emptyList());
        b(c8912ff);
        this.c = a;
    }

    @Override // o.AbstractC5913cN
    public void f() {
        if (this.a != null) {
            super.f();
        }
    }

    @Override // o.AbstractC5913cN
    public A g() {
        C8912ff<A> c8912ff = this.a;
        A a = this.c;
        return c8912ff.a(0.0f, 0.0f, a, a, c(), c(), c());
    }

    @Override // o.AbstractC5913cN
    A c(C8910fd<K> c8910fd, float f) {
        return g();
    }
}
