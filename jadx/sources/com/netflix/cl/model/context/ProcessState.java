package com.netflix.cl.model.context;

import com.netflix.cl.model.AllocationMode;
import com.netflix.cl.model.ComputationMode;
import com.netflix.cl.model.InteractionMode;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ProcessState extends CLContext {
    private AllocationMode allocation;
    private ComputationMode computation;
    private InteractionMode interaction;

    public ProcessState(AllocationMode allocationMode, InteractionMode interactionMode, ComputationMode computationMode) {
        addContextType("ProcessState");
        this.allocation = allocationMode;
        this.interaction = interactionMode;
        this.computation = computationMode;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "allocation", this.allocation);
        ExtCLUtils.addObjectToJson(jSONObject, "interaction", this.interaction);
        ExtCLUtils.addObjectToJson(jSONObject, "computation", this.computation);
        return jSONObject;
    }
}
