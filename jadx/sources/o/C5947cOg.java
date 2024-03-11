package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import o.C9834xU;

/* renamed from: o.cOg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5947cOg {
    private static int a = 1;
    private static int c;
    public static final C5947cOg d;
    private static byte e$ss2$62;

    static {
        b();
        d = new C5947cOg();
    }

    static void b() {
        e$ss2$62 = (byte) 24;
    }

    private C5947cOg() {
    }

    public final Spanned a(Context context, int i, int i2) {
        int i3 = 2 % 2;
        C8632dsu.c((Object) context, "");
        Resources resources = context.getResources();
        String string = resources.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i4 = a + 11;
            c = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            e(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = resources.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            }
        }
        C8632dsu.a(string, "");
        Resources resources2 = context.getResources();
        String string2 = resources2.getString(i2);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            e(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            CharSequence text2 = resources2.getText(i2);
            if (text2 instanceof Spanned) {
                SpannableString spannableString2 = new SpannableString(string2);
                TextUtils.copySpansFrom((SpannedString) text2, 0, string2.length(), Object.class, spannableString2, 0);
                string2 = spannableString2;
            }
        }
        C8632dsu.a(string2, "");
        Spanned c2 = c(context, string, string2);
        int i6 = c + 29;
        a = i6 % 128;
        int i7 = i6 % 2;
        return c2;
    }

    public final Spanned c(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) charSequence2, "");
        SpannableString d2 = d(context, charSequence, C9834xU.o.j);
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) d2).append((CharSequence) "\n").append((CharSequence) d(context, charSequence2, C9834xU.o.r));
        C8632dsu.a(append, "");
        return append;
    }

    private final SpannableString d(Context context, CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void e(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$62);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
