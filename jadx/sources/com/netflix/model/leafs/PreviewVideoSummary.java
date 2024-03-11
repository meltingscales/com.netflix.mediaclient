package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;
import o.InterfaceC5219bud;

/* loaded from: classes5.dex */
public class PreviewVideoSummary extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5219bud {
    private static final String TAG = "PreviewVideoSummary";
    private String parentVideoId;
    private boolean supplementalCanStream;
    private long supplementalDuration;
    private String supplementalVideoId;
    private String supplementalVideoType;

    public String getParentVideoId() {
        return this.parentVideoId;
    }

    public boolean getSupplementalCanStream() {
        return this.supplementalCanStream;
    }

    public long getSupplementalDuration() {
        return this.supplementalDuration;
    }

    public String getSupplementalVideoId() {
        return this.supplementalVideoId;
    }

    public String getSupplementalVideoType() {
        return this.supplementalVideoType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1464309672:
                    if (key.equals("supplementalDuration")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -788538068:
                    if (key.equals("supplementalCanStream")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -84383822:
                    if (key.equals("supplementalVideoId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 511877137:
                    if (key.equals("supplementalVideoType")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 941180652:
                    if (key.equals("parentVideoId")) {
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
                this.supplementalDuration = value.getAsLong();
            } else if (c == 1) {
                this.supplementalCanStream = value.getAsBoolean();
            } else if (c == 2) {
                this.supplementalVideoId = value.getAsString();
            } else if (c == 3) {
                this.supplementalVideoType = value.getAsString();
            } else if (c == 4) {
                this.parentVideoId = value.getAsString();
            }
        }
    }

    public String toString() {
        return "PreviewVideoSummary [parentVideoId = " + this.parentVideoId + ", supplementalVideoId = " + this.supplementalVideoId + ", supplementalDuration = " + this.supplementalDuration + ", supplementalCanStream = " + this.supplementalCanStream + ", supplementalVideoType = " + this.supplementalVideoType + "]";
    }
}
