package androidx.compose.ui.semantics;

import o.C8632dsu;
import o.InterfaceC8555dpy;

/* loaded from: classes.dex */
public final class AccessibilityAction<T extends InterfaceC8555dpy<? extends Boolean>> {
    private final T action;
    private final String label;

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public AccessibilityAction(String str, T t) {
        this.label = str;
        this.action = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityAction) {
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            return C8632dsu.c((Object) this.label, (Object) accessibilityAction.label) && C8632dsu.c(this.action, accessibilityAction.action);
        }
        return false;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = str != null ? str.hashCode() : 0;
        T t = this.action;
        return (hashCode * 31) + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
