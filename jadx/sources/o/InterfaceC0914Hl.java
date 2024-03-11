package o;

import java.io.Closeable;

/* renamed from: o.Hl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0914Hl extends Closeable {
    int a(long j);

    void b(long j, long j2, InterfaceC0905Hc interfaceC0905Hc);

    void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int d();

    int d(long j, long j2);

    boolean e();

    /* renamed from: o.Hl$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static void b(InterfaceC0914Hl interfaceC0914Hl, long j, long j2, InterfaceC0905Hc interfaceC0905Hc) {
            if (interfaceC0905Hc != null) {
                interfaceC0905Hc.d(interfaceC0914Hl.d());
                interfaceC0905Hc.d();
            }
            interfaceC0914Hl.c();
            if (interfaceC0905Hc != null) {
                interfaceC0905Hc.e();
                interfaceC0905Hc.a();
            }
            int d = interfaceC0914Hl.d(j, j2);
            if (interfaceC0905Hc != null) {
                interfaceC0905Hc.a(d);
                interfaceC0905Hc.c();
            }
            int a = interfaceC0914Hl.a(j);
            if (interfaceC0905Hc != null) {
                interfaceC0905Hc.b(a);
                interfaceC0905Hc.b();
            }
            interfaceC0914Hl.c();
            if (interfaceC0905Hc != null) {
                interfaceC0905Hc.h();
                interfaceC0905Hc.c(interfaceC0914Hl.d());
            }
        }
    }
}
