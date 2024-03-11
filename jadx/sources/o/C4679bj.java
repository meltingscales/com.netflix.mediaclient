package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: o.bj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4679bj {
    private static byte e$ss2$109 = 24;
    private static int g = 0;
    private static int h = 1;
    private final CharSequence a;
    private int b;
    private final int c;
    private Object[] d;
    private final boolean e;
    private int f;
    private int i;
    private CharSequence j;

    public void a(CharSequence charSequence) {
        this.j = charSequence;
        this.i = 0;
        this.b = 0;
    }

    public C4679bj() {
        this.e = false;
        this.a = null;
        this.c = 0;
    }

    public C4679bj(CharSequence charSequence) {
        this.e = true;
        this.a = charSequence;
        this.j = charSequence;
        this.c = 0;
    }

    public void a(int i) {
        b(i, null);
    }

    public void b(int i, Object[] objArr) {
        if (i == 0) {
            c();
            return;
        }
        this.i = i;
        this.d = objArr;
        this.j = null;
        this.b = 0;
    }

    private void c() {
        if (!this.e) {
            throw new IllegalArgumentException("0 is an invalid value for required strings.");
        }
        int i = this.c;
        if (i != 0) {
            a(i);
        } else {
            a(this.a);
        }
    }

    public CharSequence d(Context context) {
        int i = 2 % 2;
        if (this.b != 0) {
            int i2 = h + 121;
            g = i2 % 128;
            int i3 = i2 % 2;
            return this.d != null ? context.getResources().getQuantityString(this.b, this.f, this.d) : context.getResources().getQuantityString(this.b, this.f);
        } else if (this.i != 0) {
            if (this.d != null) {
                return context.getResources().getString(this.i, this.d);
            }
            Resources resources = context.getResources();
            int i4 = this.i;
            String string = resources.getString(i4);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                String intern = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i4);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(intern);
                    TextUtils.copySpansFrom((SpannedString) text, 0, intern.length(), Object.class, spannableString, 0);
                    int i5 = g + 97;
                    h = i5 % 128;
                    int i6 = i5 % 2;
                    return spannableString;
                }
                return intern;
            }
            return string;
        } else {
            return this.j;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4679bj) {
            C4679bj c4679bj = (C4679bj) obj;
            if (this.i == c4679bj.i && this.b == c4679bj.b && this.f == c4679bj.f) {
                CharSequence charSequence = this.j;
                if (charSequence == null ? c4679bj.j == null : charSequence.equals(c4679bj.j)) {
                    return Arrays.equals(this.d, c4679bj.d);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.j;
        int hashCode = charSequence != null ? charSequence.hashCode() : 0;
        int i = this.i;
        return (((((((hashCode * 31) + i) * 31) + this.b) * 31) + this.f) * 31) + Arrays.hashCode(this.d);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$109);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
