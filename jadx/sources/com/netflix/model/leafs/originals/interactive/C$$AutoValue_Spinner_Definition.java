package com.netflix.model.leafs.originals.interactive;

import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.Spinner;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Spinner_Definition  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Spinner_Definition extends Spinner.Definition {
    private final int fps;
    private final String imageUrl;
    private final List<Spinner.Definition.Sequence> sequence;

    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition
    public int fps() {
        return this.fps;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition
    @SerializedName("image")
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Spinner.Definition
    public List<Spinner.Definition.Sequence> sequence() {
        return this.sequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Spinner_Definition(int i, String str, List<Spinner.Definition.Sequence> list) {
        this.fps = i;
        if (str == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.imageUrl = str;
        this.sequence = list;
    }

    public String toString() {
        return "Definition{fps=" + this.fps + ", imageUrl=" + this.imageUrl + ", sequence=" + this.sequence + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Spinner.Definition) {
            Spinner.Definition definition = (Spinner.Definition) obj;
            if (this.fps == definition.fps() && this.imageUrl.equals(definition.imageUrl())) {
                List<Spinner.Definition.Sequence> list = this.sequence;
                if (list == null) {
                    if (definition.sequence() == null) {
                        return true;
                    }
                } else if (list.equals(definition.sequence())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.fps;
        int hashCode = this.imageUrl.hashCode();
        List<Spinner.Definition.Sequence> list = this.sequence;
        return ((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ (list == null ? 0 : list.hashCode());
    }
}
