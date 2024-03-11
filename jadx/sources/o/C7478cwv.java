package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cwv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7478cwv extends AbstractC7476cwt {
    private static int a = 0;
    private static int c = 1;
    public static final c d;
    private static byte e$ss2$52;

    static {
        b();
        d = new c(null);
    }

    static void b() {
        e$ss2$52 = (byte) 24;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7478cwv(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            int r1 = com.netflix.mediaclient.ui.R.o.fK
            java.lang.String r5 = r5.getString(r1)
            java.lang.String r1 = "'!#+"
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L3b
            int r1 = o.C7478cwv.c
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.C7478cwv.a = r2
            r2 = 2
            int r1 = r1 % r2
            r1 = 4
            java.lang.String r5 = r5.substring(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            s(r5, r1)
            r5 = 0
            r5 = r1[r5]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            int r1 = o.C7478cwv.c
            int r1 = r1 + 57
            int r3 = r1 % 128
            o.C7478cwv.a = r3
            int r1 = r1 % r2
            int r2 = r2 % r2
        L3b:
            o.C8632dsu.a(r5, r0)
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7478cwv.<init>(android.content.Context):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7478cwv() {
        /*
            r2 = this;
            android.content.Context r0 = o.AbstractApplicationC1040Mh.d()
            int r1 = com.netflix.mediaclient.ui.R.o.fK
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = ""
            o.C8632dsu.a(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7478cwv.<init>():void");
    }

    /* renamed from: o.cwv$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ContentPreviewPinDialog");
        }

        public final C7478cwv d(Context context, PlayVerifierVault playVerifierVault) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) playVerifierVault, "");
            getLogTag();
            C7478cwv c7478cwv = new C7478cwv(context);
            Bundle bundle = new Bundle();
            bundle.putParcelable("PlayVerifierVault", playVerifierVault);
            c7478cwv.setArguments(bundle);
            return c7478cwv;
        }
    }

    @Override // o.C8019dcV
    public void d(boolean z) {
        this.h.setVisibility(8);
    }

    private static void s(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$52);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
