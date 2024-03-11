package androidx.compose.ui.platform;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class ValueElement {
    private final String name;
    private final Object value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValueElement) {
            ValueElement valueElement = (ValueElement) obj;
            return C8632dsu.c((Object) this.name, (Object) valueElement.name) && C8632dsu.c(this.value, valueElement.value);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        Object obj = this.value;
        return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }

    public ValueElement(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }
}
