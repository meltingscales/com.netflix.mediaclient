package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;

/* loaded from: classes5.dex */
public final class KidsCharacter {
    private KidsCharacter() {
    }

    /* loaded from: classes5.dex */
    public static final class Summary extends SummaryImpl implements VideoInfo.KidsSummary {
        private static final String TAG = "KidsCharacter.Summary";
        private String storyArtUrl;

        public String getStoryArtUrl() {
            return this.storyArtUrl;
        }

        @Override // com.netflix.model.leafs.SummaryImpl, o.InterfaceC0952Ix
        public void populate(JsonElement jsonElement) {
            super.populate(jsonElement);
            for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
                JsonElement value = entry.getValue();
                String key = entry.getKey();
                key.hashCode();
                if (key.equals("storyArtUrl")) {
                    this.storyArtUrl = value.getAsString();
                }
            }
        }

        @Override // com.netflix.model.leafs.SummaryImpl
        public String toString() {
            return "KidsCharacter Summary{storyArtUrl=" + this.storyArtUrl + '}';
        }
    }
}
