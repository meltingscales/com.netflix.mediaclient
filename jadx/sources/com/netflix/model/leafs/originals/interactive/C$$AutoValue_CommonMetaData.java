package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.CommonMetaData;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_CommonMetaData  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_CommonMetaData extends CommonMetaData {
    private final Map<String, CommonMetaData.Layout> layouts;
    private final CommonMetaData.Settings settings;

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData
    @Deprecated
    public Map<String, CommonMetaData.Layout> layouts() {
        return this.layouts;
    }

    @Override // com.netflix.model.leafs.originals.interactive.CommonMetaData
    public CommonMetaData.Settings settings() {
        return this.settings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_CommonMetaData(Map<String, CommonMetaData.Layout> map, CommonMetaData.Settings settings) {
        this.layouts = map;
        if (settings == null) {
            throw new NullPointerException("Null settings");
        }
        this.settings = settings;
    }

    public String toString() {
        return "CommonMetaData{layouts=" + this.layouts + ", settings=" + this.settings + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonMetaData) {
            CommonMetaData commonMetaData = (CommonMetaData) obj;
            Map<String, CommonMetaData.Layout> map = this.layouts;
            if (map != null ? map.equals(commonMetaData.layouts()) : commonMetaData.layouts() == null) {
                if (this.settings.equals(commonMetaData.settings())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Map<String, CommonMetaData.Layout> map = this.layouts;
        return (((map == null ? 0 : map.hashCode()) ^ 1000003) * 1000003) ^ this.settings.hashCode();
    }
}
