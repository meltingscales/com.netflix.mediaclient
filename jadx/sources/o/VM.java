package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class VM {
    private final Drawable c;

    public VM() {
        this(null, 1, null);
    }

    public final Drawable e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VM) && C8632dsu.c(this.c, ((VM) obj).c);
    }

    public int hashCode() {
        Drawable drawable = this.c;
        if (drawable == null) {
            return 0;
        }
        return drawable.hashCode();
    }

    public String toString() {
        Drawable drawable = this.c;
        return "BifInfraData(bifDrawable=" + drawable + ")";
    }

    public VM(Drawable drawable) {
        this.c = drawable;
    }

    public /* synthetic */ VM(Drawable drawable, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : drawable);
    }
}
