package o;

/* renamed from: o.aZs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2096aZs implements InterfaceC2092aZo {
    public static final c b = new c(null);
    private final String d;

    public C2096aZs(String str) {
        C8632dsu.c((Object) str, "");
        this.d = str;
    }

    /* renamed from: o.aZs$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.InterfaceC2092aZo
    public boolean d() {
        C1044Mm.j("UnknownCommand", "Received not supported command %s", this.d);
        return true;
    }
}
