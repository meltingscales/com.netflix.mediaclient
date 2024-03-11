package o;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.cYd  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6216cYd extends AbstractC3336ax<b> {
    private static int c = 1;
    private static int d = 0;
    private static byte e$ss2$82 = 24;
    private int b = com.netflix.mediaclient.ui.R.o.jI;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aW;
    }

    public final void e(int i) {
        this.b = i;
    }

    public final int i() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        int i = 2 % 2;
        int i2 = d + 55;
        c = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) bVar, "");
        TextView b2 = bVar.b();
        int i4 = this.b;
        Context context = b2.getContext();
        String string = context.getString(i4);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i4);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i5 = d + 85;
                c = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        b2.setText(string);
    }

    /* renamed from: o.cYd$b */
    /* loaded from: classes5.dex */
    public static final class b extends bIG {
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.ey, false, 2, null);
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(b.class, "textView", "getTextView()Landroid/widget/TextView;", 0))};
        public static final int b = 8;

        public final TextView b() {
            return (TextView) this.e.getValue(this, c[0]);
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$82);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
