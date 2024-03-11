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
public abstract class bGT extends AbstractC3336ax<b> {
    private List<? extends Advisory> b;
    private String c;
    private CharSequence d;
    private Integer f;
    private ObjectAnimator g;
    private boolean h;
    private View.OnClickListener i;
    private View.OnClickListener j;
    private int k;
    private String l;
    private VideoType n = VideoType.UNKNOWN;

    /* renamed from: o  reason: collision with root package name */
    private int f13508o;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.r;
    }

    public final void a_(List<? extends Advisory> list) {
        this.b = list;
    }

    public final void c(VideoType videoType) {
        C8632dsu.c((Object) videoType, "");
        this.n = videoType;
    }

    public final void d(int i) {
        this.f13508o = i;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public final void d(String str) {
        this.l = str;
    }

    public final void f_(int i) {
        this.k = i;
    }

    public final List<Advisory> i() {
        return this.b;
    }

    public final void i_(String str) {
        this.c = str;
    }

    public final void j_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final View.OnClickListener k() {
        return this.i;
    }

    public final boolean l() {
        return this.h;
    }

    public final Integer m() {
        return this.f;
    }

    public final String n() {
        return this.c;
    }

    public final CharSequence o() {
        return this.d;
    }

    public final int p() {
        return this.f13508o;
    }

    public final int q() {
        return this.k;
    }

    public final View.OnClickListener r() {
        return this.j;
    }

    public final VideoType s() {
        return this.n;
    }

    public final String t() {
        return this.l;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(b bVar) {
        String str;
        String str2;
        C8632dsu.c((Object) bVar, "");
        Integer num = this.f;
        Drawable drawable = null;
        if (num != null) {
            int intValue = num.intValue();
            View r = bVar.r();
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
        if (this.h) {
            bVar.b().setVisibility(0);
            View r2 = bVar.r();
            View.OnClickListener onClickListener = this.i;
            r2.setOnClickListener(onClickListener);
            r2.setClickable(onClickListener != null);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bVar.b().getBackground(), PropertyValuesHolder.ofInt(InteractiveAnimation.ANIMATION_TYPE.ALPHA, PrivateKeyType.INVALID, 51));
            ofPropertyValuesHolder.setTarget(bVar.b().getBackground());
            ofPropertyValuesHolder.setDuration(1300L);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.start();
            this.g = ofPropertyValuesHolder;
            return;
        }
        bVar.b().setVisibility(8);
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View r3 = bVar.r();
        View.OnClickListener onClickListener2 = this.j;
        r3.setOnClickListener(onClickListener2);
        r3.setClickable(onClickListener2 != null);
        AccessibilityUtils.e(bVar.r(), null, null, this.d, 3, null);
        bVar.d().setText(c(this.k));
        List<? extends Advisory> list = this.b;
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
            bVar.e().setVisibility(8);
            bVar.a().setVisibility(0);
            bVar.a().setImageDrawable(drawable);
            bVar.a().setContentDescription(str);
        } else {
            bVar.a().setVisibility(8);
            String str3 = this.c;
            if (str3 == null || str3.length() == 0) {
                bVar.e().setVisibility(8);
            } else {
                bVar.e().setVisibility(0);
                bVar.e().setText(this.c);
            }
        }
        bVar.d().setText(c(this.k));
        C1204Sr c = bVar.c();
        if (this.n == VideoType.SHOW && (str2 = this.l) != null) {
            c.setText(str2);
            c.setContentDescription(this.l);
            return;
        }
        int i = this.f13508o;
        if (i > 0) {
            C8112deI c2 = C8178dfV.c(i, bVar.c().getContext());
            c.setText(c2.d());
            c.setContentDescription(c2.b());
            return;
        }
        c.setText("");
        c.setContentDescription("");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        super.b((bGT) bVar);
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private final String c(int i) {
        return (1900 > i || i >= 2101) ? "" : String.valueOf(i);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "yearView", "getYearView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "certificationView", "getCertificationView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "ratingIconView", "getRatingIconView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "seasonNumOrRuntimeView", "getSeasonNumOrRuntimeView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "loadingView", "getLoadingView()Landroid/view/View;", 0))};
        private final dsZ j = bIF.d(this, C3670bGh.a.t, false, 2, null);
        private final dsZ d = bIF.d(this, C3670bGh.a.m, false, 2, null);
        private final dsZ a = bIF.d(this, C3670bGh.a.k, false, 2, null);
        private final dsZ e = bIF.d(this, C3670bGh.a.f13509o, false, 2, null);
        private final dsZ c = bIF.d(this, C3670bGh.a.l, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.j.getValue(this, b[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.d.getValue(this, b[1]);
        }

        public final NetflixImageView a() {
            return (NetflixImageView) this.a.getValue(this, b[2]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.e.getValue(this, b[3]);
        }

        public final View b() {
            return (View) this.c.getValue(this, b[4]);
        }
    }
}
