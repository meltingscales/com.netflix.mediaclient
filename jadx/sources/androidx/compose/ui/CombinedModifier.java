package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import o.C8632dsu;
import o.drM;
import o.drX;

/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    private final Modifier inner;
    private final Modifier outer;

    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r, drX<? super R, ? super Modifier.Element, ? extends R> drx) {
        return (R) this.inner.foldIn(this.outer.foldIn(r, drx), drx);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(drM<? super Modifier.Element, Boolean> drm) {
        return this.outer.all(drm) && this.inner.all(drm);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (C8632dsu.c(this.outer, combinedModifier.outer) && C8632dsu.c(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", new drX<String, Modifier.Element, String>() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // o.drX
            public final String invoke(String str, Modifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            }
        })) + ']';
    }
}
