package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.template.LabelElement;

/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_LabelElement_LabelElementOverride  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_LabelElement_LabelElementOverride extends LabelElement.LabelElementOverride {
    private final LabelElement data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.LabelElementOverride
    public LabelElement data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.LabelElement.LabelElementOverride
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_LabelElement_LabelElementOverride(String str, LabelElement labelElement) {
        this.preconditionId = str;
        this.data = labelElement;
    }

    public String toString() {
        return "LabelElementOverride{preconditionId=" + this.preconditionId + ", data=" + this.data + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LabelElement.LabelElementOverride) {
            LabelElement.LabelElementOverride labelElementOverride = (LabelElement.LabelElementOverride) obj;
            String str = this.preconditionId;
            if (str != null ? str.equals(labelElementOverride.preconditionId()) : labelElementOverride.preconditionId() == null) {
                LabelElement labelElement = this.data;
                if (labelElement == null) {
                    if (labelElementOverride.data() == null) {
                        return true;
                    }
                } else if (labelElement.equals(labelElementOverride.data())) {
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
        LabelElement labelElement = this.data;
        return ((hashCode ^ 1000003) * 1000003) ^ (labelElement != null ? labelElement.hashCode() : 0);
    }
}
