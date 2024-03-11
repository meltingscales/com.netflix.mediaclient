package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;

/* renamed from: o.Ss  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1205Ss extends Toolbar {
    private int a;
    private int d;
    private int e;
    private int j;
    public static final d c = new d(null);
    public static final int b = 8;

    public final int b() {
        return this.j;
    }

    public final int c() {
        return this.a;
    }

    public final int e() {
        return this.d;
    }

    /* renamed from: o.Ss$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205Ss(Context context) {
        super(context);
        C8632dsu.c((Object) context, "");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842806, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{16842806});
        C8632dsu.a(obtainStyledAttributes, "");
        this.j = obtainStyledAttributes.getColor(0, -1);
        this.a = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1205Ss(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.toolbarStyle);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205Ss(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        a(attributeSet, i);
    }

    @SuppressLint({"RestrictedApi"})
    private final void a(AttributeSet attributeSet, int i) {
        int currentTextColor;
        int currentTextColor2;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, androidx.appcompat.R.styleable.Toolbar, i, 0);
        this.e = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
        this.d = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        if (this.e != 0) {
            appCompatTextView.setTextAppearance(getContext(), this.e);
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_titleTextColor)) {
            currentTextColor = obtainStyledAttributes.getColor(androidx.appcompat.R.styleable.Toolbar_titleTextColor, 0);
        } else {
            currentTextColor = appCompatTextView.getCurrentTextColor();
        }
        this.j = currentTextColor;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext());
        if (this.d != 0) {
            appCompatTextView2.setTextAppearance(getContext(), this.d);
        }
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor)) {
            currentTextColor2 = obtainStyledAttributes.getColor(androidx.appcompat.R.styleable.Toolbar_subtitleTextColor, 0);
        } else {
            currentTextColor2 = appCompatTextView2.getCurrentTextColor();
        }
        this.a = currentTextColor2;
        obtainStyledAttributes.recycle();
    }
}
