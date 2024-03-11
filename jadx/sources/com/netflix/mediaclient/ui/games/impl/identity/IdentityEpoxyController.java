package com.netflix.mediaclient.ui.games.impl.identity;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel;
import java.nio.charset.StandardCharsets;
import o.C8632dsu;
import o.C9935zP;
import o.bQC;

/* loaded from: classes4.dex */
public final class IdentityEpoxyController extends TypedEpoxyController<IdentityViewModel.b> {
    private static int b = 1;
    private static int c = 0;
    private static byte e$ss2$83 = 24;
    private final Context context;
    private final C9935zP eventBusFactory;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IdentityEpoxyController(android.content.Context r3, o.C9935zP r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            boolean r0 = o.C8141del.a()
            if (r0 == 0) goto L11
            android.os.Handler r0 = o.C2808an.b
            goto L15
        L11:
            android.os.Handler r0 = o.C2808an.a()
        L15:
            boolean r1 = o.C8141del.a()
            if (r1 == 0) goto L1e
            android.os.Handler r1 = o.C2808an.b
            goto L22
        L1e:
            android.os.Handler r1 = o.C2808an.a()
        L22:
            r2.<init>(r0, r1)
            r2.context = r3
            r2.eventBusFactory = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityEpoxyController.<init>(android.content.Context, o.zP):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.text.SpannedString, T] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.text.SpannedString, T] */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void buildModels(final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r24) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityEpoxyController.buildModels(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$4$lambda$3(C9935zP c9935zP, View view) {
        C8632dsu.c((Object) c9935zP, "");
        c9935zP.b(bQC.class, bQC.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$16$lambda$15$lambda$13$lambda$12(IdentityViewModel.b bVar, C9935zP c9935zP, View view) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) c9935zP, "");
        String c2 = bVar.c();
        if (c2 != null) {
            c9935zP.b(bQC.class, new bQC.c(c2));
        }
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$83);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
