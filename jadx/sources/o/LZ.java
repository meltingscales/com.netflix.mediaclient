package o;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* loaded from: classes3.dex */
public final class LZ {
    private final long A;
    private final long B;
    private final long C;
    private final long D;
    private final long E;
    private final long F;
    private final TextSelectionColors G;
    private final long H;
    private final long I;

    /* renamed from: J  reason: collision with root package name */
    private final long f13366J;
    private final long K;
    private final long L;
    private final long M;
    private final long N;
    private final long P;
    private final long Q;
    private final long S;
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13367o;
    private final long p;
    private final long q;
    private final long r;
    private final long s;
    private final long t;
    private final long u;
    private final long v;
    private final long w;
    private final long x;
    private final long y;
    private final long z;

    public /* synthetic */ LZ(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, textSelectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    private LZ(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        C8632dsu.c((Object) textSelectionColors, "");
        this.F = j;
        this.S = j2;
        this.g = j3;
        this.y = j4;
        this.x = j5;
        this.H = j6;
        this.e = j7;
        this.k = j8;
        this.c = j9;
        this.n = j10;
        this.G = textSelectionColors;
        this.w = j11;
        this.E = j12;
        this.d = j13;
        this.l = j14;
        this.z = j15;
        this.M = j16;
        this.a = j17;
        this.q = j18;
        this.I = j19;
        this.P = j20;
        this.m = j21;
        this.v = j22;
        this.u = j23;
        this.K = j24;
        this.b = j25;
        this.f13367o = j26;
        this.B = j27;
        this.N = j28;
        this.h = j29;
        this.s = j30;
        this.A = j31;
        this.Q = j32;
        this.f = j33;
        this.p = j34;
        this.D = j35;
        this.f13366J = j36;
        this.j = j37;
        this.t = j38;
        this.C = j39;
        this.L = j40;
        this.i = j41;
        this.r = j42;
    }

    public final State<Color> d(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-1911326869);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1911326869, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:1841)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.a;
        } else if (z2) {
            j = this.q;
        } else {
            j = a(collectIsFocusedAsState) ? this.z : this.M;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> h(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-1001266083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1001266083, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:1866)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.m;
        } else if (z2) {
            j = this.v;
        } else {
            j = h(collectIsFocusedAsState) ? this.I : this.P;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> a(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-468999845);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-468999845, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:1891)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.d;
        } else if (z2) {
            j = this.l;
        } else {
            j = b(collectIsFocusedAsState) ? this.w : this.E;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(399803598);
            rememberUpdatedState = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(399803703);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> c(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(273645005);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(273645005, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:1919)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.e;
        } else if (z2) {
            j = this.k;
        } else {
            j = e(collectIsFocusedAsState) ? this.x : this.H;
        }
        State<Color> m46animateColorAsStateeuL9pac = SingleValueAnimationKt.m46animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m46animateColorAsStateeuL9pac;
    }

    public final State<Color> e(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-627015617);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-627015617, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:1943)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.h;
        } else if (z2) {
            j = this.s;
        } else {
            j = c(collectIsFocusedAsState) ? this.B : this.N;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> b(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(91801152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(91801152, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:1967)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.b;
        } else if (z2) {
            j = this.f13367o;
        } else {
            j = d(collectIsFocusedAsState) ? this.u : this.K;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> i(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-293225259);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-293225259, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.textColor (TextFieldDefaults.kt:1991)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.g;
        } else if (z2) {
            j = this.y;
        } else {
            j = j(collectIsFocusedAsState) ? this.F : this.S;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> g(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(-236411736);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-236411736, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:2007)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.f;
        } else if (z2) {
            j = this.p;
        } else {
            j = f(collectIsFocusedAsState) ? this.A : this.Q;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> f(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(1098545594);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1098545594, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:2032)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.j;
        } else if (z2) {
            j = this.t;
        } else {
            j = g(collectIsFocusedAsState) ? this.D : this.f13366J;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> j(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        long j;
        C8632dsu.c((Object) interactionSource, "");
        composer.startReplaceableGroup(259235705);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(259235705, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:2056)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i >> 6) & 14);
        if (!z) {
            j = this.i;
        } else if (z2) {
            j = this.r;
        } else {
            j = i(collectIsFocusedAsState) ? this.C : this.L;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(j), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final State<Color> a(boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(779897723);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(779897723, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:2073)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1284boximpl(z ? this.n : this.c), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public final TextSelectionColors c(Composer composer, int i) {
        composer.startReplaceableGroup(-1389681951);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1389681951, i, -1, "com.netflix.hawkins.internal.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2081)");
        }
        TextSelectionColors textSelectionColors = this.G;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LZ)) {
            return false;
        }
        LZ lz = (LZ) obj;
        return Color.m1294equalsimpl0(this.F, lz.F) && Color.m1294equalsimpl0(this.S, lz.S) && Color.m1294equalsimpl0(this.g, lz.g) && Color.m1294equalsimpl0(this.y, lz.y) && Color.m1294equalsimpl0(this.x, lz.x) && Color.m1294equalsimpl0(this.H, lz.H) && Color.m1294equalsimpl0(this.e, lz.e) && Color.m1294equalsimpl0(this.k, lz.k) && Color.m1294equalsimpl0(this.c, lz.c) && Color.m1294equalsimpl0(this.n, lz.n) && C8632dsu.c(this.G, lz.G) && Color.m1294equalsimpl0(this.w, lz.w) && Color.m1294equalsimpl0(this.E, lz.E) && Color.m1294equalsimpl0(this.d, lz.d) && Color.m1294equalsimpl0(this.l, lz.l) && Color.m1294equalsimpl0(this.z, lz.z) && Color.m1294equalsimpl0(this.M, lz.M) && Color.m1294equalsimpl0(this.a, lz.a) && Color.m1294equalsimpl0(this.q, lz.q) && Color.m1294equalsimpl0(this.I, lz.I) && Color.m1294equalsimpl0(this.P, lz.P) && Color.m1294equalsimpl0(this.m, lz.m) && Color.m1294equalsimpl0(this.v, lz.v) && Color.m1294equalsimpl0(this.u, lz.u) && Color.m1294equalsimpl0(this.K, lz.K) && Color.m1294equalsimpl0(this.b, lz.b) && Color.m1294equalsimpl0(this.f13367o, lz.f13367o) && Color.m1294equalsimpl0(this.B, lz.B) && Color.m1294equalsimpl0(this.N, lz.N) && Color.m1294equalsimpl0(this.h, lz.h) && Color.m1294equalsimpl0(this.s, lz.s) && Color.m1294equalsimpl0(this.A, lz.A) && Color.m1294equalsimpl0(this.Q, lz.Q) && Color.m1294equalsimpl0(this.f, lz.f) && Color.m1294equalsimpl0(this.p, lz.p) && Color.m1294equalsimpl0(this.D, lz.D) && Color.m1294equalsimpl0(this.f13366J, lz.f13366J) && Color.m1294equalsimpl0(this.j, lz.j) && Color.m1294equalsimpl0(this.t, lz.t) && Color.m1294equalsimpl0(this.C, lz.C) && Color.m1294equalsimpl0(this.L, lz.L) && Color.m1294equalsimpl0(this.i, lz.i) && Color.m1294equalsimpl0(this.r, lz.r);
    }

    public int hashCode() {
        int m1300hashCodeimpl = Color.m1300hashCodeimpl(this.F);
        int m1300hashCodeimpl2 = Color.m1300hashCodeimpl(this.S);
        int m1300hashCodeimpl3 = Color.m1300hashCodeimpl(this.g);
        int m1300hashCodeimpl4 = Color.m1300hashCodeimpl(this.y);
        int m1300hashCodeimpl5 = Color.m1300hashCodeimpl(this.x);
        int m1300hashCodeimpl6 = Color.m1300hashCodeimpl(this.H);
        int m1300hashCodeimpl7 = Color.m1300hashCodeimpl(this.e);
        int m1300hashCodeimpl8 = Color.m1300hashCodeimpl(this.k);
        int m1300hashCodeimpl9 = Color.m1300hashCodeimpl(this.c);
        int m1300hashCodeimpl10 = Color.m1300hashCodeimpl(this.n);
        int hashCode = this.G.hashCode();
        int m1300hashCodeimpl11 = Color.m1300hashCodeimpl(this.w);
        int m1300hashCodeimpl12 = Color.m1300hashCodeimpl(this.E);
        int m1300hashCodeimpl13 = Color.m1300hashCodeimpl(this.d);
        int m1300hashCodeimpl14 = Color.m1300hashCodeimpl(this.l);
        int m1300hashCodeimpl15 = Color.m1300hashCodeimpl(this.z);
        int m1300hashCodeimpl16 = Color.m1300hashCodeimpl(this.M);
        int m1300hashCodeimpl17 = Color.m1300hashCodeimpl(this.a);
        int m1300hashCodeimpl18 = Color.m1300hashCodeimpl(this.q);
        int m1300hashCodeimpl19 = Color.m1300hashCodeimpl(this.I);
        int m1300hashCodeimpl20 = Color.m1300hashCodeimpl(this.P);
        int m1300hashCodeimpl21 = Color.m1300hashCodeimpl(this.m);
        int m1300hashCodeimpl22 = Color.m1300hashCodeimpl(this.v);
        int m1300hashCodeimpl23 = Color.m1300hashCodeimpl(this.u);
        int m1300hashCodeimpl24 = Color.m1300hashCodeimpl(this.K);
        int m1300hashCodeimpl25 = Color.m1300hashCodeimpl(this.b);
        int m1300hashCodeimpl26 = Color.m1300hashCodeimpl(this.f13367o);
        int m1300hashCodeimpl27 = Color.m1300hashCodeimpl(this.B);
        int m1300hashCodeimpl28 = Color.m1300hashCodeimpl(this.N);
        int m1300hashCodeimpl29 = Color.m1300hashCodeimpl(this.h);
        int m1300hashCodeimpl30 = Color.m1300hashCodeimpl(this.s);
        int m1300hashCodeimpl31 = Color.m1300hashCodeimpl(this.A);
        int m1300hashCodeimpl32 = Color.m1300hashCodeimpl(this.Q);
        int m1300hashCodeimpl33 = Color.m1300hashCodeimpl(this.f);
        int m1300hashCodeimpl34 = Color.m1300hashCodeimpl(this.p);
        int m1300hashCodeimpl35 = Color.m1300hashCodeimpl(this.D);
        int m1300hashCodeimpl36 = Color.m1300hashCodeimpl(this.f13366J);
        int m1300hashCodeimpl37 = Color.m1300hashCodeimpl(this.j);
        int m1300hashCodeimpl38 = Color.m1300hashCodeimpl(this.t);
        int m1300hashCodeimpl39 = Color.m1300hashCodeimpl(this.C);
        int m1300hashCodeimpl40 = Color.m1300hashCodeimpl(this.L);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((m1300hashCodeimpl * 31) + m1300hashCodeimpl2) * 31) + m1300hashCodeimpl3) * 31) + m1300hashCodeimpl4) * 31) + m1300hashCodeimpl5) * 31) + m1300hashCodeimpl6) * 31) + m1300hashCodeimpl7) * 31) + m1300hashCodeimpl8) * 31) + m1300hashCodeimpl9) * 31) + m1300hashCodeimpl10) * 31) + hashCode) * 31) + m1300hashCodeimpl11) * 31) + m1300hashCodeimpl12) * 31) + m1300hashCodeimpl13) * 31) + m1300hashCodeimpl14) * 31) + m1300hashCodeimpl15) * 31) + m1300hashCodeimpl16) * 31) + m1300hashCodeimpl17) * 31) + m1300hashCodeimpl18) * 31) + m1300hashCodeimpl19) * 31) + m1300hashCodeimpl20) * 31) + m1300hashCodeimpl21) * 31) + m1300hashCodeimpl22) * 31) + m1300hashCodeimpl23) * 31) + m1300hashCodeimpl24) * 31) + m1300hashCodeimpl25) * 31) + m1300hashCodeimpl26) * 31) + m1300hashCodeimpl27) * 31) + m1300hashCodeimpl28) * 31) + m1300hashCodeimpl29) * 31) + m1300hashCodeimpl30) * 31) + m1300hashCodeimpl31) * 31) + m1300hashCodeimpl32) * 31) + m1300hashCodeimpl33) * 31) + m1300hashCodeimpl34) * 31) + m1300hashCodeimpl35) * 31) + m1300hashCodeimpl36) * 31) + m1300hashCodeimpl37) * 31) + m1300hashCodeimpl38) * 31) + m1300hashCodeimpl39) * 31) + m1300hashCodeimpl40) * 31) + Color.m1300hashCodeimpl(this.i)) * 31) + Color.m1300hashCodeimpl(this.r);
    }

    private static final boolean a(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean h(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean e(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean c(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean d(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean j(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean f(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean g(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean i(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
