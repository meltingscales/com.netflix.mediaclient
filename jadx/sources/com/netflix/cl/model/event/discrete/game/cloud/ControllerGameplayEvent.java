package com.netflix.cl.model.event.discrete.game.cloud;

import com.netflix.cl.model.event.discrete.game.GameplayEvent;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ControllerGameplayEvent extends GameplayEvent {
    private String gameApplianceContainerId;
    private String gameApplianceUuid;
    private Long monoTimeMs;
    private String ssicClientId;

    public ControllerGameplayEvent(String str, Long l, String str2, String str3, String str4) {
        super(str4);
        addContextType("game.cloud.ControllerGameplayEvent");
        this.gameApplianceContainerId = str;
        this.monoTimeMs = l;
        this.ssicClientId = str2;
        this.gameApplianceUuid = str3;
    }

    @Override // com.netflix.cl.model.event.discrete.game.GameplayEvent, com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "gameApplianceContainerId", this.gameApplianceContainerId);
        ExtCLUtils.addObjectToJson(jSONObject, "monoTimeMs", this.monoTimeMs);
        ExtCLUtils.addStringToJson(jSONObject, "ssicClientId", this.ssicClientId);
        ExtCLUtils.addStringToJson(jSONObject, "gameApplianceUuid", this.gameApplianceUuid);
        return jSONObject;
    }
}
