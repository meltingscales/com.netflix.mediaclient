package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.template.$$AutoValue_BackgroundImageElement_BackgroundImageElementOverride  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_BackgroundImageElement_BackgroundImageElementOverride extends BackgroundImageElement.BackgroundImageElementOverride {
    private final BackgroundImageElement data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.BackgroundImageElementOverride
    public BackgroundImageElement data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.BackgroundImageElement.BackgroundImageElementOverride
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_BackgroundImageElement_BackgroundImageElementOverride(String str, BackgroundImageElement backgroundImageElement) {
        this.preconditionId = str;
        this.data = backgroundImageElement;
    }

    public String toString() {
        return "BackgroundImageElementOverride{preconditionId=" + this.preconditionId + ", data=" + this.data + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackgroundImageElement.BackgroundImageElementOverride) {
            BackgroundImageElement.BackgroundImageElementOverride backgroundImageElementOverride = (BackgroundImageElement.BackgroundImageElementOverride) obj;
            String str = this.preconditionId;
            if (str != null ? str.equals(backgroundImageElementOverride.preconditionId()) : backgroundImageElementOverride.preconditionId() == null) {
                BackgroundImageElement backgroundImageElement = this.data;
                if (backgroundImageElement == null) {
                    if (backgroundImageElementOverride.data() == null) {
                        return true;
                    }
                } else if (backgroundImageElement.equals(backgroundImageElementOverride.data())) {
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
        BackgroundImageElement backgroundImageElement = this.data;
        return ((hashCode ^ 1000003) * 1000003) ^ (backgroundImageElement != null ? backgroundImageElement.hashCode() : 0);
    }
}
