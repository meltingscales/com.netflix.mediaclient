package o;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dly  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C8447dly {
    private static final List<String> c = new ArrayList<String>() { // from class: com.netflix.partner.PSearchDataUtils$1
        {
            add("com.samsung.android.app.galaxyfinder");
            add("com.sec.android.app.launcher");
        }
    };

    public static void b(Context context, Uri uri) {
        for (String str : c) {
            context.grantUriPermission(str, uri, 1);
        }
    }

    private static String e(int i, boolean z) {
        String str = z ? "reco" : "image";
        return str + i + ".webp";
    }

    public static String d(int i) {
        return e(i, true);
    }

    public static String c(int i) {
        return e(i, false);
    }

    public static File d(Context context, int i) {
        return d(context, i, false);
    }

    public static File a(Context context, int i) {
        return d(context, i, true);
    }

    private static File d(Context context, int i, boolean z) {
        return new File(new File(context.getCacheDir(), "partnerImages/"), e(i, z));
    }

    public static Uri e(Context context, File file) {
        try {
            return FileProvider.getUriForFile(context, TO.b(context).e(), file);
        } catch (Exception e) {
            C1044Mm.e("nf_partner_search_data", "could not make fileProvider uri", e);
            return null;
        }
    }
}
