package com.netflix.model.leafs.advisory;

import android.annotation.SuppressLint;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.model.leafs.advisory.Advisory;
import java.util.List;
import java.util.Map;
import o.C8168dfL;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class ContentAdvisoryImpl extends AdvisoryImpl implements ContentAdvisory {
    private static final String TAG = "ContentAdvisory";
    public AdvisoryBoard board;
    public String broadcastDistributorName;
    public String broadcastReleaseDate;
    public String certSystemConfirmationId;
    public String i18nAdvisories;
    public String i18nRating;
    public List<ContentAdvisoryIcon> icons = null;
    public String ratingDescription;
    public String ratingIconId;
    public String ratingIconLevel;
    public String ratingIconValue;
    public String ratingShortDescription;

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public AdvisoryBoard getAdvisoryBoard() {
        return this.board;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public AdvisoryBoard getBoard() {
        return this.board;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastDistributorName() {
        return this.broadcastDistributorName;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getBroadcastReleaseDate() {
        return this.broadcastReleaseDate;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getCertSystemConfirmationId() {
        return this.certSystemConfirmationId;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nAdvisories() {
        return this.i18nAdvisories;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getI18nRating() {
        return this.i18nRating;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public List<ContentAdvisoryIcon> getIcons() {
        return this.icons;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getMessage() {
        return this.i18nRating;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingDescription() {
        return this.ratingDescription;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconLevel() {
        return this.ratingIconLevel;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory
    public String getRatingIconValue() {
        return this.ratingIconValue;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingId() {
        return this.ratingIconId;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingLevel() {
        return this.ratingIconLevel;
    }

    @Override // com.netflix.model.leafs.advisory.ContentAdvisory, com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingShortDescription() {
        return this.ratingShortDescription;
    }

    @Override // com.netflix.model.leafs.advisory.RatingDetails
    public String getRatingValue() {
        return this.ratingIconValue;
    }

    @Override // com.netflix.model.leafs.advisory.Advisory
    public String getSecondaryMessage() {
        if (C8168dfL.g(this.i18nAdvisories) && C8168dfL.h(this.broadcastDistributorName) && C8168dfL.h(this.broadcastReleaseDate)) {
            return getBroadcastDistributorName() + "  " + getBroadcastReleaseDate();
        }
        return this.i18nAdvisories;
    }

    @Override // com.netflix.model.leafs.advisory.AdvisoryImpl, com.netflix.model.leafs.advisory.Advisory
    public Advisory.Type getType() {
        return Advisory.Type.CONTENT_ADVISORY;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.netflix.model.leafs.advisory.Advisory
    public JsonObject getData(JsonElement jsonElement) {
        char c;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1866162988:
                    if (key.equals("broadcastReleaseDate")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1729984165:
                    if (key.equals("i18nRating")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100029210:
                    if (key.equals("icons")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 708792337:
                    if (key.equals("broadcastDistributorName")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1146480597:
                    if (key.equals("i18nAdvisories")) {
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
                this.broadcastReleaseDate = value.getAsString();
            } else if (c == 1) {
                this.i18nRating = value.getAsString();
            } else if (c == 2) {
                populateIconData(value);
            } else if (c == 3) {
                this.broadcastDistributorName = value.getAsString();
            } else if (c == 4) {
                this.i18nAdvisories = value.getAsString();
            }
        }
        return asJsonObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void populateIconData(JsonElement jsonElement) {
        char c;
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -1724546052:
                    if (key.equals("description")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 93908710:
                    if (key.equals("board")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102865796:
                    if (key.equals("level")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111972721:
                    if (key.equals("value")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 426755992:
                    if (key.equals("ratingId")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 896917635:
                    if (key.equals("certSystemConfirmationId")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1080866479:
                    if (key.equals("reasons")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951089120:
                    if (key.equals("shortDescription")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.ratingDescription = value.isJsonNull() ? null : value.getAsString();
                    break;
                case 1:
                    this.board = value.isJsonNull() ? null : AdvisoryBoard.getAdvisoryBoard(value.getAsString());
                    break;
                case 2:
                    this.ratingIconLevel = value.isJsonNull() ? null : value.getAsString();
                    break;
                case 3:
                    this.ratingIconValue = value.isJsonNull() ? null : value.getAsString();
                    break;
                case 4:
                    this.ratingIconId = value.isJsonNull() ? null : value.getAsString();
                    break;
                case 5:
                    this.certSystemConfirmationId = value.isJsonNull() ? null : value.getAsString();
                    break;
                case 6:
                    this.icons = value.isJsonNull() ? null : ContentAdvisoryIconImpl.asList(value.getAsJsonArray());
                    break;
                case 7:
                    this.ratingShortDescription = value.isJsonNull() ? null : value.getAsString();
                    break;
            }
        }
    }
}
