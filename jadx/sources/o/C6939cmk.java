package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.ViewUtils;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cmk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6939cmk extends ConstraintLayout {
    private static byte e$ss2$86 = 24;
    private static int f = 0;
    private static int g = 1;
    private final C1204Sr a;
    private final NetflixImageView b;
    private final C1204Sr c;
    private final C6868clS d;
    private final C1204Sr e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6939cmk(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6939cmk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6939cmk(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6939cmk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C6868clS d = C6868clS.d(LayoutInflater.from(context), this);
        C8632dsu.a(d, "");
        this.d = d;
        NetflixImageView netflixImageView = d.a;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        C1204Sr c1204Sr = d.c;
        C8632dsu.a(c1204Sr, "");
        this.a = c1204Sr;
        C1204Sr c1204Sr2 = d.e;
        C8632dsu.a(c1204Sr2, "");
        this.e = c1204Sr2;
        C1204Sr c1204Sr3 = d.d;
        C8632dsu.a(c1204Sr3, "");
        this.c = c1204Sr3;
    }

    public final void setImageUrl(String str) {
        C8632dsu.c((Object) str, "");
        this.b.showImage(str);
        this.b.setContentDescription(getResources().getString(com.netflix.mediaclient.ui.R.o.gV));
    }

    public final void a(boolean z) {
        ViewUtils.d(this.c, z);
        boolean z2 = !z;
        ViewUtils.d(this.a, z2);
        ViewUtils.d(this.e, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r1 = o.C6939cmk.f + 33;
        o.C6939cmk.g = r1 % 128;
        r1 = r1 % 2;
        r0 = new java.lang.Object[1];
        h(r5.substring(4), r0);
        r5 = ((java.lang.String) r0[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setOfferLabel(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C6939cmk.g
            int r1 = r1 + 41
            int r2 = r1 % 128
            o.C6939cmk.f = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            if (r1 == 0) goto L23
            android.content.res.Resources r1 = r4.getResources()
            java.lang.String r5 = r1.getString(r5)
            boolean r1 = r5.startsWith(r3)
            r3 = 87
            int r3 = r3 / r2
            if (r1 == 0) goto L4d
            goto L31
        L23:
            android.content.res.Resources r1 = r4.getResources()
            java.lang.String r5 = r1.getString(r5)
            boolean r1 = r5.startsWith(r3)
            if (r1 == 0) goto L4d
        L31:
            int r1 = o.C6939cmk.f
            int r1 = r1 + 33
            int r3 = r1 % 128
            o.C6939cmk.g = r3
            int r1 = r1 % r0
            r0 = 4
            java.lang.String r5 = r5.substring(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.h(r5, r0)
            r5 = r0[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
        L4d:
            java.lang.String r0 = ""
            o.C8632dsu.a(r5, r0)
            o.Sr r0 = r4.a
            r0.setText(r5)
            o.Sr r0 = r4.c
            r0.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6939cmk.setOfferLabel(int):void");
    }

    private void h(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$86);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
