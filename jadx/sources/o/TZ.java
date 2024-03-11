package o;

import android.app.Activity;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.autologin.impl.AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1;
import com.netflix.mediaclient.graphql.models.type.TokenScope;
import javax.inject.Inject;
import o.dxD;

/* loaded from: classes3.dex */
public final class TZ implements TW {
    private final AppCompatActivity a;
    private d b;
    private final InterfaceC1239Ua c;
    private final InterfaceC1338Xv d;
    private final dwQ e;
    private final dwQ f;

    @Inject
    public TZ(Activity activity, dwQ dwq, dwQ dwq2, InterfaceC1338Xv interfaceC1338Xv, InterfaceC1239Ua interfaceC1239Ua) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwq2, "");
        C8632dsu.c((Object) interfaceC1338Xv, "");
        C8632dsu.c((Object) interfaceC1239Ua, "");
        this.f = dwq;
        this.e = dwq2;
        this.d = interfaceC1338Xv;
        this.c = interfaceC1239Ua;
        this.a = (AppCompatActivity) C9737vz.e(activity, AppCompatActivity.class);
    }

    @Override // o.TW
    public void c(TokenScope tokenScope, String str, drM<? super Activity, dpR> drm) {
        C8632dsu.c((Object) tokenScope, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        String uri = Uri.parse(aIJ.a(this.a)).buildUpon().appendEncodedPath(str).build().toString();
        C8632dsu.a(uri, "");
        b(tokenScope, uri, drm);
    }

    public void b(TokenScope tokenScope, String str, drM<? super Activity, dpR> drm) {
        dxD c;
        dxD d2;
        dxD d3;
        C8632dsu.c((Object) tokenScope, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        d dVar = this.b;
        if (dVar != null && (d3 = dVar.d()) != null && d3.cu_()) {
            d dVar2 = this.b;
            if (C8632dsu.c((Object) (dVar2 != null ? dVar2.e() : null), (Object) str)) {
                return;
            }
        }
        d dVar3 = this.b;
        if (dVar3 != null && (d2 = dVar3.d()) != null) {
            dxD.b.b(d2, null, 1, null);
        }
        c = C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(this.a), this.e, null, new AutoLoginUrlOpenerImpl$launchAutoLoginUrl$job$1(this, tokenScope, str, drm, null), 2, null);
        this.b = new d(str, c);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private final String a;
        private final dxD b;

        public final dxD d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.a, (Object) dVar.a) && C8632dsu.c(this.b, dVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            dxD dxd = this.b;
            return "RequestDetails(url=" + str + ", job=" + dxd + ")";
        }

        public d(String str, dxD dxd) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) dxd, "");
            this.a = str;
            this.b = dxd;
        }
    }
}
