package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;
import javax.inject.Inject;
import o.AbstractC3855bNd;

/* loaded from: classes4.dex */
public final class bNC implements InterfaceC3859bNh {
    public static final b c = new b(null);
    private final InterfaceC3862bNk d;

    @Inject
    public bNC(InterfaceC3862bNk interfaceC3862bNk) {
        C8632dsu.c((Object) interfaceC3862bNk, "");
        this.d = interfaceC3862bNk;
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("RealGameControllerMagicPathInboundNavigation");
        }
    }

    @Override // o.InterfaceC3859bNh
    public void d(Activity activity, MagicPathUiType magicPathUiType, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) magicPathUiType, "");
        C8632dsu.c((Object) str, "");
        Intent c2 = bNG.a.c(activity, magicPathUiType, str);
        c2.addFlags(131072);
        activity.startActivity(c2);
    }

    @Override // o.InterfaceC3859bNh
    public void e(Activity activity) {
        C8632dsu.c((Object) activity, "");
        AbstractC3855bNd.c d = this.d.d();
        if (d != null) {
            d(activity, MagicPathUiType.e, d.b());
        }
    }
}
