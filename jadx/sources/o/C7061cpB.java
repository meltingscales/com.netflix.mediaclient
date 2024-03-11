package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C7142cqd;

/* renamed from: o.cpB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7061cpB extends ConstraintLayout {
    public static final b c = new b(null);
    private final C7147cqi a;
    private final NetflixImageView b;
    private int d;
    private int e;

    private final boolean c(int i, int i2) {
        return i - (this.e * 2) > 0 && i2 - (this.d * 2) > 0;
    }

    public final NetflixImageView c() {
        return this.b;
    }

    /* renamed from: o.cpB$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7061cpB(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        C7147cqi d = C7147cqi.d(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(d, "");
        this.a = d;
        NetflixImageView netflixImageView = d.c;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        this.e = a(8.0f);
        this.d = a(5.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7061cpB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        C7147cqi d = C7147cqi.d(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(d, "");
        this.a = d;
        NetflixImageView netflixImageView = d.c;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        this.e = a(8.0f);
        this.d = a(5.0f);
        a(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7061cpB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        C7147cqi d = C7147cqi.d(LayoutInflater.from(getContext()), this, true);
        C8632dsu.a(d, "");
        this.a = d;
        NetflixImageView netflixImageView = d.c;
        C8632dsu.a(netflixImageView, "");
        this.b = netflixImageView;
        this.e = a(8.0f);
        this.d = a(5.0f);
        a(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        NetflixImageView netflixImageView = this.a.c;
        C8632dsu.a(netflixImageView, "");
        c(netflixImageView, size, size2);
        NetflixImageView netflixImageView2 = this.a.e;
        C8632dsu.a(netflixImageView2, "");
        c(netflixImageView2, size, size2);
        NetflixImageView netflixImageView3 = this.a.b;
        C8632dsu.a(netflixImageView3, "");
        c(netflixImageView3, size, size2);
        super.onMeasure(i, i2);
    }

    private final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C7142cqd.e.d, 0, 0);
        C8632dsu.a(obtainStyledAttributes, "");
        try {
            int color = obtainStyledAttributes.getColor(C7142cqd.e.c, ContextCompat.getColor(getContext(), C7142cqd.d.e));
            int color2 = obtainStyledAttributes.getColor(C7142cqd.e.b, ContextCompat.getColor(getContext(), C7142cqd.d.c));
            int color3 = obtainStyledAttributes.getColor(C7142cqd.e.a, ContextCompat.getColor(getContext(), C7142cqd.d.a));
            this.e = a(obtainStyledAttributes.getDimension(C7142cqd.e.e, 8.0f));
            this.d = a(obtainStyledAttributes.getDimension(C7142cqd.e.i, 5.0f));
            this.a.c.setImageDrawable(new ColorDrawable(color));
            this.a.e.setImageDrawable(new ColorDrawable(color2));
            this.a.b.setImageDrawable(new ColorDrawable(color3));
            NetflixImageView netflixImageView = this.a.e;
            C8632dsu.a(netflixImageView, "");
            e(netflixImageView, this.e, this.d);
            NetflixImageView netflixImageView2 = this.a.b;
            C8632dsu.a(netflixImageView2, "");
            e(netflixImageView2, this.e, this.d);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void e(ImageView imageView, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C8632dsu.d(layoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        requestLayout();
    }

    private final int a(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private final void c(ImageView imageView, int i, int i2) {
        if (c(i, i2)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C8632dsu.d(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = i - (this.e * 2);
            marginLayoutParams.height = i2 - (this.d * 2);
            requestLayout();
        }
    }
}
