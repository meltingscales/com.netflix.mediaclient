package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class ContextualTextImpl extends AbstractC0941Im implements InterfaceC0952Ix, ContextualText {
    public static final Companion Companion = new Companion(null);
    private static final String EVIDENCE_KEY = "evidenceKey";
    private static final String TEXT = "text";
    @SerializedName(EVIDENCE_KEY)
    private String evidenceKey;
    @SerializedName(TEXT)
    private String text;

    @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
    public String evidenceKey() {
        return this.evidenceKey;
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
    public String text() {
        return this.text;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) TEXT)) {
                C8632dsu.d(value);
                this.text = C9688vC.c(value);
            } else if (C8632dsu.c((Object) key, (Object) EVIDENCE_KEY)) {
                C8632dsu.d(value);
                this.evidenceKey = C9688vC.c(value);
            }
        }
    }
}
