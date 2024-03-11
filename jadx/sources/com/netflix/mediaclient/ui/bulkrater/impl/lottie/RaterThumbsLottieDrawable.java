package com.netflix.mediaclient.ui.bulkrater.impl.lottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import o.C5437byj;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC1107Oy;
import o.InterfaceC8598drn;
import o.OG;

/* loaded from: classes4.dex */
public final class RaterThumbsLottieDrawable extends OG<State> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RaterThumbsLottieDrawable() {
        /*
            r18 = this;
            o.Oy$a r8 = o.InterfaceC1107Oy.a
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable$State r12 = com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.State.d
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable$State r9 = com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.State.c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r1 = r12
            r2 = r9
            o.Oy r10 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable$State r11 = com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.State.b
            com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable$State r13 = com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.State.a
            r0 = 0
            r14 = 2
            o.Oy r4 = o.InterfaceC1107Oy.a.d(r8, r9, r0, r14, r0)
            r6 = 20
            r0 = r8
            r1 = r11
            r2 = r13
            o.Oy r4 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r9
            r2 = r11
            o.Oy r9 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r4 = 0
            r6 = 28
            r1 = r11
            r2 = r13
            o.Oy r0 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = 3
            o.Oy[] r1 = new o.InterfaceC1107Oy[r1]
            r2 = 0
            r1[r2] = r10
            r2 = 1
            r1[r2] = r9
            r1[r14] = r0
            java.util.List r11 = o.C8570dqm.b(r1)
            java.lang.String r10 = "lottiefiles/thumbs_up.json"
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 56
            r17 = 0
            r9 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.bulkrater.impl.lottie.RaterThumbsLottieDrawable.<init>():void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class State implements InterfaceC1107Oy.c {
        private static final /* synthetic */ InterfaceC8598drn e;
        private static final /* synthetic */ State[] h;
        private final Integer f;
        private final int g;
        public static final State d = new State("START", 0, 0, C5437byj.e.d);
        public static final State c = new State("NEUTRAL", 1, 44, C5437byj.e.d);
        public static final State b = new State("SELECTED", 2, 72, C5437byj.e.c);
        public static final State a = new State("OUT", 3, 88, C5437byj.e.c);

        private static final /* synthetic */ State[] c() {
            return new State[]{d, c, b, a};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) h.clone();
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.f;
        }

        private State(String str, int i, Integer num, int i2) {
            this.f = num;
            this.g = i2;
        }

        static {
            State[] c2 = c();
            h = c2;
            e = C8600drp.e(c2);
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            return context.getDrawable(this.g);
        }
    }
}
