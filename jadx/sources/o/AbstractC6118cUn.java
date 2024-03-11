package o;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.C6035cRo;

/* renamed from: o.cUn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6118cUn extends AbstractC3336ax<e> {
    public CharSequence b;
    public AppView c;
    public String d;
    public TrackingInfoHolder f;
    private View.OnClickListener g;
    public String h;
    public String j;
    private int n;
    private boolean i = true;
    private int m = 1;

    public final void H_(boolean z) {
        this.i = z;
    }

    @Override // o.AbstractC3073as
    public int Z_() {
        return C6035cRo.d.f;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void e(int i) {
        this.n = i;
    }

    public final boolean i() {
        return this.i;
    }

    public final int l() {
        return this.n;
    }

    public final View.OnClickListener n() {
        return this.g;
    }

    public final int o() {
        return this.m;
    }

    public final void u_(int i) {
        this.m = i;
    }

    public final CharSequence m() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final String k() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        boolean z = this.n <= this.m - 1;
        NetflixImageView e2 = eVar.e();
        e2.setVisibility(0);
        e2.setAspectRatio(Float.valueOf(0.71f));
        e2.showImage(new ShowImageRequest().a(k()).j(z));
        e2.setContentDescription(m());
        View.OnClickListener onClickListener = this.g;
        e2.setOnClickListener(onClickListener);
        e2.setClickable(onClickListener != null);
        e2.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public e b(ViewParent viewParent) {
        C8632dsu.c((Object) viewParent, "");
        return new e(this.m);
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C8150deu.h() ? C6035cRo.e.h : C6035cRo.e.b;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i / this.m;
    }

    /* renamed from: o.cUn$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3179au {
        public NetflixImageView b;
        public View c;
        private final int e;

        public final void c(View view) {
            C8632dsu.c((Object) view, "");
            this.c = view;
        }

        public final void d(NetflixImageView netflixImageView) {
            C8632dsu.c((Object) netflixImageView, "");
            this.b = netflixImageView;
        }

        public e(int i) {
            this.e = i;
        }

        public final NetflixImageView e() {
            NetflixImageView netflixImageView = this.b;
            if (netflixImageView != null) {
                return netflixImageView;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.AbstractC3179au
        public void e(View view) {
            C8632dsu.c((Object) view, "");
            c(view);
            View findViewById = view.findViewById(C6035cRo.d.f);
            C8632dsu.a(findViewById, "");
            d((NetflixImageView) findViewById);
            b(e());
        }

        private final void b(NetflixImageView netflixImageView) {
            int dimensionPixelSize = (netflixImageView.getContext().getResources().getDisplayMetrics().widthPixels / this.e) - (netflixImageView.getContext().getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v) * (this.e - 1));
            netflixImageView.getLayoutParams().width = dimensionPixelSize;
            netflixImageView.getLayoutParams().height = (int) (dimensionPixelSize * 1.43f);
            netflixImageView.requestLayout();
        }
    }
}
