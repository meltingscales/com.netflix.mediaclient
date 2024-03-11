package o;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.airbnb.lottie.LottieAnimationView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.model.leafs.ArtworkColors;
import o.C9834xU;
import o.cVP;
import o.cWA;
import org.chromium.net.PrivateKeyType;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class cWA<T, M> extends TH {
    public static final a e = new a(null);
    private final cWA<T, M>.d a;
    private final cWA<T, M>.d b;
    private final LottieAnimationView c;
    private final Typed2EpoxyController<T, M> d;
    private final RecyclerView h;

    public final Typed2EpoxyController<T, M> e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cWA(Context context, drM<? super View, dpR> drm, Typed2EpoxyController<T, M> typed2EpoxyController) {
        super(context, cVP.b.g, drm, null, 0, 0, 0, 0, context.getResources().getDimensionPixelSize(C9834xU.a.z), false, false, false, false, false, 16120, null);
        DefaultItemAnimator defaultItemAnimator;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) typed2EpoxyController, "");
        this.d = typed2EpoxyController;
        cWA<T, M>.d dVar = new d(this, new ColorDrawable(ContextCompat.getColor(context, cVP.e.i)), new ColorDrawable(ContextCompat.getColor(context, cVP.e.e)));
        dVar.e(false, 0L);
        this.b = dVar;
        cWA<T, M>.d dVar2 = new d(this, new ColorDrawable(ContextCompat.getColor(context, cVP.e.e)), new c());
        dVar2.e(false, 0L);
        this.a = dVar2;
        View findViewById = findViewById(cVP.c.b);
        C8632dsu.a(findViewById, "");
        this.c = (LottieAnimationView) findViewById;
        View findViewById2 = findViewById(cVP.c.j);
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        recyclerView.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
        recyclerView.setAdapter(typed2EpoxyController.getAdapter());
        C8632dsu.a(findViewById2, "");
        this.h = recyclerView;
        if (NetflixApplication.v()) {
            defaultItemAnimator = null;
        } else {
            defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setAddDuration(150L);
            defaultItemAnimator.setRemoveDuration(150L);
            defaultItemAnimator.setChangeDuration(150L);
        }
        recyclerView.setItemAnimator(defaultItemAnimator);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration(this) { // from class: o.cWA.2
            final /* synthetic */ cWA<T, M> b;
            private final int[] d = new int[2];
            private final int[] e = new int[2];
            private final float a = 0.05f;

            {
                this.b = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(Canvas canvas, RecyclerView recyclerView2, RecyclerView.State state) {
                C8632dsu.c((Object) canvas, "");
                C8632dsu.c((Object) recyclerView2, "");
                C8632dsu.c((Object) state, "");
                cWA<T, M> cwa = this.b;
                int childCount = recyclerView2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View findViewById3 = recyclerView2.getChildAt(i).findViewById(cVP.c.m);
                    if (findViewById3 != null) {
                        recyclerView2.getLocationInWindow(this.d);
                        findViewById3.getLocationInWindow(this.e);
                        float height = ((this.e[1] - this.d[1]) + (findViewById3.getHeight() / 2)) - (((cWA) cwa).c.getHeight() / 2);
                        if (height != ((cWA) cwa).c.getTranslationY()) {
                            ((cWA) cwa).c.setTranslationY(height);
                        }
                        int width = (int) (recyclerView2.getWidth() * (1 + (this.a * 2)));
                        if (width != ((cWA) cwa).c.getWidth() || width != ((cWA) cwa).c.getHeight()) {
                            ((cWA) cwa).c.getLayoutParams().width = width;
                            ((cWA) cwa).c.getLayoutParams().height = width;
                            ((cWA) cwa).c.setTranslationX((-recyclerView2.getWidth()) * this.a);
                            ((cWA) cwa).c.requestLayout();
                        }
                    }
                }
            }
        });
        getSheet().setBackground(dVar);
    }

    /* loaded from: classes6.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TvConnectLayout");
        }
    }

    public static /* synthetic */ void setFullscreen$default(cWA cwa, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        cwa.setFullscreen(z, z2, z3);
    }

    public final void setFullscreen(final boolean z, final boolean z2, final boolean z3) {
        this.h.post(new Runnable() { // from class: o.cWF
            @Override // java.lang.Runnable
            public final void run() {
                cWA.c(cWA.this, z3, z2, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cWA cwa, boolean z, boolean z2, boolean z3) {
        C8632dsu.c((Object) cwa, "");
        cwa.d(z);
        ViewGroup sheet = cwa.getSheet();
        e.getLogTag();
        sheet.setBackground(z2 ? cwa.a : cwa.b);
        int i = z3 ? -1 : -2;
        if (i != sheet.getLayoutParams().height) {
            sheet.getLayoutParams().height = i;
            sheet.requestLayout();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300L);
            changeBounds.setInterpolator(new AccelerateDecelerateInterpolator());
            TransitionManager.beginDelayedTransition(cwa.getSheet(), changeBounds);
        }
        if (z2) {
            cwa.a.e(z3, 600L);
        } else {
            cwa.b.e(z3, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public final class d extends Drawable {
        private final ValueAnimator a;
        final /* synthetic */ cWA<T, M> b;
        private final Drawable c;
        private final Drawable d;

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public d(final cWA cwa, Drawable drawable, Drawable drawable2) {
            C8632dsu.c((Object) drawable, "");
            C8632dsu.c((Object) drawable2, "");
            this.b = cwa;
            this.d = drawable;
            this.c = drawable2;
            final ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setFloatValues(0.0f);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cWE
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    cWA.d.e(cWA.d.this, valueAnimator, cwa, valueAnimator2);
                }
            });
            this.a = valueAnimator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(d dVar, ValueAnimator valueAnimator, cWA cwa, ValueAnimator valueAnimator2) {
            C8632dsu.c((Object) dVar, "");
            C8632dsu.c((Object) valueAnimator, "");
            C8632dsu.c((Object) cwa, "");
            C8632dsu.c((Object) valueAnimator2, "");
            Drawable drawable = dVar.c;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            drawable.setAlpha((int) (((Float) animatedValue).floatValue() * ((float) PrivateKeyType.INVALID)));
            cwa.getSheet().invalidate();
        }

        public final void e(boolean z, long j) {
            if (j <= 0) {
                if (z) {
                    this.a.setFloatValues(1.0f);
                    this.c.setAlpha(PrivateKeyType.INVALID);
                } else {
                    this.a.setFloatValues(0.0f);
                    this.c.setAlpha(0);
                }
                ViewGroup sheet = this.b.getSheet();
                if (sheet != null) {
                    sheet.invalidate();
                    return;
                }
                return;
            }
            this.a.setDuration(j);
            ValueAnimator valueAnimator = this.a;
            float[] fArr = new float[2];
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            fArr[0] = ((Float) animatedValue).floatValue();
            fArr[1] = z ? 1.0f : 0.0f;
            valueAnimator.setFloatValues(fArr);
            this.a.start();
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            this.d.setBounds(i, i2, i3, i4);
            this.c.setBounds(i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            C8632dsu.c((Object) canvas, "");
            cWA.e.getLogTag();
            if (this.c.getAlpha() != 255) {
                this.d.draw(canvas);
            }
            if (this.c.getAlpha() != 0) {
                this.c.draw(canvas);
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class c extends ColorDrawable {
        private final Drawable a;
        private final float b;
        private final ColorDrawable c;

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public c() {
            super(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
            this.c = new ColorDrawable(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
            Drawable drawable = ContextCompat.getDrawable(cWA.this.getContext(), cVP.d.b);
            C8632dsu.d(drawable);
            this.a = drawable;
            this.b = drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.a.setBounds(i, i4 - ((int) ((i3 - i) * this.b)), i3, i4);
            this.c.setBounds(i, i2, i3, this.a.getBounds().top);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            C8632dsu.c((Object) canvas, "");
            super.draw(canvas);
            this.c.draw(canvas);
            this.a.draw(canvas);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            super.setAlpha(i);
            this.c.setAlpha(i);
            this.a.setAlpha(i);
        }
    }

    private final void d(boolean z) {
        if (z) {
            if (this.c.getVisibility() == 0) {
                return;
            }
            if (!C8141del.a() && !NetflixApplication.v()) {
                this.c.g();
            }
            this.c.setVisibility(0);
        } else if (this.c.getVisibility() == 8) {
        } else {
            this.c.b();
            this.c.setVisibility(8);
        }
    }
}
