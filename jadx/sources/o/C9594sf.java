package o;

import com.fasterxml.jackson.core.JsonLocation;

/* renamed from: o.sf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C9594sf extends AbstractC9323nS {
    protected final AbstractC9323nS a;
    protected Object c;
    protected String e;
    protected final JsonLocation f;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.c;
    }

    @Override // o.AbstractC9323nS
    public AbstractC9323nS b() {
        return this.a;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.c = obj;
    }

    @Override // o.AbstractC9323nS
    public String c() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    @Override // o.AbstractC9323nS
    public boolean f() {
        return this.e != null;
    }

    public void m() {
        this.d++;
    }

    protected C9594sf(AbstractC9323nS abstractC9323nS, JsonLocation jsonLocation) {
        super(abstractC9323nS);
        this.a = abstractC9323nS.b();
        this.e = abstractC9323nS.c();
        this.c = abstractC9323nS.a();
        this.f = jsonLocation;
    }

    protected C9594sf() {
        super(0, -1);
        this.a = null;
        this.f = JsonLocation.d;
    }

    protected C9594sf(C9594sf c9594sf, int i, int i2) {
        super(i, i2);
        this.a = c9594sf;
        this.f = c9594sf.f;
    }

    public static C9594sf b(AbstractC9323nS abstractC9323nS) {
        if (abstractC9323nS == null) {
            return new C9594sf();
        }
        return new C9594sf(abstractC9323nS, null);
    }

    public C9594sf o() {
        this.d++;
        return new C9594sf(this, 1, -1);
    }

    public C9594sf n() {
        this.d++;
        return new C9594sf(this, 2, -1);
    }

    public C9594sf l() {
        AbstractC9323nS abstractC9323nS = this.a;
        if (abstractC9323nS instanceof C9594sf) {
            return (C9594sf) abstractC9323nS;
        }
        if (abstractC9323nS == null) {
            return new C9594sf();
        }
        return new C9594sf(abstractC9323nS, this.f);
    }
}
