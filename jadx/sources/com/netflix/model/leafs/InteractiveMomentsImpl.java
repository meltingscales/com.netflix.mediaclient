package com.netflix.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import java.lang.reflect.Type;
import o.AbstractC0941Im;
import o.C1332Xp;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class InteractiveMomentsImpl extends AbstractC0941Im implements InterfaceC0952Ix {
    private static final Type interactiveMomentsType = TypeToken.get(InteractiveMoments.class).getType();
    private InteractiveMoments interactiveMoments = null;

    public InteractiveMoments getInteractiveMoments() {
        return this.interactiveMoments;
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        this.interactiveMoments = null;
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.size() > 0) {
            this.interactiveMoments = (InteractiveMoments) ((Gson) C1332Xp.b(Gson.class)).fromJson(asJsonObject, interactiveMomentsType);
        }
    }
}
