package com.netflix.cl.model.event.discrete.secondscreen;

import com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.cl.model.secondscreen.SSICOrientation;
import com.netflix.cl.model.secondscreen.SafeAreaSize;
import com.netflix.cl.model.secondscreen.ScreenResolution;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Connection extends ControllerGameplayEvent {
    private String beaconId;
    private String beaconInfo;
    private Double canopusRedeemTime;
    private String cloudGameSessionId;
    private Double controllerInitTime;
    private SSICOrientation deviceOrientation;
    private String error;
    private String osVersion;
    private SafeAreaSize safeAreaSize;
    private ScreenResolution screenResolution;
    private ConnectionSource source;

    public Connection(String str, String str2, Double d, Double d2, String str3, ConnectionSource connectionSource, String str4, String str5, SafeAreaSize safeAreaSize, SSICOrientation sSICOrientation, ScreenResolution screenResolution, String str6, Long l, String str7, String str8, String str9) {
        super(str6, l, str7, str8, str9);
        addContextType("secondscreen.Connection");
        this.beaconInfo = str;
        this.cloudGameSessionId = str2;
        this.controllerInitTime = d;
        this.canopusRedeemTime = d2;
        this.beaconId = str3;
        this.source = connectionSource;
        this.error = str4;
        this.osVersion = str5;
        this.safeAreaSize = safeAreaSize;
        this.deviceOrientation = sSICOrientation;
        this.screenResolution = screenResolution;
    }

    @Override // com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent, com.netflix.cl.model.event.discrete.game.GameplayEvent, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "beaconInfo", this.beaconInfo);
        ExtCLUtils.addStringToJson(jSONObject, "cloudGameSessionId", this.cloudGameSessionId);
        ExtCLUtils.addObjectToJson(jSONObject, "controllerInitTime", this.controllerInitTime);
        ExtCLUtils.addObjectToJson(jSONObject, "canopusRedeemTime", this.canopusRedeemTime);
        ExtCLUtils.addStringToJson(jSONObject, "beaconId", this.beaconId);
        ExtCLUtils.addObjectToJson(jSONObject, NetflixActivity.EXTRA_SOURCE, this.source);
        ExtCLUtils.addStringToJson(jSONObject, UmaAlert.ICON_ERROR, this.error);
        ExtCLUtils.addStringToJson(jSONObject, "osVersion", this.osVersion);
        ExtCLUtils.addObjectToJson(jSONObject, "safeAreaSize", this.safeAreaSize);
        ExtCLUtils.addObjectToJson(jSONObject, "deviceOrientation", this.deviceOrientation);
        ExtCLUtils.addObjectToJson(jSONObject, "screenResolution", this.screenResolution);
        return jSONObject;
    }
}
