package o;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.AccessibilityUtils;
import com.netflix.model.leafs.advisory.Advisory;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes4.dex */
public abstract class bGO extends AbstractC3336ax<c> {
    private String b;
    private List<? extends Advisory> c;
    private String d;
    private Integer f;
    private CharSequence g;
    private String h;
    private ObjectAnimator i;
    private boolean j;
    private View.OnClickListener k;
    private View.OnClickListener l;
    private String m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f13506o;
    private int p;
    private boolean q;
    private boolean s;
    private VideoType t = VideoType.UNKNOWN;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.E;
    }

    public final void a(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.t = videoType;
    }

    public final void b(int i) {
        this.p = i;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.k = onClickListener;
    }

    public final void c(String str) {
        this.m = str;
    }

    public final void c(List<? extends Advisory> list) {
        this.c = list;
    }

    public final void c(boolean z) {
        this.s = z;
    }

    public final void e_(int i) {
        this.f13506o = i;
    }

    public final void f_(String str) {
        this.b = str;
    }

    public final void g_(String str) {
        this.d = str;
    }

    public final void h_(String str) {
        this.h = str;
    }

    public final List<Advisory> i() {
        return this.c;
    }

    public final void i_(CharSequence charSequence) {
        this.g = charSequence;
    }

    public final void i_(boolean z) {
        this.n = z;
    }

    public final void j_(boolean z) {
        this.q = z;
    }

    public final String k() {
        return this.b;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.h;
    }

    public final CharSequence n() {
        return this.g;
    }

    public final Integer o() {
        return this.f;
    }

    public final int p() {
        return this.f13506o;
    }

    public final String q() {
        return this.m;
    }

    public final boolean r() {
        return this.j;
    }

    public final View.OnClickListener s() {
        return this.l;
    }

    public final View.OnClickListener t() {
        return this.k;
    }

    public final boolean u() {
        return this.q;
    }

    public final boolean v() {
        return this.s;
    }

    public final int w() {
        return this.p;
    }

    public final VideoType x() {
        return this.t;
    }

    public final boolean y() {
        return this.n;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(c cVar) {
        String str;
        String str2;
        C8632dsu.c((Object) cVar, "");
        Integer num = this.f;
        Drawable drawable = null;
        if (num != null) {
            int intValue = num.intValue();
            View r = cVar.r();
            ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(intValue);
                marginLayoutParams.setMarginEnd(intValue);
                r.requestLayout();
            }
        }
        if (this.j) {
            cVar.c().setVisibility(0);
            View r2 = cVar.r();
            View.OnClickListener onClickListener = this.l;
            r2.setOnClickListener(onClickListener);
            r2.setClickable(onClickListener != null);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(cVar.c().getBackground(), PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, PrivateKeyType.INVALID, 51));
            ofPropertyValuesHolder.setTarget(cVar.c().getBackground());
            ofPropertyValuesHolder.setDuration(1300L);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.start();
            this.i = ofPropertyValuesHolder;
            return;
        }
        cVar.c().setVisibility(8);
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View r3 = cVar.r();
        View.OnClickListener onClickListener2 = this.k;
        r3.setOnClickListener(onClickListener2);
        r3.setClickable(onClickListener2 != null);
        AccessibilityUtils.e(cVar.r(), null, null, this.g, 3, null);
        cVar.j().setText(d(this.p));
        List<? extends Advisory> list = this.c;
        if (list != null) {
            for (Advisory advisory : list) {
                if (advisory instanceof ContentAdvisory) {
                    ContentAdvisory contentAdvisory = (ContentAdvisory) advisory;
                    if (contentAdvisory.getBoard() != null) {
                        C1332Xp c1332Xp = C1332Xp.b;
                        drawable = ((InterfaceC1610aHr) C1332Xp.b(InterfaceC1610aHr.class)).b((RatingDetails) advisory, true);
                        str = contentAdvisory.getI18nRating();
                        break;
                    }
                }
            }
        }
        str = null;
        if (drawable != null) {
            cVar.b().setVisibility(8);
            cVar.h().setVisibility(0);
            cVar.h().setImageDrawable(drawable);
            cVar.h().setContentDescription(str);
        } else {
            cVar.h().setVisibility(8);
            String str3 = this.h;
            if (str3 == null || str3.length() == 0) {
                cVar.b().setVisibility(8);
            } else {
                cVar.b().setVisibility(0);
                cVar.b().setText(this.h);
            }
        }
        cVar.j().setText(d(this.p));
        C1204Sr f = cVar.f();
        if (this.t != VideoType.SHOW || (str2 = this.m) == null) {
            int i = this.f13506o;
            if (i > 0) {
                C8112deI c2 = C8178dfV.c(i, cVar.f().getContext());
                f.setText(c2.d());
                f.setContentDescription(c2.b());
            } else {
                f.setText("");
                f.setContentDescription("");
            }
        } else {
            f.setText(str2);
            f.setContentDescription(this.m);
        }
        String str4 = this.b;
        if (str4 == null || str4.length() == 0) {
            cVar.d().setVisibility(8);
        } else {
            cVar.d().setVisibility(0);
            cVar.d().setText(this.b);
            cVar.d().setContentDescription(this.d);
        }
        NetflixImageView i2 = cVar.i();
        if (i2 != null) {
            i2.setVisibility(this.q ? 0 : 8);
        }
        NetflixImageView a = cVar.a();
        if (a != null) {
            a.setVisibility(this.n ? 0 : 8);
        }
        NetflixImageView e = cVar.e();
        if (e == null) {
            return;
        }
        e.setVisibility(this.s ? 0 : 8);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((bGO) cVar);
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private final String d(int i) {
        return (1900 > i || i >= 2101) ? "" : String.valueOf(i);
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "yearView", "getYearView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "certificationView", "getCertificationView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "ratingIconView", "getRatingIconView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "seasonNumOrRuntimeView", "getSeasonNumOrRuntimeView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "capabilitiesBadgesView", "getCapabilitiesBadgesView()Lcom/netflix/mediaclient/android/widget/IconFontTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "loadingView", "getLoadingView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(c.class, "spatialAudioBadge", "getSpatialAudioBadge()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "audioDescriptionBadge", "getAudioDescriptionBadge()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "closedCaptionBadge", "getClosedCaptionBadge()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};

        /* renamed from: o  reason: collision with root package name */
        private final dsZ f13507o = bIF.d(this, C3670bGh.a.t, false, 2, null);
        private final dsZ b = bIF.d(this, C3670bGh.a.m, false, 2, null);
        private final dsZ f = bIF.d(this, C3670bGh.a.k, false, 2, null);
        private final dsZ g = bIF.d(this, C3670bGh.a.f13509o, false, 2, null);
        private final dsZ c = bIF.d(this, C3670bGh.a.f, false, 2, null);
        private final dsZ h = bIF.d(this, C3670bGh.a.l, false, 2, null);
        private final dsZ j = bIF.c(this, C3670bGh.a.s);
        private final dsZ d = bIF.c(this, C3670bGh.a.h);
        private final dsZ e = bIF.c(this, C3670bGh.a.n);

        public final C1204Sr j() {
            return (C1204Sr) this.f13507o.getValue(this, a[0]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.b.getValue(this, a[1]);
        }

        public final NetflixImageView h() {
            return (NetflixImageView) this.f.getValue(this, a[2]);
        }

        public final C1204Sr f() {
            return (C1204Sr) this.g.getValue(this, a[3]);
        }

        public final RD d() {
            return (RD) this.c.getValue(this, a[4]);
        }

        public final View c() {
            return (View) this.h.getValue(this, a[5]);
        }

        public final NetflixImageView i() {
            return (NetflixImageView) this.j.getValue(this, a[6]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.d.getValue(this, a[7]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.e.getValue(this, a[8]);
        }
    }
}
