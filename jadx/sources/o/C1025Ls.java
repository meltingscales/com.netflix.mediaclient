package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;

/* renamed from: o.Ls  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1025Ls {
    public static final C1025Ls c = new C1025Ls();

    private C1025Ls() {
    }

    /* renamed from: o.Ls$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final int e = 0;
        private final MutableState a;
        private final MutableState b;
        private final MutableState c;
        private final MutableState d;
        private final MutableState f;
        private final MutableState g;
        private final MutableState h;
        private final MutableState i;
        private final MutableState j;
        private final MutableState k;
        private final MutableState l;
        private final MutableState m;
        private final MutableState n;

        /* renamed from: o  reason: collision with root package name */
        private final MutableState f13368o;

        public /* synthetic */ c(Theme theme, float f, float f2, float f3, float f4, float f5, b bVar, float f6, duI dui, float f7, float f8, float f9, float f10, C8627dsp c8627dsp) {
            this(theme, f, f2, f3, f4, f5, bVar, f6, dui, f7, f8, f9, f10);
        }

        private c(Theme theme, float f, float f2, float f3, float f4, float f5, b bVar, float f6, duI dui, float f7, float f8, float f9, float f10) {
            MutableState mutableStateOf$default;
            MutableState mutableStateOf$default2;
            MutableState mutableStateOf$default3;
            MutableState mutableStateOf$default4;
            MutableState mutableStateOf$default5;
            MutableState mutableStateOf$default6;
            MutableState mutableStateOf$default7;
            MutableState mutableStateOf$default8;
            MutableState mutableStateOf$default9;
            MutableState mutableStateOf$default10;
            MutableState mutableStateOf$default11;
            MutableState mutableStateOf$default12;
            MutableState mutableStateOf$default13;
            MutableState mutableStateOf$default14;
            C8632dsu.c((Object) theme, "");
            C8632dsu.c((Object) bVar, "");
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1284boximpl(LA.d(Token.Color.iF.c, theme)), null, 2, null);
            this.a = mutableStateOf$default;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(theme, null, 2, null);
            this.g = mutableStateOf$default2;
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f), null, 2, null);
            this.d = mutableStateOf$default3;
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f2), null, 2, null);
            this.l = mutableStateOf$default4;
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f3), null, 2, null);
            this.h = mutableStateOf$default5;
            mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f5), null, 2, null);
            this.c = mutableStateOf$default6;
            mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f4), null, 2, null);
            this.b = mutableStateOf$default7;
            mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f6), null, 2, null);
            this.j = mutableStateOf$default8;
            mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bVar, null, 2, null);
            this.f = mutableStateOf$default9;
            mutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(dui, null, 2, null);
            this.i = mutableStateOf$default10;
            mutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f7), null, 2, null);
            this.m = mutableStateOf$default11;
            mutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f8), null, 2, null);
            this.n = mutableStateOf$default12;
            mutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f9), null, 2, null);
            this.k = mutableStateOf$default13;
            mutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.unit.Dp.m2490boximpl(f10), null, 2, null);
            this.f13368o = mutableStateOf$default14;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ c(com.netflix.hawkins.consumer.tokens.Theme r18, float r19, float r20, float r21, float r22, float r23, o.C1025Ls.b r24, float r25, o.duI r26, float r27, float r28, float r29, float r30, int r31, o.C8627dsp r32) {
            /*
                r17 = this;
                r0 = r31
                r1 = r0 & 2
                if (r1 == 0) goto Lc
                float r1 = o.C1021Lo.d()
                r4 = r1
                goto Le
            Lc:
                r4 = r19
            Le:
                r1 = r0 & 4
                if (r1 == 0) goto L18
                float r1 = o.C1021Lo.f()
                r5 = r1
                goto L1a
            L18:
                r5 = r20
            L1a:
                r1 = r0 & 8
                if (r1 == 0) goto L24
                float r1 = o.C1021Lo.b()
                r6 = r1
                goto L26
            L24:
                r6 = r21
            L26:
                r1 = r0 & 16
                if (r1 == 0) goto L30
                float r1 = o.C1021Lo.a()
                r7 = r1
                goto L32
            L30:
                r7 = r22
            L32:
                r1 = r0 & 32
                if (r1 == 0) goto L3c
                float r1 = o.C1021Lo.c()
                r8 = r1
                goto L3e
            L3c:
                r8 = r23
            L3e:
                r1 = r0 & 64
                if (r1 == 0) goto L48
                o.Ls$b$h r1 = o.C1021Lo.j()
                r9 = r1
                goto L4a
            L48:
                r9 = r24
            L4a:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L54
                float r1 = o.C1021Lo.e()
                r10 = r1
                goto L56
            L54:
                r10 = r25
            L56:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L5d
                r1 = 0
                r11 = r1
                goto L5f
            L5d:
                r11 = r26
            L5f:
                r1 = r0 & 512(0x200, float:7.175E-43)
                r2 = 0
                if (r1 == 0) goto L6b
                float r1 = (float) r2
                float r1 = androidx.compose.ui.unit.Dp.m2492constructorimpl(r1)
                r12 = r1
                goto L6d
            L6b:
                r12 = r27
            L6d:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L78
                float r1 = (float) r2
                float r1 = androidx.compose.ui.unit.Dp.m2492constructorimpl(r1)
                r13 = r1
                goto L7a
            L78:
                r13 = r28
            L7a:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L85
                float r1 = (float) r2
                float r1 = androidx.compose.ui.unit.Dp.m2492constructorimpl(r1)
                r14 = r1
                goto L87
            L85:
                r14 = r29
            L87:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L92
                float r0 = (float) r2
                float r0 = androidx.compose.ui.unit.Dp.m2492constructorimpl(r0)
                r15 = r0
                goto L94
            L92:
                r15 = r30
            L94:
                r16 = 0
                r2 = r17
                r3 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1025Ls.c.<init>(com.netflix.hawkins.consumer.tokens.Theme, float, float, float, float, float, o.Ls$b, float, o.duI, float, float, float, float, int, o.dsp):void");
        }

        public final long d() {
            return ((Color) this.a.getValue()).m1302unboximpl();
        }

        public final Theme h() {
            return (Theme) this.g.getValue();
        }

        public final float a() {
            return ((androidx.compose.ui.unit.Dp) this.d.getValue()).m2498unboximpl();
        }

        public final float i() {
            return ((androidx.compose.ui.unit.Dp) this.l.getValue()).m2498unboximpl();
        }

        public final float g() {
            return ((androidx.compose.ui.unit.Dp) this.h.getValue()).m2498unboximpl();
        }

        public final float b() {
            return ((androidx.compose.ui.unit.Dp) this.c.getValue()).m2498unboximpl();
        }

        public final float c() {
            return ((androidx.compose.ui.unit.Dp) this.b.getValue()).m2498unboximpl();
        }

        public final float f() {
            return ((androidx.compose.ui.unit.Dp) this.j.getValue()).m2498unboximpl();
        }

        public final b j() {
            return (b) this.f.getValue();
        }

        public final duI e() {
            return (duI) this.i.getValue();
        }

        public final float l() {
            return ((androidx.compose.ui.unit.Dp) this.m.getValue()).m2498unboximpl();
        }

        public final float n() {
            return ((androidx.compose.ui.unit.Dp) this.n.getValue()).m2498unboximpl();
        }

        public final float k() {
            return ((androidx.compose.ui.unit.Dp) this.k.getValue()).m2498unboximpl();
        }

        public final float m() {
            return ((androidx.compose.ui.unit.Dp) this.f13368o.getValue()).m2498unboximpl();
        }
    }

    public final c e(Theme theme, float f, float f2, float f3, float f4, float f5, b bVar, float f6, duI dui, Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        b.h hVar;
        float f12;
        float f13;
        b.h hVar2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        composer.startReplaceableGroup(1027770667);
        Theme theme2 = (i2 & 1) != 0 ? (Theme) composer.consume(LC.e()) : theme;
        if ((i2 & 2) != 0) {
            f18 = C1021Lo.b;
            f7 = f18;
        } else {
            f7 = f;
        }
        if ((i2 & 4) != 0) {
            f17 = C1021Lo.j;
            f8 = f17;
        } else {
            f8 = f2;
        }
        if ((i2 & 8) != 0) {
            f16 = C1021Lo.a;
            f9 = f16;
        } else {
            f9 = f3;
        }
        if ((i2 & 16) != 0) {
            f15 = C1021Lo.c;
            f10 = f15;
        } else {
            f10 = f4;
        }
        if ((i2 & 32) != 0) {
            f14 = C1021Lo.e;
            f11 = f14;
        } else {
            f11 = f5;
        }
        if ((i2 & 64) != 0) {
            hVar2 = C1021Lo.f;
            hVar = hVar2;
        } else {
            hVar = bVar;
        }
        if ((i2 & 128) != 0) {
            f13 = C1021Lo.d;
            f12 = f13;
        } else {
            f12 = f6;
        }
        duI dui2 = (i2 & JSONzip.end) != 0 ? null : dui;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1027770667, i, -1, "com.netflix.hawkins.consumer.component.tooltip.HawkinsTooltip.rememberHawkinsTooltipStyle (HawkinsTooltipPopUp.kt:242)");
        }
        composer.startReplaceableGroup(-1026407729);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c(theme2, f7, f8, f9, f11, f10, hVar, f12, dui2, 0.0f, 0.0f, 0.0f, 0.0f, 7680, null);
            composer.updateRememberedValue(rememberedValue);
        }
        c cVar = (c) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cVar;
    }

    /* renamed from: o.Ls$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public String toString() {
            String b = dsA.a(getClass()).b();
            return b == null ? "" : b;
        }

        /* renamed from: o.Ls$b$h */
        /* loaded from: classes3.dex */
        public static final class h extends b {
            public static final h c = new h();

            private h() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$i */
        /* loaded from: classes3.dex */
        public static final class i extends b {
            public static final i b = new i();

            private i() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$f */
        /* loaded from: classes3.dex */
        public static final class f extends b {
            public static final f e = new f();

            private f() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$e */
        /* loaded from: classes3.dex */
        public static final class e extends b {
            public static final e b = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$d */
        /* loaded from: classes3.dex */
        public static final class d extends b {
            public static final d e = new d();

            private d() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$c */
        /* loaded from: classes3.dex */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0087b extends b {
            public static final C0087b b = new C0087b();

            private C0087b() {
                super(null);
            }
        }

        /* renamed from: o.Ls$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super(null);
            }
        }
    }
}
