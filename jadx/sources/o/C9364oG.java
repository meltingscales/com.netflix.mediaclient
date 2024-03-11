package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.ContentReference;

/* renamed from: o.oG  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9364oG extends AbstractC9323nS {
    protected String a;
    protected C9364oG c;
    protected int e;
    protected C9366oI f;
    protected int g;
    protected Object i;
    protected final C9364oG j;

    @Override // o.AbstractC9323nS
    public Object a() {
        return this.i;
    }

    @Override // o.AbstractC9323nS
    public void b(Object obj) {
        this.i = obj;
    }

    @Override // o.AbstractC9323nS
    public String c() {
        return this.a;
    }

    public C9364oG e(C9366oI c9366oI) {
        this.f = c9366oI;
        return this;
    }

    @Override // o.AbstractC9323nS
    public boolean f() {
        return this.a != null;
    }

    public C9366oI l() {
        return this.f;
    }

    @Override // o.AbstractC9323nS
    /* renamed from: m */
    public C9364oG b() {
        return this.j;
    }

    public C9364oG n() {
        this.i = null;
        return this.j;
    }

    public boolean o() {
        int i = this.d + 1;
        this.d = i;
        return this.b != 0 && i > 0;
    }

    public C9364oG(C9364oG c9364oG, C9366oI c9366oI, int i, int i2, int i3) {
        this.j = c9364oG;
        this.f = c9366oI;
        this.b = i;
        this.g = i2;
        this.e = i3;
        this.d = -1;
    }

    public void a(int i, int i2, int i3) {
        this.b = i;
        this.d = -1;
        this.g = i2;
        this.e = i3;
        this.a = null;
        this.i = null;
        C9366oI c9366oI = this.f;
        if (c9366oI != null) {
            c9366oI.a();
        }
    }

    public static C9364oG c(C9366oI c9366oI) {
        return new C9364oG(null, c9366oI, 0, 1, 0);
    }

    public C9364oG a(int i, int i2) {
        C9364oG c9364oG = this.c;
        if (c9364oG == null) {
            C9366oI c9366oI = this.f;
            C9364oG c9364oG2 = new C9364oG(this, c9366oI == null ? null : c9366oI.b(), 1, i, i2);
            this.c = c9364oG2;
            return c9364oG2;
        }
        c9364oG.a(1, i, i2);
        return c9364oG;
    }

    public C9364oG c(int i, int i2) {
        C9364oG c9364oG = this.c;
        if (c9364oG == null) {
            C9366oI c9366oI = this.f;
            C9364oG c9364oG2 = new C9364oG(this, c9366oI == null ? null : c9366oI.b(), 2, i, i2);
            this.c = c9364oG2;
            return c9364oG2;
        }
        c9364oG.a(2, i, i2);
        return c9364oG;
    }

    @Override // o.AbstractC9323nS
    public JsonLocation d(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this.g, this.e);
    }

    @Override // o.AbstractC9323nS
    @Deprecated
    public JsonLocation d(Object obj) {
        return d(ContentReference.d(obj));
    }

    public void d(String str) {
        this.a = str;
        C9366oI c9366oI = this.f;
        if (c9366oI != null) {
            c(c9366oI, str);
        }
    }

    private void c(C9366oI c9366oI, String str) {
        if (c9366oI.a(str)) {
            Object e = c9366oI.e();
            JsonParser jsonParser = e instanceof JsonParser ? (JsonParser) e : null;
            throw new JsonParseException(jsonParser, "Duplicate field '" + str + "'");
        }
    }
}
