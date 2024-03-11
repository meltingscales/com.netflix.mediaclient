package com.netflix.model.leafs.originals;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes5.dex */
public abstract class AbstractBillboardAsset extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC8319diD, BillboardAsset {
    private final String TAG = getTag();
    private String artWorkType;
    private Integer height;
    private String imageKey;
    private String url;
    private Integer width;

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getArtWorkType() {
        return this.artWorkType;
    }

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public Integer getDominantBackgroundColor() {
        return null;
    }

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public Integer getHeight() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getImageKey() {
        return this.imageKey;
    }

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public String getUrl() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.originals.BillboardAsset
    public Integer getWidth() {
        return this.width;
    }

    public AbstractBillboardAsset(JsonElement jsonElement) {
        populate(jsonElement);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                switch (key.hashCode()) {
                    case -1221029593:
                        if (key.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -859620604:
                        if (key.equals("imageKey")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 116079:
                        if (key.equals(SignupConstants.Field.URL)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113126854:
                        if (key.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1749853550:
                        if (key.equals("artWorkType")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.height = Integer.valueOf(C8123deT.c(value));
                } else if (c == 1) {
                    this.imageKey = C8123deT.b(value);
                } else if (c == 2) {
                    this.url = C8123deT.b(value);
                } else if (c == 3) {
                    this.width = Integer.valueOf(C8123deT.c(value));
                } else if (c == 4) {
                    this.artWorkType = C8123deT.b(value);
                }
            }
        }
    }
}
