package o;

import java.util.List;
import java.util.Map;
import o.InterfaceC0914Hl;

/* renamed from: o.Hh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0910Hh implements InterfaceC0908Hf, InterfaceC0912Hj, InterfaceC0913Hk, InterfaceC0909Hg, InterfaceC0914Hl {
    public static final C0910Hh e = new C0910Hh();

    @Override // o.InterfaceC0914Hl
    public int a(long j) {
        return 0;
    }

    @Override // o.InterfaceC0908Hf
    /* renamed from: a */
    public C0910Hh b() {
        return this;
    }

    @Override // o.InterfaceC0908Hf
    /* renamed from: b */
    public C0910Hh e(long j) {
        return this;
    }

    @Override // o.InterfaceC0911Hi
    public void b(boolean z) {
    }

    @Override // o.InterfaceC0914Hl
    public void c() {
    }

    @Override // o.InterfaceC0913Hk
    public void c(String str, HZ hz, Long l) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) hz, "");
    }

    @Override // o.InterfaceC0908Hf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.InterfaceC0914Hl
    public int d() {
        return 0;
    }

    @Override // o.InterfaceC0914Hl
    public int d(long j, long j2) {
        return 0;
    }

    @Override // o.InterfaceC0909Hg
    public void e(String str) {
        C8632dsu.c((Object) str, "");
    }

    @Override // o.InterfaceC0914Hl
    public boolean e() {
        return false;
    }

    @Override // o.InterfaceC0908Hf
    /* renamed from: f */
    public C0910Hh c(long j) {
        return this;
    }

    @Override // o.InterfaceC0908Hf
    /* renamed from: g */
    public C0910Hh d(long j) {
        return this;
    }

    private C0910Hh() {
    }

    @Override // o.InterfaceC0914Hl
    public void b(long j, long j2, InterfaceC0905Hc interfaceC0905Hc) {
        InterfaceC0914Hl.c.b(this, j, j2, interfaceC0905Hc);
    }

    @Override // o.InterfaceC0912Hj
    public Map<String, HZ> e(List<String> list, InterfaceC0906Hd interfaceC0906Hd) {
        Map<String, HZ> d;
        C8632dsu.c((Object) list, "");
        d = dqE.d();
        return d;
    }
}
