package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: o.eW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8850eW extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> d = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> c = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> e = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.d.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.c.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.e.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.e.remove(animatorPauseListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (Animator.AnimatorListener animatorListener : this.c) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        for (Animator.AnimatorListener animatorListener : this.c) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.d) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.e) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.e) {
            animatorPauseListener.onAnimationResume(this);
        }
    }
}
