package o;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.Base64;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import dagger.hilt.android.scopes.ActivityScoped;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import o.bBI;

@ActivityScoped
/* loaded from: classes4.dex */
public final class bBL implements bBI {
    public static final int a;
    public static final e c;
    private static byte e$ss2$128 = 0;
    private static int i = 0;
    private static int j = 1;
    private final VG b;
    private final InterfaceC1284Vt d;
    private final Activity e;
    private final VH f;
    private final VD g;

    static {
        b();
        c = new e(null);
        a = 8;
    }

    static void b() {
        e$ss2$128 = (byte) 24;
    }

    @Inject
    public bBL(Activity activity, VH vh, VG vg, InterfaceC1284Vt interfaceC1284Vt, VD vd) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) vg, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) vd, "");
        this.e = activity;
        this.f = vh;
        this.b = vg;
        this.d = interfaceC1284Vt;
        this.g = vd;
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("ProfileSwitchUiImpl");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
        if (r0.startsWith("'!#+") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
        r2 = new java.lang.Object[1];
        h(r0.substring(4), r2);
        r0 = ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
        if ((!r0.startsWith("'!#+")) != false) goto L8;
     */
    @Override // o.bBI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.appcompat.app.AlertDialog.Builder a(final o.bBI.a r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            o.bBL$e r1 = o.bBL.c
            r1.getLogTag()
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.app.Activity r2 = r8.e
            int r3 = o.C9834xU.o.c
            r1.<init>(r2, r3)
            android.app.Activity r2 = r8.e
            android.content.res.Resources r2 = r2.getResources()
            int r3 = o.bBM.c.ae
            java.lang.String r2 = r2.getString(r3)
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            o.VD r2 = r8.g
            boolean r2 = r2.c()
            r3 = 4
            java.lang.String r4 = "'!#+"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L74
            int r2 = o.bBL.i
            int r2 = r2 + 53
            int r7 = r2 % 128
            o.bBL.j = r7
            int r2 = r2 % r0
            if (r2 != 0) goto L50
            android.app.Activity r0 = r8.e
            android.content.res.Resources r0 = r0.getResources()
            int r2 = o.bBM.c.ag
            java.lang.String r0 = r0.getString(r2)
            boolean r2 = r0.startsWith(r4)
            r4 = 82
            int r4 = r4 / r6
            r2 = r2 ^ r5
            if (r2 == 0) goto L62
            goto Lc1
        L50:
            android.app.Activity r0 = r8.e
            android.content.res.Resources r0 = r0.getResources()
            int r2 = o.bBM.c.ag
            java.lang.String r0 = r0.getString(r2)
            boolean r2 = r0.startsWith(r4)
            if (r2 == 0) goto Lc1
        L62:
            java.lang.String r0 = r0.substring(r3)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r8.h(r0, r2)
            r0 = r2[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            goto Lc1
        L74:
            android.app.Activity r2 = r8.e
            android.content.res.Resources r2 = r2.getResources()
            int r7 = o.bBM.c.ad
            java.lang.String r2 = r2.getString(r7)
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto Lc0
            int r4 = o.bBL.i
            int r4 = r4 + 83
            int r7 = r4 % 128
            o.bBL.j = r7
            int r4 = r4 % r0
            if (r4 != 0) goto La6
            java.lang.String r2 = r2.substring(r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r8.h(r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r3 = 85
            int r3 = r3 / r6
            goto Lb7
        La6:
            java.lang.String r2 = r2.substring(r3)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r8.h(r2, r3)
            r2 = r3[r6]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
        Lb7:
            int r3 = o.bBL.i
            int r3 = r3 + 65
            int r4 = r3 % 128
            o.bBL.j = r4
            int r3 = r3 % r0
        Lc0:
            r0 = r2
        Lc1:
            androidx.appcompat.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            android.app.Activity r1 = r8.e
            android.content.res.Resources r1 = r1.getResources()
            int r2 = o.bBM.c.a
            java.lang.String r1 = r1.getString(r2)
            o.bBK r2 = new o.bBK
            r2.<init>()
            androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            android.app.Activity r1 = r8.e
            android.content.res.Resources r1 = r1.getResources()
            int r2 = o.bBM.c.h
            java.lang.String r1 = r1.getString(r2)
            o.bBN r2 = new o.bBN
            r2.<init>()
            androidx.appcompat.app.AlertDialog$Builder r9 = r0.setPositiveButton(r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bBL.a(o.bBI$a):androidx.appcompat.app.AlertDialog$Builder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bBI.a aVar, DialogInterface dialogInterface, int i2) {
        if (aVar != null) {
            aVar.e();
        }
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bBI.a aVar, DialogInterface dialogInterface, int i2) {
        if (aVar != null) {
            aVar.c();
        }
        dialogInterface.cancel();
    }

    @Override // o.bBI
    public boolean c() {
        return this.b.b() != null;
    }

    @Override // o.bBI
    public void e() {
        this.d.i();
    }

    @Override // o.bBI
    public void c(InterfaceC5283bvo interfaceC5283bvo) {
        C8632dsu.c((Object) interfaceC5283bvo, "");
        c.getLogTag();
        if (this.b.b() != null) {
            this.f.b(interfaceC5283bvo);
        }
    }

    @Override // o.bBI
    public void a() {
        c.getLogTag();
        if (this.b.b() != null) {
            this.g.a(CommanderState.a);
            this.b.a();
        }
    }

    private void h(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$128);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
