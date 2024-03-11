package o;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.netflix.mediaclient.util.ViewUtils;
import o.C9645uM;

/* renamed from: o.dgs  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8254dgs {
    public static void a(final ImageView imageView, Drawable drawable, final Bitmap bitmap) {
        Drawable[] drawableArr = new Drawable[2];
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        drawableArr[0] = drawable;
        drawableArr[1] = new BitmapDrawable(imageView.getResources(), bitmap);
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        imageView.setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition(150);
        Runnable runnable = (Runnable) imageView.getTag(C9645uM.c.d);
        if (runnable != null) {
            C8187dfe.e(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: o.dgs.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!C8054ddD.l(imageView.getContext()) && (imageView.getDrawable() instanceof TransitionDrawable)) {
                        TransitionDrawable transitionDrawable2 = (TransitionDrawable) imageView.getDrawable();
                        if (transitionDrawable2.getNumberOfLayers() > 1 && (transitionDrawable2.getDrawable(1) instanceof BitmapDrawable)) {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) transitionDrawable2.getDrawable(1);
                            if (bitmapDrawable.getBitmap() == bitmap) {
                                imageView.setImageDrawable(bitmapDrawable);
                            }
                        }
                    }
                } finally {
                    imageView.setTag(C9645uM.c.d, null);
                }
            }
        };
        imageView.setTag(C9645uM.c.d, runnable2);
        C8187dfe.a(runnable2, 150L);
    }

    public static void a(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            c(view, 1.0f, 0.0f, 75, new c(view));
        } else {
            view.setVisibility(8);
        }
    }

    public static void c(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 0 && C9913yu.a(view.getAlpha(), 1.0f)) {
            return;
        }
        view.animate().cancel();
        d(view, z);
    }

    public static void d(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            c(view, 0.0f, 1.0f, 150, new d(view));
            return;
        }
        view.animate().cancel();
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    private static void c(View view, float f, float f2, int i, Animator.AnimatorListener animatorListener) {
        view.setAlpha(f);
        view.animate().withLayer().alpha(f2).setDuration(i).setListener(animatorListener).start();
    }

    /* renamed from: o.dgs$c */
    /* loaded from: classes5.dex */
    public static class c implements Animator.AnimatorListener {
        private final View b;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public c(View view) {
            this.b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dgs$d */
    /* loaded from: classes5.dex */
    public static class d implements Animator.AnimatorListener {
        private final View e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        public d(View view) {
            this.e = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.e.setVisibility(0);
        }
    }

    public static ViewPropertyAnimator e(View view, boolean z) {
        return e(view, z, 300);
    }

    public static ViewPropertyAnimator e(final View view, final boolean z, int i) {
        final float f = z ? 1.0f : 0.0f;
        final ViewPropertyAnimator alpha = view.animate().alpha(f);
        alpha.setDuration(i).setInterpolator(new LinearInterpolator()).setListener(new Animator.AnimatorListener() { // from class: o.dgs.1
            private boolean b;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if ((!z && (view.getAlpha() < 1.0f || !view.isShown())) || (z && view.getAlpha() > 0.0f && view.isShown())) {
                    C1044Mm.j("AnimationUtils", "Skipping view appearance animation - view is already in correct state.");
                    ViewUtils.d(view, z);
                    alpha.cancel();
                    view.setAlpha(f);
                    return;
                }
                ViewUtils.d(view, true);
                this.b = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C1044Mm.b("AnimationUtils", "onAnimationEnd");
                if (this.b) {
                    return;
                }
                ViewUtils.d(view, z);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C1044Mm.a("AnimationUtils", "onAnimationCancel");
                this.b = true;
            }
        });
        alpha.start();
        return alpha;
    }
}
