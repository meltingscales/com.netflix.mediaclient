package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o.C5855cKw;
import o.C8632dsu;
import o.InterfaceC5846cKn;
import o.cNY;

/* loaded from: classes4.dex */
public final class cNY implements InterfaceC5846cKn {
    public static final int b;
    private static boolean e;
    private static WeakReference<AnimatedVectorDrawableCompat> f;
    private static boolean h;
    private static ValueAnimator i;
    private static boolean j;
    private static int k;
    private static InterfaceC5846cKn.a l;
    private static String n;

    /* renamed from: o  reason: collision with root package name */
    private static long f13685o;
    public static final cNY a = new cNY();
    private static Set<MediaPlayer> d = new LinkedHashSet();
    private static float c = 1.0f;
    private static final Set<WeakReference<d>> g = new LinkedHashSet();

    /* loaded from: classes4.dex */
    public interface d {
        void c(float f);
    }

    private final void d(String str) {
        h = true;
        n = str;
    }

    public final String a() {
        return n;
    }

    public final long b() {
        return f13685o;
    }

    private cNY() {
    }

    static {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cOc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cNY.d(valueAnimator);
            }
        });
        C8632dsu.d(ofFloat);
        ofFloat.addListener(new a());
        i = ofFloat;
        j = true;
        b = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ValueAnimator valueAnimator) {
        C8632dsu.c((Object) valueAnimator, "");
        cNY cny = a;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        cny.e(((Float) animatedValue).floatValue());
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        d(str);
        f13685o = System.currentTimeMillis();
    }

    public final void c(boolean z) {
        synchronized (this) {
            k += z ? 1 : -1;
        }
    }

    public final AnimatedVectorDrawableCompat c() {
        WeakReference<AnimatedVectorDrawableCompat> weakReference = f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final boolean j() {
        boolean z;
        synchronized (this) {
            if (h) {
                z = k > 0;
            }
        }
        return z;
    }

    public final void e() {
        h = false;
        InterfaceC5846cKn.a aVar = l;
        if (aVar != null) {
            aVar.c();
        }
    }

    private final boolean d() {
        return C8153dex.G() || e;
    }

    @Override // o.InterfaceC5846cKn
    public InterfaceC5847cKo d(ViewGroup viewGroup, View view, boolean z, String str, drO<dpR> dro) {
        InterfaceC5846cKn.a aVar;
        C8632dsu.c((Object) dro, "");
        e = z;
        if (!d() || viewGroup == null || str == null) {
            return null;
        }
        Activity activity = (Activity) C9737vz.b(viewGroup.getContext(), Activity.class);
        if (activity != null && (aVar = l) != null) {
            aVar.d(activity);
        }
        C5946cOf c5946cOf = new C5946cOf(viewGroup, z);
        cNY cny = a;
        Context context = viewGroup.getContext();
        C8632dsu.a(context, "");
        AnimatedVectorDrawableCompat c2 = cny.c(context, z);
        if (c2 != null) {
            c2.registerAnimationCallback(new b(c2));
            f = new WeakReference<>(c2);
        }
        c5946cOf.c(viewGroup, view, str, dro);
        return c5946cOf;
    }

    /* loaded from: classes4.dex */
    public static final class b extends Animatable2Compat.AnimationCallback {
        final /* synthetic */ AnimatedVectorDrawableCompat b;

        b(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.b = animatedVectorDrawableCompat;
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            cNY cny = cNY.a;
            Drawable.Callback callback = this.b.getCallback();
            final View view = callback instanceof View ? (View) callback : null;
            if (view != null) {
                final AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.b;
                if (view.isAttachedToWindow()) {
                    Context context = view.getContext();
                    C8632dsu.a(context, "");
                    if (C9737vz.d(context)) {
                        return;
                    }
                    try {
                        animatedVectorDrawableCompat.start();
                        C8187dfe.c(new Runnable() { // from class: o.cOe
                            @Override // java.lang.Runnable
                            public final void run() {
                                cNY.b.e(AnimatedVectorDrawableCompat.this, view);
                            }
                        });
                    } catch (NullPointerException e) {
                        C1044Mm.j("ProfileSplashImpl", "Caught", e);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AnimatedVectorDrawableCompat animatedVectorDrawableCompat, View view) {
            C8632dsu.c((Object) animatedVectorDrawableCompat, "");
            C8632dsu.c((Object) view, "");
            cNY cny = cNY.a;
            animatedVectorDrawableCompat.start();
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            Drawable.Callback callback = this.b.getCallback();
            if (callback instanceof View) {
                View view = (View) callback;
            }
            cNY cny = cNY.a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cNY cny = cNY.a;
            cNY.c = 1.0f;
        }
    }

    public final void e(boolean z) {
        if (!i.isStarted()) {
            if (z) {
                i.setFloatValues(0.0f, 1.0f);
            } else {
                i.setFloatValues(1.0f, 0.0f);
            }
            i.start();
        } else if (z != j) {
            i.reverse();
        }
        j = z;
    }

    public final void d(d dVar) {
        C8632dsu.c((Object) dVar, "");
        g.add(new WeakReference<>(dVar));
        dVar.c(c);
    }

    public final void a(final d dVar) {
        C8632dsu.c((Object) dVar, "");
        C8571dqn.e(g, new drM<WeakReference<d>, Boolean>() { // from class: com.netflix.mediaclient.ui.profiles.ProfileSplashImpl$removeListenerForProgressAlphaChange$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final Boolean invoke(WeakReference<cNY.d> weakReference) {
                C8632dsu.c((Object) weakReference, "");
                return Boolean.valueOf(C8632dsu.c(weakReference.get(), cNY.d.this));
            }
        });
    }

    private final void e(float f2) {
        c = f2;
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((WeakReference) it.next()).get();
            if (dVar != null) {
                dVar.c(f2);
            }
        }
    }

    private final AnimatedVectorDrawableCompat c(Context context, boolean z) {
        int i2;
        if (z) {
            i2 = C8153dex.C() ? C5855cKw.e.b : C5855cKw.e.e;
        } else {
            i2 = C5855cKw.e.d;
        }
        return AnimatedVectorDrawableCompat.create(context, i2);
    }

    @Override // o.InterfaceC5846cKn
    public InterfaceC5847cKo a(ViewGroup viewGroup, boolean z) {
        InterfaceC5846cKn.a aVar;
        if (viewGroup == null || !j()) {
            return null;
        }
        Activity activity = (Activity) C9737vz.b(viewGroup.getContext(), Activity.class);
        if (activity != null && (aVar = l) != null) {
            aVar.c(activity);
        }
        C5946cOf c5946cOf = new C5946cOf(viewGroup, e);
        c5946cOf.d(viewGroup, z);
        return c5946cOf;
    }

    public final void b(int i2) {
        C1332Xp c1332Xp = C1332Xp.b;
        final MediaPlayer create = MediaPlayer.create((Context) C1332Xp.b(Context.class), i2);
        if (create != null) {
            d.add(create);
            create.start();
            create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.cOd
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    cNY.c(create, mediaPlayer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        C8632dsu.c((Object) mediaPlayer, "");
        mediaPlayer.release();
        d.remove(mediaPlayer);
    }
}
