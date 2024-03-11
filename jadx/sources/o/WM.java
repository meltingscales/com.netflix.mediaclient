package o;

/* loaded from: classes3.dex */
public final class WM implements UQ {
    public static final d d = new d(null);
    private final InterfaceC1284Vt c;

    public WM(InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.c = interfaceC1284Vt;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("TargetDisconnectedCallbackImpl");
        }
    }

    @Override // o.UQ
    public void c(InterfaceC1265Va interfaceC1265Va) {
        C8632dsu.c((Object) interfaceC1265Va, "");
        d.getLogTag();
        if (interfaceC1265Va.d()) {
            C1329Xm.c.e();
        } else {
            C1331Xo.b.d(this.c);
        }
    }
}
