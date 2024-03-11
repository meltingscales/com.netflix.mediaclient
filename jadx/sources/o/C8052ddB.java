package o;

import android.net.Uri;

/* renamed from: o.ddB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8052ddB {
    public static final Uri c(String str, boolean z) {
        boolean d;
        C8632dsu.c((Object) str, "");
        d = duD.d((CharSequence) str, (CharSequence) "netflix.com", false, 2, (Object) null);
        if (d && z) {
            return b(str);
        }
        Uri parse = Uri.parse(str);
        C8632dsu.d(parse);
        return parse;
    }

    public static final Uri b(String str) {
        C8632dsu.c((Object) str, "");
        Uri build = Uri.parse(str).buildUpon().appendQueryParameter("netflixsource", "android").appendQueryParameter("fromApp", "true").build();
        C8632dsu.a(build, "");
        return build;
    }
}
