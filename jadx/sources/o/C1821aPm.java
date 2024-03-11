package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.NrmLanguagesData;
import com.netflix.mediaclient.service.webclient.model.leafs.UserCookies;

/* renamed from: o.aPm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1821aPm {
    private static String a = "nf_config_nrm";
    public NrmLanguagesData c;
    public Context e;

    public C1821aPm(Context context) {
        this.e = context;
        this.c = NrmLanguagesData.fromJsonString(C8157dfA.e(context, "nrmLanguages", (String) null));
    }

    private boolean a() {
        return C1815aPg.d(this.e).a();
    }

    public static String[] b(Context context) {
        String[] strArr;
        NrmLanguagesData fromJsonString = NrmLanguagesData.fromJsonString(C8157dfA.e(context, "nrmLanguages", (String) null));
        if (fromJsonString == null || (strArr = fromJsonString.tags) == null) {
            return null;
        }
        return strArr;
    }

    public void e() {
        C1044Mm.e(a, "clearing cookies");
        C8284dhV.a(a());
    }

    public void a(UserCookies userCookies) {
        if (userCookies == null || !userCookies.isValid()) {
            C1044Mm.d(a, "netflixCookies object is null or invalid - ignore overwrite");
            return;
        }
        UserCookies e = C8284dhV.e(a());
        if (C8168dfL.d(e.netflixId, userCookies.netflixId) && C8168dfL.d(e.secureNetflixId, userCookies.secureNetflixId)) {
            C1044Mm.e(a, "ignore write of same cookies");
        } else {
            C8284dhV.a(userCookies.netflixId, userCookies.secureNetflixId, a());
        }
    }

    public void c(NrmLanguagesData nrmLanguagesData) {
        if (nrmLanguagesData == null) {
            C1044Mm.d(a, "nrmLanguagesData object is null - ignore overwrite");
            return;
        }
        C8157dfA.a(this.e, "nrmLanguages", nrmLanguagesData.toJsonString());
        this.c = nrmLanguagesData;
    }

    public static boolean d(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "nrmLanguages", (String) null));
    }
}
