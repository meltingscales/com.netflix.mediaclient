package androidx.window.layout;

import java.util.List;
import o.C8576dqs;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        C8632dsu.c((Object) list, "");
        this.displayFeatures = list;
    }

    public String toString() {
        String d;
        d = C8576dqs.d(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C8632dsu.c(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return C8632dsu.c(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }
}
