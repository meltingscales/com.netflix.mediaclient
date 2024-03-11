package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class Colors {
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState isLight$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryVariant$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryVariant$delegate;
    private final MutableState surface$delegate;

    public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m1284boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }

    public String toString() {
        return "Colors(primary=" + ((Object) Color.m1301toStringimpl(m565getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m1301toStringimpl(m566getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m1301toStringimpl(m567getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m1301toStringimpl(m568getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m1301toStringimpl(m558getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m1301toStringimpl(m569getSurface0d7_KjU())) + ", error=" + ((Object) Color.m1301toStringimpl(m559getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m1301toStringimpl(m562getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m1301toStringimpl(m563getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m1301toStringimpl(m560getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m1301toStringimpl(m564getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m1301toStringimpl(m561getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m565getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getPrimaryVariant-0d7_KjU  reason: not valid java name */
    public final long m566getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m567getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getSecondaryVariant-0d7_KjU  reason: not valid java name */
    public final long m568getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m558getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m569getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m559getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m562getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m563getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m560getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m564getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m1302unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m561getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m1302unboximpl();
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }
}
