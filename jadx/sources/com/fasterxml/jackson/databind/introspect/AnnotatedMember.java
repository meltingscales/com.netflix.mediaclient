package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import o.AbstractC9509qt;
import o.C9513qx;
import o.C9537rU;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public abstract class AnnotatedMember extends AbstractC9509qt implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient C9513qx c;
    protected final transient InterfaceC9470qG e;

    public abstract void c(Object obj, Object obj2);

    public abstract Object d(Object obj);

    public abstract AbstractC9509qt e(C9513qx c9513qx);

    public abstract Class<?> g();

    public abstract Member h();

    public C9513qx j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AnnotatedMember(InterfaceC9470qG interfaceC9470qG, C9513qx c9513qx) {
        this.e = interfaceC9470qG;
        this.c = c9513qx;
    }

    public String l() {
        return g().getName() + "#" + d();
    }

    @Override // o.AbstractC9509qt
    public final <A extends Annotation> A d(Class<A> cls) {
        C9513qx c9513qx = this.c;
        if (c9513qx == null) {
            return null;
        }
        return (A) c9513qx.e(cls);
    }

    @Override // o.AbstractC9509qt
    public final boolean a(Class<?> cls) {
        C9513qx c9513qx = this.c;
        if (c9513qx == null) {
            return false;
        }
        return c9513qx.b(cls);
    }

    @Override // o.AbstractC9509qt
    public boolean a(Class<? extends Annotation>[] clsArr) {
        C9513qx c9513qx = this.c;
        if (c9513qx == null) {
            return false;
        }
        return c9513qx.a(clsArr);
    }

    public final void d(boolean z) {
        Member h = h();
        if (h != null) {
            C9537rU.b(h, z);
        }
    }
}
