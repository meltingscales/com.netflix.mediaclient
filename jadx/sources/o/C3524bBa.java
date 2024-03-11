package o;

import android.content.Context;
import androidx.core.content.ContextCompat;
import o.C3796bKz;

/* renamed from: o.bBa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3524bBa {
    public static final dpR e(Context context, ST st, Integer num) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) st, "");
        st.d(context.getResources().getInteger(C3796bKz.c.d));
        st.b(ContextCompat.getColor(context, C3796bKz.b.a));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C3796bKz.d.c);
        st.a(0, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        st.e(context.getResources().getDimensionPixelSize(C3796bKz.d.b));
        if (num != null) {
            st.b(context, num.intValue());
            return dpR.c;
        }
        return null;
    }
}
