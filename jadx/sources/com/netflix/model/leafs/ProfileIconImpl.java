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
import o.InterfaceC5159btW;

/* loaded from: classes5.dex */
public final class ProfileIconImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5159btW {
    private static final String CONTENT_DESCRIPTION = "contentDescription";
    public static final Companion Companion = new Companion(null);
    private static final String ID = "id";
    private static final String URL = "url";
    private static final String UUID = "uuid";
    @SerializedName(CONTENT_DESCRIPTION)
    private String contentDescription;
    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private String url;
    @SerializedName(UUID)
    private String uuid;

    public static final ArrayList<InterfaceC5159btW> asList(JsonArray jsonArray) {
        return Companion.asList(jsonArray);
    }

    @Override // o.InterfaceC5159btW
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Override // o.InterfaceC5159btW
    public String getId() {
        return this.id;
    }

    @Override // o.InterfaceC5159btW
    public String getUrl() {
        return this.url;
    }

    @Override // o.InterfaceC5159btW
    public String getUuid() {
        return this.uuid;
    }

    public void setContentDescription(String str) {
        this.contentDescription = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("ProfileIconImpl");
        }

        public final ArrayList<InterfaceC5159btW> asList(JsonArray jsonArray) {
            ArrayList<InterfaceC5159btW> arrayList = new ArrayList<>();
            if (jsonArray != null) {
                int size = jsonArray.size();
                for (int i = 0; i < size; i++) {
                    JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                    if (asJsonObject != null) {
                        ProfileIconImpl profileIconImpl = new ProfileIconImpl();
                        profileIconImpl.populate(asJsonObject);
                        arrayList.add(profileIconImpl);
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
                if (hashCode != -1273585213) {
                    if (hashCode != 3355) {
                        if (hashCode != 116079) {
                            if (hashCode == 3601339 && key.equals(UUID)) {
                                C8632dsu.d(value);
                                setUuid(C9688vC.c(value));
                            }
                        } else if (key.equals("url")) {
                            C8632dsu.d(value);
                            setUrl(C9688vC.c(value));
                        }
                    } else if (key.equals("id")) {
                        C8632dsu.d(value);
                        setId(C9688vC.c(value));
                    }
                } else if (key.equals(CONTENT_DESCRIPTION)) {
                    C8632dsu.d(value);
                    setContentDescription(C9688vC.c(value));
                }
            }
        }
    }
}
