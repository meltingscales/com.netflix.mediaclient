package o;

import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cep  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6520cep extends AbstractC3336ax<b> {
    private static byte e$ss2$145 = 24;
    private static int g = 1;
    private static int j;
    private boolean b;
    private int c = 2;
    private View.OnClickListener d;
    private int f;

    /* renamed from: o.cep$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.H;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void c(int i) {
        this.f = i;
    }

    public final void e(int i) {
        this.c = i;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final boolean i() {
        return this.b;
    }

    public final View.OnClickListener k() {
        return this.d;
    }

    public final int m() {
        return this.f;
    }

    public final int o() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
        r7 = new android.text.SpannableString(r5);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r4, 0, r5.length(), java.lang.Object.class, r7, 0);
        r5 = r7;
     */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6520cep.b r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6520cep.e(o.cep$b):void");
    }

    private void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$145);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
