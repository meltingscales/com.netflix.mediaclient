package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.util.AccessibilityUtils;

/* loaded from: classes3.dex */
public final class SU extends FrameLayout {
    private final C9839xZ b;
    private final AccelerateInterpolator c;
    private final boolean e;
    private boolean f;
    private boolean i;
    private final int j;
    public static final b d = new b(null);
    public static final int a = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SU(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ SU(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C1332Xp c1332Xp = C1332Xp.b;
        boolean z = true;
        this.j = (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        this.c = new AccelerateInterpolator();
        if (!C8171dfO.b() && !AccessibilityUtils.a(context) && !C8141del.a()) {
            z = false;
        }
        this.e = z;
        C9839xZ c = C9839xZ.c(LayoutInflater.from(context), this);
        C8632dsu.a(c, "");
        this.b = c;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("TinyMaturityRating");
        }
    }

    public static /* synthetic */ void setData$default(SU su, SX sx, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        su.setData(sx, z);
    }

    public final void setData(SX sx, boolean z) {
        if (sx != null && sx.a()) {
            this.i = true;
            NetflixImageView netflixImageView = this.b.e;
            C8632dsu.a(netflixImageView, "");
            netflixImageView.setVisibility(8);
            this.b.e.setImageDrawable(null);
            this.b.e.setContentDescription(null);
            C1204Sr c1204Sr = this.b.c;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
            this.b.c.setText((CharSequence) null);
            this.b.c.setContentDescription(null);
            if (sx.e() != null) {
                NetflixImageView netflixImageView2 = this.b.e;
                C8632dsu.a(netflixImageView2, "");
                netflixImageView2.setVisibility(0);
                this.b.e.setImageDrawable(sx.e());
                this.b.e.setContentDescription(sx.b());
            } else if (sx.d() != null) {
                C1204Sr c1204Sr2 = this.b.c;
                C8632dsu.a(c1204Sr2, "");
                c1204Sr2.setVisibility(0);
                this.b.c.setText(sx.d());
                this.b.c.setContentDescription(sx.b());
            }
        } else {
            this.i = false;
            setVisibility(8);
        }
        if (z) {
            e();
        }
    }

    public final void b() {
        if (this.i) {
            e();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SU.this.f = false;
            SU.this.setVisibility(8);
            SU.this.setTranslationY(0.0f);
            SU.this.setAlpha(0.0f);
        }
    }

    private final void e() {
        animate().cancel();
        this.f = false;
        if (this.i) {
            setVisibility(0);
        }
        setAlpha(1.0f);
        setTranslationY(0.0f);
    }

    public final void a(long j) {
        if (this.e || j == 0) {
            setVisibility(8);
        } else if (!this.i || this.f || getVisibility() != 0 || getAlpha() == 0.0f) {
        } else {
            e();
            this.f = true;
            animate().setStartDelay(j).alpha(0.0f).translationYBy(-this.j).setInterpolator(this.c).setDuration(1600L).setListener(new a());
        }
    }
}
