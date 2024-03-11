package o;

import com.netflix.mediaclient.ui.epoxymodels.api.controller.ControllerVideoDataOverrides;
import java.util.Set;

/* renamed from: o.bTw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4036bTw implements cYA {
    public static final e d = new e(null);
    private final ControllerVideoDataOverrides a;
    private final drO<dpR> b;
    private final drM<Integer, dpR> c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4036bTw(drO<dpR> dro, drM<? super Integer, dpR> drm) {
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) drm, "");
        this.b = dro;
        this.c = drm;
        this.a = new ControllerVideoDataOverrides();
    }

    /* renamed from: o.bTw$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("VideoOverridesManager");
        }
    }

    @Override // o.cYA
    public int a(String str, bLL bll) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bll, "");
        int d2 = this.a.d(str, bll);
        this.b.invoke();
        d.getLogTag();
        return d2;
    }

    @Override // o.cYA
    public Boolean a(String str, ControllerVideoDataOverrides.VideoOverrideName videoOverrideName) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoOverrideName, "");
        return this.a.c(str, videoOverrideName);
    }

    public final void b(C4049bUi c4049bUi) {
        Set<Integer> b;
        C8632dsu.c((Object) c4049bUi, "");
        e eVar = d;
        eVar.getLogTag();
        C4029bTp e2 = c4049bUi.e();
        if (e2 == null || (b = e2.b()) == null || !(!b.isEmpty())) {
            return;
        }
        eVar.getLogTag();
        this.a.b(b);
        eVar.getLogTag();
        int e3 = this.a.e();
        if (this.a.b()) {
            this.c.invoke(Integer.valueOf(e3));
        }
    }
}
