package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;
import java.util.Map;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
class BillboardAssetsHolder implements InterfaceC0952Ix {
    private static final String TAG = "Assets";
    private BillboardBackgroundImpl background;
    private HorizontalBillboardBackground horizontalBackground;
    private BillboardLogo logo;

    public BillboardBackgroundImpl getBackground() {
        return this.background;
    }

    public HorizontalBillboardBackground getHorizontalBackground() {
        return this.horizontalBackground;
    }

    public BillboardLogo getLogo() {
        return this.logo;
    }

    public BillboardAssetsHolder(JsonElement jsonElement) {
        populate(jsonElement);
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            int hashCode = key.hashCode();
            if (hashCode == -1332194002) {
                if (key.equals("background")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3327403) {
                if (hashCode == 1573511282 && key.equals("horizontalBackground")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (key.equals("logo")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.background = new BillboardBackgroundImpl(value);
            } else if (c == 1) {
                this.logo = new BillboardLogo(value);
            } else if (c == 2) {
                this.horizontalBackground = new HorizontalBillboardBackground(value);
            }
        }
    }
}
