package o;

import com.bugsnag.android.ErrorType;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import o.C9246lv;

/* renamed from: o.mk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9288mk implements C9246lv.a {
    private final boolean a;
    private String b;
    private String c;
    private List<C9279mb> d;
    private String e;
    private ErrorType g;

    public final boolean b() {
        return this.a;
    }

    public final List<C9279mb> d() {
        return this.d;
    }

    public C9288mk(String str, String str2, ErrorType errorType, boolean z, String str3, C9278ma c9278ma) {
        List<C9279mb> n;
        this.c = str;
        this.e = str2;
        this.g = errorType;
        this.a = z;
        this.b = str3;
        n = C8576dqs.n(c9278ma.e());
        this.d = n;
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c(SignupConstants.Field.LANG_ID).e(this.c);
        c9246lv.c("name").e(this.e);
        c9246lv.c("type").e(this.g.getDesc$bugsnag_android_core_release());
        c9246lv.c("state").e(this.b);
        c9246lv.c("stacktrace");
        c9246lv.c();
        for (C9279mb c9279mb : this.d) {
            c9246lv.c(c9279mb);
        }
        c9246lv.b();
        if (this.a) {
            c9246lv.c("errorReportingThread").b(true);
        }
        c9246lv.d();
    }
}
