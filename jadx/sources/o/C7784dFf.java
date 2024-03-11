package o;

/* renamed from: o.dFf  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C7784dFf {
    public final dFD a;
    private boolean c;

    public void a() {
    }

    public void b() {
        this.c = false;
    }

    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(boolean z) {
        this.c = z;
    }

    public void d() {
        this.c = true;
    }

    public final boolean e() {
        return this.c;
    }

    public C7784dFf(dFD dfd) {
        C8632dsu.c((Object) dfd, "");
        this.a = dfd;
        this.c = true;
    }

    public final void d(char c) {
        this.a.b(c);
    }

    public final void d(String str) {
        C8632dsu.c((Object) str, "");
        this.a.c(str);
    }

    public void a(float f) {
        this.a.c(String.valueOf(f));
    }

    public void c(double d) {
        this.a.c(String.valueOf(d));
    }

    public void d(byte b) {
        this.a.c(b);
    }

    public void c(short s) {
        this.a.c(s);
    }

    public void b(int i) {
        this.a.c(i);
    }

    public void b(long j) {
        this.a.c(j);
    }

    public void b(boolean z) {
        this.a.c(String.valueOf(z));
    }

    public void c(String str) {
        C8632dsu.c((Object) str, "");
        this.a.a(str);
    }
}
