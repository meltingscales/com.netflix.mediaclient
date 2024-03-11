package o;

import android.content.res.Resources;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;

/* renamed from: o.bVz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4093bVz extends AbstractC3073as<C1181Ru> {
    private static byte e$ss2$125 = 24;
    private static int g = 0;
    private static int i = 1;
    private View.OnClickListener b;
    private int d = com.netflix.mediaclient.ui.R.e.D;
    private int j = com.netflix.mediaclient.ui.R.o.hA;
    private int c = com.netflix.mediaclient.ui.R.o.hy;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.V;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final int k() {
        return this.d;
    }

    public final int l() {
        return this.j;
    }

    public final int m() {
        return this.c;
    }

    @Override // o.AbstractC3073as
    /* renamed from: d */
    public void c(C1181Ru c1181Ru) {
        int i2 = 2 % 2;
        C8632dsu.c((Object) c1181Ru, "");
        super.c((AbstractC4093bVz) c1181Ru);
        Resources resources = c1181Ru.getResources();
        c1181Ru.setIconDrawable(this.d);
        String string = resources.getString(this.j);
        if (string.startsWith("'!#+")) {
            int i3 = g + 47;
            i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            o(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c1181Ru.setMessageText(string);
        String string2 = resources.getString(this.c);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            o(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i5 = g + 63;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        c1181Ru.setButtonText(string2);
        c1181Ru.setButtonClickListener(this.b);
        int i7 = i + 105;
        g = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3073as
    /* renamed from: c */
    public void e(C1181Ru c1181Ru) {
        C8632dsu.c((Object) c1181Ru, "");
        c1181Ru.setButtonClickListener(null);
        super.e((AbstractC4093bVz) c1181Ru);
    }

    private void o(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$125);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
