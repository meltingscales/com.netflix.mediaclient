package o;

/* renamed from: o.dCt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7717dCt {
    public static final c a = c.a;

    boolean a(InterfaceC7707dCj interfaceC7707dCj, int i);

    double b(InterfaceC7707dCj interfaceC7707dCj, int i);

    int b(InterfaceC7707dCj interfaceC7707dCj);

    char c(InterfaceC7707dCj interfaceC7707dCj, int i);

    byte d(InterfaceC7707dCj interfaceC7707dCj, int i);

    <T> T d(InterfaceC7707dCj interfaceC7707dCj, int i, dBP<? extends T> dbp, T t);

    float e(InterfaceC7707dCj interfaceC7707dCj, int i);

    <T> T e(InterfaceC7707dCj interfaceC7707dCj, int i, dBP<? extends T> dbp, T t);

    void e(InterfaceC7707dCj interfaceC7707dCj);

    InterfaceC7720dCw f(InterfaceC7707dCj interfaceC7707dCj, int i);

    short g(InterfaceC7707dCj interfaceC7707dCj, int i);

    int h(InterfaceC7707dCj interfaceC7707dCj);

    String h(InterfaceC7707dCj interfaceC7707dCj, int i);

    boolean h();

    long i(InterfaceC7707dCj interfaceC7707dCj, int i);

    int j(InterfaceC7707dCj interfaceC7707dCj, int i);

    dFP n();

    /* renamed from: o.dCt$c */
    /* loaded from: classes5.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }
    }

    /* renamed from: o.dCt$d */
    /* loaded from: classes5.dex */
    public static final class d {
        public static int a(InterfaceC7717dCt interfaceC7717dCt, InterfaceC7707dCj interfaceC7707dCj) {
            C8632dsu.c((Object) interfaceC7707dCj, "");
            return -1;
        }

        public static boolean d(InterfaceC7717dCt interfaceC7717dCt) {
            return false;
        }

        public static /* synthetic */ Object d(InterfaceC7717dCt interfaceC7717dCt, InterfaceC7707dCj interfaceC7707dCj, int i, dBP dbp, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return interfaceC7717dCt.d(interfaceC7707dCj, i, dbp, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }
}
