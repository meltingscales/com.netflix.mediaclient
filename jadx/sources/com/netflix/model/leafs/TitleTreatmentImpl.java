package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.Video;
import java.util.Map;
import o.C1045Mp;
import o.C8123deT;
import o.C8627dsp;

/* loaded from: classes5.dex */
public final class TitleTreatmentImpl extends Video.VideoArtwork {
    public static final Companion Companion = new Companion(null);
    private static final String HEIGHT = "height";
    private static final String WIDTH = "width";
    @SerializedName("height")
    private Integer height;
    @SerializedName("width")
    private Integer width;

    public Integer getHeight() {
        return this.height;
    }

    public Integer getWidth() {
        return this.width;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("TitleTreatmentImpl");
        }
    }

    public TitleTreatmentImpl() {
        super("titleTreatmentUrl");
    }

    @Override // com.netflix.model.leafs.Video.VideoArtwork, o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                if (key != null) {
                    int hashCode = key.hashCode();
                    if (hashCode != -1221029593) {
                        if (hashCode != -634252209) {
                            if (hashCode == 113126854 && key.equals("width")) {
                                this.width = Integer.valueOf(value.getAsInt());
                            }
                        } else if (key.equals("titleTreatmentUrl")) {
                            this.url = C8123deT.b(value);
                        }
                    } else if (key.equals("height")) {
                        this.height = Integer.valueOf(value.getAsInt());
                    }
                }
            }
        }
    }
}
