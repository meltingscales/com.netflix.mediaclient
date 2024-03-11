package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.C9246lv;

/* renamed from: o.kj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9181kj implements C9246lv.a {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Number h;

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final String i() {
        return this.g;
    }

    public final Number j() {
        return this.h;
    }

    public C9181kj(String str, String str2, String str3, String str4, String str5, String str6, String str7, Number number) {
        this.b = str;
        this.c = str2;
        this.a = str3;
        this.g = str4;
        this.e = str5;
        this.d = str6;
        this.f = str7;
        this.h = number;
    }

    public C9181kj(C9258mG c9258mG, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, c9258mG.h(), c9258mG.d(), c9258mG.A());
    }

    public void e(C9246lv c9246lv) {
        c9246lv.c("binaryArch").e(this.b);
        c9246lv.c("buildUUID").e(this.d);
        c9246lv.c("codeBundleId").e(this.e);
        c9246lv.c(SignupConstants.Field.LANG_ID).e(this.c);
        c9246lv.c("releaseStage").e(this.a);
        c9246lv.c("type").e(this.f);
        c9246lv.c("version").e(this.g);
        c9246lv.c("versionCode").a(this.h);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        e(c9246lv);
        c9246lv.d();
    }
}
