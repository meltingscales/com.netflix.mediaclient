package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.SJ;
import o.dpR;

/* loaded from: classes3.dex */
public final class SJ extends FrameLayout {
    private static final Interpolator c;
    private static final Interpolator d;
    private final CharSequence a;
    private int f;
    private AnimatorSet g;
    private final C1204Sr h;
    private final AttributeSet i;
    private final CharSequence j;
    private final View k;
    private Drawable l;
    private int m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final ImageButton f13396o;
    private final C1204Sr p;
    private final CharSequence q;
    private Drawable r;
    private final CharSequence s;
    private final CharSequence t;
    private int u;
    private int v;
    private a w;
    private final float x;
    private final int y;
    public static final e b = new e(null);
    public static final int e = 8;

    /* loaded from: classes3.dex */
    public interface a {
        void c(SJ sj, int i, int i2);

        void e(SJ sj, int i, int i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJ(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final a b() {
        return this.w;
    }

    public final int e() {
        return this.y;
    }

    public final void setAnimMode(int i2) {
        this.f = i2;
    }

    public final void setOnSeekButtonListener(a aVar) {
        this.w = aVar;
    }

    public /* synthetic */ SJ(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJ(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.i = attributeSet;
        this.u = 1;
        this.v = 1;
        int i3 = 101;
        this.f = 101;
        this.g = new AnimatorSet();
        View.inflate(context, C9834xU.i.n, this);
        C9838xY d2 = C9838xY.d(this);
        C8632dsu.a(d2, "");
        ImageButton imageButton = d2.e;
        C8632dsu.a(imageButton, "");
        this.f13396o = imageButton;
        C1204Sr c1204Sr = d2.d;
        C8632dsu.a(c1204Sr, "");
        this.p = c1204Sr;
        View view = d2.a;
        C8632dsu.a(view, "");
        this.k = view;
        C1204Sr c1204Sr2 = d2.b;
        C8632dsu.a(c1204Sr2, "");
        this.h = c1204Sr2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9834xU.n.ak);
        C8632dsu.a(obtainStyledAttributes, "");
        try {
            int integer = obtainStyledAttributes.getInteger(C9834xU.n.ao, 10);
            this.y = integer;
            this.s = String.valueOf(integer);
            this.a = C1333Xq.e(context, C9834xU.h.k).d("seconds", Integer.valueOf(integer)).c();
            this.j = C1333Xq.e(context, C9834xU.h.s).d("seconds", Integer.valueOf(integer)).c();
            String c2 = C1333Xq.e(context, C9834xU.h.f13916o).d("seconds", Integer.valueOf(integer)).c();
            this.q = c2;
            String c3 = C1333Xq.e(context, C9834xU.h.l).d("seconds", Integer.valueOf(integer)).c();
            this.t = c3;
            if (this.u != -1) {
                c2 = c3;
            }
            c1204Sr2.setText(c2);
            c1204Sr2.setAlpha(0.0f);
            int i4 = obtainStyledAttributes.getInt(C9834xU.n.an, 1);
            this.v = i4;
            if (i4 != 1) {
                i3 = 102;
            }
            this.f = i3;
            if (i4 == -1) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C9834xU.a.L);
                view.getLayoutParams().width = dimensionPixelSize;
                view.getLayoutParams().height = dimensionPixelSize;
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(C9834xU.a.K);
                imageButton.getLayoutParams().width = dimensionPixelSize2;
                imageButton.getLayoutParams().height = dimensionPixelSize2;
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(C9834xU.a.S);
                imageButton.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
                c1204Sr.setTextSize(0, getResources().getDimension(C9834xU.a.O));
                if (!C8141del.a()) {
                    c1204Sr.setTypeface(C1336Xt.e((Activity) C9737vz.b(context, Activity.class)));
                }
                c1204Sr.setPadding(c1204Sr.getPaddingLeft(), getResources().getDimensionPixelSize(C9834xU.a.R), c1204Sr.getPaddingRight(), c1204Sr.getPaddingBottom());
                Drawable drawable = ContextCompat.getDrawable(context, C9834xU.j.f13918J);
                C8632dsu.d(drawable);
                this.r = drawable;
                Drawable drawable2 = ContextCompat.getDrawable(context, C9834xU.j.F);
                C8632dsu.d(drawable2);
                this.l = drawable2;
            } else if (i4 == 1) {
                int dimensionPixelSize4 = getResources().getDimensionPixelSize(C9834xU.a.f13910J);
                view.getLayoutParams().width = dimensionPixelSize4;
                view.getLayoutParams().height = dimensionPixelSize4;
                int dimensionPixelSize5 = getResources().getDimensionPixelSize(C9834xU.a.M);
                imageButton.getLayoutParams().width = dimensionPixelSize5;
                imageButton.getLayoutParams().height = dimensionPixelSize5;
                int dimensionPixelSize6 = getResources().getDimensionPixelSize(C9834xU.a.N);
                imageButton.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
                c1204Sr.setTextSize(0, getResources().getDimension(C9834xU.a.P));
                c1204Sr.setPadding(c1204Sr.getPaddingLeft(), getResources().getDimensionPixelSize(C9834xU.a.Q), c1204Sr.getPaddingRight(), c1204Sr.getPaddingBottom());
                Drawable drawable3 = ContextCompat.getDrawable(context, C9834xU.j.L);
                C8632dsu.d(drawable3);
                this.r = drawable3;
                Drawable drawable4 = ContextCompat.getDrawable(context, C9834xU.j.I);
                C8632dsu.d(drawable4);
                this.l = drawable4;
            } else {
                throw new UnsupportedOperationException("should not happen as SeekButton_sb_size is enum");
            }
            this.n = obtainStyledAttributes.getBoolean(C9834xU.n.aq, true);
            this.x = getResources().getDimension(C9834xU.a.U);
            setClipChildren(false);
            post(new Runnable() { // from class: o.SM
                @Override // java.lang.Runnable
                public final void run() {
                    SJ.g(SJ.this);
                }
            });
            setMode(obtainStyledAttributes.getInt(C9834xU.n.ap, 1));
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(androidx.appcompat.R.attr.selectableItemBackgroundBorderless, typedValue, true)) {
                imageButton.setBackgroundResource(typedValue.resourceId);
            }
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C9834xU.n.al);
            if (colorStateList != null) {
                imageButton.setImageTintList(colorStateList);
                c1204Sr.setTextColor(colorStateList);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SeekButton");
        }
    }

