package com.netflix.mediaclient.android.lottie.drawables;

import android.content.Context;
import android.graphics.drawable.Drawable;
import o.C8600drp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1107Oy;
import o.InterfaceC8598drn;
import o.OG;

/* loaded from: classes3.dex */
public class RaterThumbDownLottieDrawable extends OG<State> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RaterThumbDownLottieDrawable() {
        /*
            r18 = this;
            o.Oy$a r8 = o.InterfaceC1107Oy.a
            com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable$State r12 = com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable.State.a
            com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable$State r9 = com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable.State.c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r1 = r12
            r2 = r9
            o.Oy r10 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable$State r2 = com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable.State.e
            r0 = 0
            r1 = 2
            o.Oy r4 = o.InterfaceC1107Oy.a.d(r8, r12, r0, r1, r0)
            r6 = 20
            r0 = r8
            r1 = r9
            o.Oy r0 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            o.Oy[] r0 = new o.InterfaceC1107Oy[]{r10, r0}
            java.util.List r11 = o.C8570dqm.b(r0)
            java.lang.String r10 = "lottiefiles/rating_thumb_down.json"
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 56
            r17 = 0
            r9 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 1
            r1 = r18
            r1.enableMergePathsForKitKatAndAbove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.lottie.drawables.RaterThumbDownLottieDrawable.<init>():void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class State implements InterfaceC1107Oy.c {
        private static final /* synthetic */ State[] b;
        private static final /* synthetic */ InterfaceC8598drn d;
        private final int h;
        private final Integer i;
        public static final State a = new State("NEUTRAL", 0, 0, C9834xU.j.x);
        public static final State c = new State("SELECTED", 1, 17, C9834xU.j.y);
        public static final State e = new State("UNSELECTED", 2, 24, C9834xU.j.x);

        private static final /* synthetic */ State[] a() {
            return new State[]{a, c, e};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) b.clone();
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.i;
        }

        private State(String str, int i, Integer num, int i2) {
            this.i = num;
            this.h = i2;
        }

        static {
            State[] a2 = a();
            b = a2;
            d = C8600drp.e(a2);
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            return context.getDrawable(this.h);
        }
    }
}
