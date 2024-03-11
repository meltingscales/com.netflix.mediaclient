package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC5475bzU;
import o.C5473bzS;

/* renamed from: o.bAd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3500bAd extends AbstractC3336ax<e> {
    private C9935zP c;

    @Override // o.AbstractC3073as
    public int a() {
        return C5473bzS.e.e;
    }

    public final void a(C9935zP c9935zP) {
        this.c = c9935zP;
    }

    public final C9935zP i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.e((AbstractC3500bAd) eVar);
        eVar.d().setOnClickListener(new View.OnClickListener() { // from class: o.bAc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3500bAd.d(AbstractC3500bAd.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC3500bAd abstractC3500bAd, View view) {
        C8632dsu.c((Object) abstractC3500bAd, "");
        C9935zP c9935zP = abstractC3500bAd.c;
        if (c9935zP != null) {
            c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.e.c);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.b((AbstractC3500bAd) eVar);
        eVar.d().setOnClickListener(null);
    }

    /* renamed from: o.bAd$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "dismissButton", "getDismissButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ a = bIF.d(this, C5473bzS.a.b, false, 2, null);

        public final C1203Sq d() {
            return (C1203Sq) this.a.getValue(this, c[0]);
        }
    }
}
