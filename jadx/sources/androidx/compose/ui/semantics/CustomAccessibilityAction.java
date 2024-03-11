package androidx.compose.ui.semantics;

import o.C8632dsu;
import o.drO;

/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    private final drO<Boolean> action;
    private final String label;

    public final drO<Boolean> getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomAccessibilityAction) {
            CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
            return C8632dsu.c((Object) this.label, (Object) customAccessibilityAction.label) && C8632dsu.c(this.action, customAccessibilityAction.action);
        }
        return false;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