    static {
        Interpolator create = PathInterpolatorCompat.create(0.19f, 1.0f, 0.22f, 1.0f);
        C8632dsu.a(create, "");
        d = create;
        Interpolator create2 = PathInterpolatorCompat.create(0.23f, 1.0f, 0.32f, 1.0f);
        C8632dsu.a(create2, "");
        c = create2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final SJ sj) {
        C8632dsu.c((Object) sj, "");
        if (sj.n) {
            Observable<dpR> c2 = C9618tM.c(sj.f13396o);
            final drM<dpR, dpR> drm = new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.android.widget.SeekButton$9$1
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    d(dpr);
                    return dpR.c;
                }

                public final void d(dpR dpr) {
                    int i2;
                    int i3;
                    int i4;
                    C8632dsu.c((Object) dpr, "");
                    SJ sj2 = SJ.this;
                    i2 = sj2.m;
                    sj2.m = i2 + 1;
                    SJ.b.getLogTag();
                    SJ.a b2 = SJ.this.b();
                    if (b2 != null) {
                        SJ sj3 = SJ.this;
                        i3 = sj3.u;
                        i4 = SJ.this.m;
                        b2.c(sj3, i3, i4);
                    }
                    SJ.b(SJ.this, null, 1, null);
                }
            };
            Observable observeOn = c2.map(new Function() { // from class: o.SN
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    dpR b2;
                    b2 = SJ.b(drM.this, obj);
                    return b2;
                }
            }).debounce(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
            C8632dsu.a(observeOn, "");
            SubscribersKt.subscribeBy$default(observeOn, (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.android.widget.SeekButton$9$2
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(dpR dpr) {
                    a(dpr);
                    return dpR.c;
                }

                public final void a(dpR dpr) {
                    int i2;
                    int i3;
                    SJ.b.getLogTag();
                    SJ.a b2 = SJ.this.b();
                    if (b2 != null) {
                        SJ sj2 = SJ.this;
                        i2 = sj2.u;
                        i3 = SJ.this.m;
                        b2.e(sj2, i2, i3);
                    }
                    SJ.this.m = 0;
                }
            }, 3, (Object) null);
            return;
        }
        sj.m = 1;
        SubscribersKt.subscribeBy$default(C9618tM.c(sj.f13396o), (drM) null, (drO) null, new drM<dpR, dpR>() { // from class: com.netflix.mediaclient.android.widget.SeekButton$9$3
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(dpR dpr) {
                a(dpr);
                return dpR.c;
            }

            public final void a(dpR dpr) {
                int i2;
                int i3;
                int i4;
                int i5;
                C8632dsu.c((Object) dpr, "");
                SJ.b.getLogTag();
                SJ.a b2 = SJ.this.b();
                if (b2 != null) {
                    SJ sj2 = SJ.this;
                    i4 = sj2.u;
                    i5 = SJ.this.m;
                    b2.c(sj2, i4, i5);
                }
                SJ.a b3 = SJ.this.b();
                if (b3 != null) {
                    SJ sj3 = SJ.this;
                    i2 = sj3.u;
                    i3 = SJ.this.m;
                    b3.e(sj3, i2, i3);
                }
                SJ.b(SJ.this, null, 1, null);
            }
        }, 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (dpR) drm.invoke(obj);
    }

    @Override // android.view.View
    public boolean performClick() {
        return this.f13396o.performClick();
    }

    public final void setMode(int i2) {
        Map d2;
        Map k;
        Throwable th;
        this.u = i2;
        if (i2 == -1) {
            this.f13396o.setImageDrawable(this.l);
            setContentDescription(this.a);
            this.p.setText(this.s);
            this.h.setText(this.q);
        } else if (i2 == 1) {
            this.f13396o.setImageDrawable(this.r);
            setContentDescription(this.j);
            this.p.setText(this.s);
            this.h.setText(this.t);
        } else {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("sb_mode attribute value should be forward or backward", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f13396o.setEnabled(z);
        this.p.setEnabled(z);
        this.f13396o.setAlpha(z ? 1.0f : 0.3f);
        this.p.setAlpha(z ? 1.0f : 0.3f);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return super.isEnabled() && this.f13396o.isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /* renamed from: d */
    public String getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(SJ sj, drO dro, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dro = null;
        }
        sj.b(dro);
    }

    public final void b(drO<dpR> dro) {
        int i2 = this.f;
        if (i2 == 101) {
            a(dro);
        } else if (i2 != 102) {
        } else {
            e(dro);
        }
    }

    private final void e(drO<dpR> dro) {
        float f = this.u == -1 ? -45.0f : 45.0f;
        ImageButton imageButton = this.f13396o;
        Property property = View.SCALE_X;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, 0.9f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(imageButton, ofFloat, PropertyValuesHolder.ofFloat(property2, 0.9f)).setDuration(100L);
        C8632dsu.a(duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(this.f13396o, PropertyValuesHolder.ofFloat(property, 1.0f), PropertyValuesHolder.ofFloat(property2, 1.0f)).setDuration(350L);
        C8632dsu.a(duration2, "");
        ImageButton imageButton2 = this.f13396o;
        Property property3 = View.ROTATION;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(imageButton2, property3, 0.0f, f).setDuration(150L);
        C8632dsu.a(duration3, "");
        Interpolator interpolator = d;
        duration3.setInterpolator(interpolator);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f13396o, property3, f, 0.0f).setDuration(750L);
        C8632dsu.a(duration4, "");
        duration4.setInterpolator(interpolator);
        View view = this.k;
        Property property4 = View.ALPHA;
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, property4, 0.0f, 0.7f).setDuration(100L);
        C8632dsu.a(duration5, "");
        duration5.addListener(new i());
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(this.k, property4, 0.7f, 0.0f).setDuration(350L);
        C8632dsu.a(duration6, "");
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.g = animatorSet;
        animatorSet.play(duration).with(duration2).before(duration3).before(duration5);
        this.g.play(duration4).after(duration3);
        this.g.play(duration6).after(duration5);
        this.g.addListener(new g(dro));
        this.g.start();
    }

    /* loaded from: classes3.dex */
    public static final class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ.this.k.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ.this.k.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends AnimatorListenerAdapter {
        final /* synthetic */ drO<dpR> c;

        g(drO<dpR> dro) {
            this.c = dro;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ sj = SJ.this;
            sj.e(sj.f13396o, SJ.this.p, SJ.this.k);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            drO<dpR> dro = this.c;
            if (dro != null) {
                dro.invoke();
            }
        }
    }

    private final void a(drO<dpR> dro) {
        boolean z = this.u == -1;
        float f = this.x;
        float f2 = z ? -45.0f : 45.0f;
        if (z) {
            f = -f;
        }
        ImageButton imageButton = this.f13396o;
        Property property = View.SCALE_X;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, 0.9f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(imageButton, ofFloat, PropertyValuesHolder.ofFloat(property2, 0.9f)).setDuration(100L);
        C8632dsu.a(duration, "");
        C1204Sr c1204Sr = this.p;
        Property property3 = View.ALPHA;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(c1204Sr, property3, 1.0f, 0.0f).setDuration(100L);
        C8632dsu.a(duration2, "");
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(this.f13396o, PropertyValuesHolder.ofFloat(property, 1.0f), PropertyValuesHolder.ofFloat(property2, 1.0f)).setDuration(350L);
        C8632dsu.a(duration3, "");
        ImageButton imageButton2 = this.f13396o;
        Property property4 = View.ROTATION;
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(imageButton2, property4, 0.0f, f2).setDuration(150L);
        C8632dsu.a(duration4, "");
        Interpolator interpolator = d;
        duration4.setInterpolator(interpolator);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f13396o, property4, f2, 0.0f).setDuration(750L);
        C8632dsu.a(duration5, "");
        duration5.setInterpolator(interpolator);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(this.h, View.TRANSLATION_X, f).setDuration(750L);
        C8632dsu.a(duration6, "");
        duration6.setInterpolator(c);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(this.p, property3, 0.0f, 1.0f).setDuration(150L);
        C8632dsu.a(duration7, "");
        ObjectAnimator duration8 = ObjectAnimator.ofFloat(this.h, property3, 0.0f).setDuration(150L);
        C8632dsu.a(duration8, "");
        duration8.addListener(new c(duration7, dro));
        ObjectAnimator duration9 = ObjectAnimator.ofFloat(this.h, property3, 0.0f, 1.0f).setDuration(100L);
        C8632dsu.a(duration9, "");
        duration9.setStartDelay(80L);
        ObjectAnimator duration10 = ObjectAnimator.ofFloat(this.k, property3, 0.0f, 0.7f).setDuration(100L);
        C8632dsu.a(duration10, "");
        duration10.addListener(new b());
        ObjectAnimator duration11 = ObjectAnimator.ofFloat(this.k, property3, 0.7f, 0.0f).setDuration(350L);
        C8632dsu.a(duration11, "");
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.g = animatorSet;
        animatorSet.play(duration).with(duration2).before(duration9).before(duration3).before(duration4).before(duration6).before(duration10);
        this.g.play(duration5).after(duration4);
        this.g.play(duration8).after(duration6);
        this.g.play(duration7).after(duration8);
        this.g.play(duration11).after(duration10);
        this.g.addListener(new d());
        this.g.start();
    }

    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        final /* synthetic */ drO<dpR> c;
        final /* synthetic */ ObjectAnimator e;

        c(ObjectAnimator objectAnimator, drO<dpR> dro) {
            this.e = objectAnimator;
            this.c = dro;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ.this.h.setTranslationX(0.0f);
            SJ.this.h.setScaleX(1.0f);
            SJ.this.h.setScaleY(1.0f);
            ObjectAnimator objectAnimator = this.e;
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            fArr[1] = SJ.this.f13396o.isEnabled() ? 1.0f : 0.3f;
            objectAnimator.setFloatValues(fArr);
            drO<dpR> dro = this.c;
            if (dro != null) {
                dro.invoke();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ.this.k.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ.this.k.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            SJ sj = SJ.this;
            sj.e(sj.f13396o, SJ.this.p, SJ.this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(View view, TextView textView, View view2) {
        this.h.setTranslationX(0.0f);
        this.h.setScaleX(1.0f);
        this.h.setScaleY(1.0f);
        this.h.setAlpha(0.0f);
        textView.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view2.setAlpha(0.0f);
        view2.setVisibility(8);
    }

    public final void c() {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.i, C9834xU.n.ak);
        C8632dsu.a(obtainStyledAttributes, "");
        this.v = obtainStyledAttributes.getInt(C9834xU.n.an, 1);
        obtainStyledAttributes.recycle();
        int i2 = this.v;
        this.f = i2 == 1 ? 101 : 102;
        if (i2 == -1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C9834xU.a.L);
            this.k.getLayoutParams().width = dimensionPixelSize;
            this.k.getLayoutParams().height = dimensionPixelSize;
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C9834xU.a.K);
            this.f13396o.getLayoutParams().width = dimensionPixelSize2;
            this.f13396o.getLayoutParams().height = dimensionPixelSize2;
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(C9834xU.a.S);
            this.f13396o.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
            this.p.setTextSize(0, getResources().getDimension(C9834xU.a.O));
            if (!C8141del.a()) {
                this.p.setTypeface(C1336Xt.e((Activity) C9737vz.b(getContext(), Activity.class)));
            }
            C1204Sr c1204Sr = this.p;
            c1204Sr.setPadding(c1204Sr.getPaddingLeft(), getResources().getDimensionPixelSize(C9834xU.a.R), c1204Sr.getPaddingRight(), c1204Sr.getPaddingBottom());
        } else if (i2 != 1) {
        } else {
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(C9834xU.a.f13910J);
            this.k.getLayoutParams().width = dimensionPixelSize4;
            this.k.getLayoutParams().height = dimensionPixelSize4;
            int dimensionPixelSize5 = getResources().getDimensionPixelSize(C9834xU.a.M);
            this.f13396o.getLayoutParams().width = dimensionPixelSize5;
            this.f13396o.getLayoutParams().height = dimensionPixelSize5;
            int dimensionPixelSize6 = getResources().getDimensionPixelSize(C9834xU.a.N);
            this.f13396o.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
            this.p.setTextSize(0, getResources().getDimension(C9834xU.a.P));
            C1204Sr c1204Sr2 = this.p;
            c1204Sr2.setPadding(c1204Sr2.getPaddingLeft(), getResources().getDimensionPixelSize(C9834xU.a.Q), c1204Sr2.getPaddingRight(), c1204Sr2.getPaddingBottom());
            Drawable drawable = ContextCompat.getDrawable(getContext(), C9834xU.j.L);
            C8632dsu.d(drawable);
            this.r = drawable;
            Drawable drawable2 = ContextCompat.getDrawable(getContext(), C9834xU.j.I);
            C8632dsu.d(drawable2);
            this.l = drawable2;
        }
    }
}
