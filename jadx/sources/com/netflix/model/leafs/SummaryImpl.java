package com.netflix.model.leafs;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.VideoInfo;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1596aHd;
import o.InterfaceC0952Ix;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC5188btz;

/* loaded from: classes5.dex */
public class SummaryImpl extends AbstractC0941Im implements InterfaceC5188btz, InterfaceC0952Ix, VideoInfo.Summary {
    private static long QUICKDRAW_DP_CAN_DOWNLOAD_BIT = -2147483648L;
    private static long QUICKDRAW_DP_IN_QUEUE_BIT = 1073741824;
    private static long QUICKDRAW_DP_IS_INTERACTIVE_BIT = 536870912;
    private static final String TAG = "Summary";
    public boolean availableForDownload;
    public String boxartId;
    public String boxartUrl;
    public String certificationBoardId;
    public String certificationLevel;
    public String certificationRatingId;
    public String certificationValue;
    public int displayRuntime;
    public VideoType enumType;
    public String i18nRating;
    public boolean inQueue;
    public boolean isInteractiveContent;
    public boolean isOriginal;
    public RecommendedTrailer recommendedTrailer;
    public String seasonNumLabel;
    public String synopsis;
    public String title;
    public String type;
    public String unifiedEntityId;
    public String year;
    public String id = "-1";
    public boolean isAvailableToPlay = true;
    public boolean isPlayable = true;

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        return this.boxartId;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getBoxartUrl() {
        return this.boxartUrl;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        return this.boxartUrl;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getCertificationBoardId() {
        return this.certificationBoardId;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getCertificationLevel() {
        return this.certificationLevel;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getCertificationValue() {
        return this.certificationValue;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public int getDisplayRuntime() {
        return this.displayRuntime;
    }

    public VideoType getEnumType() {
        return this.enumType;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getSeasonNumLabel() {
        return this.seasonNumLabel;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getSynopsis() {
        return this.synopsis;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        return this.title;
    }

    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    @Override // com.netflix.model.leafs.VideoInfo.Summary
    public String getYear() {
        return this.year;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return this.availableForDownload;
    }

    public boolean isAvailableToPlay() {
        return this.isAvailableToPlay;
    }

    public boolean isInQueue() {
        return this.inQueue;
    }

    public boolean isInteractiveContent() {
        return this.isInteractiveContent;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return this.isOriginal;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return this.isPlayable;
    }

    public String getVideoMerchComputeId() {
        RecommendedTrailer recommendedTrailer = this.recommendedTrailer;
        if (recommendedTrailer != null) {
            return recommendedTrailer.getSupplementalVideoMerchComputeId();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void populate(JsonElement jsonElement) {
        char c;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.isAvailableToPlay = true;
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            JsonElement value = entry.getValue();
            String key = entry.getKey();
            key.hashCode();
            switch (key.hashCode()) {
                case -2040995853:
                    if (key.equals("boxartId")) {
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
                case -1067215565:
                    if (key.equals("trailer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -416615408:
                    if (key.equals("unifiedEntityId")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (key.equals(SignupConstants.Field.LANG_ID)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 96586:
                    if (key.equals("air")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 119465:
                    if (key.equals("ycs")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (key.equals("type")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 32546672:
                    if (key.equals("canStream")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110371416:
                    if (key.equals(SignupConstants.Field.VIDEO_TITLE)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 585773339:
                    if (key.equals("isOriginal")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1085869528:
                    if (key.equals("isPlayable")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1153650071:
                    if (key.equals("boxartUrl")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1828656532:
                    if (key.equals("synopsis")) {
                        c = '\r';
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
                    this.boxartId = value.getAsString();
                    break;
                case 1:
                    this.i18nRating = value.getAsString();
                    break;
                case 2:
                    this.recommendedTrailer = RecommendedTrailerImpl.fromJson(value.getAsJsonObject());
                    break;
                case 3:
                    this.unifiedEntityId = value.getAsString();
                    break;
                case 4:
                    String asString = value.getAsString();
                    this.id = asString;
                    if (TextUtils.isEmpty(asString)) {
                        this.id = "-1";
                        InterfaceC1593aHa.b("Video data " + jsonToString(asJsonObject));
                        InterfaceC1598aHf.a(new C1596aHd("SPY-17693 Video.Summary is missing id").b(ErrorType.m));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    long asLong = value.getAsLong();
                    long j = QUICKDRAW_DP_CAN_DOWNLOAD_BIT;
                    this.availableForDownload = (asLong & j) > 0;
                    long j2 = QUICKDRAW_DP_IN_QUEUE_BIT;
                    this.inQueue = (asLong & j2) > 0;
                    long j3 = QUICKDRAW_DP_IS_INTERACTIVE_BIT;
                    this.isInteractiveContent = (asLong & j3) > 0;
                    this.displayRuntime = (int) (asLong & (~(j | j2 | j3)));
                    break;
                case 6:
                    String[] split = value.getAsString().split("\u0007");
                    this.year = split.length >= 1 ? split[0] : "";
                    this.certificationValue = split.length >= 2 ? split[1] : "";
                    this.certificationLevel = split.length >= 3 ? split[2] : "";
                    this.certificationRatingId = split.length >= 4 ? split[3] : "";
                    this.certificationBoardId = split.length >= 5 ? split[4] : "";
                    this.seasonNumLabel = split.length == 6 ? split[5] : "";
                    break;
                case 7:
                    this.type = value.getAsString();
                    break;
                case '\b':
                    this.isAvailableToPlay = value.getAsBoolean();
                    break;
                case '\t':
                    this.title = value.getAsString();
                    break;
                case '\n':
                    this.isOriginal = entry.getValue().getAsBoolean();
                    break;
                case 11:
                    this.isPlayable = entry.getValue().getAsBoolean();
                    break;
                case '\f':
                    this.boxartUrl = value.getAsString();
                    break;
                case '\r':
                    this.synopsis = value.getAsString();
                    break;
            }
        }
        if (this.type == null) {
            InterfaceC1593aHa.b("SPY-19129: SummaryImpl.type does not exist in the response. Json: " + jsonToString(asJsonObject));
        }
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        if (this.enumType == null) {
            this.enumType = VideoType.create(this.type);
        }
        return this.enumType;
    }

    public String toString() {
        String str = "Summary [id=" + this.id + ", type=" + this.type + ", title=" + this.title + ", isOriginal=" + this.isOriginal + ", unifiedEntityId=" + this.unifiedEntityId + ", isAvailableToPlay=" + this.isAvailableToPlay;
        if (this.year != null || this.synopsis != null || this.seasonNumLabel != null) {
            return str + ", year=" + this.year + ", certificationValue='" + this.certificationValue + ", certificationLevel='" + this.certificationLevel + ", certificationBoardId='" + this.certificationBoardId + ", seasonNumLabel=" + this.seasonNumLabel + ", synopsis=" + this.synopsis + ", inQueue=" + this.inQueue + ", availableForDownload=" + this.availableForDownload + ", runtime=" + this.displayRuntime + "]";
        }
        return str + "]";
    }

    private String jsonToString(JsonObject jsonObject) {
        return jsonObject.toString().replace("\n", "").replace("\"", "'");
    }
}
