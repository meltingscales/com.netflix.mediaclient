package o;

import com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides;

/* renamed from: o.daX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7915daX {
    public static final a b = new a(null);
    private final drO<dpR> a;
    private final ControllerVideoDataOverrides d;
    private final drM<Integer, dpR> e;

    public final ControllerVideoDataOverrides e() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7915daX(drO<dpR> dro, drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        this.a = dro;
        this.e = drm;
        this.d = new ControllerVideoDataOverrides();
    }

    /* renamed from: o.daX$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("VideoOverridesManager");
        }
    }

    public final int a(String str, bLL bll) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bll, "");
        int d = this.d.d(str, bll);
        this.a.invoke();
        b.getLogTag();
        return d;
    }

    public final void b(C7978dbh c7978dbh) {
        C8632dsu.c((Object) c7978dbh, "");
        a aVar = b;
        aVar.getLogTag();
        if (!c7978dbh.b().isEmpty()) {
            aVar.getLogTag();
            this.d.b(c7978dbh.b());
            aVar.getLogTag();
            int e = this.d.e();
            if (this.d.b()) {
                this.e.invoke(Integer.valueOf(e));
            }
        }
    }
}
