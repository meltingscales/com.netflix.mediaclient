package com.netflix.model.leafs.originals.interactive;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_ImpressionData  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ImpressionData extends ImpressionData {
    private final StateData data;
    private final String type;

    @Override // com.netflix.model.leafs.originals.interactive.ImpressionData
    public StateData data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.ImpressionData
    public String type() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ImpressionData(String str, StateData stateData) {
        this.type = str;
        if (stateData == null) {
            throw new NullPointerException("Null data");
        }
        this.data = stateData;
    }

    public String toString() {
        return "ImpressionData{type=" + this.type + ", data=" + this.data + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImpressionData) {
            ImpressionData impressionData = (ImpressionData) obj;
            String str = this.type;
            if (str != null ? str.equals(impressionData.type()) : impressionData.type() == null) {
                if (this.data.equals(impressionData.data())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.type;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.data.hashCode();
    }
}
