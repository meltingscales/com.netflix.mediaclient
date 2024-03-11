package o;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;

/* renamed from: o.dfV  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8178dfV {
    public static String d(int i, Context context) {
        return c(i, context).d();
    }

    public static C8112deI c(int i, Context context) {
        return a(i, context.getResources());
    }

    public static C8112deI a(int i, Resources resources) {
        if ("iw".equals(Locale.getDefault().getLanguage())) {
            int i2 = i / 60;
            return new C8112deI(resources.getString(com.netflix.mediaclient.ui.R.o.fd, Integer.valueOf(i2)), C1333Xq.d(com.netflix.mediaclient.ui.R.o.E).a(i2).c(), 0, i2);
        }
        int i3 = i / 3600;
        int i4 = (i - (i3 * 3600)) / 60;
        String string = resources.getString(com.netflix.mediaclient.ui.R.o.fd, 0);
        String c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.E).a(0).c();
        if (i3 > 0) {
            if (i4 > 0) {
                string = resources.getString(com.netflix.mediaclient.ui.R.o.eZ, Integer.valueOf(i3), Integer.valueOf(i4));
                String c2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.H).a(i3).c();
                c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.G).d("hours", c2).d("minutes", C1333Xq.d(com.netflix.mediaclient.ui.R.o.E).a(i4).c()).c();
            } else {
                string = resources.getString(com.netflix.mediaclient.ui.R.o.fb, Integer.valueOf(i3));
                c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.H).a(i3).c();
            }
        } else if (i4 > 0) {
            string = resources.getString(com.netflix.mediaclient.ui.R.o.fd, Integer.valueOf(i4));
            c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.E).a(i4).c();
        }
        return new C8112deI(string, c, i3, i4);
    }
}
