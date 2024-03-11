package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.PlayContextImp;

/* renamed from: o.bpH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4932bpH {
    public static final C4932bpH c = new C4932bpH();
    private static String d = "amzn_deeplink_data";
    public static final int a = 8;

    public final String b() {
        return d;
    }

    private C4932bpH() {
    }

    public static final boolean a(Intent intent) {
        return intent != null && intent.hasExtra(d) && C8151dev.c();
    }

    public static final Intent e(Intent intent) {
        boolean d2;
        if (intent == null || !intent.hasExtra(d)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(intent.getStringExtra(d));
        d2 = duD.d((CharSequence) sb, (CharSequence) "?", false, 2, (Object) null);
        if (d2) {
            sb.append("&");
        } else if (!d2) {
            sb.append("?");
        }
        sb.append(NetflixActivity.EXTRA_SOURCE);
        sb.append("=");
        sb.append("amazonCatalogSearch");
        sb.append("&");
        sb.append("trkid");
        sb.append("=");
        sb.append(PlayContextImp.g);
        return new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString()));
    }
}
