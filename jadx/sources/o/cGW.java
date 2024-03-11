package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import java.util.List;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.SP;
import o.cBO;
import o.cGW;
import o.cIE;

/* loaded from: classes4.dex */
public class cGW extends AbstractC5765cHn implements cFV {
    public static final a d = new a(null);
    private final C1204Sr a;
    private final SP b;
    private final ImageView c;
    private final InterfaceC8554dpx e;
    private final ViewGroup g;

    @Override // o.cFV
    public void a(List<Long> list) {
        C8632dsu.c((Object) list, "");
    }

    public SP k() {
        return this.b;
    }

    @Override // o.AbstractC9944zY
    /* renamed from: l */
    public ViewGroup e() {
        return this.g;
    }

    public int m() {
        return cIE.c.O;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cGW(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        View e2 = C9703vR.e(viewGroup, m(), 0, 2, null);
        C8632dsu.d(e2);
        this.g = (ViewGroup) e2;
        View findViewById = e().findViewById(cIE.b.at);
        C8632dsu.a(findViewById, "");
        this.a = (C1204Sr) findViewById;
        View findViewById2 = e().findViewById(cIE.b.bS);
        C8632dsu.a(findViewById2, "");
        this.b = (SP) findViewById2;
        View findViewById3 = e().findViewById(cIE.b.p);
        C8632dsu.a(findViewById3, "");
        this.c = (ImageView) findViewById3;
        b2 = dpB.b(new drO<Integer>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.PlayerSeekbarUIView$containerId$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Integer invoke() {
                return Integer.valueOf(cGW.this.e().getId());
            }
        });
        this.e = b2;
        final e eVar = new e();
        k().setOnSeekBarChangeListener(eVar);
        k().setUglySeekBarListener(new SP.b() { // from class: o.cGW.5
            @Override // o.SP.b
            public boolean c(SeekBar seekBar, MotionEvent motionEvent, int i) {
                C8632dsu.c((Object) seekBar, "");
                C8632dsu.c((Object) motionEvent, "");
                return e.this.c(seekBar, motionEvent, i);
            }
        });
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.AbstractC5765cHn
    public int bI_() {
        return ((Number) this.e.getValue()).intValue();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        super.d();
        k().setEnabled(true);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        super.b();
        k().setEnabled(false);
    }

    @Override // o.cFV
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        this.a.setText(str);
    }

    @Override // o.cFV
    public void e(int i) {
        k().setMax(i);
    }

    @Override // o.cFV
    public void b(int i) {
        k().setProgress(i);
    }

    @Override // o.cFV
    public void a(int i) {
        k().setSecondaryProgress(i);
    }

    @Override // o.cFV
    public void j() {
        k().e(false);
    }

    @Override // o.cFV
    public void f() {
        k().e(true);
    }

    @Override // o.cFV
    public void i() {
        this.c.setVisibility(0);
    }

    @Override // o.cFV
    public void g() {
        this.c.setVisibility(8);
    }

    protected final int c(int i) {
        return ((int) k().e(i)) + ((int) k().getX());
    }

    @Override // o.cFV
    public void d(int i) {
        this.c.setTranslationX(k().e(i) - (this.c.getMeasuredWidth() / 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i, Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c.getTranslationX(), c(i));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cHd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cGW.e(cGW.this, valueAnimator);
            }
        });
        ofFloat.addListener(new b(runnable));
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cGW cgw, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) cgw, "");
        C8632dsu.c((Object) valueAnimator, "");
        ImageView imageView = cgw.c;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        imageView.setTranslationX(((Float) animatedValue).floatValue());
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ Runnable d;

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

        b(Runnable runnable) {
            this.d = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cGW.this.c.post(this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int h(int i) {
        return (i / 10000) * 10000;
    }

    public void b(int i, int i2, boolean z) {
        if (!z) {
            i = j(i);
        }
        b((cGW) new cBO.C5579o(i, c(i) + ((int) e().getX()), z));
    }

    private final int j(int i) {
        return this.b.getSecondaryProgress() <= 0 ? i : Math.min(i, this.b.getSecondaryProgress());
    }

    public void e(int i, int i2) {
        b((cGW) new cBO.C5582r(false, j(i), true, i2));
    }

    /* loaded from: classes4.dex */
    public final class e implements SeekBar.OnSeekBarChangeListener, SR {
        private boolean a;
        private int b;
        private int c;
        private boolean d = true;

        private final boolean b(float f) {
            return f < -300.0f || f > 300.0f;
        }

        public e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8632dsu.c((Object) seekBar, "");
            if (z) {
                this.c = i;
                if (Math.abs(seekBar.getProgress() - this.c) <= this.b) {
                    if (this.d) {
                        this.d = false;
                    } else {
                        seekBar.performHapticFeedback(1);
                    }
                }
                int progress = seekBar.getProgress();
                int i2 = this.c;
                boolean z2 = progress >= i2;
                cGW cgw = cGW.this;
                cgw.b(i2, cgw.c(i2) + ((int) cGW.this.e().getX()), z2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            synchronized (this) {
                C8632dsu.c((Object) seekBar, "");
                this.d = true;
                this.b = (int) (seekBar.getMax() * 0.003d);
                int progress = seekBar.getProgress();
                this.c = progress;
                cGW cgw = cGW.this;
                cgw.b((cGW) new cBO.C5577m(progress, cgw.c(progress)));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Map d;
            Map k;
            Throwable th;
            synchronized (this) {
                C8632dsu.c((Object) seekBar, "");
                if (!(seekBar instanceof SP)) {
                    C1044Mm.d("PlayerSeekbarUIView", "PlayerFragment got not a Netflix seekbar!");
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("PlayerFragment got not a Netflix seekbar!", null, null, false, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b);
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
                int progress = ((SP) seekBar).getProgress();
                int progress2 = ((SP) seekBar).getProgress();
                if (!this.a) {
                    progress = cGW.this.h(this.c);
                    this.c = 0;
                }
                ((SP) seekBar).setProgress(progress);
                cGW.this.e(progress, progress2);
            }
        }

        @Override // o.SR
        public boolean c(SeekBar seekBar, MotionEvent motionEvent, int i) {
            C8632dsu.c((Object) seekBar, "");
            C8632dsu.c((Object) motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.a = false;
                onStartTrackingTouch(seekBar);
                onProgressChanged(seekBar, i, true);
                return true;
            } else if (action == 1) {
                if (b(motionEvent.getY())) {
                    onProgressChanged(seekBar, seekBar.getProgress(), true);
                }
                b(seekBar);
                onStopTrackingTouch(seekBar);
                return true;
            } else if (action != 2) {
                return false;
            } else {
                if (!b(motionEvent.getY())) {
                    onProgressChanged(seekBar, i, true);
                    this.a = false;
                } else if (!this.a) {
                    b(seekBar, seekBar.getProgress());
                    this.a = true;
                }
                return true;
            }
        }

        private final void b(SeekBar seekBar) {
            CLv2Utils.INSTANCE.b(new Focus(AppView.trickplayScrubberThumb, null), seekBar.getProgress() >= this.c, false);
        }

        private final void b(final SeekBar seekBar, final int i) {
            cGW.this.c(i, new Runnable() { // from class: o.cHc
                @Override // java.lang.Runnable
                public final void run() {
                    cGW.e.c(cGW.e.this, seekBar, i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e eVar, SeekBar seekBar, int i) {
            C8632dsu.c((Object) eVar, "");
            C8632dsu.c((Object) seekBar, "");
            eVar.onProgressChanged(seekBar, i, true);
        }
    }
}
