package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cml  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6940cml extends ConstraintLayout {
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$73 = 24;
    private final C1203Sq b;
    private final C6862clM e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6940cml(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6940cml(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6940cml(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6940cml(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C6862clM d = C6862clM.d(LayoutInflater.from(context), this, true);
        C8632dsu.a(d, "");
        this.e = d;
        C1203Sq c1203Sq = d.e;
        C8632dsu.a(c1203Sq, "");
        this.b = c1203Sq;
    }

    public final void setLabel(int i) {
        int i2 = 2 % 2;
        int i3 = c + 75;
        a = i3 % 128;
        int i4 = i3 % 2;
        C1203Sq c1203Sq = this.b;
        String string = getResources().getString(i);
        if (string.startsWith("'!#+")) {
            int i5 = a + 3;
            c = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                d(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            d(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        c1203Sq.setText(string);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$73);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
