package o;

import android.view.View;
import android.widget.FrameLayout;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceCtaType;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7212cru;

/* renamed from: o.crx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7215crx extends AbstractC3336ax<c> {
    private View.OnClickListener b;
    public C7201crj c;
    private int d;
    private View.OnClickListener f;
    private View.OnClickListener g;
    private int j;

    @Override // o.AbstractC3073as
    public int a() {
        return C7212cru.c.a;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    public final void j_(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener k() {
        return this.g;
    }

    public final void k_(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final int m() {
        return this.j;
    }

    public final View.OnClickListener n() {
        return this.f;
    }

    public final int o() {
        return this.d;
    }

    public final void s_(int i) {
        this.d = i;
    }

    public final void t_(int i) {
        this.j = i;
    }

    public final C7201crj l() {
        C7201crj c7201crj = this.c;
        if (c7201crj != null) {
            return c7201crj;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.i().setVisibility(l().f() != null ? 0 : 8);
        if (l().f() != null) {
            cVar.i().setText(l().f());
        }
        cVar.a().setText(l().b());
        cVar.c().setText(l().e().a());
        cVar.c().setOnClickListener(this.g);
        C1203Sq g = cVar.g();
        NewUserExperienceCtaType d = l().c().d();
        NewUserExperienceCtaType newUserExperienceCtaType = NewUserExperienceCtaType.d;
        g.setVisibility(d != newUserExperienceCtaType ? 0 : 8);
        if (l().c().d() != newUserExperienceCtaType) {
            cVar.g().setText(l().c().a());
            cVar.g().setOnClickListener(this.f);
        }
        cVar.e().setVisibility(l().a() ? 0 : 8);
        if (l().a()) {
            cVar.e().setAnimation(l().d());
        }
        cVar.b().setOnClickListener(this.b);
        C1176Rp.setup$default(cVar.d(), this.j, C7212cru.b.a, 0, 0, 12, null);
        cVar.d().c(this.d);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((AbstractC7215crx) cVar);
        cVar.c().setOnClickListener(null);
        cVar.g().setOnClickListener(null);
        cVar.b().setOnClickListener(null);
    }

    /* renamed from: o.crx$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(c.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "description", "getDescription()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "primaryCta", "getPrimaryCta()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(c.class, "secondaryCta", "getSecondaryCta()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(c.class, "itemContainer", "getItemContainer()Landroid/widget/FrameLayout;", 0)), dsA.c(new PropertyReference1Impl(c.class, "carouselIndicator", "getCarouselIndicator()Lcom/netflix/mediaclient/android/widget/CarouselIndicatorView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "icon", "getIcon()Lcom/netflix/mediaclient/android/widget/NetflixLottieAnimationView;", 0))};
        private final dsZ j = bIF.d(this, C7212cru.d.i, false, 2, null);
        private final dsZ d = bIF.d(this, C7212cru.d.a, false, 2, null);
        private final dsZ g = bIF.d(this, C7212cru.d.g, false, 2, null);
        private final dsZ h = bIF.d(this, C7212cru.d.h, false, 2, null);
        private final dsZ c = bIF.d(this, C7212cru.d.c, false, 2, null);
        private final dsZ b = bIF.d(this, C7212cru.d.d, false, 2, null);
        private final dsZ a = bIF.d(this, C7212cru.d.b, false, 2, null);

        public final C1204Sr i() {
            return (C1204Sr) this.j.getValue(this, e[0]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, e[1]);
        }

        public final C1203Sq c() {
            return (C1203Sq) this.g.getValue(this, e[2]);
        }

        public final C1203Sq g() {
            return (C1203Sq) this.h.getValue(this, e[3]);
        }

        public final FrameLayout b() {
            return (FrameLayout) this.c.getValue(this, e[4]);
        }

        public final C1176Rp d() {
            return (C1176Rp) this.b.getValue(this, e[5]);
        }

        public final C1199Sm e() {
            return (C1199Sm) this.a.getValue(this, e[6]);
        }
    }
}
