package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import java.nio.charset.StandardCharsets;
import o.C9834xU;

/* loaded from: classes3.dex */
public class RS extends FrameLayout {
    private static final Interpolator a;
    private static final Interpolator b;
    private static byte e$ss2$1812 = 0;
    private static int l = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13392o;
    private final ValueAnimator c;
    private final C1189Sc d;
    private int e;
    private final ValueAnimator f;
    private int g;
    private final ValueAnimator h;
    private final TextView i;
    private int j;
    private boolean n;

    static void c() {
        e$ss2$1812 = (byte) 24;
    }

    public boolean a() {
        return this.n;
    }

    static {
        c();
        a = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
        b = PathInterpolatorCompat.create(0.755f, 0.05f, 0.855f, 0.06f);
    }

    public RS(Context context) {
        this(context, null, 0);
    }

    public RS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = false;
        this.h = new ValueAnimator();
        this.f = new ValueAnimator();
        this.c = new ValueAnimator();
        View.inflate(context, C9834xU.i.f, this);
        TextView textView = (TextView) findViewById(C9834xU.g.F);
        this.i = textView;
        C1189Sc d = C1189Sc.d.d(getContext(), attributeSet);
        this.d = d;
        setBackground(new C1192Sf(d));
        textView.setTextColor(d.m());
        textView.setText(d.k());
        int f = d.f();
        this.g = f;
        this.j = (f / 2) * (-1);
        this.e = getPaddingStart() + getPaddingEnd();
        setAlpha(0.0f);
        setVisibility(8);
    }

    public void setText(int i) {
        int i2 = 2 % 2;
        TextView textView = this.i;
        Context context = textView.getContext();
        String string = context.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i3 = l + 87;
            f13392o = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i5 = l + 73;
                f13392o = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        textView.setText(string);
    }

    public void setText(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    private void d(int i, int i2, int i3, int i4, Interpolator interpolator, final boolean z) {
        if (this.h.isRunning()) {
            this.h.cancel();
        }
        this.h.setIntValues(i, i2);
        this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.RS.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RS.this.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RS.this.requestLayout();
            }
        });
        this.h.addListener(new AnimatorListenerAdapter() { // from class: o.RS.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    RS.this.setVisibility(8);
                }
                RS.this.h.removeAllListeners();
            }
        });
        this.h.setDuration(i3);
        this.h.setInterpolator(interpolator);
        this.h.setStartDelay(i4);
        this.h.start();
    }

    private void d(int i, int i2, int i3, int i4, Interpolator interpolator) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f.cancel();
        }
        this.f.setIntValues(i, i2);
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.RS.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                RS.this.i.setTranslationX(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        this.f.addListener(new AnimatorListenerAdapter() { // from class: o.RS.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                RS.this.f.removeAllListeners();
            }
        });
        this.f.setDuration(i3);
        this.f.setInterpolator(interpolator);
        this.f.setStartDelay(i4);
        this.f.start();
    }

    private void b(float f, float f2, int i, int i2) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.c.cancel();
        }
        this.c.setFloatValues(f, f2);
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.RS.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                RS.this.i.setAlpha(floatValue);
                RS.this.setAlpha(floatValue);
            }
        });
        this.c.addListener(new AnimatorListenerAdapter() { // from class: o.RS.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                RS.this.c.removeAllListeners();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                RS.this.c.removeAllListeners();
            }
        });
        this.c.setDuration(i);
        this.c.setStartDelay(i2);
        this.c.start();
    }

    private boolean a(ValueAnimator... valueAnimatorArr) {
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            if (valueAnimator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void c(boolean z) {
        if (this.n || a(this.c, this.h, this.f)) {
            return;
        }
        setVisibility(0);
        this.n = true;
        int measureText = (int) this.i.getPaint().measureText(this.i.getText(), 0, this.i.getText().length());
        int i = (this.e * 2) + measureText;
        int i2 = (int) (i * 0.2d);
        int i3 = i / 2;
        getLayoutParams().width = this.g;
        setPadding(0, 0, 0, 0);
        this.i.getLayoutParams().width = measureText;
        this.i.setTranslationX(this.j);
        requestLayout();
        setAlpha(0.0f);
        this.i.setAlpha(0.0f);
        if (!z) {
            Interpolator interpolator = a;
            d(i2, i, 0, 0, interpolator, true);
            d(this.j, 0, 0, 0, interpolator);
            b(0.0f, 1.0f, 0, 0);
            return;
        }
        Interpolator interpolator2 = a;
        d(i2, i, 800, 100, interpolator2, true);
        d(i3 * (-1), 0, 800, 100, interpolator2);
        b(0.0f, 1.0f, 200, 100);
    }

    public void e(boolean z) {
        if (this.n) {
            this.n = false;
            int measureText = (this.e * 2) + ((int) this.i.getPaint().measureText(this.i.getText(), 0, this.i.getText().length()));
            int i = (int) (measureText * 0.2d);
            int i2 = (measureText / 2) * (-1);
            if (!z) {
                int measuredWidth = getMeasuredWidth();
                Interpolator interpolator = b;
                d(measuredWidth, i, 0, 0, interpolator, false);
                d(0, i2, 0, 0, interpolator);
                b(1.0f, 0.0f, 0, 0);
                return;
            }
            int measuredWidth2 = getMeasuredWidth();
            Interpolator interpolator2 = b;
            d(measuredWidth2, i, 500, 100, interpolator2, false);
            d(0, i2, 500, 100, interpolator2);
            b(1.0f, 0.0f, 250, 350);
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1812);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
