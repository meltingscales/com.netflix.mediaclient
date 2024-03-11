package o;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.RelativeLayout;
import com.netflix.android.imageloader.api.ShowImageRequest;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class cWU extends RelativeLayout {
    private static int b = 0;
    private static int d = 1;
    private static byte e$ss2$122 = 24;
    private final C3632bFa a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWU(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cWU(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ cWU(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cWU(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        View.inflate(context, com.netflix.mediaclient.ui.R.i.bL, this);
        C3632bFa b2 = C3632bFa.b(this);
        C8632dsu.a(b2, "");
        this.a = b2;
    }

    public final void setDropDownText(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.a.b.setText(charSequence);
    }

    public final void setHint(CharSequence charSequence) {
        this.a.i.setHint(charSequence);
    }

    public final void setIconImage(String str) {
        if (str != null) {
            this.a.a.showImage(new ShowImageRequest().a(str).a(true));
        } else {
            this.a.a.clearImage();
        }
    }

    public final void setErrorText(int i) {
        int i2 = 2 % 2;
        int i3 = b + 61;
        d = i3 % 128;
        int i4 = i3 % 2;
        C1204Sr c1204Sr = this.a.g;
        Context context = c1204Sr.getContext();
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            c(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i5 = d + 45;
                b = i5 % 128;
                int i6 = i5 % 2;
                string = spannableString;
            }
        }
        c1204Sr.setText(string);
        int i7 = d + 109;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(boolean z) {
        this.a.g.setVisibility(z ? 0 : 8);
        this.a.i.setBackgroundResource(z ? com.netflix.mediaclient.ui.R.e.aR : com.netflix.mediaclient.ui.R.e.aV);
    }

    public final void a(View.OnClickListener onClickListener) {
        this.a.e.setFocusable(false);
        this.a.e.setInputType(0);
        setOnClickListener(onClickListener);
        this.a.e.setOnClickListener(onClickListener);
    }

    private void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$122);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
