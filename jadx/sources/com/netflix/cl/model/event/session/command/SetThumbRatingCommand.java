package com.netflix.cl.model.event.session.command;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SetThumbRatingCommand extends Command {
    public SetThumbRatingCommand() {
        addContextType("SetThumbRatingCommand");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
