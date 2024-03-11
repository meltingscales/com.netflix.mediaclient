package o;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* renamed from: o.ckr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6840ckr {
    public static final CharSequence e(C1333Xq c1333Xq, CharSequence charSequence, CharSequence charSequence2, Integer num) {
        C8632dsu.c((Object) c1333Xq, "");
        Spanned c = C8168dfL.c(c1333Xq.d("mfaType", (charSequence == null || charSequence2 == null) ? charSequence != null ? SignupConstants.Field.EMAIL : "phone" : "emailAndPhone").d(SignupConstants.Field.EMAIL, charSequence).d("phone", charSequence2).d(SignupConstants.Field.TRAVEL_DAYS_OF_ACCESS, num).c());
        C8632dsu.a(c, "");
        return c;
    }

    public static final SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        C8632dsu.c((Object) spannableStringBuilder, "");
        SpannableStringBuilder append = spannableStringBuilder.append('\n');
        C8632dsu.a(append, "");
        return append;
    }

    public static final SpannableStringBuilder d(SpannableStringBuilder spannableStringBuilder, Activity activity, drM<? super SpannableStringBuilder, dpR> drm) {
        C8632dsu.c((Object) spannableStringBuilder, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) drm, "");
        C8145dep c8145dep = new C8145dep(C1336Xt.e(activity));
        int length = spannableStringBuilder.length();
        drm.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(c8145dep, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
