package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: o.Ru  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1181Ru extends ConstraintLayout {
    protected C1203Sq a;
    protected View b;
    protected ImageView c;
    protected int d;
    protected int e;
    protected C1204Sr g;
    protected int j;

    public C1181Ru(Context context) {
        super(context);
        b();
    }

    public C1181Ru(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
        d(attributeSet);
    }

    public C1181Ru(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
        d(attributeSet);
    }

    protected void d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.netflix.mediaclient.ui.R.k.b);
        setIconDrawable(obtainStyledAttributes.getDrawable(com.netflix.mediaclient.ui.R.k.a));
        setMessageText(obtainStyledAttributes.getString(com.netflix.mediaclient.ui.R.k.e));
        setButtonText(obtainStyledAttributes.getString(com.netflix.mediaclient.ui.R.k.d));
        obtainStyledAttributes.recycle();
    }

    protected void b() {
        View.inflate(getContext(), com.netflix.mediaclient.ui.R.i.W, this);
        Resources resources = getResources();
        this.e = resources.getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.n);
        this.d = resources.getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.f13241o);
        this.j = resources.getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.l);
        this.c = (ImageView) findViewById(com.netflix.mediaclient.ui.R.g.by);
        this.b = findViewById(com.netflix.mediaclient.ui.R.g.bs);
        this.g = (C1204Sr) findViewById(com.netflix.mediaclient.ui.R.g.bv);
        C1203Sq c1203Sq = (C1203Sq) findViewById(com.netflix.mediaclient.ui.R.g.bt);
        this.a = c1203Sq;
        c1203Sq.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.k);
        if (getPaddingStart() == 0) {
            C9870yD.b((View) this, 0, dimensionPixelSize);
        }
        if (getPaddingEnd() == 0) {
            C9870yD.b((View) this, 2, dimensionPixelSize);
        }
        if (getPaddingBottom() == 0) {
            C9870yD.b((View) this, 3, getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.h));
        }
    }

    public void setIconDrawable(Drawable drawable) {
        this.c.setImageDrawable(drawable);
    }

    public void setIconDrawable(int i) {
        this.c.setImageResource(i);
    }

    public void setMessageText(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    public void setButtonText(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setVisibility(C8168dfL.a(charSequence) ? 8 : 0);
    }

    public void setButtonClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (size - (paddingTop + paddingBottom) > this.j) {
            int i3 = this.e;
            layoutParams.width = i3;
            layoutParams.height = i3;
            this.b.setVisibility(0);
        } else {
            int i4 = this.d;
            layoutParams.width = i4;
            layoutParams.height = i4;
            this.b.setVisibility(8);
        }
        super.onMeasure(i, i2);
    }
}
