package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cmj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6938cmj extends ConstraintLayout {
    private static int a = 1;
    private static int d = 0;
    private static byte e$ss2$73 = 24;
    private final C6866clQ b;
    private final C1203Sq e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6938cmj(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6938cmj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6938cmj(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6938cmj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C6866clQ c = C6866clQ.c(LayoutInflater.from(context), this, true);
        C8632dsu.a(c, "");
        this.b = c;
        C1203Sq c1203Sq = c.c;
        C8632dsu.a(c1203Sq, "");
        this.e = c1203Sq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
        if ((r2 % 2) != 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
        r2 = 5 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r7.startsWith("'!#+") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if ((!r7.startsWith("'!#+")) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        r2 = new java.lang.Object[1];
        c(r7.substring(4), r2);
        r7 = ((java.lang.String) r2[0]).intern();
        r2 = o.C6938cmj.d + 49;
        o.C6938cmj.a = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLabel(int r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C6938cmj.a
            int r1 = r1 + 23
            int r2 = r1 % 128
            o.C6938cmj.d = r2
            int r1 = r1 % r0
            java.lang.String r2 = "'!#+"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            o.Sq r1 = r6.e
            android.content.res.Resources r5 = r6.getResources()
            java.lang.String r7 = r5.getString(r7)
            boolean r2 = r7.startsWith(r2)
            r5 = 76
            int r5 = r5 / r4
            if (r2 == 0) goto L56
            goto L37
        L26:
            o.Sq r1 = r6.e
            android.content.res.Resources r5 = r6.getResources()
            java.lang.String r7 = r5.getString(r7)
            boolean r2 = r7.startsWith(r2)
            r2 = r2 ^ r3
            if (r2 == r3) goto L56
        L37:
            r2 = 4
            java.lang.String r7 = r7.substring(r2)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r6.c(r7, r2)
            r7 = r2[r4]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r7.intern()
            int r2 = o.C6938cmj.d
            int r2 = r2 + 49
            int r3 = r2 % 128
            o.C6938cmj.a = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L56
            r2 = 5
            int r2 = r2 % r2
        L56:
            r1.setText(r7)
            int r7 = o.C6938cmj.d
            int r7 = r7 + 89
            int r1 = r7 % 128
            o.C6938cmj.a = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L67
            r7 = 37
            int r7 = r7 / r4
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6938cmj.setLabel(int):void");
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        setClickable(onClickListener != null);
    }

    private void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$73);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
