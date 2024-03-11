package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import o.AbstractC9564rv;
import o.C9534rR;
import o.InterfaceC9522rF;

/* loaded from: classes5.dex */
public final class SerializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final InterfaceC9522rF[] a;
    protected final InterfaceC9522rF[] c;
    protected final AbstractC9564rv[] e;
    protected static final InterfaceC9522rF[] d = new InterfaceC9522rF[0];
    protected static final AbstractC9564rv[] b = new AbstractC9564rv[0];

    public SerializerFactoryConfig() {
        this(null, null, null);
    }

    protected SerializerFactoryConfig(InterfaceC9522rF[] interfaceC9522rFArr, InterfaceC9522rF[] interfaceC9522rFArr2, AbstractC9564rv[] abstractC9564rvArr) {
        this.c = interfaceC9522rFArr == null ? d : interfaceC9522rFArr;
        this.a = interfaceC9522rFArr2 == null ? d : interfaceC9522rFArr2;
        this.e = abstractC9564rvArr == null ? b : abstractC9564rvArr;
    }

    public boolean d() {
        return this.a.length > 0;
    }

    public boolean a() {
        return this.e.length > 0;
    }

    public Iterable<InterfaceC9522rF> b() {
        return new C9534rR(this.c);
    }

    public Iterable<InterfaceC9522rF> e() {
        return new C9534rR(this.a);
    }

    public Iterable<AbstractC9564rv> c() {
        return new C9534rR(this.e);
    }
}
