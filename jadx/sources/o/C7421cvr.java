package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import o.C7373cuw;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.cvr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7421cvr extends View$OnClickListenerC7404cva {
    private C7349cuY d;
    private final ValueAnimator f = new ValueAnimator();
    public static final a b = new a(null);
    public static final int a = 8;

    @Override // o.View$OnClickListenerC7404cva
    public int d() {
        return com.netflix.mediaclient.ui.R.l.k;
    }

    @Override // o.View$OnClickListenerC7404cva
    public int e() {
        return C7373cuw.b.h;
    }

    /* renamed from: o.cvr$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.View$OnClickListenerC7404cva, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        C7349cuY d2 = C7349cuY.d(view);
        this.d = d2;
        C8632dsu.a(d2, "");
        if (bundle == null) {
            a();
        }
        d2.e.getViewTreeObserver().addOnGlobalLayoutListener(new d(d2));
        Context context = getContext();
        if (context != null) {
            int i = com.netflix.mediaclient.ui.R.g.au;
            Drawable drawable = d2.n.getDrawable();
            C8632dsu.d(drawable);
            d(context, i, (LayerDrawable) drawable);
            int i2 = com.netflix.mediaclient.ui.R.g.aw;
            Drawable drawable2 = d2.f13775o.getDrawable();
            C8632dsu.d(drawable2);
            d(context, i2, (LayerDrawable) drawable2);
        }
        d2.e.setFitsSystemWindows(true);
        C1193Sg c1193Sg = d2.c;
        C8632dsu.a(c1193Sg, "");
        C1332Xp c1332Xp = C1332Xp.b;
        C9702vQ.c(c1193Sg, (int) TypedValue.applyDimension(1, 16, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        f();
        j();
    }

    /* renamed from: o.cvr$d */
    /* loaded from: classes4.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ C7349cuY c;

        d(C7349cuY c7349cuY) {
            this.c = c7349cuY;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.c.u.getMeasuredHeight() < this.c.e.getMeasuredHeight()) {
                ConstraintLayout constraintLayout = this.c.u;
                C8632dsu.a(constraintLayout, "");
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 80;
                    constraintLayout.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            this.c.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    @Override // o.View$OnClickListenerC7404cva, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.d = null;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireActivity(), com.netflix.mediaclient.ui.R.l.k);
        Window window = dialog.getWindow();
        if (window != null) {
            window.getAttributes().windowAnimations = com.netflix.mediaclient.ui.R.l.d;
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (!BrowseExperience.e()) {
                systemUiVisibility |= 512;
            } else if (Build.VERSION.SDK_INT >= 26) {
                systemUiVisibility |= 528;
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility | 1280);
        }
        return dialog;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        b();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag
    public boolean handleBackPressed() {
        dismiss();
        return true;
    }

    private final void j() {
        if (this.f.isRunning()) {
            this.f.cancel();
        }
        ValueAnimator valueAnimator = this.f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), 1.0f);
        this.f.start();
    }

    private final void b() {
        if (this.f.isRunning()) {
            this.f.cancel();
        }
        ValueAnimator valueAnimator = this.f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        valueAnimator.setFloatValues(((Float) animatedValue).floatValue(), 0.0f);
        this.f.start();
    }

    private final void f() {
        final C7349cuY c7349cuY = this.d;
        if (c7349cuY == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        NestedScrollView nestedScrollView = c7349cuY.e;
        C8632dsu.a(nestedScrollView, "");
        nestedScrollView.setVisibility(4);
        this.f.setDuration(300L);
        this.f.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cvx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7421cvr.e(C7349cuY.this, this, valueAnimator);
            }
        });
        this.f.setFloatValues(0.0f);
        this.f.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C7349cuY c7349cuY, C7421cvr c7421cvr, ValueAnimator valueAnimator) {
        Drawable mutate;
        C8632dsu.c((Object) c7349cuY, "");
        C8632dsu.c((Object) c7421cvr, "");
        C8632dsu.c((Object) valueAnimator, "");
        int measuredHeight = c7349cuY.u.getMeasuredHeight();
        Object animatedValue = c7421cvr.f.getAnimatedValue();
        C8632dsu.d(animatedValue);
        float floatValue = ((Float) animatedValue).floatValue();
        c7349cuY.u.setTranslationY((1 - floatValue) * measuredHeight);
        Drawable background = c7349cuY.e.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setAlpha((int) (((float) PrivateKeyType.INVALID) * floatValue));
            c7349cuY.e.invalidate();
        }
        c7349cuY.e.requestLayout();
        if (floatValue > 0.1d) {
            NestedScrollView nestedScrollView = c7349cuY.e;
            C8632dsu.a(nestedScrollView, "");
            if (nestedScrollView.getVisibility() == 4) {
                NestedScrollView nestedScrollView2 = c7349cuY.e;
                C8632dsu.a(nestedScrollView2, "");
                nestedScrollView2.setVisibility(0);
            }
        }
    }

    /* renamed from: o.cvr$c */
    /* loaded from: classes4.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            Object animatedValue = C7421cvr.this.f.getAnimatedValue();
            C8632dsu.d(animatedValue);
            if (C9913yu.a(((Float) animatedValue).floatValue(), 0.0f)) {
                C7421cvr.this.dismissAllowingStateLoss();
            }
        }
    }

    private final void d(Context context, int i, LayerDrawable layerDrawable) {
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(i);
        C8632dsu.d(findDrawableByLayerId);
        ((GradientDrawable) findDrawableByLayerId).setColor(ContextCompat.getColor(context, com.netflix.mediaclient.ui.R.c.f));
    }
}
