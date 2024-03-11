package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.PostPlayAsset;
import com.netflix.model.leafs.originals.Tone;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Map;
import o.C8123deT;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public class PostPlayAssetImpl implements InterfaceC0952Ix, PostPlayAsset {
    private static final String TAG = "PostPlayAsset";
    private String assetType;
    private int height;
    private boolean isBadged;
    private String tone;
    private PostPlayAsset.Type type;
    private String url;
    private int width;

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getAssetType() {
        return this.assetType;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public int getHeight() {
        return this.height;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getTone() {
        return this.tone;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public PostPlayAsset.Type getType() {
        return this.type;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public String getUrl() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public int getWidth() {
        return this.width;
    }

    @Override // com.netflix.model.leafs.PostPlayAsset
    public boolean isBadged() {
        return this.isBadged;
    }

    public void setAssetType(String str) {
        this.assetType = str;
    }

    public void setBadged(boolean z) {
        this.isBadged = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setTone(String str) {
        this.tone = str;
    }

    public void setType(PostPlayAsset.Type type) {
        this.type = type;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public PostPlayAssetImpl(PostPlayAsset.Type type) {
        this(type, null);
    }

    public PostPlayAssetImpl(PostPlayAsset.Type type, JsonElement jsonElement) {
        this.width = 0;
        this.height = 0;
        this.isBadged = false;
        this.type = type;
        if (jsonElement != null) {
            populate(jsonElement);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            if (!(value instanceof JsonNull)) {
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
                    case -722613525:
                        if (key.equals("isBadged")) {
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
                    case 3565938:
                        if (key.equals("tone")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 113126854:
                        if (key.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1315305034:
                        if (key.equals("assetType")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    this.height = value.getAsInt();
                } else if (c == 1) {
                    this.isBadged = value.getAsBoolean();
                } else if (c == 2) {
                    this.url = value.getAsString();
                } else if (c == 3) {
                    String b = C8123deT.b(value);
                    String str = Tone.DARK;
                    if (!Tone.DARK.equals(b)) {
                        str = Tone.LIGHT;
                    }
                    this.tone = str;
                } else if (c == 4) {
                    this.width = value.getAsInt();
                } else if (c == 5) {
                    this.assetType = value.getAsString();
                }
            }
        }
    }
}
