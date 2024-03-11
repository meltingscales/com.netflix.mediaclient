package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AutofillNode {
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final drM<String, dpR> onFill;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final drM<String, dpR> getOnFill() {
        return this.onFill;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutofillNode) {
            AutofillNode autofillNode = (AutofillNode) obj;
            return C8632dsu.c(this.autofillTypes, autofillNode.autofillTypes) && C8632dsu.c(this.boundingBox, autofillNode.boundingBox) && C8632dsu.c(this.onFill, autofillNode.onFill);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode();
        Rect rect = this.boundingBox;
        int hashCode2 = rect != null ? rect.hashCode() : 0;
        drM<String, dpR> drm = this.onFill;
        return (((hashCode * 31) + hashCode2) * 31) + (drm != null ? drm.hashCode() : 0);
    }
}
