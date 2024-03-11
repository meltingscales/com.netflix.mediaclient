package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_ScreenPosition  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_ScreenPosition extends ScreenPosition {
    private final Float x;
    private final Float y;

    @Override // com.netflix.model.leafs.originals.interactive.ScreenPosition
    public Float x() {
        return this.x;
    }

    @Override // com.netflix.model.leafs.originals.interactive.ScreenPosition
    public Float y() {
        return this.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ScreenPosition(Float f, Float f2) {
        if (f == null) {
            throw new NullPointerException("Null x");
        }
        this.x = f;
        if (f2 == null) {
            throw new NullPointerException("Null y");
        }
        this.y = f2;
    }

    public String toString() {
        return "ScreenPosition{x=" + this.x + ", y=" + this.y + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScreenPosition) {
            ScreenPosition screenPosition = (ScreenPosition) obj;
            return this.x.equals(screenPosition.x()) && this.y.equals(screenPosition.y());
        }
        return false;
    }

    public int hashCode() {
        return ((this.x.hashCode() ^ 1000003) * 1000003) ^ this.y.hashCode();
    }
}
