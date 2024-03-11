package o;

/* renamed from: o.dCx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7721dCx {
    void a(float f);

    void a(InterfaceC7707dCj interfaceC7707dCj, int i);

    InterfaceC7719dCv b(InterfaceC7707dCj interfaceC7707dCj, int i);

    void b(byte b);

    void b(int i);

    InterfaceC7721dCx c(InterfaceC7707dCj interfaceC7707dCj);

    dFP c();

    void c(double d);

    void c(boolean z);

    void d();

    void d(char c);

    void d(short s);

    InterfaceC7719dCv e(InterfaceC7707dCj interfaceC7707dCj);

    void e();

    void e(long j);

    void e(String str);

    <T> void e(dBZ<? super T> dbz, T t);

    /* renamed from: o.dCx$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public static void b(InterfaceC7721dCx interfaceC7721dCx) {
        }

        public static InterfaceC7719dCv a(InterfaceC7721dCx interfaceC7721dCx, InterfaceC7707dCj interfaceC7707dCj, int i) {
            C8632dsu.c((Object) interfaceC7707dCj, "");
            return interfaceC7721dCx.e(interfaceC7707dCj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void e(InterfaceC7721dCx interfaceC7721dCx, dBZ<? super T> dbz, T t) {
            C8632dsu.c((Object) dbz, "");
            dbz.e(interfaceC7721dCx, t);
        }

        public static <T> void c(InterfaceC7721dCx interfaceC7721dCx, dBZ<? super T> dbz, T t) {
            C8632dsu.c((Object) dbz, "");
            if (dbz.e().i()) {
                interfaceC7721dCx.e(dbz, t);
            } else if (t == null) {
                interfaceC7721dCx.e();
            } else {
                interfaceC7721dCx.d();
                interfaceC7721dCx.e(dbz, t);
            }
        }
    }
}
