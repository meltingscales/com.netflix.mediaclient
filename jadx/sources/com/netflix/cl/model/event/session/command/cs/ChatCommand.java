package com.netflix.cl.model.event.session.command.cs;

import com.netflix.cl.model.event.session.command.Command;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ChatCommand extends Command {
    public ChatCommand() {
        addContextType("cs.ChatCommand");
    }

    @Override // com.netflix.cl.model.event.Event, com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        return super.toJSONObject();
    }
}
