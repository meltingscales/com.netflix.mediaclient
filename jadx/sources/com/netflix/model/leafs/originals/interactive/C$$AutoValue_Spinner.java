package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Spinner;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Spinner  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Spinner extends Spinner {
    private final Spinner.Definition pngJson;
    private final Size size;

    @Override // com.netflix.model.leafs.originals.interactive.Spinner
    public Spinner.Definition pngJson() {
        return this.pngJson;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Spinner
    public Size size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Spinner(Spinner.Definition definition, Size size) {
        this.pngJson = definition;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
    }

    public String toString() {
        return "Spinner{pngJson=" + this.pngJson + ", size=" + this.size + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Spinner) {
            Spinner spinner = (Spinner) obj;
            Spinner.Definition definition = this.pngJson;
            if (definition != null ? definition.equals(spinner.pngJson()) : spinner.pngJson() == null) {
                if (this.size.equals(spinner.size())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Spinner.Definition definition = this.pngJson;
        return (((definition == null ? 0 : definition.hashCode()) ^ 1000003) * 1000003) ^ this.size.hashCode();
    }
}
