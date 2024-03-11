package o;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.io.ContentReference;

/* renamed from: o.of  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9389of {
    protected final ContentReference a;
    protected char[] b;
    protected JsonEncoding c;
    protected byte[] d;
    protected final C9382oY e;
    protected byte[] f;
    protected final boolean g;
    protected char[] h;
    @Deprecated
    protected final Object i;
    protected char[] j;
    protected byte[] k;

    public void d(JsonEncoding jsonEncoding) {
        this.c = jsonEncoding;
    }

    public boolean f() {
        return this.g;
    }

    public ContentReference g() {
        return this.a;
    }

    public JsonEncoding i() {
        return this.c;
    }

    @Deprecated
    public Object j() {
        return this.i;
    }

    public C9389of(C9382oY c9382oY, ContentReference contentReference, boolean z) {
        this.e = c9382oY;
        this.a = contentReference;
        this.i = contentReference.a();
        this.g = z;
    }

    public C9443pg h() {
        return new C9443pg(this.e);
    }

    public byte[] e() {
        b((Object) this.f);
        byte[] e = this.e.e(0);
        this.f = e;
        return e;
    }

    public byte[] d() {
        b((Object) this.k);
        byte[] e = this.e.e(1);
        this.k = e;
        return e;
    }

    public byte[] e(int i) {
        b((Object) this.k);
        byte[] e = this.e.e(1, i);
        this.k = e;
        return e;
    }

    public byte[] c() {
        b((Object) this.d);
        byte[] e = this.e.e(3);
        this.d = e;
        return e;
    }

    public char[] b() {
        b(this.j);
        char[] b = this.e.b(0);
        this.j = b;
        return b;
    }

    public char[] b(int i) {
        b(this.j);
        char[] a = this.e.a(0, i);
        this.j = a;
        return a;
    }

    public char[] a() {
        b(this.b);
        char[] b = this.e.b(1);
        this.b = b;
        return b;
    }

    public char[] d(int i) {
        b(this.h);
        char[] a = this.e.a(3, i);
        this.h = a;
        return a;
    }

    public void c(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.f);
            this.f = null;
            this.e.a(0, bArr);
        }
    }

    public void a(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.k);
            this.k = null;
            this.e.a(1, bArr);
        }
    }

    public void b(byte[] bArr) {
        if (bArr != null) {
            c(bArr, this.d);
            this.d = null;
            this.e.a(3, bArr);
        }
    }

    public void d(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.j);
            this.j = null;
            this.e.d(0, cArr);
        }
    }

    public void e(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.b);
            this.b = null;
            this.e.d(1, cArr);
        }
    }

    public void a(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.h);
            this.h = null;
            this.e.d(3, cArr);
        }
    }

    protected final void b(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void c(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw o();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw o();
        }
    }

    private IllegalArgumentException o() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
