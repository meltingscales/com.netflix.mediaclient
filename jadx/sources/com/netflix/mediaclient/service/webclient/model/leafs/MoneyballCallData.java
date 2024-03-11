package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.ActionField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.FieldValidator;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1332Xp;
import o.C8168dfL;

/* loaded from: classes4.dex */
public class MoneyballCallData {
    private String actionId;
    public Map<String, String> extraRequestArgs;
    public String flow;
    public String mode;
    public String moneyBallActionModeOverride;
    private List<Field> withFields;

    public boolean isValid() {
        List<Field> list = this.withFields;
        if (list == null || list.size() <= 0) {
            return true;
        }
        for (Field field : this.withFields) {
            if ((field instanceof FieldValidator) && !((FieldValidator) field).isValid()) {
                return false;
            }
        }
        return true;
    }

    public MoneyballCallData(FlowMode flowMode, String str, ActionField actionField) {
        this.extraRequestArgs = Collections.emptyMap();
        this.flow = flowMode.getFlow();
        this.mode = flowMode.getMode();
        this.actionId = actionField.getId();
        this.moneyBallActionModeOverride = str;
        this.withFields = actionField.getRequiredFields();
    }

    public MoneyballCallData(String str, String str2, String str3) {
        this.extraRequestArgs = Collections.emptyMap();
        this.flow = str;
        this.mode = str2;
        this.actionId = str3;
        this.withFields = Collections.emptyList();
    }

    public Map<String, Map<String, String>> getFieldValueMap() {
        HashMap hashMap = new HashMap();
        List<Field> list = this.withFields;
        if (list != null) {
            for (Field field : list) {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("value", field.getValue().toString());
                hashMap.put(field.getId(), hashMap2);
            }
        }
        return hashMap;
    }

    public String toJsonString() {
        HashMap hashMap = new HashMap();
        hashMap.put("flow", this.flow);
        if (C8168dfL.h(this.moneyBallActionModeOverride)) {
            hashMap.put("mode", this.moneyBallActionModeOverride);
        } else {
            hashMap.put("mode", this.mode);
        }
        String str = this.actionId;
        if (str != null) {
            hashMap.put(SignupConstants.Error.DEBUG_INFO_ACTION, str);
        }
        if (!this.withFields.isEmpty()) {
            hashMap.put("fields", getFieldValueMap());
        }
        return ((Gson) C1332Xp.b(Gson.class)).toJson(hashMap);
    }
}
