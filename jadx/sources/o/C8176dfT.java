package o;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.Formatter;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Locale;
import o.C9834xU;

/* renamed from: o.dfT  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8176dfT {
    private static final int[] c = {com.netflix.mediaclient.ui.R.o.ap, com.netflix.mediaclient.ui.R.o.cv, com.netflix.mediaclient.ui.R.o.ho, com.netflix.mediaclient.ui.R.o.bX, com.netflix.mediaclient.ui.R.o.lN, com.netflix.mediaclient.ui.R.o.jp, com.netflix.mediaclient.ui.R.o.bM};
    private static final int[] b = {com.netflix.mediaclient.ui.R.o.t, com.netflix.mediaclient.ui.R.o.A, com.netflix.mediaclient.ui.R.o.B, com.netflix.mediaclient.ui.R.o.x, com.netflix.mediaclient.ui.R.o.O, com.netflix.mediaclient.ui.R.o.L, com.netflix.mediaclient.ui.R.o.w};

    public static CharSequence a(Context context, String str, String str2) {
        if (context == null || C8168dfL.g(str2)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public static String b(int i) {
        return ((Context) C1332Xp.b(Context.class)).getString(com.netflix.mediaclient.ui.R.o.fC, Integer.valueOf(i));
    }

    public static String d(Context context, long j) {
        String formatShortFileSize = Formatter.formatShortFileSize(context, j);
        return "ro".equals(Locale.getDefault().getLanguage()) ? formatShortFileSize.replace("O", "B") : formatShortFileSize;
    }

    public static CharSequence c(Context context, String str, String str2) {
        String str3 = str + System.getProperty("line.separator") + str2;
        if (context == null) {
            return str3;
        }
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new TextAppearanceSpan(context, C9834xU.o.m), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(context, C9834xU.o.r), str.length(), str3.length(), 33);
        return spannableString;
    }

    public static CharSequence e(Context context, String str, String str2) {
        String property = System.getProperty("line.separator");
        String str3 = str + property + property + str2;
        if (context == null) {
            return str3;
        }
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new TextAppearanceSpan(context, C9834xU.o.n), 0, str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(context, C9834xU.o.s), str.length(), str3.length(), 33);
        return spannableString;
    }

    public static String b(Context context, InterfaceC5160btX interfaceC5160btX, VideoType videoType) {
        String d;
        if (VideoType.SHOW == videoType) {
            if (interfaceC5160btX.aU_()) {
                d = "";
            } else {
                String aK_ = interfaceC5160btX.aK_();
                if (C8168dfL.g(aK_)) {
                    d = C1333Xq.d(com.netflix.mediaclient.ui.R.o.dr).d("episodeNumber", Integer.valueOf(interfaceC5160btX.aw_())).c();
                } else {
                    d = C8168dfL.a(com.netflix.mediaclient.ui.R.o.ge, aK_, Integer.valueOf(interfaceC5160btX.aw_()));
                }
            }
        } else {
            d = C8178dfV.d(interfaceC5160btX.g(), context);
        }
        int a = C8168dfL.a(d, ' ', 2);
        if (a > -1) {
            String replace = d.replace(' ', (char) 160);
            String substring = replace.substring(0, a);
            String substring2 = replace.substring(a + 1);
            return substring + (char) 8203 + substring2;
        }
        return d;
    }
}
