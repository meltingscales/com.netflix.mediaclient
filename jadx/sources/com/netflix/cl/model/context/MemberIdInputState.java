package com.netflix.cl.model.context;

import com.netflix.cl.model.MemberIdInputKind;
import com.netflix.cl.util.ExtCLUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MemberIdInputState extends CLContext {
    private MemberIdInputKind memberIdInputKind;

    public MemberIdInputState(MemberIdInputKind memberIdInputKind) {
        addContextType("MemberIdInputState");
        this.memberIdInputKind = memberIdInputKind;
    }

    @Override // com.netflix.cl.model.ContextType, com.netflix.cl.model.JsonSerializer
    public JSONObject toJSONObject() {
        JSONObject jSONObject = super.toJSONObject();
        ExtCLUtils.addObjectToJson(jSONObject, "memberIdInputKind", this.memberIdInputKind);
        return jSONObject;
    }
}
