package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;
import o.InterfaceC5149btM;
import o.InterfaceC8322diG;

/* loaded from: classes5.dex */
public final class ListItemEvidenceImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8322diG, InterfaceC5149btM {
    public static final Companion Companion = new Companion(null);
    private static final String ID = "imageKey";
    private static final String TCARD_URL = "tcardUrl";
    private static final String URL = "imageUrl";
    @SerializedName(ID)
    private String imageKey;
    @SerializedName(URL)
    private String imageUrl;
    @SerializedName(TCARD_URL)
    private String tcardUrl;

    @Override // o.InterfaceC5149btM
    public String getImageKey() {
        return this.imageKey;
    }

    @Override // o.InterfaceC5149btM
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // o.InterfaceC5149btM
    public String getTcardUrl() {
        return this.tcardUrl;
    }

    public void setImageKey(String str) {
        this.imageKey = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setTcardUrl(String str) {
        this.tcardUrl = str;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("ListItemEvidenceImpl");
        }
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
                if (hashCode != -859620604) {
                    if (hashCode != -859610604) {
                        if (hashCode == 856460619 && key.equals(TCARD_URL)) {
                            C8632dsu.d(value);
                            setTcardUrl(C9688vC.c(value));
                        }
                    } else if (key.equals(URL)) {
                        C8632dsu.d(value);
                        setImageUrl(C9688vC.c(value));
                    }
                } else if (key.equals(ID)) {
                    C8632dsu.d(value);
                    setImageKey(C9688vC.c(value));
                }
            }
        }
    }
}
