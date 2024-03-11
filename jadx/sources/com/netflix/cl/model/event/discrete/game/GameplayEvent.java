package com.netflix.cl.model.event.discrete.game;

import com.netflix.cl.model.event.discrete.DiscreteEvent;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class GameplayEvent extends DiscreteEvent {
    private String gameplaySessionId;

    public GameplayEvent(String str) {
        addContextType("game.GameplayEvent");
        this.gameplaySessionId = str;
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addStringToJson(jSONObject, "gameplaySessionId", this.gameplaySessionId);
        return jSONObject;
    }
}
