package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.netflix.mediaclient.android.lottie.drawables.PlayPauseDrawable;
import com.netflix.mediaclient.service.pushnotification.Payload;
import kotlin.NoWhenBranchMatchedException;
import o.C1045Mp;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9702vQ;
import o.C9834xU;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public final class PlayPauseButton extends AppCompatImageView {
    public static final e b = new e(null);
    public static final int d = 8;
    private final PlayPauseDrawable a;
    private ButtonState c;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonState.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayPauseButton(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayPauseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final ButtonState a() {
        return this.c;
    }

    public /* synthetic */ PlayPauseButton(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayPauseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable();
        this.a = playPauseDrawable;
        playPauseDrawable.setState((PlayPauseDrawable) PlayPauseDrawable.State.a);
        setImageDrawable(playPauseDrawable);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        C9702vQ.a(this);
        this.c = ButtonState.b;
    }

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlayPauseButton");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class ButtonState {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ ButtonState[] d;
        public static final ButtonState b = new ButtonState(Payload.Action.PLAY, 0);
        public static final ButtonState e = new ButtonState("PAUSE", 1);

        private static final /* synthetic */ ButtonState[] e() {
            return new ButtonState[]{b, e};
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) d.clone();
        }

        private ButtonState(String str, int i) {
        }

        static {
            ButtonState[] e2 = e();
            d = e2;
            c = C8600drp.e(e2);
        }
    }

    public final void setState(ButtonState buttonState) {
        String string;
        C8632dsu.c((Object) buttonState, "");
        int i = d.d[buttonState.ordinal()];
        if (i == 1) {
            b.getLogTag();
            this.a.animateToState(PlayPauseDrawable.State.a);
            string = getContext().getString(C9834xU.h.b);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            b.getLogTag();
            this.a.animateToState(PlayPauseDrawable.State.c);
            string = getContext().getString(C9834xU.h.a);
        }
        setContentDescription(string);
        this.c = buttonState;
    }

    public final void setStateImmediate(ButtonState buttonState) {
        PlayPauseDrawable.State state;
        C8632dsu.c((Object) buttonState, "");
        PlayPauseDrawable playPauseDrawable = this.a;
        if (buttonState == ButtonState.b) {
            setContentDescription(getContext().getString(C9834xU.h.b));
            state = PlayPauseDrawable.State.a;
        } else {
            setContentDescription(getContext().getString(C9834xU.h.a));
            state = PlayPauseDrawable.State.c;
        }
        playPauseDrawable.setState((PlayPauseDrawable) state);
    }
}
