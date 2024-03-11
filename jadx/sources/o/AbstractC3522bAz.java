package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC5475bzU;
import o.C5473bzS;

/* renamed from: o.bAz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3522bAz extends AbstractC3336ax<e> {
    private String c = "";
    private C9935zP d;

    @Override // o.AbstractC3073as
    public int a() {
        return C5473bzS.e.h;
    }

    public final void b(C9935zP c9935zP) {
        this.d = c9935zP;
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    public final C9935zP i() {
        return this.d;
    }

    public final String l() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.e((AbstractC3522bAz) eVar);
        eVar.a().setText(this.c);
        eVar.a().setOnClickListener(new View.OnClickListener() { // from class: o.bAy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3522bAz.a(AbstractC3522bAz.this, view);
            }
        });
        eVar.c().setOnClickListener(new View.OnClickListener() { // from class: o.bAw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3522bAz.b(AbstractC3522bAz.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC3522bAz abstractC3522bAz, View view) {
        C8632dsu.c((Object) abstractC3522bAz, "");
        C9935zP c9935zP = abstractC3522bAz.d;
        if (c9935zP != null) {
            c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.h.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3522bAz abstractC3522bAz, View view) {
        C8632dsu.c((Object) abstractC3522bAz, "");
        C9935zP c9935zP = abstractC3522bAz.d;
        if (c9935zP != null) {
            c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.e.c);
        }
    }

    /* renamed from: o.bAz$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "resendCodeButton", "getResendCodeButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "dismissButton", "getDismissButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ b = bIF.d(this, C5473bzS.a.e, false, 2, null);
        private final dsZ d = bIF.d(this, C5473bzS.a.b, false, 2, null);

        public final C1203Sq a() {
            return (C1203Sq) this.b.getValue(this, c[0]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.d.getValue(this, c[1]);
        }
    }
}
