package com.netflix.model.leafs.advisory;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class ContentAdvisoryIconImpl implements InterfaceC0952Ix, ContentAdvisoryIcon {
    public String id;
    public String text;

    @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisoryIcon
    public String getText() {
        return this.text;
    }

    public static ArrayList<ContentAdvisoryIcon> asList(JsonArray jsonArray) {
        ArrayList<ContentAdvisoryIcon> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
            ContentAdvisoryIconImpl contentAdvisoryIconImpl = new ContentAdvisoryIconImpl();
            contentAdvisoryIconImpl.populate(asJsonObject);
            arrayList.add(contentAdvisoryIconImpl);
        }
        return arrayList;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals(SignupConstants.Field.LANG_ID)) {
                this.id = value.isJsonNull() ? null : value.getAsString();
            } else if (key.equals("text")) {
                this.text = value.isJsonNull() ? null : value.getAsString();
            }
        }
    }
}
