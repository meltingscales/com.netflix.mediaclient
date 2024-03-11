package com.netflix.model.leafs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC0941Im;
import o.C8632dsu;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class TaglineMessagesImpl extends AbstractC0941Im implements TaglineMessages, InterfaceC0952Ix {
    private final String TAG = "TaglineMessagesImpl";
    private List<TaglineMessage> listOfTaglineMessages = new ArrayList();

    @Override // com.netflix.model.leafs.TaglineMessages
    public List<TaglineMessage> getTaglineMessages() {
        return this.listOfTaglineMessages;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        this.listOfTaglineMessages = new ArrayList();
        if (jsonElement.isJsonArray()) {
            JsonArray<JsonElement> asJsonArray = jsonElement.getAsJsonArray();
            C8632dsu.a(asJsonArray, "");
            for (JsonElement jsonElement2 : asJsonArray) {
                TaglineMessageImpl taglineMessageImpl = new TaglineMessageImpl();
                JsonObject asJsonObject = jsonElement2.getAsJsonObject();
                C8632dsu.a(asJsonObject, "");
                taglineMessageImpl.populate(asJsonObject);
                this.listOfTaglineMessages.add(taglineMessageImpl);
            }
        }
    }
}
