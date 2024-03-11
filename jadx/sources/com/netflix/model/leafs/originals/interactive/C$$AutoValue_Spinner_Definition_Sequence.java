package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Spinner;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Spinner_Definition_Sequence  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Spinner_Definition_Sequence extends Spinner.Definition.Sequence {
    private final int h;
    private final int w;
    private final int x;
    private final int y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition.Sequence
    public int h() {
        return this.h;
    }

    public int hashCode() {
        return ((((((this.h ^ 1000003) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003) ^ this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition.Sequence
    public int w() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition.Sequence
    public int x() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition.Sequence
    public int y() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Spinner_Definition_Sequence(int i, int i2, int i3, int i4) {
        this.h = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
    }

    public String toString() {
        return "Sequence{h=" + this.h + ", w=" + this.w + ", x=" + this.x + ", y=" + this.y + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Spinner.Definition.Sequence) {
            Spinner.Definition.Sequence sequence = (Spinner.Definition.Sequence) obj;
            return this.h == sequence.h() && this.w == sequence.w() && this.x == sequence.x() && this.y == sequence.y();
        }
        return false;
    }
}
