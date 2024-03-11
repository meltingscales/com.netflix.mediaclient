package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3827bMc;
import o.AbstractC7990dbt;
import o.C7939dav;
import o.C8141del;
import o.C8171dfO;

/* renamed from: o.dbt  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7990dbt extends bLN<b> {
    public static final a c = new a(null);
    private static final int d = C7939dav.d.p;
    private long b = 2000;
    private String f;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.m;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final void b(long j) {
        this.b = j;
    }

    public final long k() {
        return this.b;
    }

    public final String l() {
        return this.f;
    }

    /* renamed from: o.dbt$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("FadingNetflixBadgeModel");
        }
    }

    @Override // o.bLN, o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.e((AbstractC7990dbt) bVar);
        View r = bVar.r();
        int i = d;
        if (!C8632dsu.c(r.getTag(i), Long.valueOf(b()))) {
            bVar.r().setTag(i, Long.valueOf(b()));
            bVar.c().showImage(this.f);
            bVar.b();
        }
        if (C1870aRh.a.a().e()) {
            ViewParent parent = bVar.r().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null || viewGroup.getId() != C7939dav.d.B) {
                return;
            }
            viewGroup.setClipToOutline(true);
            C9702vQ.c(viewGroup, new C9686vA(viewGroup.getContext().getResources().getDimensionPixelSize(C7939dav.e.a), true, false, 4, null));
        }
    }

    @Override // o.bLN, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.c().clearImage();
        super.b((AbstractC7990dbt) bVar);
    }

    @Override // o.bLN
    /* renamed from: e */
    public void a(b bVar, AbstractC3827bMc abstractC3827bMc) {
        C8632dsu.c((Object) bVar, "");
        C8632dsu.c((Object) abstractC3827bMc, "");
        bVar.r();
        if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.j.c)) {
            bVar.b(this.b);
        } else if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.b.e)) {
            bVar.b();
        } else if (C8632dsu.c(abstractC3827bMc, AbstractC3827bMc.a.b)) {
            bVar.b();
        }
    }

    /* renamed from: o.dbt$b */
    /* loaded from: classes5.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "brandImage", "getBrandImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ a = bIF.d(this, C7939dav.d.c, false, 2, null);
        private final InterfaceC8554dpx b;
        private final AccelerateInterpolator c;
        private boolean d;
        private final int g;

        public b() {
            InterfaceC8554dpx b;
            C1332Xp c1332Xp = C1332Xp.b;
            this.g = (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            this.c = new AccelerateInterpolator();
            b = dpB.b(new drO<Boolean>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.models.FadingNetflixBadgeModel$Holder$areAnimationsDisabled$2
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: b */
                public final Boolean invoke() {
                    return Boolean.valueOf(C8171dfO.b() || AccessibilityUtils.a(AbstractC7990dbt.b.this.r().getContext()) || C8141del.a());
                }
            });
            this.b = b;
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.a.getValue(this, e[0]);
        }

        private final boolean e() {
            return ((Boolean) this.b.getValue()).booleanValue();
        }

        public final void b() {
            d();
        }

        public final void b(long j) {
            if (e() || j == 0) {
                r().setVisibility(8);
            } else if (this.d || r().getVisibility() != 0 || r().getAlpha() == 0.0f) {
            } else {
                d();
                this.d = true;
                r().animate().setStartDelay(j).alpha(0.0f).translationYBy(-this.g).setInterpolator(this.c).setDuration(1600L).setListener(new a());
            }
        }

        /* renamed from: o.dbt$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C8632dsu.c((Object) animator, "");
                b.this.d = false;
                b.this.r().setVisibility(8);
                b.this.r().setTranslationY(0.0f);
                b.this.r().setAlpha(0.0f);
            }
        }

        private final void d() {
            View r = r();
            r.animate().cancel();
            this.d = false;
            r.setVisibility(0);
            r.setAlpha(1.0f);
            r.setTranslationY(0.0f);
        }
    }
}
