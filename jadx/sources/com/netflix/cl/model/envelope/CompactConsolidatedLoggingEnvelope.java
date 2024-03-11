package com.netflix.cl.model.envelope;

import com.netflix.cl.Platform;
import com.netflix.cl.model.ContextType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CompactConsolidatedLoggingEnvelope implements LoggingEnvelope {
    private SortedMap<Long, ContextType> currentState = Collections.synchronizedSortedMap(new TreeMap());
    private List<ReverseDelta> snapshosts = new ArrayList();

    public CompactConsolidatedLoggingEnvelope(Map<Long, ContextType> map, List<ReverseDelta> list) {
        Platform.getLocalLogger().debug("Current state map size: %d", Integer.valueOf(map.size()));
        this.currentState.putAll(map);
        Platform.getLocalLogger().debug("Snapshots: %d", Integer.valueOf(list.size()));
        this.snapshosts.addAll(list);
    }

    @Override // com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CompactConsolidatedLoggingEnvelope");
        jSONObject.put("version", 2);
        jSONObject.put("clientSendTime", Platform.getCurrentTimeInMs());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("currentState", jSONObject2);
        for (Long l : this.currentState.keySet()) {
            Platform.LocalLogger localLogger = Platform.getLocalLogger();
            localLogger.debug("Add to current state " + l);
            jSONObject2.put(l.toString(), this.currentState.get(l).toJSONObject());
        }
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("reverseDeltas", jSONArray);
        for (ReverseDelta reverseDelta : this.snapshosts) {
            reverseDelta.addItself(jSONArray);
        }
        return jSONObject;
    }
}
