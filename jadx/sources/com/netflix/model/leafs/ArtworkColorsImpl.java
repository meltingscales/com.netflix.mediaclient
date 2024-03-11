package com.netflix.model.leafs;

import android.graphics.Color;
import com.google.gson.JsonElement;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1596aHd;
import o.InterfaceC0952Ix;
import o.InterfaceC1598aHf;

/* loaded from: classes5.dex */
public class ArtworkColorsImpl extends AbstractC0941Im implements InterfaceC0952Ix, ArtworkColors {
    public static final String TAG = "ArtworkColors";
    private Integer foregroundColor = null;
    private Integer backgroundColor = null;

    @Override // com.netflix.model.leafs.ArtworkColors
    public int getForegroundColor() {
        return getForegroundColor(-1);
    }

    @Override // com.netflix.model.leafs.ArtworkColors
    public int getForegroundColor(int i) {
        Integer num = this.foregroundColor;
        return num == null ? i : num.intValue();
    }

    @Override // com.netflix.model.leafs.ArtworkColors
    public int getBackgroundColor() {
        return getBackgroundColor(ArtworkColors.DEFAULT_BACKGROUND_COLOR);
    }

    @Override // com.netflix.model.leafs.ArtworkColors
    public int getBackgroundColor(int i) {
        Integer num = this.backgroundColor;
        return num == null ? i : num.intValue();
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            if (key.equals("foregroundColor")) {
                this.foregroundColor = parseColor(value);
            } else if (key.equals("backgroundColor")) {
                this.backgroundColor = parseColor(value);
            }
        }
    }

    private static Integer parseColor(JsonElement jsonElement) {
        if (!jsonElement.isJsonNull()) {
            try {
                return Integer.valueOf(Color.parseColor(String.format("#%s", jsonElement.getAsString())));
            } catch (IllegalArgumentException e) {
                InterfaceC1598aHf.a(new C1596aHd(String.format("%s: can't recognize color %s", TAG, jsonElement.getAsString())).b(ErrorType.m).d(e).b(false));
            }
        }
        return null;
    }
}
