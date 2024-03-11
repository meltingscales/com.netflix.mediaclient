package o;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.ceO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6493ceO extends AbstractC3336ax<b> {
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$61 = 24;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
        if ((r1 instanceof android.text.Spanned) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
        r2 = new android.text.SpannableString(r5);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r1, 0, r5.length(), java.lang.Object.class, r2, 0);
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        r3 = r5.substring(4);
        r5 = new java.lang.Object[1];
        k(r3, r5);
        r5 = ((java.lang.String) r5[0]).intern();
        r1 = r4.getText(r1);
     */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6493ceO.b r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.AbstractC6493ceO.b
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.AbstractC6493ceO.c = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            java.lang.String r4 = ""
            if (r1 != 0) goto L35
            o.C8632dsu.c(r13, r4)
            super.e(r13)
            int r1 = com.netflix.mediaclient.ui.R.o.gU
            o.Sr r4 = r13.d()
            android.content.res.Resources r4 = r4.getResources()
            o.Sr r13 = r13.d()
            java.lang.String r5 = r4.getString(r1)
            boolean r3 = r5.startsWith(r3)
            r6 = 37
            int r6 = r6 / r2
            if (r3 == 0) goto L86
            goto L53
        L35:
            o.C8632dsu.c(r13, r4)
            super.e(r13)
            int r1 = com.netflix.mediaclient.ui.R.o.gU
            o.Sr r4 = r13.d()
            android.content.res.Resources r4 = r4.getResources()
            o.Sr r13 = r13.d()
            java.lang.String r5 = r4.getString(r1)
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L86
        L53:
            r3 = 4
            java.lang.String r3 = r5.substring(r3)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r12.k(r3, r5)
            r2 = r5[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r2.intern()
            java.lang.CharSequence r1 = r4.getText(r1)
            boolean r2 = r1 instanceof android.text.Spanned
            if (r2 == 0) goto L86
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r5)
            r6 = r1
            android.text.SpannedString r6 = (android.text.SpannedString) r6
            r7 = 0
            int r8 = r5.length()
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r1 = r2
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            r11 = 0
            r10 = r2
            android.text.TextUtils.copySpansFrom(r6, r7, r8, r9, r10, r11)
            r5 = r2
        L86:
            r13.setText(r5)
            int r13 = o.AbstractC6493ceO.b
            int r13 = r13 + 99
            int r1 = r13 % 128
            o.AbstractC6493ceO.c = r1
            int r13 = r13 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6493ceO.e(o.ceO$b):void");
    }

    /* renamed from: o.ceO$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.am, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "bodyText", "getBodyText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int c = 8;

        public final C1204Sr d() {
            return (C1204Sr) this.d.getValue(this, e[0]);
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$61);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
