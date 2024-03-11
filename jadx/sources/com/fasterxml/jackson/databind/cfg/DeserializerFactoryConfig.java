package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import java.io.Serializable;
import o.AbstractC9419pI;
import o.AbstractC9449pm;
import o.C9534rR;
import o.InterfaceC9426pP;
import o.InterfaceC9427pQ;
import o.InterfaceC9431pU;

/* loaded from: classes5.dex */
public class DeserializerFactoryConfig implements Serializable {
    private static final long serialVersionUID = 1;
    protected final InterfaceC9426pP[] f;
    protected final AbstractC9419pI[] g;
    protected final InterfaceC9431pU[] h;
    protected final AbstractC9449pm[] i;
    protected final InterfaceC9427pQ[] j;
    protected static final InterfaceC9427pQ[] d = new InterfaceC9427pQ[0];
    protected static final AbstractC9419pI[] e = new AbstractC9419pI[0];
    protected static final AbstractC9449pm[] b = new AbstractC9449pm[0];
    protected static final InterfaceC9431pU[] a = new InterfaceC9431pU[0];
    protected static final InterfaceC9426pP[] c = {new StdKeyDeserializers()};

    public DeserializerFactoryConfig() {
        this(null, null, null, null, null);
    }

    protected DeserializerFactoryConfig(InterfaceC9427pQ[] interfaceC9427pQArr, InterfaceC9426pP[] interfaceC9426pPArr, AbstractC9419pI[] abstractC9419pIArr, AbstractC9449pm[] abstractC9449pmArr, InterfaceC9431pU[] interfaceC9431pUArr) {
        this.j = interfaceC9427pQArr == null ? d : interfaceC9427pQArr;
        this.f = interfaceC9426pPArr == null ? c : interfaceC9426pPArr;
        this.g = abstractC9419pIArr == null ? e : abstractC9419pIArr;
        this.i = abstractC9449pmArr == null ? b : abstractC9449pmArr;
        this.h = interfaceC9431pUArr == null ? a : interfaceC9431pUArr;
    }

    public boolean g() {
        return this.f.length > 0;
    }

    public boolean e() {
        return this.g.length > 0;
    }

    public boolean c() {
        return this.i.length > 0;
    }

    public boolean j() {
        return this.h.length > 0;
    }

    public Iterable<InterfaceC9427pQ> a() {
        return new C9534rR(this.j);
    }

    public Iterable<InterfaceC9426pP> h() {
        return new C9534rR(this.f);
    }

    public Iterable<AbstractC9419pI> b() {
        return new C9534rR(this.g);
    }

    public Iterable<AbstractC9449pm> d() {
        return new C9534rR(this.i);
    }

    public Iterable<InterfaceC9431pU> f() {
        return new C9534rR(this.h);
    }
}
