package kotlin.jvm.internal;

import java.io.Serializable;
import o.C8632dsu;
import o.InterfaceC8633dsv;
import o.dsA;

/* loaded from: classes.dex */
public abstract class Lambda<R> implements InterfaceC8633dsv<R>, Serializable {
    private final int arity;

    @Override // o.InterfaceC8633dsv
    public int getArity() {
        return this.arity;
    }

    public Lambda(int i) {
        this.arity = i;
    }

    public String toString() {
        String c = dsA.c(this);
        C8632dsu.a(c, "");
        return c;
    }
}
