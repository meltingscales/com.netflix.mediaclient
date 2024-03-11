package o;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C4022bTi;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bVt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4087bVt extends AbstractC3336ax<b> implements InterfaceC3829bMe {
    public static final d c = new d(null);
    public drO<? extends TrackingInfo> b;
    public AppView d;
    private String f;
    private String g;
    private InterfaceC3825bMa.a h;
    private String i;
    private String k;
    private String m;
    private View.OnClickListener n;

    /* renamed from: o  reason: collision with root package name */
    private Animation.AnimationListener f13550o;
    private boolean l;
    private boolean j = this.l;

    public final void H_(String str) {
        this.i = str;
    }

    public final void I_(String str) {
        this.g = str;
    }

    public final void J_(String str) {
        this.f = str;
    }

    public final void K_(String str) {
        this.k = str;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.z;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void b(InterfaceC3825bMa.a aVar) {
        this.h = aVar;
    }

    public final void b(boolean z) {
        this.l = z;
    }

    public final void e(Animation.AnimationListener animationListener) {
        this.f13550o = animationListener;
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return true;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.g;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final String o() {
        return this.i;
    }

    public final Animation.AnimationListener p() {
        return this.f13550o;
    }

    public final String q() {
        return this.k;
    }

    public final View.OnClickListener r() {
        return this.n;
    }

    public final boolean s() {
        return this.l;
    }

    public final String t() {
        return this.m;
    }

    /* renamed from: o.bVt$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("KidsFavoritesMysteryBox");
        }
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.b;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.d;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(final b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.e((AbstractC4087bVt) bVar);
        this.j = this.l;
        bVar.r().setContentDescription(this.k);
        if (!this.j) {
            String str = this.f;
            if (str != null) {
                bVar.a().showImage(new ShowImageRequest().a(str).c(ShowImageRequest.Priority.a).d());
            }
            bVar.c().startAnimation(AnimationUtils.loadAnimation(bVar.r().getContext(), C4022bTi.d.e));
            bVar.b().startAnimation(AnimationUtils.loadAnimation(bVar.r().getContext(), C4022bTi.d.b));
            bVar.h().startAnimation(AnimationUtils.loadAnimation(bVar.r().getContext(), C4022bTi.d.a));
        } else {
            bVar.a().setVisibility(8);
            bVar.d().setVisibility(0);
            c(bVar);
        }
        a(bVar);
        View r = bVar.r();
        r.setOnClickListener(new View.OnClickListener() { // from class: o.bVx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC4087bVt.b(AbstractC4087bVt.this, bVar, view);
            }
        });
        r.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC4087bVt abstractC4087bVt, b bVar, View view) {
        View.OnClickListener onClickListener;
        C8632dsu.c((Object) abstractC4087bVt, "");
        C8632dsu.c((Object) bVar, "");
        if ((abstractC4087bVt.j || C8150deu.g()) && (onClickListener = abstractC4087bVt.n) != null) {
            onClickListener.onClick(view);
        }
        if (abstractC4087bVt.j) {
            return;
        }
        bVar.d().setVisibility(0);
        bVar.d().startAnimation(AnimationUtils.loadAnimation(view.getContext(), C4022bTi.d.d));
        if (abstractC4087bVt.j) {
            return;
        }
        abstractC4087bVt.j = true;
        NetflixImageView a = bVar.a();
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), C4022bTi.d.c);
        loadAnimation.setAnimationListener(abstractC4087bVt.f13550o);
        a.startAnimation(loadAnimation);
        abstractC4087bVt.c(bVar);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        View r = bVar.r();
        r.setOnClickListener(null);
        r.setClickable(false);
        bVar.c().setAnimation(null);
        bVar.b().setAnimation(null);
        bVar.h().setAnimation(null);
        bVar.a().setBackground(null);
        bVar.a().setForeground(null);
        bVar.a().onViewRecycled();
        bVar.e().setBackground(null);
        bVar.e().setForeground(null);
        bVar.e().onViewRecycled();
        bVar.f().setBackground(null);
        bVar.f().setForeground(null);
        bVar.f().onViewRecycled();
        super.b((AbstractC4087bVt) bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(o.AbstractC4087bVt.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.g
            if (r0 == 0) goto L2b
            boolean r1 = o.C8684dus.a(r0)
            if (r1 == 0) goto Lb
            goto L2b
        Lb:
            com.netflix.android.imageloader.api.ShowImageRequest r1 = new com.netflix.android.imageloader.api.ShowImageRequest
            r1.<init>()
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r1.a(r0)
            com.netflix.android.imageloader.api.ShowImageRequest$Priority r1 = com.netflix.android.imageloader.api.ShowImageRequest.Priority.a
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.c(r1)
            r1 = 1
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.a(r1)
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.d()
            com.netflix.mediaclient.android.widget.NetflixImageView r1 = r3.e()
            r1.showImage(r0)
            goto L3a
        L2b:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r3.e()
            r0.clearImage()
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r3.e()
            r1 = 0
            r0.setImageDrawable(r1)
        L3a:
            java.lang.String r0 = r2.i
            if (r0 == 0) goto L60
            boolean r1 = o.C8684dus.a(r0)
            if (r1 == 0) goto L45
            goto L60
        L45:
            com.netflix.android.imageloader.api.ShowImageRequest r1 = new com.netflix.android.imageloader.api.ShowImageRequest
            r1.<init>()
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r1.a(r0)
            com.netflix.android.imageloader.api.ShowImageRequest$Priority r1 = com.netflix.android.imageloader.api.ShowImageRequest.Priority.a
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.c(r1)
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.d()
            com.netflix.mediaclient.android.widget.NetflixImageView r3 = r3.f()
            r3.showImage(r0)
            goto L67
        L60:
            com.netflix.mediaclient.android.widget.NetflixImageView r3 = r3.f()
            r3.clearImage()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC4087bVt.a(o.bVt$b):void");
    }

    private final void c(b bVar) {
        bVar.c().setAnimation(null);
        bVar.c().setVisibility(8);
        bVar.b().setAnimation(null);
        bVar.b().setVisibility(8);
        bVar.h().setAnimation(null);
        bVar.h().setVisibility(8);
    }

    /* renamed from: o.bVt$b */
    /* loaded from: classes4.dex */
    public static class b extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(b.class, "revealedContainer", "getRevealedContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), dsA.c(new PropertyReference1Impl(b.class, "mysteryBoxImage", "getMysteryBoxImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "characterImage", "getCharacterImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "tcardImage", "getTcardImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "sparkle1", "getSparkle1()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "sparkle2", "getSparkle2()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "lights", "getLights()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ e = bIF.d(this, C4022bTi.e.l, false, 2, null);
        private final dsZ c = bIF.d(this, C4022bTi.e.n, false, 2, null);
        private final dsZ d = bIF.d(this, C4022bTi.e.e, false, 2, null);
        private final dsZ g = bIF.d(this, C4022bTi.e.s, false, 2, null);
        private final dsZ j = bIF.d(this, C4022bTi.e.q, false, 2, null);
        private final dsZ h = bIF.d(this, C4022bTi.e.r, false, 2, null);
        private final dsZ b = bIF.d(this, C4022bTi.e.c, false, 2, null);

        public final ConstraintLayout d() {
            return (ConstraintLayout) this.e.getValue(this, a[0]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.c.getValue(this, a[1]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.d.getValue(this, a[2]);
        }

        public final NetflixImageView f() {
            return (NetflixImageView) this.g.getValue(this, a[3]);
        }

        public final NetflixImageView b() {
            return (NetflixImageView) this.j.getValue(this, a[4]);
        }

        public final NetflixImageView h() {
            return (NetflixImageView) this.h.getValue(this, a[5]);
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.b.getValue(this, a[6]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setTag(aLX.a.e, Boolean.TRUE);
        }
    }
}
