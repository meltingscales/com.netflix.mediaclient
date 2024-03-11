package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import o.C9834xU;

/* renamed from: o.St  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1206St extends AppCompatToggleButton {
    private final CharSequence a;
    private C1189Sc b;
    private final Rect e;
    private final Rect j;
    public static final b d = new b(null);
    public static final int c = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1206St(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1206St(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final C1189Sc a() {
        return this.b;
    }

    public /* synthetic */ C1206St(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206St(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.a = getText();
        this.j = new Rect();
        this.e = new Rect();
        this.b = new C1189Sc(null, null, null, null, 0, 0, 0, 0, false, null, 0, false, false, false, 16383, null);
        setAttributes$widgetry_release(C1189Sc.d.d(context, attributeSet));
    }

    /* renamed from: o.St$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("NetflixToggleButton");
        }
    }

    public final void setAttributes$widgetry_release(C1189Sc c1189Sc) {
        C8632dsu.c((Object) c1189Sc, "");
        this.b = c1189Sc;
        setBackground(new C1192Sf(c1189Sc));
        setTextColor(c1189Sc.m());
        if (TextViewCompat.getAutoSizeTextType(this) == 1) {
            TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(this, new int[]{TextViewCompat.getAutoSizeMinTextSize(this), Math.round(getTextSize())}, 0);
        }
        c();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    public final void setLabelVisibility(boolean z) {
        if (!z) {
            setText("");
        } else {
            setText(this.a);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    protected void onFinishInflate() {
        c();
        super.onFinishInflate();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null, i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null, i3 != 0 ? ContextCompat.getDrawable(getContext(), i3) : null, i4 != 0 ? ContextCompat.getDrawable(getContext(), i4) : null);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ContextCompat.getDrawable(getContext(), i) : null, i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null, i3 != 0 ? ContextCompat.getDrawable(getContext(), i3) : null, i4 != 0 ? ContextCompat.getDrawable(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatToggleButton, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1189Sc c1189Sc = this.b;
        if (c1189Sc != null && c1189Sc.a()) {
            super.setCompoundDrawables(C9870yD.a(drawable, this.b.g(), this.b.j()), C9870yD.a(drawable2, this.b.g(), this.b.j()), C9870yD.a(drawable3, this.b.g(), this.b.j()), C9870yD.a(drawable4, this.b.g(), this.b.j()));
        } else {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatToggleButton, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1189Sc c1189Sc = this.b;
        if (c1189Sc != null && c1189Sc.a()) {
            super.setCompoundDrawablesRelative(C9870yD.a(drawable, this.b.g(), this.b.j()), C9870yD.a(drawable2, this.b.g(), this.b.j()), C9870yD.a(drawable3, this.b.g(), this.b.j()), C9870yD.a(drawable4, this.b.g(), this.b.j()));
        } else {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }
    }

    private final void c() {
        Drawable drawable;
        Drawable drawable2;
        if (getCompoundDrawablesRelative()[0] != null) {
            drawable = getCompoundDrawablesRelative()[0];
        } else {
            drawable = b() ? getCompoundDrawables()[2] : getCompoundDrawables()[0];
        }
        if (getCompoundDrawablesRelative()[2] != null) {
            drawable2 = getCompoundDrawablesRelative()[2];
        } else {
            drawable2 = b() ? getCompoundDrawables()[0] : getCompoundDrawables()[2];
        }
        setCompoundDrawablesRelative(drawable, getCompoundDrawablesRelative()[1], drawable2, getCompoundDrawablesRelative()[3]);
    }

    private final void e() {
        int bottomPaddingOffset;
        if (this.b.d()) {
            if (TextUtils.isEmpty(getText())) {
                this.j.setEmpty();
            } else {
                getPaint().getTextBounds(getText().toString(), 0, getText().length(), this.j);
            }
            Drawable[] compoundDrawables = getCompoundDrawables();
            C8632dsu.a(compoundDrawables, "");
            if (compoundDrawables[0] != null) {
                int width = getWidth() - (getPaddingLeft() + getPaddingRight());
                compoundDrawables[0].copyBounds(this.e);
                if (width > this.j.width() + this.e.width()) {
                    this.e.offsetTo((((getRightPaddingOffset() + width) - (this.j.width() + this.e.width())) / 2) - getCompoundDrawablePadding(), 0);
                    compoundDrawables[0].setBounds(this.e);
                }
            }
            if (compoundDrawables[2] != null) {
                int width2 = getWidth() - (getPaddingLeft() + getPaddingRight());
                compoundDrawables[2].copyBounds(this.e);
                if (width2 > this.j.width() + this.e.width()) {
                    this.e.offsetTo((((getLeftPaddingOffset() - width2) + (this.j.width() + this.e.width())) / 2) + getCompoundDrawablePadding(), 0);
                    compoundDrawables[2].setBounds(this.e);
                }
            }
            if (compoundDrawables[1] != null) {
                int height = getHeight() - (getPaddingTop() + getPaddingBottom());
                compoundDrawables[1].copyBounds(this.e);
                if (height > this.j.height() + this.e.height() + getCompoundDrawablePadding() && (bottomPaddingOffset = (((getBottomPaddingOffset() + height) - (this.j.height() + this.e.height())) / 2) - getCompoundDrawablePadding()) >= 0) {
                    Rect rect = this.e;
                    rect.offsetTo(rect.left, bottomPaddingOffset);
                    compoundDrawables[1].setBounds(this.e);
                }
            }
            if (compoundDrawables[3] != null) {
                int height2 = getHeight() - (getPaddingTop() + getPaddingBottom());
                compoundDrawables[3].copyBounds(this.e);
                if (height2 > this.j.height() + this.e.height() + getCompoundDrawablePadding()) {
                    int compoundDrawablePadding = getCompoundDrawablePadding();
                    Rect rect2 = this.e;
                    rect2.offsetTo(rect2.left, (((getTopPaddingOffset() - height2) + (this.j.height() + this.e.height())) / 2) + compoundDrawablePadding);
                    compoundDrawables[3].setBounds(this.e);
                }
            }
        }
    }

    private final boolean b() {
        return getLayoutDirection() == 1;
    }
}
