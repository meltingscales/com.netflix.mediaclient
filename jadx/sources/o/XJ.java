package o;

import android.content.Context;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public final class XJ implements XM {
    public static final b a = new b(null);
    private XR b;
    private final XL d;
    private final Context e;

    @Inject
    public XJ(@ApplicationContext Context context, XL xl) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) xl, "");
        this.e = context;
        this.d = xl;
        c(XN.c.d(C8157dfA.e(context, "featureConfigData", (String) null), false));
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    private final void c(XR xr) {
        this.b = xr;
        this.d.e(xr != null ? xr.c() : null);
    }

    @Override // o.XM
    public XR a() {
        XR xr = this.b;
        return xr == null ? XN.c.d(c()) : xr;
    }

    @Override // o.XM
    public void d() {
        C8157dfA.a(this.e, "featureConfigData", (String) null);
        c(null);
        C1044Mm.e("FeatureSetDao", "Clearing featureSetResponse");
    }

    @Override // o.XM
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        XR d = XN.c.d(str, c());
        if (d != null) {
            C8157dfA.a(this.e, "featureConfigData", str);
            c(d);
        }
    }

    private final boolean c() {
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        return k != null ? k.v() : C8157dfA.b(this.e, "nf_user_status_loggedin", false);
    }
}
