package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.template.ElementV2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_ElementV2_ElementV2Override  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ElementV2_ElementV2Override extends ElementV2.ElementV2Override {
    private final ElementV2 data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2.ElementV2Override
    public ElementV2 data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.ElementV2.ElementV2Override
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ElementV2_ElementV2Override(String str, ElementV2 elementV2) {
        this.preconditionId = str;
        this.data = elementV2;
    }

    public String toString() {
        return "ElementV2Override{preconditionId=" + this.preconditionId + ", data=" + this.data + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ElementV2.ElementV2Override) {
            ElementV2.ElementV2Override elementV2Override = (ElementV2.ElementV2Override) obj;
            String str = this.preconditionId;
            if (str != null ? str.equals(elementV2Override.preconditionId()) : elementV2Override.preconditionId() == null) {
                ElementV2 elementV2 = this.data;
                if (elementV2 == null) {
                    if (elementV2Override.data() == null) {
                        return true;
                    }
                } else if (elementV2.equals(elementV2Override.data())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.preconditionId;
        int hashCode = str == null ? 0 : str.hashCode();
        ElementV2 elementV2 = this.data;
        return ((hashCode ^ 1000003) * 1000003) ^ (elementV2 != null ? elementV2.hashCode() : 0);
    }
}
