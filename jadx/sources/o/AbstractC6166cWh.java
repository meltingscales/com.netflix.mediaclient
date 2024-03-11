package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6184cWz;
import o.C8632dsu;
import o.C9935zP;
import o.cVP;
import o.dpR;

/* renamed from: o.cWh  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6166cWh extends AbstractC3336ax<e> {
    private CharSequence b;
    private C9935zP d;
    private CharSequence f;
    private Integer g;
    private AbstractC6184cWz.d j;
    private Integer k;
    private AbstractC6184cWz.d l;
    private boolean c = true;
    private boolean h = true;
    private final View.OnClickListener i = new View.OnClickListener() { // from class: o.cWg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC6166cWh.b(AbstractC6166cWh.this, view);
        }
    };

    public final void N_(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.b;
    }

    public final void a_(AbstractC6184cWz.d dVar) {
        this.j = dVar;
    }

    public final void a_(C9935zP c9935zP) {
        this.d = c9935zP;
    }

    public final void b(CharSequence charSequence) {
        this.f = charSequence;
    }

    public final void d(Integer num) {
        this.g = num;
    }

    public final void d(boolean z) {
        this.h = z;
    }

    public final void e(AbstractC6184cWz.d dVar) {
        this.l = dVar;
    }

    public final C9935zP i() {
        return this.d;
    }

    public final boolean k() {
        return this.c;
    }

    public final AbstractC6184cWz.d l() {
        return this.j;
    }

    public final Integer m() {
        return this.g;
    }

    public final CharSequence n() {
        return this.f;
    }

    public final CharSequence o() {
        return this.b;
    }

    public final boolean q() {
        return this.h;
    }

    public final AbstractC6184cWz.d r() {
        return this.l;
    }

    public final void r_(Integer num) {
        this.k = num;
    }

    public final Integer t() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC6166cWh abstractC6166cWh, View view) {
        C8632dsu.c((Object) abstractC6166cWh, "");
        int id = view.getId();
        if (id == cVP.c.c) {
            C9726vo.d(abstractC6166cWh.d, abstractC6166cWh.j, new drX<C9935zP, AbstractC6184cWz.d, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.models.ButtonsModel$onClickListener$1$1
                @Override // o.drX
                public /* synthetic */ dpR invoke(C9935zP c9935zP, AbstractC6184cWz.d dVar) {
                    c(c9935zP, dVar);
                    return dpR.c;
                }

                public final void c(C9935zP c9935zP, AbstractC6184cWz.d dVar) {
                    C8632dsu.c((Object) c9935zP, "");
                    C8632dsu.c((Object) dVar, "");
                    c9935zP.b(AbstractC6184cWz.class, dVar);
                }
            });
        } else if (id == cVP.c.h) {
            C9726vo.d(abstractC6166cWh.d, abstractC6166cWh.l, new drX<C9935zP, AbstractC6184cWz.d, dpR>() { // from class: com.netflix.mediaclient.ui.tvconnect.impl.models.ButtonsModel$onClickListener$1$2
                @Override // o.drX
                public /* synthetic */ dpR invoke(C9935zP c9935zP, AbstractC6184cWz.d dVar) {
                    c(c9935zP, dVar);
                    return dpR.c;
                }

                public final void c(C9935zP c9935zP, AbstractC6184cWz.d dVar) {
                    C8632dsu.c((Object) c9935zP, "");
                    C8632dsu.c((Object) dVar, "");
                    c9935zP.b(AbstractC6184cWz.class, dVar);
                }
            });
        }
    }

    @Override // o.AbstractC3336ax
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        e(eVar.e(), this.b, this.g);
        e(eVar.c(), this.f, this.k);
        eVar.e().setEnabled(this.c);
        eVar.c().setEnabled(this.h);
        eVar.e().setOnClickListener(this.i);
        eVar.c().setOnClickListener(this.i);
    }

    private final void e(C1203Sq c1203Sq, CharSequence charSequence, Integer num) {
        if (charSequence == null || charSequence.length() == 0) {
            c1203Sq.setVisibility(8);
            c1203Sq.setText((CharSequence) null);
        } else if (num != null) {
            c1203Sq.e(num.intValue());
            c1203Sq.setVisibility(0);
            c1203Sq.setText(charSequence);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: o.cWh$e */
    /* loaded from: classes6.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(e.class, "negative", "getNegative()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(e.class, "positive", "getPositive()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ e = bIF.d(this, cVP.c.c, false, 2, null);
        private final dsZ c = bIF.d(this, cVP.c.h, false, 2, null);

        public final C1203Sq e() {
            return (C1203Sq) this.e.getValue(this, d[0]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.c.getValue(this, d[1]);
        }
    }
}
