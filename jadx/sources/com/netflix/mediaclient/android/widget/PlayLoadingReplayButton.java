package com.netflix.mediaclient.android.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable;
import com.netflix.mediaclient.android.widget.PlayLoadingReplayButton;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9702vQ;
import o.C9834xU;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public final class PlayLoadingReplayButton extends AppCompatImageView {
    private final ValueAnimator a;
    private final PlayLoadingReplayDrawable d;
    private d e;
    private String h;
    private ButtonState j;
    public static final c c = new c(null);
    public static final int b = 8;

    /* loaded from: classes6.dex */
    public interface d {
        void b(boolean z);
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonState.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonState.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayLoadingReplayButton(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayLoadingReplayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final d b() {
        return this.e;
    }

    public final void setListener(d dVar) {
        this.e = dVar;
    }

    public /* synthetic */ PlayLoadingReplayButton(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayLoadingReplayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        this.j = ButtonState.b;
        PlayLoadingReplayDrawable playLoadingReplayDrawable = new PlayLoadingReplayDrawable();
        this.d = playLoadingReplayDrawable;
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Sx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PlayLoadingReplayButton.d(valueAnimator, this, valueAnimator2);
            }
        });
        valueAnimator.addListener(new b(valueAnimator, this));
        valueAnimator.setDuration(getResources().getInteger(17694720));
        this.a = valueAnimator;
        playLoadingReplayDrawable.setState((PlayLoadingReplayDrawable) PlayLoadingReplayDrawable.State.a);
        c(this.j);
        setImageDrawable(playLoadingReplayDrawable);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        C9702vQ.a(this);
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayLoadingReplayButton");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ButtonState {
        private static final /* synthetic */ ButtonState[] h;
        private static final /* synthetic */ InterfaceC8598drn j;
        public static final ButtonState b = new ButtonState("IDLE", 0);
        public static final ButtonState a = new ButtonState("PLAYING", 1);
        public static final ButtonState e = new ButtonState("PAUSED", 2);
        public static final ButtonState d = new ButtonState("LOADING", 3);
        public static final ButtonState c = new ButtonState("REPLAY", 4);

        private static final /* synthetic */ ButtonState[] e() {
            return new ButtonState[]{b, a, e, d, c};
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) h.clone();
        }

        private ButtonState(String str, int i) {
        }

        static {
            ButtonState[] e2 = e();
            h = e2;
            j = C8600drp.e(e2);
        }
    }

    public final void setState(ButtonState buttonState) {
        C8632dsu.c((Object) buttonState, "");
        d(buttonState);
        this.j = buttonState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ValueAnimator valueAnimator, PlayLoadingReplayButton playLoadingReplayButton, ValueAnimator valueAnimator2) {
        C8632dsu.c((Object) valueAnimator, "");
        C8632dsu.c((Object) playLoadingReplayButton, "");
        C8632dsu.c((Object) valueAnimator2, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            playLoadingReplayButton.setAlpha(f.floatValue());
        }
    }

    public final void setPlayButtonIdleContentDescription(String str) {
        this.h = str;
        if (this.j != ButtonState.b || str == null || str.length() == 0) {
            return;
        }
        setContentDescription(str);
    }

    private final void c(ButtonState buttonState) {
        String string;
        int i = e.b[buttonState.ordinal()];
        if (i == 1) {
            String str = this.h;
            string = (str == null || str.length() == 0) ? getContext().getString(C9834xU.h.b) : this.h;
        } else if (i == 2) {
            string = getContext().getString(C9834xU.h.c);
        } else {
            string = i != 3 ? null : getContext().getString(C9834xU.h.e);
        }
        setContentDescription(string);
    }

    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ ValueAnimator b;
        final /* synthetic */ PlayLoadingReplayButton e;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b(ValueAnimator valueAnimator, PlayLoadingReplayButton playLoadingReplayButton) {
            this.b = valueAnimator;
            this.e = playLoadingReplayButton;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Object animatedValue = this.b.getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            if (f != null) {
                float floatValue = f.floatValue();
                d b = this.e.b();
                if (b != null) {
                    if (floatValue == 1.0f) {
                        b.b(true);
                    } else if (floatValue == 0.0f) {
                        b.b(false);
                    }
                }
                int i = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
                this.e.setVisibility((i == 0) ^ true ? 0 : 8);
                this.e.setClickable(!(i == 0));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.ButtonState r7) {
        /*
            r6 = this;
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$ButtonState r0 = r6.j
            if (r7 != r0) goto L5
            return
        L5:
            int[] r1 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.e.b
            int r2 = r7.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L5d
            if (r1 == r2) goto L49
            r5 = 3
            if (r1 == r5) goto L22
            r0 = 4
            if (r1 == r0) goto L1b
            goto L69
        L1b:
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$c r0 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.c
            r0.getLogTag()
            r0 = r4
            goto L6a
        L22:
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$c r1 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.c
            r1.getLogTag()
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$ButtonState r1 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.ButtonState.c
            if (r0 != r1) goto L3a
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.c
            r0.setState(r1)
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.e
            r0.animateToState(r1)
            goto L69
        L3a:
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.a
            r0.setState(r1)
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.d
            r0.animateToState(r1)
            goto L69
        L49:
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$c r0 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.c
            r0.getLogTag()
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.g
            r0.setState(r1)
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.c
            r0.animateToState(r1)
            goto L69
        L5d:
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$c r0 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.c
            r0.getLogTag()
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable r0 = r6.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.a
            r0.setState(r1)
        L69:
            r0 = r3
        L6a:
            r6.c(r7)
            if (r0 == 0) goto L80
            android.animation.ValueAnimator r7 = r6.a
            float r0 = r6.getAlpha()
            float[] r1 = new float[r2]
            r1[r3] = r0
            r0 = 0
            r1[r4] = r0
            r7.setFloatValues(r1)
            goto L9b
        L80:
            r6.setVisibility(r3)
            android.animation.ValueAnimator r7 = r6.a
            r0 = 0
            r7.setStartDelay(r0)
            android.animation.ValueAnimator r7 = r6.a
            float r0 = r6.getAlpha()
            float[] r1 = new float[r2]
            r1[r3] = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r4] = r0
            r7.setFloatValues(r1)
        L9b:
            android.animation.ValueAnimator r7 = r6.a
            r7.start()
            com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$c r7 = com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.c
            r7.getLogTag()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.widget.PlayLoadingReplayButton.d(com.netflix.mediaclient.android.widget.PlayLoadingReplayButton$ButtonState):void");
    }
}
