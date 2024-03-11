package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.SP;
import o.cII;
import o.cJO;

/* loaded from: classes4.dex */
public final class cJO extends ConstraintLayout {
    public static final b a = new b(null);
    public static final int e = 8;
    private boolean b;
    private InterfaceC8613dsb<? super Integer, ? super Integer, ? super Boolean, ? super Boolean, dpR> c;
    private ImageView d;
    private InterfaceC8612dsa<? super Integer, ? super Integer, ? super Boolean, dpR> f;
    private InterfaceC8613dsb<? super Integer, ? super Integer, ? super Boolean, ? super Boolean, dpR> g;
    private SP j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cJO(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cJO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final boolean a() {
        return this.b;
    }

    public final InterfaceC8612dsa<Integer, Integer, Boolean, dpR> b() {
        return this.f;
    }

    public final InterfaceC8613dsb<Integer, Integer, Boolean, Boolean, dpR> d() {
        return this.g;
    }

    public final InterfaceC8613dsb<Integer, Integer, Boolean, Boolean, dpR> e() {
        return this.c;
    }

    public final void setCanPerformHapticFeedback(boolean z) {
        this.b = z;
    }

    public final void setOnIntendSeekFinal(InterfaceC8613dsb<? super Integer, ? super Integer, ? super Boolean, ? super Boolean, dpR> interfaceC8613dsb) {
        this.c = interfaceC8613dsb;
    }

    public final void setOnIntendSeekProgress(InterfaceC8613dsb<? super Integer, ? super Integer, ? super Boolean, ? super Boolean, dpR> interfaceC8613dsb) {
        this.g = interfaceC8613dsb;
    }

    public final void setOnIntendSeekStart(InterfaceC8612dsa<? super Integer, ? super Integer, ? super Boolean, dpR> interfaceC8612dsa) {
        this.f = interfaceC8612dsa;
    }

    public /* synthetic */ cJO(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cJO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PlayerSeekbarLegacy");
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.j = (SP) findViewById(cII.a.b);
        this.d = (ImageView) findViewById(cII.a.e);
        c cVar = new c();
        SP sp = this.j;
        if (sp != null) {
            sp.setOnSeekBarChangeListener(cVar);
        }
        SP sp2 = this.j;
        if (sp2 != null) {
            sp2.setUglySeekBarListener(new d(cVar));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements SP.b {
        final /* synthetic */ c c;

        d(c cVar) {
            this.c = cVar;
        }

        @Override // o.SP.b
        public boolean c(SeekBar seekBar, MotionEvent motionEvent, int i) {
            C8632dsu.c((Object) seekBar, "");
            C8632dsu.c((Object) motionEvent, "");
            return this.c.c(seekBar, motionEvent, i);
        }
    }

    public final void setSeekbarProgress(int i) {
        SP sp = this.j;
        if (sp == null) {
            return;
        }
        sp.setProgress(i);
    }

    public final void setSeekbarDuration(int i) {
        SP sp = this.j;
        if (sp == null) {
            return;
        }
        sp.setMax(i);
    }

    public final int e(int i) {
        SP sp = this.j;
        if (sp != null) {
            return (int) sp.e(i);
        }
        return 0;
    }

    public final void c(boolean z) {
        ImageView imageView = this.d;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void e(boolean z) {
        SP sp = this.j;
        if (sp != null) {
            sp.e(!z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        SP sp = this.j;
        if (sp == null) {
            return;
        }
        sp.setEnabled(z);
    }

    public final void a(int i) {
        ImageView imageView = this.d;
        SP sp = this.j;
        if (imageView == null || sp == null) {
            return;
        }
        imageView.setTranslationX(sp.e(i) - (imageView.getMeasuredWidth() / 2));
    }

    /* loaded from: classes4.dex */
    public final class c implements SeekBar.OnSeekBarChangeListener, SR {
        private int a;
        private int b;
        private boolean c;
        private boolean e = true;

        private final int e() {
            return this.a;
        }

        private final boolean e(float f) {
            return f < -300.0f || f > 300.0f;
        }

        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8632dsu.c((Object) seekBar, "");
            if (z) {
                this.a = i;
                if (Math.abs(seekBar.getProgress() - e()) <= this.b) {
                    if (this.e) {
                        this.e = false;
                    } else if (cJO.this.a()) {
                        seekBar.performHapticFeedback(1);
                    }
                }
                boolean z2 = seekBar.getProgress() >= e();
                cJO.this.a(i);
                InterfaceC8613dsb<Integer, Integer, Boolean, Boolean, dpR> d = cJO.this.d();
                if (d != null) {
                    d.invoke(Integer.valueOf(e()), Integer.valueOf(cJO.this.e(e())), Boolean.valueOf(z2), Boolean.valueOf(e() == seekBar.getMax()));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            synchronized (this) {
                C8632dsu.c((Object) seekBar, "");
                boolean z = true;
                this.e = true;
                this.b = (int) (seekBar.getMax() * 0.003d);
                this.a = seekBar.getProgress();
                InterfaceC8612dsa<Integer, Integer, Boolean, dpR> b2 = cJO.this.b();
                if (b2 != null) {
                    int e = e();
                    int e2 = cJO.this.e(e());
                    if (e() != seekBar.getMax()) {
                        z = false;
                    }
                    b2.invoke(Integer.valueOf(e), Integer.valueOf(e2), Boolean.valueOf(z));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Map d;
            Map k;
            Throwable th;
            synchronized (this) {
                if (!(seekBar instanceof SP)) {
                    b bVar = cJO.a;
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("PlayerFragment got not a Netflix seekbar!", null, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b2);
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
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                    return;
                }
                int e = e();
                int progress = ((SP) seekBar).getProgress();
                if (!this.c) {
                    e = c(e());
                    this.a = 0;
                }
                ((SP) seekBar).setProgress(e);
                InterfaceC8613dsb<Integer, Integer, Boolean, Boolean, dpR> e2 = cJO.this.e();
                if (e2 != null) {
                    e2.invoke(Integer.valueOf(e), Integer.valueOf(progress), Boolean.FALSE, Boolean.TRUE);
                }
            }
        }

        private final int c(int i) {
            int i2 = (i / 10000) * 10000;
            if (i2 == i) {
                cJO.a.getLogTag();
            } else {
                cJO.a.getLogTag();
            }
            return i2;
        }

        @Override // o.SR
        public boolean c(SeekBar seekBar, MotionEvent motionEvent, int i) {
            C8632dsu.c((Object) seekBar, "");
            C8632dsu.c((Object) motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.c = false;
                cJO.this.getParent().requestDisallowInterceptTouchEvent(true);
                onStartTrackingTouch(seekBar);
                onProgressChanged(seekBar, i, true);
                return true;
            } else if (action == 1) {
                cJO.this.getParent().requestDisallowInterceptTouchEvent(false);
                if (e(motionEvent.getY())) {
                    onProgressChanged(seekBar, seekBar.getProgress(), true);
                }
                onStopTrackingTouch(seekBar);
                return true;
            } else if (action != 2) {
                return false;
            } else {
                if (!e(motionEvent.getY())) {
                    onProgressChanged(seekBar, i, true);
                    this.c = false;
                } else if (!this.c) {
                    a(seekBar, seekBar.getProgress());
                    this.c = true;
                }
                return true;
            }
        }

        private final void a(final SeekBar seekBar, final int i) {
            d(i, new Runnable() { // from class: o.cJL
                @Override // java.lang.Runnable
                public final void run() {
                    cJO.c.a(cJO.c.this, seekBar, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar, SeekBar seekBar, int i) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) seekBar, "");
            cVar.onProgressChanged(seekBar, i, true);
        }

        private final void d(int i, Runnable runnable) {
            final ImageView imageView = cJO.this.d;
            if (imageView == null) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(imageView.getTranslationX(), d(i));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cJP
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    cJO.c.e(imageView, valueAnimator);
                }
            });
            ofFloat.addListener(new b(imageView, runnable));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration(200L);
            ofFloat.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ImageView imageView, ValueAnimator valueAnimator) {
            C8632dsu.c((Object) imageView, "");
            C8632dsu.c((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C8632dsu.d(animatedValue);
            imageView.setTranslationX(((Float) animatedValue).floatValue());
        }

        /* loaded from: classes4.dex */
        public static final class b implements Animator.AnimatorListener {
            final /* synthetic */ Runnable b;
            final /* synthetic */ ImageView d;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                C8632dsu.c((Object) animator, "");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                C8632dsu.c((Object) animator, "");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C8632dsu.c((Object) animator, "");
            }

            b(ImageView imageView, Runnable runnable) {
                this.d = imageView;
                this.b = runnable;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C8632dsu.c((Object) animator, "");
                this.d.post(this.b);
            }
        }

        private final int d(int i) {
            SP sp = cJO.this.j;
            if (sp == null) {
                return 0;
            }
            return ((int) sp.e(i)) + ((int) sp.getX());
        }
    }
}
