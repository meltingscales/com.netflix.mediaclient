package o;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import com.netflix.mediaclient.ui.mdx.CastState;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.cfm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6570cfm extends AbstractC3336ax<c> {
    private static int b = 0;
    private static int d = 1;
    private static byte e$ss2$82 = 24;
    private CastState c;

    /* renamed from: o.cfm$b */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[CastState.values().length];
            try {
                iArr[CastState.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CastState.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.v;
    }

    public final void c(CastState castState) {
        this.c = castState;
    }

    public final CastState i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(c cVar) {
        int i;
        int i2 = 2 % 2;
        int i3 = b + 55;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            C8632dsu.c((Object) cVar, "");
            super.e((AbstractC6570cfm) cVar);
            throw null;
        }
        C8632dsu.c((Object) cVar, "");
        super.e((AbstractC6570cfm) cVar);
        CastState castState = this.c;
        int i4 = castState == null ? -1 : b.c[castState.ordinal()];
        if (i4 != 1) {
            int i5 = d + 125;
            b = i5 % 128;
            int i6 = i5 % 2;
            i = i4 != 2 ? com.netflix.mediaclient.ui.R.o.eb : com.netflix.mediaclient.ui.R.o.ee;
        } else {
            i = com.netflix.mediaclient.ui.R.o.hc;
        }
        Resources resources = cVar.b().getResources();
        C1204Sr b2 = cVar.b();
        String string = resources.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i7 = d + 3;
            b = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = resources.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i9 = d + 89;
                b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        b2.setText(string);
    }

    /* renamed from: o.cfm$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.aq, false, 2, null);
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "titleText", "getTitleText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int b = 8;

        public final C1204Sr b() {
            return (C1204Sr) this.e.getValue(this, d[0]);
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
