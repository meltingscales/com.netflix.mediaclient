package o;

import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.AbstractC9791we;
import o.C9795wi;

/* renamed from: o.wE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9743wE extends AbstractC9710vY implements InterfaceC9746wH {
    public static final e a = new e(null);
    private static final float d = 0.35f;
    private final NetflixImageView c;
    private final ImageView e;
    private final C1204Sr f;
    private final ProgressBar g;
    private final FrameLayout h;
    private final int i;
    private final C1204Sr j;
    private final C1204Sr l;
    private final View n;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9743wE(final View view, C9812wz c9812wz) {
        super(view);
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        FrameLayout frameLayout = c9812wz.x;
        C8632dsu.a(frameLayout, "");
        this.h = frameLayout;
        ImageView imageView = c9812wz.j;
        C8632dsu.a(imageView, "");
        this.e = imageView;
        ProgressBar progressBar = c9812wz.l;
        C8632dsu.a(progressBar, "");
        this.g = progressBar;
        C1204Sr c1204Sr = c9812wz.r;
        C8632dsu.a(c1204Sr, "");
        this.f = c1204Sr;
        C1204Sr c1204Sr2 = c9812wz.A;
        C8632dsu.a(c1204Sr2, "");
        this.l = c1204Sr2;
        C1204Sr c1204Sr3 = c9812wz.B;
        C8632dsu.a(c1204Sr3, "");
        this.j = c1204Sr3;
        NetflixImageView netflixImageView = c9812wz.i;
        C8632dsu.a(netflixImageView, "");
        this.c = netflixImageView;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: o.wD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9743wE.d(C9743wE.this, view2);
            }
        });
        TypedValue typedValue = new TypedValue();
        o_().getResources().getValue(C9795wi.c.b, typedValue, true);
        final float f = typedValue.getFloat();
        o_().getResources().getValue(C9795wi.c.a, typedValue, true);
        final float f2 = typedValue.getFloat();
        final Runnable runnable = new Runnable() { // from class: o.wG
            @Override // java.lang.Runnable
            public final void run() {
                C9743wE.c(C9743wE.this, view, f, f2);
            }
        };
        o_().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.wF
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C9743wE.c(C9743wE.this, runnable, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        this.n = view;
        this.i = e().getId();
    }

    /* renamed from: o.wE$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C9743wE c9743wE, View view) {
        C8632dsu.c((Object) c9743wE, "");
        c9743wE.b((C9743wE) AbstractC9791we.h.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9743wE c9743wE, View view, float f, float f2) {
        C8632dsu.c((Object) c9743wE, "");
        C8632dsu.c((Object) view, "");
        NetflixImageView netflixImageView = c9743wE.c;
        ViewGroup.LayoutParams layoutParams = netflixImageView.getLayoutParams();
        if (layoutParams != null) {
            C1204Sr c1204Sr = c9743wE.f;
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = c9743wE.g.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams2 = c9743wE.f.getLayoutParams();
            C8632dsu.a(layoutParams2, "");
            int b = C9687vB.b(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = c9743wE.f.getLayoutParams();
            C8632dsu.a(layoutParams3, "");
            int c = C9687vB.c(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = c9743wE.g.getLayoutParams();
            C8632dsu.a(layoutParams4, "");
            int b2 = C9687vB.b(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = c9743wE.g.getLayoutParams();
            C8632dsu.a(layoutParams5, "");
            c1204Sr.setMaxWidth(((((measuredWidth - measuredWidth2) - b) - c) - b2) - C9687vB.c(layoutParams5));
            int min = (int) Math.min(view.getMeasuredHeight() * d, view.getMeasuredHeight() / f);
            layoutParams.height = min;
            layoutParams.width = (int) (min / f2);
            netflixImageView.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9743wE c9743wE, Runnable runnable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8632dsu.c((Object) c9743wE, "");
        C8632dsu.c((Object) runnable, "");
        if (i7 - i5 != i3 - i) {
            c9743wE.o_().post(runnable);
        }
    }

    @Override // o.InterfaceC9746wH
    public void g() {
        this.l.setText((CharSequence) null);
        this.j.setText((CharSequence) null);
        this.c.setImageDrawable(null);
    }

    @Override // o.InterfaceC9746wH
    public void a(boolean z) {
        this.h.setClickable(z);
    }

    @Override // o.InterfaceC9746wH
    public void b(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.f.setText(C1333Xq.d(C9795wi.b.c).d("mdx_device", charSequence).c());
        this.f.setVisibility(0);
        this.g.setVisibility(0);
        this.l.setVisibility(4);
        this.j.setVisibility(4);
        this.e.setVisibility(4);
    }

    @Override // o.InterfaceC9746wH
    public void i() {
        this.f.setText((CharSequence) null);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // o.InterfaceC9746wH
    public void b(CharSequence charSequence, CharSequence charSequence2, Uri uri, Integer num) {
        C8632dsu.c((Object) charSequence, "");
        C8632dsu.c((Object) uri, "");
        this.e.setVisibility(0);
        C1204Sr c1204Sr = this.l;
        c1204Sr.setVisibility(0);
        c1204Sr.setText(charSequence);
        C1204Sr c1204Sr2 = this.j;
        c1204Sr2.setVisibility(0);
        c1204Sr2.setText(charSequence2);
        this.c.onViewRecycled();
        this.c.showImage(new ShowImageRequest().a(uri.toString()).a(true).d(true));
    }

    @Override // o.InterfaceC9746wH
    public void d(boolean z) {
        this.c.setVisibility(z ? 0 : 4);
    }

    @Override // o.InterfaceC9746wH
    public void a(float f, int i) {
        C1204Sr c1204Sr = this.l;
        c1204Sr.setPadding(c1204Sr.getPaddingLeft(), (int) e(q(), f), c1204Sr.getPaddingRight(), c1204Sr.getPaddingBottom());
        this.l.setScaleX(e(s(), f));
        this.l.setScaleY(e(s(), f));
        this.j.setScaleX(e(r_(), f));
        this.j.setScaleY(e(r_(), f));
        C1204Sr c1204Sr2 = this.j;
        c1204Sr2.setPadding(c1204Sr2.getPaddingLeft(), (int) e(q_(), f), c1204Sr2.getPaddingRight(), c1204Sr2.getPaddingBottom());
        this.e.setRotation(e(p_(), f));
        C9789wc.d(this.c, c(j_(), f));
        this.c.setTranslationY(e(l_(), f));
    }
}
