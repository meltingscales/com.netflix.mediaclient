package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C9834xU;

/* renamed from: o.zJ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9929zJ extends FrameLayout {
    private static final int[] d = {16842912};
    private CharSequence a;
    private ConstraintLayout b;
    private BadgeView c;
    protected NetflixImageView e;
    private int f;
    private ColorStateList g;
    private BadgeView h;
    private ConstraintLayout i;
    private C9936zQ j;
    private final TextView m;

    public C9936zQ b() {
        return this.j;
    }

    protected int c() {
        return C9834xU.i.d;
    }

    public void setItemPosition(int i) {
        this.f = i;
    }

    public C9929zJ(Context context) {
        this(context, null);
    }

    public C9929zJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9929zJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.a = null;
        LayoutInflater.from(context).inflate(c(), (ViewGroup) this, true);
        setBackgroundResource(C9834xU.j.S);
        this.e = (NetflixImageView) findViewById(C9834xU.g.x);
        this.m = (TextView) findViewById(C9834xU.g.v);
    }

    public void d(C9936zQ c9936zQ) {
        this.j = c9936zQ;
        setSelected(c9936zQ.j());
        setEnabled(c9936zQ.e());
        String d2 = c9936zQ.d();
        if (d2 == null && c9936zQ.a() != 0) {
            setIcon(c9936zQ.b(getContext()));
        } else {
            d(d2);
        }
        setTitle(c9936zQ.c());
        setId(c9936zQ.b());
    }

    public void d(String str) {
        Resources resources = getResources();
        this.e.showImage(str);
        this.e.setRoundedCornerRadius(resources.getDimension(C9834xU.a.i));
        this.e.setForeground(ResourcesCompat.getDrawable(resources, C9834xU.j.f, getContext().getTheme()));
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
        d();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.j.b(z);
        TextView textView = this.m;
        ViewCompat.setPivotX(textView, textView.getWidth() / 2);
        TextView textView2 = this.m;
        ViewCompat.setPivotY(textView2, textView2.getBaseline());
        refreshDrawableState();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m.setEnabled(z);
        this.e.setEnabled(z);
        try {
            if (z) {
                ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
            } else {
                ViewCompat.setPointerIcon(this, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C9936zQ c9936zQ = this.j;
        if (c9936zQ != null && c9936zQ.j()) {
            View.mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintList(drawable, this.g);
        }
        this.e.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        C9936zQ c9936zQ = this.j;
        if (c9936zQ != null) {
            setIcon(c9936zQ.b(getContext()));
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.m.setTextColor(colorStateList);
    }

    public void setLabelVisibility(boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        if (z) {
            this.m.setVisibility(0);
            layoutParams.gravity = 49;
        } else {
            this.m.setVisibility(8);
            layoutParams.gravity = 17;
        }
        this.e.setLayoutParams(layoutParams);
    }

    public void setItemBackground(int i) {
        ViewCompat.setBackground(this, i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public BadgeView e() {
        if (this.h == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) ((ViewStub) findViewById(C9834xU.g.f)).inflate();
            this.i = constraintLayout;
            this.h = (BadgeView) constraintLayout.findViewById(C9834xU.g.j);
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.i);
        constraintSet.clear(C9834xU.g.j, 3);
        constraintSet.clear(C9834xU.g.j, 6);
        constraintSet.connect(C9834xU.g.j, 6, this.i.getId(), 6);
        constraintSet.connect(C9834xU.g.j, 7, this.i.getId(), 7);
        constraintSet.connect(C9834xU.g.j, 4, this.i.getId(), 4);
        constraintSet.applyTo(this.i);
        return this.h;
    }

    public BadgeView a() {
        if (this.c == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) ((ViewStub) findViewById(C9834xU.g.e)).inflate();
            this.b = constraintLayout;
            this.c = (BadgeView) constraintLayout.findViewById(C9834xU.g.j);
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.b);
        constraintSet.clear(C9834xU.g.j, 4);
        constraintSet.clear(C9834xU.g.j, 7);
        constraintSet.connect(C9834xU.g.j, 6, C9834xU.g.t, 6, getContext().getResources().getDimensionPixelSize(C9834xU.a.D));
        constraintSet.connect(C9834xU.g.j, 3, this.b.getId(), 3, getContext().getResources().getDimensionPixelSize(C9834xU.a.u));
        constraintSet.applyTo(this.b);
        return this.c;
    }

    public boolean d(int i) {
        this.m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.m.getMeasuredWidth() <= i;
    }

    public void setBadgeContentDescription(CharSequence charSequence) {
        this.a = charSequence;
        d();
    }

    private void d() {
        if (this.a == null) {
            setContentDescription(this.m.getText());
        } else {
            setContentDescription(C1333Xq.d(C9834xU.h.d).d("item_name", this.m.getText()).d("extra_info", this.a).c());
        }
    }
}
