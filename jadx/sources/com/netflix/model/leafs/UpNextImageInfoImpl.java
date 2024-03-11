package com.netflix.model.leafs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public final class UpNextImageInfoImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, UpNextImageInfo {
    public static final Companion Companion = new Companion(null);
    private static final String ID = "id";
    private static final String URL = "url";
    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private String url;

    public static final ArrayList<UpNextImageInfo> asList(JsonArray jsonArray) {
        return Companion.asList(jsonArray);
    }

    @Override // com.netflix.model.leafs.UpNextImageInfo
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.UpNextImageInfo
    public String getUrl() {
        return this.url;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (C8632dsu.c((Object) key, (Object) "url")) {
                C8632dsu.d(value);
                this.url = C9688vC.c(value);
            } else if (C8632dsu.c((Object) key, (Object) "id")) {
                C8632dsu.d(value);
                this.id = C9688vC.c(value);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("SearchSectionSummary");
        }

        public final ArrayList<UpNextImageInfo> asList(JsonArray jsonArray) {
            ArrayList<UpNextImageInfo> arrayList = new ArrayList<>();
            if (jsonArray != null) {
                int size = jsonArray.size();
                for (int i = 0; i < size; i++) {
                    JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                    if (asJsonObject != null) {
                        UpNextImageInfoImpl upNextImageInfoImpl = new UpNextImageInfoImpl();
                        upNextImageInfoImpl.populate(asJsonObject);
                        arrayList.add(upNextImageInfoImpl);
                    }
                }
            }
            return arrayList;
        }
    }
}
