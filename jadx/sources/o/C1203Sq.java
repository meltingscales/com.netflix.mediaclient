package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.TextViewCompat;
import com.netflix.android.org.json.zip.JSONzip;
import o.C9834xU;

/* renamed from: o.Sq */
/* loaded from: classes3.dex */
public class C1203Sq extends AppCompatButton {
    public static final e a = new e(null);
    public static final int d = 8;
    private final CharSequence b;
    private final Rect c;
    private C1189Sc e;
    private final Rect h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1203Sq(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1203Sq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final C1189Sc b() {
        return this.e;
    }

    public /* synthetic */ C1203Sq(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C9834xU.b.y : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203Sq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.b = getText();
        this.e = new C1189Sc(null, null, null, null, 0, 0, 0, 0, false, null, 0, false, false, false, 16383, null);
        this.h = new Rect();
        this.c = new Rect();
        setAttributes$widgetry_release(C1189Sc.d.d(context, attributeSet));
    }

    /* renamed from: o.Sq$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("NetflixTextButton");
        }
    }

    public final void setAttributes$widgetry_release(C1189Sc c1189Sc) {
        C8632dsu.c((Object) c1189Sc, "");
        this.e = c1189Sc;
        setBackground(new C1192Sf(c1189Sc));
        setTextColor(c1189Sc.m());
        if (TextViewCompat.getAutoSizeTextType(this) == 1) {
            TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(this, new int[]{TextViewCompat.getAutoSizeMinTextSize(this), Math.round(getTextSize())}, 0);
        }
        c();
        setOutlineProvider(new a());
    }

    /* renamed from: o.Sq$a */
    /* loaded from: classes3.dex */
    public static final class a extends ViewOutlineProvider {
        private final Rect c = new Rect();

        a() {
            C1203Sq.this = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            this.c.right = C1203Sq.this.getMeasuredWidth();
            this.c.bottom = C1203Sq.this.getMeasuredHeight();
            if (outline != null) {
                outline.setRoundRect(this.c, C1203Sq.this.d());
            }
            C1203Sq.this.setClipToOutline(true);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence text = getText();
        super.setText(charSequence, bufferType);
        if (C8632dsu.c(text, charSequence) || isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    public final void setLabelVisibility(boolean z) {
        if (!z) {
            setText("");
        } else {
            setText(this.b);
        }
    }

    private final void e() {
        int bottomPaddingOffset;
        if (this.e.d()) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(text)) {
                this.h.setEmpty();
            } else {
                getPaint().getTextBounds(text.toString(), 0, text.length(), this.h);
            }
            Drawable[] compoundDrawables = getCompoundDrawables();
            C8632dsu.a(compoundDrawables, "");
            if (compoundDrawables[0] != null) {
                int width = getWidth() - (getPaddingLeft() + getPaddingRight());
                compoundDrawables[0].copyBounds(this.c);
                if (width > this.h.width() + this.c.width()) {
                    this.c.offsetTo((((getRightPaddingOffset() + width) - (this.h.width() + this.c.width())) / 2) - getCompoundDrawablePadding(), 0);
                    compoundDrawables[0].setBounds(this.c);
                }
            }
            if (compoundDrawables[2] != null) {
                int width2 = getWidth() - (getPaddingLeft() + getPaddingRight());
                compoundDrawables[2].copyBounds(this.c);
                if (width2 > this.h.width() + this.c.width()) {
                    this.c.offsetTo((((getLeftPaddingOffset() - width2) + (this.h.width() + this.c.width())) / 2) + getCompoundDrawablePadding(), 0);
                    compoundDrawables[2].setBounds(this.c);
                }
            }
            if (compoundDrawables[1] != null) {
                int height = getHeight() - (getPaddingTop() + getPaddingBottom());
                compoundDrawables[1].copyBounds(this.c);
                if (height > this.h.height() + this.c.height() + getCompoundDrawablePadding() && (bottomPaddingOffset = (((getBottomPaddingOffset() + height) - (this.h.height() + this.c.height())) / 2) - getCompoundDrawablePadding()) >= 0) {
                    Rect rect = this.c;
                    rect.offsetTo(rect.left, bottomPaddingOffset);
                    compoundDrawables[1].setBounds(this.c);
                }
            }
            if (compoundDrawables[3] != null) {
                int height2 = getHeight() - (getPaddingTop() + getPaddingBottom());
                compoundDrawables[3].copyBounds(this.c);
                if (height2 > this.h.height() + this.c.height() + getCompoundDrawablePadding()) {
                    int compoundDrawablePadding = getCompoundDrawablePadding();
                    Rect rect2 = this.c;
                    rect2.offsetTo(rect2.left, (((getTopPaddingOffset() - height2) + (this.h.height() + this.c.height())) / 2) + compoundDrawablePadding);
                    compoundDrawables[3].setBounds(this.c);
                }
            }
        }
    }

    public final void e(int i) {
        setAttributes$widgetry_release(C1189Sc.d.b(new ContextThemeWrapper(getContext(), i), i));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        c();
        super.onFinishInflate();
    }

    private final void c() {
        Drawable drawable;
        Drawable drawable2;
        if (getCompoundDrawablesRelative()[0] != null) {
            drawable = getCompoundDrawablesRelative()[0];
        } else {
            drawable = a() ? getCompoundDrawables()[2] : getCompoundDrawables()[0];
        }
        if (getCompoundDrawablesRelative()[2] != null) {
            drawable2 = getCompoundDrawablesRelative()[2];
        } else {
            drawable2 = a() ? getCompoundDrawables()[0] : getCompoundDrawables()[2];
        }
        setCompoundDrawablesRelative(drawable, getCompoundDrawablesRelative()[1], drawable2, getCompoundDrawablesRelative()[3]);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null, i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null, i3 != 0 ? AppCompatResources.getDrawable(getContext(), i3) : null, i4 != 0 ? AppCompatResources.getDrawable(getContext(), i4) : null);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null, i2 != 0 ? AppCompatResources.getDrawable(getContext(), i2) : null, i3 != 0 ? AppCompatResources.getDrawable(getContext(), i3) : null, i4 != 0 ? AppCompatResources.getDrawable(getContext(), i4) : null);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1189Sc c1189Sc = this.e;
        if (c1189Sc != null) {
            ColorStateList g = c1189Sc.n() ? this.e.g() : null;
            super.setCompoundDrawables(C9870yD.a(drawable, g, this.e.j()), C9870yD.a(drawable2, g, this.e.j()), C9870yD.a(drawable3, g, this.e.j()), C9870yD.a(drawable4, g, this.e.j()));
            return;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1189Sc c1189Sc = this.e;
        if (c1189Sc != null) {
            ColorStateList g = c1189Sc.n() ? this.e.g() : null;
            super.setCompoundDrawablesRelative(C9870yD.a(drawable, g, this.e.j()), C9870yD.a(drawable2, g, this.e.j()), C9870yD.a(drawable3, g, this.e.j()), C9870yD.a(drawable4, g, this.e.j()));
            return;
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static /* synthetic */ void a(C1203Sq c1203Sq, ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAttributes");
        }
        c1203Sq.e((i5 & 1) != 0 ? c1203Sq.e.h() : colorStateList, (i5 & 2) != 0 ? c1203Sq.e.c() : colorStateList2, (i5 & 4) != 0 ? c1203Sq.e.m() : colorStateList3, (i5 & 8) != 0 ? c1203Sq.e.g() : colorStateList4, (i5 & 16) != 0 ? c1203Sq.e.d() : z, (i5 & 32) != 0 ? c1203Sq.e.i() : i, (i5 & 64) != 0 ? c1203Sq.e.b() : i2, (i5 & 128) != 0 ? c1203Sq.e.l() : i3, (i5 & JSONzip.end) != 0 ? c1203Sq.e.j() : i4, (i5 & 512) != 0 ? c1203Sq.e.e() : z2, (i5 & 1024) != 0 ? c1203Sq.e.n() : z3);
    }

    public final void e(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, ColorStateList colorStateList4, boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3) {
        C8632dsu.c((Object) colorStateList, "");
        C8632dsu.c((Object) colorStateList2, "");
        C8632dsu.c((Object) colorStateList3, "");
        C8632dsu.c((Object) colorStateList4, "");
        setAttributes$widgetry_release(new C1189Sc(colorStateList, colorStateList2, colorStateList3, colorStateList4, i, i2, i3, i4, z, null, 0, z2, false, z3, 5632, null));
    }

    public final int d() {
        return this.e.b();
    }

    private final boolean a() {
        return getLayoutDirection() == 1;
    }
}
