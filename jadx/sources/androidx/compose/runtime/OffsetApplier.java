package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i) {
        this.applier = applier;
        this.offset = i;
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.nesting++;
        this.applier.down(n);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        int i = this.nesting;
        if (i > 0) {
            this.nesting = i - 1;
            this.applier.up();
            return;
        }
        ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, N n) {
        this.applier.insertTopDown(i + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, N n) {
        this.applier.insertBottomUp(i + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        this.applier.remove(i + (this.nesting == 0 ? this.offset : 0), i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        int i4 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }
}
