package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Map;
import o.AbstractC0941Im;
import o.InterfaceC0952Ix;
import o.InterfaceC5279bvk;
import org.chromium.net.NetError;

@Deprecated
/* loaded from: classes5.dex */
public class SearchCollectionEntityImpl extends AbstractC0941Im implements InterfaceC0952Ix, InterfaceC5279bvk, SearchCollectionEntity {
    private static final String TAG = "SearchCollectionEntity";
    private String boxartId;
    private String displayHeader;
    private String displayString;
    private boolean enableTitleGroupTreatment;
    private String entityId;
    private String entityType;
    private String imgUrl;
    private boolean isPreRelease;
    private boolean isVideoAvailable;
    private String preQueryBoxartId;
    private String preQueryImgUrl;
    private int trackId = NetError.ERR_SSL_CLIENT_AUTH_CERT_NEEDED;
    private String unifiedEntityId;
    private String videoId;
    private String videoType;

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getBoxartId() {
        return this.boxartId;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getDisplayHeader() {
        return this.displayHeader;
    }

    public boolean getEnableTitleGroupTreatment() {
        return this.enableTitleGroupTreatment;
    }

    @Override // o.InterfaceC5279bvk
    public String getEntityId() {
        return this.entityId;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getEntityType() {
        return this.entityType;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getImageUrl() {
        return this.imgUrl;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public boolean getIsPreRelease() {
        return this.isPreRelease;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getPreQueryBoxartId() {
        return this.preQueryBoxartId;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getPreQueryImgUrl() {
        return this.preQueryImgUrl;
    }

    public String getTitle() {
        return this.displayString;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public int getTrackId() {
        return this.trackId;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getUnifiedEntityId() {
        return this.unifiedEntityId;
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public String getVideoId() {
        return this.videoId;
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
                case -2138714641:
                    if (key.equals("displayHeader")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2102099874:
                    if (key.equals("entityId")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -2040995853:
                    if (key.equals("boxartId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1915815848:
                    if (key.equals("isVideoAvailable")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1809429645:
                    if (key.equals("displayString")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1776440658:
                    if (key.equals("enableTitleGroupTreatment")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482998339:
                    if (key.equals("entityType")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1185088852:
                    if (key.equals("imgUrl")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1067396154:
                    if (key.equals("trackId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -416615408:
                    if (key.equals("unifiedEntityId")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -249089288:
                    if (key.equals("preQueryBoxartId")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 135683246:
                    if (key.equals("isPreRelease")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 389958385:
                    if (key.equals("preQueryImgUrl")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 452782838:
                    if (key.equals(SignupConstants.Field.VIDEO_ID)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1332961877:
                    if (key.equals("videoType")) {
                        c = 14;
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
                    this.displayHeader = value.getAsString();
                    break;
                case 1:
                    this.entityId = value.getAsString();
                    break;
                case 2:
                    this.boxartId = value.getAsString();
                    break;
                case 3:
                    this.isVideoAvailable = value.getAsBoolean();
                    break;
                case 4:
                    this.displayString = value.getAsString();
                    break;
                case 5:
                    this.enableTitleGroupTreatment = value.getAsBoolean();
                    break;
                case 6:
                    this.entityType = value.getAsString();
                    break;
                case 7:
                    this.imgUrl = value.getAsString();
                    break;
                case '\b':
                    this.trackId = value.getAsInt();
                    break;
                case '\t':
                    this.unifiedEntityId = value.getAsString();
                    break;
                case '\n':
                    this.preQueryBoxartId = value.getAsString();
                    break;
                case 11:
                    this.isPreRelease = value.getAsBoolean();
                    break;
                case '\f':
                    this.preQueryImgUrl = value.getAsString();
                    break;
                case '\r':
                    this.videoId = value.getAsString();
                    break;
                case 14:
                    this.videoType = value.getAsString();
                    break;
            }
        }
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public VideoType getVideoType() {
        return VideoType.create(this.videoType);
    }

    @Override // com.netflix.model.leafs.SearchCollectionEntity
    public Boolean getIsVideoAvailable() {
        return Boolean.valueOf(this.isVideoAvailable);
    }

    public String toString() {
        return "SearchCollectionEntity [videoId=" + this.videoId + ", entityId=" + this.entityId + ", unifiedEntityId=" + this.unifiedEntityId + ", displayString=" + this.displayString + ", displayHeader=" + this.displayHeader + ", entityType=" + this.entityType + ", trackId=" + this.trackId + ", imgUrl=" + this.imgUrl + ", boxartId=" + this.boxartId + ", preQueryImgUrl=" + this.preQueryImgUrl + ", preQueryBoxartId=" + this.preQueryBoxartId + ", isVideoAvailable=" + this.isVideoAvailable + ", enableTitleGroupTreatment=" + this.enableTitleGroupTreatment + ", isPreRelease=" + this.isPreRelease + "]";
    }
}
