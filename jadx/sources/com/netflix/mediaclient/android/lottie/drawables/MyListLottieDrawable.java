package com.netflix.mediaclient.android.lottie.drawables;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import o.C8600drp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1107Oy;
import o.InterfaceC8598drn;
import o.OG;

/* loaded from: classes3.dex */
public final class MyListLottieDrawable extends OG<State> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MyListLottieDrawable() {
        /*
            r12 = this;
            o.Oy$a r8 = o.InterfaceC1107Oy.a
            com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable$State r9 = com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable.State.d
            com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable$State r10 = com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable.State.e
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 28
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            o.Oy r11 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = r10
            r2 = r9
            o.Oy r0 = o.InterfaceC1107Oy.a.e(r0, r1, r2, r3, r4, r5, r6, r7)
            o.Oy[] r0 = new o.InterfaceC1107Oy[]{r11, r0}
            java.util.List r3 = o.C8570dqm.b(r0)
            com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable$State r4 = com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable.State.b
            java.lang.String r2 = "lottiefiles/my-list-plus-to-check.json"
            r6 = 0
            r7 = 0
            r8 = 56
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.lottie.drawables.MyListLottieDrawable.<init>():void");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class State implements InterfaceC1107Oy.c {
        private static final /* synthetic */ State[] a;
        private static final /* synthetic */ InterfaceC8598drn c;
        private final Integer g;
        private final Integer j;
        public static final State b = new State("UNKNOWN", 0, null, null);
        public static final State d = new State("PLUS", 1, 0, Integer.valueOf(C9834xU.j.f13919o));
        public static final State e = new State("CHECK", 2, 31, Integer.valueOf(C9834xU.j.k));

        private static final /* synthetic */ State[] b() {
            return new State[]{b, d, e};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) a.clone();
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.j;
        }

        private State(String str, int i, Integer num, Integer num2) {
            this.j = num;
            this.g = num2;
        }

        static {
            State[] b2 = b();
            a = b2;
            c = C8600drp.e(b2);
        }

        /* loaded from: classes3.dex */
        public static final class c extends ColorDrawable {
            final /* synthetic */ Drawable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Drawable drawable) {
                super(0);
                this.b = drawable;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicWidth() {
                Drawable drawable = this.b;
                if (drawable != null) {
                    return drawable.getIntrinsicWidth();
                }
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public int getIntrinsicHeight() {
                Drawable drawable = this.b;
                if (drawable != null) {
                    return drawable.getIntrinsicHeight();
                }
                return 0;
            }
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            Integer num = this.g;
            if (num == null) {
                return new c(e.b(context));
            }
            return context.getDrawable(num.intValue());
        }
    }
}
