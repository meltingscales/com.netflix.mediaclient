package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import o.C9513qx;
import o.InterfaceC9470qG;

/* loaded from: classes5.dex */
public abstract class AnnotatedWithParams extends AnnotatedMember {
    private static final long serialVersionUID = 1;
    protected final C9513qx[] i;

    public abstract JavaType c(int i);

    public abstract Object c();

    public abstract Object c(Object obj);

    public abstract Object c(Object[] objArr);

    public abstract Class<?> e(int i);

    public abstract int f();

    /* JADX INFO: Access modifiers changed from: protected */
    public AnnotatedWithParams(InterfaceC9470qG interfaceC9470qG, C9513qx c9513qx, C9513qx[] c9513qxArr) {
        super(interfaceC9470qG, c9513qx);
        this.i = c9513qxArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AnnotatedParameter d(int i, C9513qx c9513qx) {
        this.i[i] = c9513qx;
        return d(i);
    }

    public final C9513qx b(int i) {
        C9513qx[] c9513qxArr = this.i;
        if (c9513qxArr == null || i < 0 || i >= c9513qxArr.length) {
            return null;
        }
        return c9513qxArr[i];
    }

    public final AnnotatedParameter d(int i) {
        return new AnnotatedParameter(this, c(i), this.e, b(i), i);
    }
}
