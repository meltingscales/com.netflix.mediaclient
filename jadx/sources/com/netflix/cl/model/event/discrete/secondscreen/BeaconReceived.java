package com.netflix.cl.model.event.discrete.secondscreen;

import com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BeaconReceived extends ControllerGameplayEvent {
    private String beaconId;
    private ConnectionSource beaconSource;

    public BeaconReceived(ConnectionSource connectionSource, String str, String str2, Long l, String str3, String str4, String str5) {
        super(str2, l, str3, str4, str5);
        addContextType("secondscreen.BeaconReceived");
        this.beaconSource = connectionSource;
        this.beaconId = str;
    }

    @Override // com.netflix.cl.model.event.discrete.game.cloud.ControllerGameplayEvent, com.netflix.cl.model.event.discrete.game.GameplayEvent, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "beaconSource", this.beaconSource);
        ExtCLUtils.addStringToJson(jSONObject, "beaconId", this.beaconId);
        return jSONObject;
    }
}
