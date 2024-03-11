package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* renamed from: o.Sh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1194Sh extends AppCompatSeekBar {
    private static final int c;
    private Integer a;
    private final PointF b;
    private final ValueAnimator f;
    private boolean g;
    private boolean h;
    private SeekBar.OnSeekBarChangeListener i;
    private int j;
    public static final a e = new a(null);
    public static final int d = 8;

    /* renamed from: o.Sh$d */
    /* loaded from: classes3.dex */
    public interface d extends SeekBar.OnSeekBarChangeListener {

        /* renamed from: o.Sh$d$e */
        /* loaded from: classes6.dex */
        public static final class e {
            public static void c(d dVar, C1194Sh c1194Sh, int i) {
                C8632dsu.c((Object) c1194Sh, "");
            }
        }

        void d(C1194Sh c1194Sh, int i);

        void e(C1194Sh c1194Sh);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1194Sh(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1194Sh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.i = onSeekBarChangeListener;
    }

    public /* synthetic */ C1194Sh(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1194Sh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        this.b = new PointF();
        setSplitTrack(false);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Sj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C1194Sh.b(C1194Sh.this, valueAnimator2);
            }
        });
        valueAnimator.addListener(new b());
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        super.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: o.Sh.4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                C8632dsu.c((Object) seekBar, "");
                if (C1194Sh.this.g) {
                    return;
                }
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = C1194Sh.this.i;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar, i2, z);
                }
                Integer num = C1194Sh.this.a;
                if (num != null) {
                    C1194Sh c1194Sh = C1194Sh.this;
                    int intValue = num.intValue();
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = c1194Sh.i;
                    d dVar = onSeekBarChangeListener2 instanceof d ? (d) onSeekBarChangeListener2 : null;
                    if (dVar != null) {
                        dVar.d(c1194Sh, intValue);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                C8632dsu.c((Object) seekBar, "");
                C1194Sh.this.h = true;
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = C1194Sh.this.i;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener;
                C8632dsu.c((Object) seekBar, "");
                if (C1194Sh.this.g || (onSeekBarChangeListener = C1194Sh.this.i) == null) {
                    return;
                }
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        });
    }

    /* renamed from: o.Sh$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("NetflixCancellableSeekBar");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1194Sh c1194Sh, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) c1194Sh, "");
        C8632dsu.c((Object) valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        c1194Sh.setProgress(((Integer) animatedValue).intValue());
    }

    /* renamed from: o.Sh$b */
    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = C1194Sh.this.i;
            if (onSeekBarChangeListener != null) {
                C1194Sh c1194Sh = C1194Sh.this;
                onSeekBarChangeListener.onProgressChanged(c1194Sh, c1194Sh.getProgress(), true);
            }
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = C1194Sh.this.i;
            if (onSeekBarChangeListener2 != null) {
                onSeekBarChangeListener2.onStopTrackingTouch(C1194Sh.this);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8632dsu.c((Object) motionEvent, "");
        if (isEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.g = false;
                this.b.x = motionEvent.getX();
                this.b.y = motionEvent.getY();
                this.j = getProgress();
                this.h = false;
                this.a = Integer.valueOf((int) motionEvent.getX());
                return super.onTouchEvent(motionEvent);
            }
            if (action != 1) {
                if (action == 2) {
                    if (this.g || this.f.isRunning()) {
                        return false;
                    }
                    if (!this.h) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (Math.abs(Math.round(motionEvent.getY() - this.b.y)) > c) {
                        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.i;
                        d dVar = onSeekBarChangeListener instanceof d ? (d) onSeekBarChangeListener : null;
                        if (dVar != null) {
                            dVar.e(this);
                        }
                        this.g = true;
                        this.f.setIntValues(getProgress(), this.j);
                        this.f.start();
                        return false;
                    }
                    this.a = Integer.valueOf((int) motionEvent.getX());
                    return super.onTouchEvent(motionEvent);
                } else if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            if (!this.g) {
                return super.onTouchEvent(motionEvent);
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            setProgress(this.j);
            return onTouchEvent;
        }
        return false;
    }

    static {
        C1332Xp c1332Xp = C1332Xp.b;
        c = (int) TypedValue.applyDimension(1, 150, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
    }
}
