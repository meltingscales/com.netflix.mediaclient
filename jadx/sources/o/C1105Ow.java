package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;
import o.InterfaceC1107Oy;

/* renamed from: o.Ow  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1105Ow extends OG<b> {
    public static final int $stable = 0;
    public static final c Companion = new c(null);
    private final b checked;
    private final b unchecked;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* renamed from: o.Ow$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CheckableLottieDrawable");
        }
    }

    public /* synthetic */ C1105Ow(String str, e eVar, e eVar2, int i, boolean z, int i2, C8627dsp c8627dsp) {
        this(str, eVar, eVar2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1105Ow(java.lang.String r16, o.C1105Ow.e r17, o.C1105Ow.e r18, int r19, boolean r20) {
        /*
            r15 = this;
            java.lang.String r0 = ""
            r2 = r16
            o.C8632dsu.c(r2, r0)
            r3 = r17
            o.C8632dsu.c(r3, r0)
            r4 = r18
            o.C8632dsu.c(r4, r0)
            o.Oy$a r0 = o.InterfaceC1107Oy.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            o.Ow$b r6 = new o.Ow$b
            int r5 = r17.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r7 = r17.b()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.<init>(r1, r5, r7)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            o.Ow$b r7 = new o.Ow$b
            int r5 = r18.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r8 = r18.b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.<init>(r13, r5, r8)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            r5 = r0
            o.Oy r14 = o.InterfaceC1107Oy.a.e(r5, r6, r7, r8, r9, r10, r11, r12)
            o.Ow$b r6 = new o.Ow$b
            int r5 = r18.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r7 = r18.b()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.<init>(r13, r5, r7)
            o.Ow$b r7 = new o.Ow$b
            int r5 = r17.a()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r8 = r17.b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.<init>(r1, r5, r8)
            r8 = 0
            r5 = r0
            o.Oy r0 = o.InterfaceC1107Oy.a.e(r5, r6, r7, r8, r9, r10, r11, r12)
            o.Oy[] r0 = new o.InterfaceC1107Oy[]{r14, r0}
            java.util.List r5 = o.C8570dqm.b(r0)
            r1 = r15
            r6 = r19
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1105Ow.<init>(java.lang.String, o.Ow$e, o.Ow$e, int, boolean):void");
    }

    public /* synthetic */ C1105Ow(String str, e eVar, e eVar2, List list, int i, boolean z, int i2, C8627dsp c8627dsp) {
        this(str, eVar, eVar2, list, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1105Ow(String str, e eVar, e eVar2, List<? extends InterfaceC1107Oy<b>> list, int i, boolean z) {
        super(str, list, new b(null, null, Integer.valueOf(eVar.b())), false, i, z, 8, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) eVar2, "");
        C8632dsu.c((Object) list, "");
        this.unchecked = new b(Boolean.FALSE, Integer.valueOf(eVar.a()), Integer.valueOf(eVar.b()));
        this.checked = new b(Boolean.TRUE, Integer.valueOf(eVar2.a()), Integer.valueOf(eVar2.b()));
    }

    /* renamed from: o.Ow$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC1107Oy.c {
        private final Boolean b;
        private final Integer d;
        private final Integer e;

        public final Integer a() {
            return this.d;
        }

        @Override // o.InterfaceC1107Oy.c
        public Integer e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.b, bVar.b) && C8632dsu.c(this.e, bVar.e) && C8632dsu.c(this.d, bVar.d);
            }
            return false;
        }

        public int hashCode() {
            Boolean bool = this.b;
            int hashCode = bool == null ? 0 : bool.hashCode();
            Integer num = this.e;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public b(Boolean bool, Integer num, Integer num2) {
            this.b = bool;
            this.e = num;
            this.d = num2;
        }

        @Override // o.InterfaceC1107Oy.c
        public Drawable b(Context context) {
            C8632dsu.c((Object) context, "");
            Integer num = this.d;
            if (num == null) {
                return null;
            }
            return context.getDrawable(num.intValue());
        }

        public String toString() {
            Boolean bool = this.b;
            return "CheckedState: " + bool;
        }
    }

    public final void reset() {
        setState((C1105Ow) new b(null, null, this.unchecked.a()));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean h;
        C8632dsu.c((Object) iArr, "");
        h = C8563dqf.h(iArr, 16842912);
        b bVar = h ? this.checked : this.unchecked;
        Companion.getLogTag();
        if (getAnimationLoaded()) {
            animateToState(bVar);
        } else {
            setState((C1105Ow) bVar);
        }
        return super.setState(iArr);
    }

    public final void setCheckedNoAnimation(boolean z) {
        setState((C1105Ow) (z ? this.checked : this.unchecked));
    }

    public final boolean isChecked() {
        return C8632dsu.c(getState(), this.checked);
    }

    public final boolean isSameDrawableType(Drawable drawable) {
        return (drawable instanceof C1105Ow) && C8632dsu.c(drawable.getClass(), getClass());
    }

    /* renamed from: o.Ow$e */
    /* loaded from: classes3.dex */
    public static final class e {
        private final int a;
        private final int d;

        public final int a() {
            return this.d;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.d == eVar.d && this.a == eVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.d) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            int i = this.d;
            int i2 = this.a;
            return "CheckFrameInfo(frame=" + i + ", drawableRes=" + i2 + ")";
        }

        public e(int i, int i2) {
            this.d = i;
            this.a = i2;
        }
    }
}
