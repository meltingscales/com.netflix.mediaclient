package com.netflix.mediaclient.android.lottie.drawables;

import android.content.Context;
import android.graphics.drawable.Drawable;
import o.C8600drp;
import o.C8632dsu;
import o.InterfaceC1107Oy;
import o.InterfaceC8598drn;
import o.OG;

/* loaded from: classes3.dex */
public final class LiveNowDrawable extends OG<State> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LiveNowDrawable() {
        /*
            r11 = this;
            o.Oy$a r0 = o.InterfaceC1107Oy.a
            com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable$State r6 = com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable.State.e
            com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable$State r10 = com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable.State.b
            r3 = 1
            r4 = 0
            r5 = 0
            r1 = r6
            r2 = r10
            o.Oy r0 = r0.d(r1, r2, r3, r4, r5)
            java.util.List r3 = o.C8570dqm.c(r0)
            java.lang.String r2 = "lottiefiles/live_now.json"
            r5 = 1
            r0 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            r1 = r11
            r4 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = o.C8120deQ.a()
            if (r0 != 0) goto L2a
            r11.animateToState(r10)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.lottie.drawables.LiveNowDrawable.<init>():void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class State implements InterfaceC1107Oy.c {
        private static final /* synthetic */ InterfaceC8598drn c;
        private static final /* synthetic */ State[] d;
        private final Integer a;
        public static final State e = new State("START", 0, 0);
        public static final State b = new State("END", 1, 240);

        private static final /* synthetic */ State[] b() {
            return new State[]{e, b};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) d.clone();
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            return null;
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.a;
        }

        private State(String str, int i, Integer num) {
            this.a = num;
        }

        static {
            State[] b2 = b();
            d = b2;
            c = C8600drp.e(b2);
        }
    }
}
