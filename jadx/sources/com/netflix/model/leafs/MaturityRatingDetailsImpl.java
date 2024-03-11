package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.RatingDetails;
import java.util.Map;
import o.AbstractC0941Im;
import o.C8123deT;
import o.C8627dsp;
import o.C8632dsu;
import o.C9688vC;
import o.InterfaceC0952Ix;

/* loaded from: classes5.dex */
public final class MaturityRatingDetailsImpl extends AbstractC0941Im implements InterfaceC0952Ix, RatingDetails {
    private static final String BOARD_ID = "boardId";
    public static final Companion Companion = new Companion(null);
    private static final String DESCRIPTION = "description";
    private static final String ID = "id";
    private static final String LEVEL = "level";
    private static final String SHORT_DESCRIPTION = "shortDescription";
    private static final String VALUE = "value";
    @SerializedName(BOARD_ID)
    private Integer boardId;
    @SerializedName(DESCRIPTION)
    private String description;
    @SerializedName("id")
    private Integer id;
    @SerializedName(LEVEL)
    private Integer level;
    @SerializedName(SHORT_DESCRIPTION)
    private String shortDescription;
    @SerializedName("value")
    private String value;

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        return this.description;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        return this.shortDescription;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        return this.value;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        C8632dsu.c((Object) jsonElement, "");
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            C8632dsu.d(entry);
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (key != null) {
                switch (key.hashCode()) {
                    case -1724546052:
                        if (key.equals(DESCRIPTION)) {
                            C8632dsu.d(value);
                            this.description = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 3355:
                        if (key.equals("id")) {
                            this.id = Integer.valueOf(C8123deT.c(value));
                            break;
                        } else {
                            continue;
                        }
                    case 51959457:
                        if (key.equals(BOARD_ID)) {
                            this.boardId = Integer.valueOf(C8123deT.c(value));
                            break;
                        } else {
                            continue;
                        }
                    case 102865796:
                        if (key.equals(LEVEL)) {
                            this.level = Integer.valueOf(C8123deT.c(value));
                            break;
                        } else {
                            continue;
                        }
                    case 111972721:
                        if (key.equals("value")) {
                            C8632dsu.d(value);
                            this.value = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                    case 1951089120:
                        if (key.equals(SHORT_DESCRIPTION)) {
                            C8632dsu.d(value);
                            this.shortDescription = C9688vC.c(value);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        Integer num = this.level;
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        Integer num = this.id;
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        Integer num = this.boardId;
        return AdvisoryBoard.getAdvisoryBoardById(num != null ? num.toString() : null);
    }
}
