package com.netflix.cl.model.event.discrete;

import com.netflix.cl.model.CellularDataUsageLevel;
import com.netflix.cl.model.StorageLocationKind;
import com.netflix.cl.model.VideoQualityLevel;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AccountSettingsReported extends DiscreteEvent {
    private Boolean allowNotificationsSetting;
    private CellularDataUsageLevel cellularDataUsageSetting;
    private StorageLocationKind downloadLocationSetting;
    private VideoQualityLevel downloadVideoQualitySetting;
    private Boolean downloadedForYouSetting;
    private Boolean smartDownloadsSetting;
    private Boolean wifiOnlyDownloadsSetting;

    public AccountSettingsReported(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, CellularDataUsageLevel cellularDataUsageLevel, StorageLocationKind storageLocationKind, VideoQualityLevel videoQualityLevel) {
        addContextType("AccountSettingsReported");
        this.allowNotificationsSetting = bool;
        this.smartDownloadsSetting = bool2;
        this.wifiOnlyDownloadsSetting = bool3;
        this.downloadedForYouSetting = bool4;
        this.cellularDataUsageSetting = cellularDataUsageLevel;
        this.downloadLocationSetting = storageLocationKind;
        this.downloadVideoQualitySetting = videoQualityLevel;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "allowNotificationsSetting", this.allowNotificationsSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "smartDownloadsSetting", this.smartDownloadsSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "wifiOnlyDownloadsSetting", this.wifiOnlyDownloadsSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "downloadedForYouSetting", this.downloadedForYouSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "cellularDataUsageSetting", this.cellularDataUsageSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "downloadLocationSetting", this.downloadLocationSetting);
        ExtCLUtils.addObjectToJson(jSONObject, "downloadVideoQualitySetting", this.downloadVideoQualitySetting);
        return jSONObject;
    }
}
