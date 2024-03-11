package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import o.C9834xU;

/* renamed from: o.cek  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6515cek extends AbstractC3336ax<b> {
    private static byte e$ss2$145 = 24;
    private static int g = 0;
    private static int i = 1;
    private boolean b;
    private Integer c;
    private View.OnClickListener d;
    private Integer f;

    /* renamed from: o.cek$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.H;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void d(Integer num) {
        this.f = num;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final boolean i() {
        return this.b;
    }

    public final Integer k() {
        return this.c;
    }

    public final View.OnClickListener m() {
        return this.d;
    }

    public final Integer n() {
        return this.f;
    }

    public final void n_(Integer num) {
        this.c = num;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(b bVar) {
        int i2;
        int i3 = 2 % 2;
        C8632dsu.c((Object) bVar, "");
        Resources resources = bVar.r().getContext().getResources();
        if (!this.b) {
            i2 = C9834xU.a.v;
        } else {
            int i4 = i + 33;
            g = i4 % 128;
            int i5 = i4 % 2;
            i2 = C9834xU.a.q;
            int i6 = g + 63;
            i = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        View r = bVar.r();
        C8632dsu.d(r);
        C1203Sq c1203Sq = (C1203Sq) r;
        Integer num = this.f;
        if (num != null) {
            int intValue = num.intValue();
            Context context = c1203Sq.getContext();
            String string = context.getString(intValue);
            if (string.startsWith("'!#+")) {
                int i8 = i + 9;
                g = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    l(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    boolean z = context.getText(intValue) instanceof Spanned;
                    throw null;
                }
                String substring = string.substring(4);
                Object[] objArr2 = new Object[1];
                l(substring, objArr2);
                string = ((String) objArr2[0]).intern();
                CharSequence text = context.getText(intValue);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            c1203Sq.setText(string);
        }
        Integer num2 = this.c;
        if (num2 != null) {
            c1203Sq.setCompoundDrawablesRelativeWithIntrinsicBounds(num2.intValue(), 0, 0, 0);
            int i9 = g + 51;
            i = i9 % 128;
            int i10 = i9 % 2;
        }
        c1203Sq.setPadding(c1203Sq.getPaddingLeft(), c1203Sq.getPaddingTop(), c1203Sq.getPaddingRight(), dimensionPixelSize);
        View.OnClickListener onClickListener = this.d;
        c1203Sq.setOnClickListener(onClickListener);
        c1203Sq.setClickable(onClickListener != null);
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$145);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
