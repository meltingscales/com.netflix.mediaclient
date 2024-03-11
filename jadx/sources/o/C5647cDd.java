package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.template.ImageElement;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.SimpleElement;
import io.reactivex.Observable;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import o.C5650cDg;
import o.cIE;

/* renamed from: o.cDd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5647cDd extends cCV {
    private final ScaleAnimation a;
    private final LayoutTimer b;
    private C1204Sr c;
    private final FrameLayout e;

    @Override // o.AbstractC5649cDf
    public void b(int i) {
    }

    @Override // o.AbstractC5649cDf
    public void f() {
    }

    @Override // o.AbstractC5649cDf
    public void i() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5647cDd(Observable<C5651cDh> observable, InteractiveMoments interactiveMoments, Moment moment, FrameLayout frameLayout, LayoutTimer layoutTimer, Map<String, ? extends Style> map, Map<String, ? extends Image> map2, float f, InterfaceC9638uF interfaceC9638uF) {
        super(observable, interactiveMoments, moment, map, map2, f, interfaceC9638uF);
        NetflixImageView netflixImageView;
        ConstraintLayout constraintLayout;
        C5640cCx c5640cCx;
        C5640cCx c5640cCx2;
        C5640cCx c5640cCx3;
        C1204Sr c1204Sr;
        NetflixImageView netflixImageView2;
        NetflixImageView netflixImageView3;
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) frameLayout, "");
        C8632dsu.c((Object) layoutTimer, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) map2, "");
        C8632dsu.c((Object) interfaceC9638uF, "");
        this.e = frameLayout;
        this.b = layoutTimer;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setAnimationListener(new e(scaleAnimation, this));
        this.a = scaleAnimation;
        AbstractC5649cDf.a(this, frameLayout, layoutTimer, null, null, 12, null);
        LayoutTimer.TimerChildren children = layoutTimer.children();
        if (children != null) {
            ImageElement background = children.background();
            if (background != null && (netflixImageView3 = (NetflixImageView) frameLayout.findViewById(cIE.b.bV)) != null) {
                C8632dsu.d(netflixImageView3);
                C8632dsu.d(background);
                AbstractC5649cDf.a(this, netflixImageView3, background, null, null, 12, null);
            }
            ImageElement overlay = children.overlay();
            if (overlay != null && (netflixImageView2 = (NetflixImageView) frameLayout.findViewById(cIE.b.bX)) != null) {
                C8632dsu.d(overlay);
                AbstractC5649cDf.a(this, netflixImageView2, overlay, null, null, 12, null);
            }
            SimpleElement countdownLabel = children.countdownLabel();
            int i = 0;
            if (countdownLabel != null && (c1204Sr = (C1204Sr) frameLayout.findViewById(cIE.b.bU)) != null) {
                c1204Sr.setVisibility(0);
                this.c = c1204Sr;
                C8632dsu.d(countdownLabel);
                AbstractC5649cDf.a(this, c1204Sr, countdownLabel, null, null, 12, null);
            }
            LayoutTimer.TimerChildren.TimerBar fillContainer = children.fillContainer();
            if (fillContainer != null && (constraintLayout = (ConstraintLayout) frameLayout.findViewById(cIE.b.bT)) != null) {
                C8632dsu.d(constraintLayout);
                LayoutTimer.TimerChildren.TimerBar.TimerBarChildren children2 = fillContainer.children();
                ImageElement leftCap = children2.leftCap();
                ImageElement rightCap = children2.rightCap();
                ImageElement fill = children2.fill();
                C8632dsu.d(fillContainer);
                AbstractC5649cDf.a(this, constraintLayout, fillContainer, null, null, 12, null);
                if (leftCap != null && (c5640cCx3 = (C5640cCx) frameLayout.findViewById(cIE.b.bP)) != null) {
                    C8632dsu.d(c5640cCx3);
                    AbstractC5649cDf.a(this, c5640cCx3, leftCap, null, null, 12, null);
                    i = c5640cCx3.getLayoutParams().width;
                }
                if (rightCap != null && (c5640cCx2 = (C5640cCx) frameLayout.findViewById(cIE.b.bQ)) != null) {
                    C8632dsu.d(c5640cCx2);
                    AbstractC5649cDf.a(this, c5640cCx2, rightCap, null, null, 12, null);
                    i += c5640cCx2.getLayoutParams().width;
                }
                if (fill != null && (c5640cCx = (C5640cCx) frameLayout.findViewById(cIE.b.bR)) != null) {
                    C8632dsu.d(c5640cCx);
                    AbstractC5649cDf.a(this, c5640cCx, fill, null, null, 12, null);
                    if (c5640cCx.getLayoutParams().width + i > constraintLayout.getLayoutParams().width) {
                        c5640cCx.getLayoutParams().width = constraintLayout.getLayoutParams().width - i;
                    }
                }
            }
            ImageElement deviceIcon = children.deviceIcon();
            if (deviceIcon == null || (netflixImageView = (NetflixImageView) frameLayout.findViewById(cIE.b.bY)) == null) {
                return;
            }
            C8632dsu.d(deviceIcon);
            AbstractC5649cDf.a(this, netflixImageView, deviceIcon, null, null, 12, null);
        }
    }

    /* renamed from: o.cDd$e */
    /* loaded from: classes4.dex */
    public static final class e implements Animation.AnimationListener {
        final /* synthetic */ ScaleAnimation c;
        final /* synthetic */ C5647cDd d;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        e(ScaleAnimation scaleAnimation, C5647cDd c5647cDd) {
            this.c = scaleAnimation;
            this.d = c5647cDd;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.c.hasEnded()) {
                this.d.e(C5650cDg.d.d);
            }
        }
    }

    @Override // o.AbstractC5649cDf
    public void c(final long j) {
        if (Settings.Global.getFloat(this.e.getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            final View findViewById = this.e.findViewById(cIE.b.bR);
            if (findViewById != null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(findViewById.getWidth(), 0);
                cCM ccm = cCM.a;
                Context context = this.e.getContext();
                C8632dsu.a(context, "");
                ValueAnimator duration = ofInt.setDuration(ccm.d(context, j));
                final Integer maxSecondsForCountdown = this.b.maxSecondsForCountdown();
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.b = maxSecondsForCountdown != null ? maxSecondsForCountdown.intValue() : 0;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cDc
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C5647cDd.e(findViewById, j, maxSecondsForCountdown, intRef, this, valueAnimator);
                    }
                });
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                duration.setInterpolator(cBZ.a.a());
                duration.addListener(new a(booleanRef, maxSecondsForCountdown, this, findViewById));
                a(duration);
                duration.start();
                return;
            }
            return;
        }
        View findViewById2 = this.e.findViewById(cIE.b.bT);
        if (findViewById2 != null) {
            this.a.setDuration(j);
            findViewById2.startAnimation(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, long j, Integer num, Ref.IntRef intRef, C5647cDd c5647cDd, ValueAnimator valueAnimator) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) intRef, "");
        C8632dsu.c((Object) c5647cDd, "");
        C8632dsu.c((Object) valueAnimator, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C8632dsu.d(animatedValue);
        layoutParams.width = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
        if (j <= 0 || num == null) {
            return;
        }
        int intValue = num.intValue() - ((int) ((valueAnimator.getCurrentPlayTime() * num.intValue()) / j));
        if (intRef.b != intValue) {
            intRef.b = intValue;
            c5647cDd.e(new C5650cDg.b(intValue));
        }
    }

    /* renamed from: o.cDd$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ Integer a;
        final /* synthetic */ C5647cDd c;
        final /* synthetic */ Ref.BooleanRef d;
        final /* synthetic */ View e;

        a(Ref.BooleanRef booleanRef, Integer num, C5647cDd c5647cDd, View view) {
            this.d = booleanRef;
            this.a = num;
            this.c = c5647cDd;
            this.e = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            AbstractC5649cDf.d.getLogTag();
            this.d.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            Integer num = this.a;
            if (num != null) {
                this.c.e(new C5650cDg.b(num.intValue()));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            if (this.d.a) {
                return;
            }
            AbstractC5649cDf.d.getLogTag();
            this.e.setVisibility(8);
            this.c.e(C5650cDg.d.d);
        }
    }

    @Override // o.AbstractC5649cDf
    public void f(int i) {
        C1204Sr c1204Sr = this.c;
        if (c1204Sr != null) {
            c1204Sr.setText(String.valueOf(i));
        }
    }
}
