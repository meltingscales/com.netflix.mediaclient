package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import java.util.Map;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;
import o.InterfaceC8319diD;

/* loaded from: classes6.dex */
public class SupplementalSummary extends AbstractC0941Im implements InterfaceC8319diD, InterfaceC0952Ix {
    private static final String TAG = "SupplementalSummary";
    public String parentVideoId;
    public String supplementalVideoId;
    public long supplementalDuration = 0;
    public boolean supplementalCanStream = false;

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
                case 941180652:
                    if (key.equals("parentVideoId")) {
                        c = 3;
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
                this.parentVideoId = value.getAsString();
            }
        }
    }
}
