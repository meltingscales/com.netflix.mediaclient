package o;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.PropertyName;

/* renamed from: o.qH  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9471qH {
    private static final C9471qH f = new C9471qH(PropertyName.a, Object.class, null, false, null);
    protected final Class<?> a;
    protected final Class<? extends ObjectIdGenerator<?>> b;
    protected final boolean c;
    protected final PropertyName d;
    protected final Class<? extends InterfaceC9317nM> e;

    public static C9471qH a() {
        return f;
    }

    public Class<? extends InterfaceC9317nM> b() {
        return this.e;
    }

    public Class<? extends ObjectIdGenerator<?>> c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public PropertyName e() {
        return this.d;
    }

    public Class<?> f() {
        return this.a;
    }

    public C9471qH(PropertyName propertyName, Class<?> cls, Class<? extends ObjectIdGenerator<?>> cls2, Class<? extends InterfaceC9317nM> cls3) {
        this(propertyName, cls, cls2, false, cls3);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends o.nM>, code=java.lang.Class, for r5v0, types: [java.lang.Class<? extends o.nM>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected C9471qH(com.fasterxml.jackson.databind.PropertyName r1, java.lang.Class<?> r2, java.lang.Class<? extends com.fasterxml.jackson.annotation.ObjectIdGenerator<?>> r3, boolean r4, java.lang.Class r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            if (r5 != 0) goto Lf
            java.lang.Class<o.nO> r5 = o.C9319nO.class
        Lf:
            r0.e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9471qH.<init>(com.fasterxml.jackson.databind.PropertyName, java.lang.Class, java.lang.Class, boolean, java.lang.Class):void");
    }

    public C9471qH c(boolean z) {
        return this.c == z ? this : new C9471qH(this.d, this.a, this.b, z, this.e);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.d + ", scope=" + C9537rU.u(this.a) + ", generatorType=" + C9537rU.u(this.b) + ", alwaysAsId=" + this.c;
    }
}
