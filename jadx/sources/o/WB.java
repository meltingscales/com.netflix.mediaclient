package o;

/* loaded from: classes3.dex */
public final class WB implements UH {
    public static final c b = new c(null);
    private final InterfaceC1284Vt a;

    public WB(InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.a = interfaceC1284Vt;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DeviceLostCallbackImpl");
        }
    }

    @Override // o.UH
    public void c(C1255Uq c1255Uq) {
        C8632dsu.c((Object) c1255Uq, "");
        b.getLogTag();
        C1331Xo.b.d(this.a);
    }
}
