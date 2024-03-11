package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9246lv;

/* renamed from: o.lK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9209lK implements C9246lv.a {
    private String b;
    private List<C9209lK> c;
    private String d;
    private String e;

    public C9209lK() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.d;
    }

    public final void a(List<C9209lK> list) {
        this.c = list;
    }

    public final String b() {
        return this.b;
    }

    public final List<C9209lK> d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public C9209lK(String str, String str2, String str3) {
        List<C9209lK> i;
        this.d = str;
        this.b = str2;
        this.e = str3;
        i = C8569dql.i();
        this.c = i;
    }

    public /* synthetic */ C9209lK(String str, String str2, String str3, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "Android Bugsnag Notifier" : str, (i & 2) != 0 ? "6.1.0" : str2, (i & 4) != 0 ? "https://bugsnag.com" : str3);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("name").e(this.d);
        c9246lv.c("version").e(this.b);
        c9246lv.c(SignupConstants.Field.URL).e(this.e);
        if (!this.c.isEmpty()) {
            c9246lv.c("dependencies");
            c9246lv.c();
            for (C9209lK c9209lK : this.c) {
                c9246lv.c(c9209lK);
            }
            c9246lv.b();
        }
        c9246lv.d();
    }
}
