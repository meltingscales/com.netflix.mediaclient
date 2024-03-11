package com.netflix.mediaclient.android.lottie.drawables;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import o.C8600drp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1107Oy;
import o.InterfaceC8598drn;
import o.OG;

/* loaded from: classes3.dex */
public final class PlayLoadingReplayDrawable extends OG<State> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayLoadingReplayDrawable() {
        /*
            r18 = this;
            o.Oy$a r8 = o.InterfaceC1107Oy.a
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r12 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.a
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r9 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.d
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r10 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.b
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 24
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            o.Oy r4 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = 0
            r6 = 20
            r1 = r12
            r2 = r9
            o.Oy r11 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            r4 = 0
            r6 = 24
            r1 = r9
            r2 = r10
            o.Oy r13 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r1 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.g
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r14 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.c
            r3 = 0
            r6 = 28
            r2 = r14
            o.Oy r15 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable$State r16 = com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.State.e
            r3 = 1
            r6 = 24
            r1 = r9
            r2 = r10
            o.Oy r4 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = 0
            r6 = 20
            r1 = r12
            r2 = r9
            o.Oy r4 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r14
            r2 = r16
            o.Oy r0 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            o.Oy[] r0 = new o.InterfaceC1107Oy[]{r11, r13, r15, r0}
            java.util.List r11 = o.C8570dqm.b(r0)
            java.lang.String r10 = "lottiefiles/play-loading-replay.json"
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 56
            r17 = 0
            r9 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.lottie.drawables.PlayLoadingReplayDrawable.<init>():void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class State implements InterfaceC1107Oy.c {
        private static final /* synthetic */ State[] h;
        private static final /* synthetic */ InterfaceC8598drn j;
        private final int f;
        private final Integer i;
        public static final State a = new State("IDLE", 0, 0, C9834xU.j.s);
        public static final State d = new State("LOADING_START", 1, 41, C9834xU.j.s);
        public static final State b = new State("LOADING_END", 2, 101, C9834xU.j.s);
        public static final State g = new State("REPLAY_START", 3, 102, C9834xU.j.s);
        public static final State c = new State("REPLAY_READY", 4, 142, C9834xU.j.s);
        public static final State e = new State("REPLAY_END", 5, 173, C9834xU.j.s);

        private static final /* synthetic */ State[] a() {
            return new State[]{a, d, b, g, c, e};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h.clone();
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.i;
        }

        private State(String str, int i, Integer num, int i2) {
            this.i = num;
            this.f = i2;
        }

        static {
            State[] a2 = a();
            h = a2;
            j = C8600drp.e(a2);
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            return AppCompatResources.getDrawable(context, this.f);
        }
    }
}
