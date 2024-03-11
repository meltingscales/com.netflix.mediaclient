package o;

import com.bugsnag.android.ErrorType;
import java.io.File;
import java.util.List;
import java.util.Set;
import o.C9246lv;

/* renamed from: o.lf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9230lf implements C9246lv.a {
    private final C9258mG a;
    private final C9209lK b;
    private String c;
    private C9229le d;
    private final File e;

    public C9230lf(String str, C9229le c9229le, C9209lK c9209lK, C9258mG c9258mG) {
        this(str, c9229le, null, c9209lK, c9258mG, 4, null);
    }

    public final String a() {
        return this.c;
    }

    public final C9229le b() {
        return this.d;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void d(C9229le c9229le) {
        this.d = c9229le;
    }

    public final File e() {
        return this.e;
    }

    public C9230lf(String str, C9229le c9229le, File file, C9209lK c9209lK, C9258mG c9258mG) {
        List<C9209lK> n;
        this.c = str;
        this.e = file;
        this.a = c9258mG;
        this.d = c9229le;
        C9209lK c9209lK2 = new C9209lK(c9209lK.a(), c9209lK.b(), c9209lK.e());
        n = C8576dqs.n(c9209lK.d());
        c9209lK2.a(n);
        dpR dpr = dpR.c;
        this.b = c9209lK2;
    }

    public /* synthetic */ C9230lf(String str, C9229le c9229le, File file, C9209lK c9209lK, C9258mG c9258mG, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : c9229le, (i & 4) != 0 ? null : file, c9209lK, c9258mG);
    }

    public final Set<ErrorType> d() {
        Set<ErrorType> e;
        C9229le c9229le = this.d;
        if (c9229le != null) {
            return c9229le.e().e();
        }
        File file = this.e;
        if (file != null) {
            return C9228ld.e.b(file, this.a).b();
        }
        e = dqN.e();
        return e;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("apiKey").e(this.c);
        c9246lv.c("payloadVersion").e("4.0");
        c9246lv.c("notifier").c(this.b);
        c9246lv.c("events").c();
        C9229le c9229le = this.d;
        if (c9229le != null) {
            c9246lv.c(c9229le);
        } else {
            File file = this.e;
            if (file != null) {
                c9246lv.c(file);
            }
        }
        c9246lv.b();
        c9246lv.d();
    }
}
