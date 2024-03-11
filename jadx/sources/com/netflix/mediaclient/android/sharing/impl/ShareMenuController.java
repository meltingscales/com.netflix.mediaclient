package com.netflix.mediaclient.android.sharing.impl;

import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import com.netflix.android.widgetry.widget.menu.MenuController;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.AbstractC3073as;
import o.C1152Qr;
import o.C8569dql;
import o.C8632dsu;
import o.C9930zK;
import o.C9931zL;
import o.QH;
import o.QI;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class ShareMenuController<T> extends MenuController<QI<T>> {
    public static final int $stable = 8;
    private static int a = 0;
    private static int b = 1;
    private static byte e$ss2$104;
    private QI<T> shareInProgress;
    private final List<QI<T>> shareTargets;

    static {
        e();
    }

    static void e() {
        e$ss2$104 = (byte) 24;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShareMenuController(java.util.List<? extends o.QI<T>> r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.Xp r0 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = o.C1332Xp.b(r0)
            android.content.Context r0 = (android.content.Context) r0
            int r1 = com.netflix.mediaclient.ui.R.o.lz
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "'!#+"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L44
            int r1 = com.netflix.mediaclient.android.sharing.impl.ShareMenuController.b
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.netflix.mediaclient.android.sharing.impl.ShareMenuController.a = r3
            r3 = 2
            int r1 = r1 % r3
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            c(r0, r1)
            r0 = 0
            r0 = r1[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            int r1 = com.netflix.mediaclient.android.sharing.impl.ShareMenuController.b
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.netflix.mediaclient.android.sharing.impl.ShareMenuController.a = r2
            int r1 = r1 % r3
            int r3 = r3 % r3
        L44:
            r4.<init>(r0)
            r4.shareTargets = r5
            o.PM r5 = new o.PM
            r5.<init>()
            r4.addInterceptor(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.sharing.impl.ShareMenuController.<init>(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$8$lambda$7$lambda$5(ShareMenuController shareMenuController, QI qi, View view) {
        C8632dsu.c((Object) shareMenuController, "");
        C8632dsu.c((Object) qi, "");
        shareMenuController.shareInProgress = qi;
        shareMenuController.getItemClickSubject().onNext(qi);
        shareMenuController.requestModelBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItems$lambda$8$lambda$7$lambda$6(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    @Override // com.netflix.android.widgetry.widget.menu.MenuController
    public void addItems() {
        T t;
        List<QI<T>> list = this.shareTargets;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                QI qi = (QI) it.next();
                if (!(qi instanceof C1152Qr) && !(qi instanceof QH) && (i = i + 1) < 0) {
                    C8569dql.f();
                }
            }
            if (i != 0) {
                Iterator<T> it2 = this.shareTargets.iterator();
                while (it2.hasNext()) {
                    final QI qi2 = (QI) it2.next();
                    C9931zL c9931zL = new C9931zL();
                    QI<T> qi3 = this.shareInProgress;
                    boolean z = (qi3 == null || C8632dsu.c(qi2, qi3)) ? false : true;
                    c9931zL.a((CharSequence) (qi2.e() + qi2.hashCode()));
                    c9931zL.e((Drawable) qi2.c());
                    c9931zL.e(qi2.b());
                    c9931zL.b(C8632dsu.c(qi2, this.shareInProgress));
                    c9931zL.b(z ? 0.35f : 1.0f);
                    if (!z) {
                        c9931zL.d(new View.OnClickListener() { // from class: o.PS
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ShareMenuController.addItems$lambda$8$lambda$7$lambda$5(ShareMenuController.this, qi2, view);
                            }
                        });
                    }
                    final drM<View, dpR> dismissClickListener = getDismissClickListener();
                    c9931zL.a(new View.OnClickListener() { // from class: o.PR
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShareMenuController.addItems$lambda$8$lambda$7$lambda$6(drM.this, view);
                        }
                    });
                    add(c9931zL);
                }
                return;
            }
        }
        Iterator<T> it3 = this.shareTargets.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t = null;
                break;
            }
            t = it3.next();
            if (((QI) t) instanceof QH) {
                break;
            }
        }
        QI qi4 = (QI) t;
        if (qi4 != null) {
            getItemClickSubject().onNext(qi4);
        }
        getDismissSubject().onNext(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShareMenuController shareMenuController, List list) {
        C8632dsu.c((Object) shareMenuController, "");
        C8632dsu.c((Object) list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC3073as abstractC3073as = (AbstractC3073as) it.next();
            if (abstractC3073as instanceof C9930zK) {
                ((C9930zK) abstractC3073as).c(shareMenuController.shareInProgress != null ? 0.35f : 1.0f);
            }
        }
    }

    private static void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$104);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
