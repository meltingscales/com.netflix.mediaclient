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
import o.InterfaceC5182btt;

/* loaded from: classes5.dex */
public final class BulkRaterImagesImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5182btt {
    private static final String BACKGROUND_TALL_URL = "backgroundTall";
    private static final String BACKGROUND_URL = "background";
    public static final Companion Companion = new Companion(null);
    private static final String TITLE_LOGO_URL = "logo";
    private static final String URL_KEY = "url";
    @SerializedName(BACKGROUND_TALL_URL)
    private String backgroundTallUrl;
    @SerializedName(BACKGROUND_URL)
    private String backgroundUrl;
    @SerializedName(TITLE_LOGO_URL)
    private String titleLogoUrl;

    public static final ArrayList<InterfaceC5182btt> asList(JsonArray jsonArray) {
        return Companion.asList(jsonArray);
    }

    @Override // o.InterfaceC5182btt
    public String getBackgroundTallUrl() {
        return this.backgroundTallUrl;
    }

    @Override // o.InterfaceC5182btt
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @Override // o.InterfaceC5182btt
    public String getTitleLogoUrl() {
        return this.titleLogoUrl;
    }

    public void setBackgroundTallUrl(String str) {
        this.backgroundTallUrl = str;
    }

    public void setBackgroundUrl(String str) {
        this.backgroundUrl = str;
    }

    public void setTitleLogoUrl(String str) {
        this.titleLogoUrl = str;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("BulkRaterImagesImpl");
        }

        public final ArrayList<InterfaceC5182btt> asList(JsonArray jsonArray) {
            ArrayList<InterfaceC5182btt> arrayList = new ArrayList<>();
            if (jsonArray != null) {
                int size = jsonArray.size();
                for (int i = 0; i < size; i++) {
                    JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                    if (asJsonObject != null) {
                        BulkRaterImagesImpl bulkRaterImagesImpl = new BulkRaterImagesImpl();
                        bulkRaterImagesImpl.populate(asJsonObject);
                        arrayList.add(bulkRaterImagesImpl);
                    }
                }
            }
            return arrayList;
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        Companion.getLogTag();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                int hashCode = key.hashCode();
                if (hashCode != -1332194002) {
                    if (hashCode != 3327403) {
                        if (hashCode == 1427486459 && key.equals(BACKGROUND_TALL_URL)) {
                            C8632dsu.d(value);
                            setBackgroundTallUrl(getImageUrl(value));
                        }
                    } else if (key.equals(TITLE_LOGO_URL)) {
                        C8632dsu.d(value);
                        setTitleLogoUrl(getImageUrl(value));
                    }
                } else if (key.equals(BACKGROUND_URL)) {
                    C8632dsu.d(value);
                    setBackgroundUrl(getImageUrl(value));
                }
            }
        }
    }

    private final String getImageUrl(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.get("url") != null) {
                JsonElement jsonElement2 = asJsonObject.get("url");
                C8632dsu.a(jsonElement2, "");
                return C9688vC.c(jsonElement2);
            }
            return null;
        }
        return null;
    }
}
