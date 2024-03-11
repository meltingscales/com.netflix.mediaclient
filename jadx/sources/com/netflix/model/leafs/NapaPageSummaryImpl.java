package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class NapaPageSummaryImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, NapaPageSummary {
    public static final Companion Companion = new Companion(null);
    private static final String EXPIRES = "expires";
    private static final String NUMBER_OF_SECTIONS = "numberOfSections";
    private static final String PAGE_KIND = "pageKind";
    @SerializedName(EXPIRES)
    private Long expiresTime = 0L;
    @SerializedName(NUMBER_OF_SECTIONS)
    private int numberOfSections;
    @SerializedName(PAGE_KIND)
    private String pageKind;
    private long requestId;

    @Override // com.netflix.model.leafs.NapaPageSummary
    public Long getExpiresTime() {
        return this.expiresTime;
    }

    @Override // com.netflix.model.leafs.NapaPageSummary
    public String getPageKind() {
        return this.pageKind;
    }

    @Override // com.netflix.model.leafs.NapaPageSummary
    public long getRequestId() {
        return this.requestId;
    }

    @Override // com.netflix.model.leafs.NapaPageSummary
    public int getTotalSections() {
        return this.numberOfSections;
    }

    public final void setRequestId(long j) {
        this.requestId = j;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -2134705842) {
                    if (hashCode != -1309235404) {
                        if (hashCode == 859189955 && key.equals(PAGE_KIND)) {
                            this.pageKind = value.getAsString();
                        }
                    } else if (key.equals(EXPIRES)) {
                        this.expiresTime = Long.valueOf(value.getAsLong());
                    }
                } else if (key.equals(NUMBER_OF_SECTIONS)) {
                    this.numberOfSections = value.getAsInt();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("NapaPageSummaryImpl");
        }
    }
}
