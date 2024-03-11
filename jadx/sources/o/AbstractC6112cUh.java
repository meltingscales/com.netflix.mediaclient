package o;

import android.view.View;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import o.AbstractC6078cTd;
import o.C6035cRo;

/* renamed from: o.cUh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6112cUh extends AbstractC3336ax<d> {
    public static final b b = new b(null);
    public String c;
    private boolean f;
    private View.OnClickListener g;
    private C9935zP h;
    private CharSequence i;
    private String j;
    private boolean l;
    private boolean m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13700o;
    private int q;
    private String t;
    private boolean d = true;
    private int k = 3;

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.c;
    }

    public final void a(boolean z) {
        this.f13700o = z;
    }

    public final void b(CharSequence charSequence) {
        this.i = charSequence;
    }

    public final void b(String str) {
        this.t = str;
    }

    public final void b(boolean z) {
        this.l = z;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void c(boolean z) {
        this.f = z;
    }

    public final void d(int i) {
        this.q = i;
    }

    public final void d(String str) {
        this.n = str;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final void e(int i) {
        this.k = i;
    }

    public final void e(String str) {
        this.j = str;
    }

    public final void e(C9935zP c9935zP) {
        this.h = c9935zP;
    }

    public final boolean i() {
        return this.d;
    }

    public final View.OnClickListener k() {
        return this.g;
    }

    public final boolean l() {
        return this.f;
    }

    public final String m() {
        return this.j;
    }

    public final C9935zP n() {
        return this.h;
    }

    public final CharSequence o() {
        return this.i;
    }

    public final int p() {
        return this.q;
    }

    public final boolean q() {
        return this.l;
    }

    public final String r() {
        return this.n;
    }

    public final boolean s() {
        return this.f13700o;
    }

    public final int t() {
        return this.k;
    }

    public final String w() {
        return this.t;
    }

    /* renamed from: o.cUh$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        NetflixImageView d2 = dVar.d();
        c(d2);
        d2.setVisibility(0);
        d2.showImage(new ShowImageRequest().a(this.j).j(this.f13700o));
        View.OnClickListener onClickListener = this.g;
        d2.setOnClickListener(onClickListener);
        d2.setClickable(onClickListener != null);
        d2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        CharSequence charSequence = this.i;
        if (charSequence == null) {
            charSequence = this.t;
        }
        d2.setContentDescription(charSequence);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        this.m = false;
        super.b((AbstractC6112cUh) dVar);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: e */
    public void c(int i, d dVar) {
        C8632dsu.c((Object) dVar, "");
        if (this.l) {
            dVar.d().setBackground(dVar.b());
            if (this.f && !this.m) {
                C9935zP c9935zP = this.h;
                if (c9935zP != null) {
                    c9935zP.b(AbstractC6078cTd.class, new AbstractC6078cTd.t(this.q));
                }
                this.m = true;
            }
            AnimatedVectorDrawableCompat b2 = dVar.b();
            if (b2 != null) {
                if (i == 0) {
                    if (b2.isRunning()) {
                        return;
                    }
                    b2.start();
                } else if (i == 1 && b2.isRunning()) {
                    b2.stop();
                }
            }
        }
    }

    private final void c(NetflixImageView netflixImageView) {
        int e = LoMoUtils.e();
        int dimensionPixelSize = netflixImageView.getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v);
        int i = C8632dsu.c((Object) this.n, (Object) "QuerySearch") ? this.k : 2;
        float f = C8632dsu.c((Object) this.n, (Object) "QuerySearch") ? 0.25f : 0.45f;
        int i2 = dimensionPixelSize * (i - 1);
        int i3 = netflixImageView.getContext().getResources().getDisplayMetrics().widthPixels - e;
        int i4 = (int) (((i3 - (f * ((i3 / i) - i2))) / i) - i2);
        netflixImageView.getLayoutParams().width = i4;
        netflixImageView.getLayoutParams().height = (int) (i4 * 1.43f);
        netflixImageView.requestLayout();
    }

    /* renamed from: o.cUh$d */
    /* loaded from: classes4.dex */
    public final class d extends AbstractC3179au {
        private AnimatedVectorDrawableCompat a;
        public NetflixImageView c;
        public View d;

        public final AnimatedVectorDrawableCompat b() {
            return this.a;
        }

        public final void b(View view) {
            C8632dsu.c((Object) view, "");
            this.d = view;
        }

        public final void c(NetflixImageView netflixImageView) {
            C8632dsu.c((Object) netflixImageView, "");
            this.c = netflixImageView;
        }

        public d() {
        }

        public final NetflixImageView d() {
            NetflixImageView netflixImageView = this.c;
            if (netflixImageView != null) {
                return netflixImageView;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            b(view);
            View findViewById = view.findViewById(C6035cRo.d.f);
            C8632dsu.a(findViewById, "");
            c((NetflixImageView) findViewById);
            this.a = AnimatedVectorDrawableCompat.create(d().getContext(), BrowseExperience.a() ? C6035cRo.b.d : C6035cRo.b.b);
        }
    }
}
