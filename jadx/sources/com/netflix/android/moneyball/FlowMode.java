package com.netflix.android.moneyball;

import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.ChoiceField;
import com.netflix.android.moneyball.fields.DataBacked;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.android.moneyball.fields.OptionField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.C8632dsu;
import o.dqF;

/* loaded from: classes2.dex */
public final class FlowMode implements GetField, DataBacked {
    private final Map<String, Object> data;
    private Map<String, ? extends Field> fields;

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Map<String, Object> getData() {
        return this.data;
    }

    @Override // com.netflix.android.moneyball.GetField
    public Map<String, Field> getFields() {
        return this.fields;
    }

    @Override // com.netflix.android.moneyball.GetField
    public void setFields(Map<String, ? extends Field> map) {
        C8632dsu.c((Object) map, "");
        this.fields = map;
    }

    public FlowMode(Map<String, Object> map) {
        C8632dsu.c((Object) map, "");
        this.data = map;
        this.fields = dqF.c();
        Object attrWithDefault = getAttrWithDefault("fields", dqF.c());
        C8632dsu.d(attrWithDefault);
        initFields((Map) attrWithDefault, this);
    }

    @Override // com.netflix.android.moneyball.GetField
    public OptionField findOptionField(String str, ChoiceField choiceField) {
        return GetField.DefaultImpls.findOptionField(this, str, choiceField);
    }

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Object getAttr(String str) {
        return DataBacked.DefaultImpls.getAttr(this, str);
    }

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Object getAttrWithDefault(String str, Object obj) {
        return DataBacked.DefaultImpls.getAttrWithDefault(this, str, obj);
    }

    @Override // com.netflix.android.moneyball.GetField
    public Field getField(String str) {
        return GetField.DefaultImpls.getField(this, str);
    }

    @Override // com.netflix.android.moneyball.GetField
    public Field getFieldNonResursive(String str) {
        return GetField.DefaultImpls.getFieldNonResursive(this, str);
    }

    @Override // com.netflix.android.moneyball.GetField
    public void initFields(Map<String, ? extends Object> map, FlowMode flowMode) {
        GetField.DefaultImpls.initFields(this, map, flowMode);
    }

    public final String getFlow() {
        Object attrWithDefault = getAttrWithDefault("flow", "");
        C8632dsu.d(attrWithDefault);
        return (String) attrWithDefault;
    }

    public final String getMode() {
        Object attrWithDefault = getAttrWithDefault("mode", SignupConstants.Mode.WARN_USER);
        C8632dsu.d(attrWithDefault);
        return (String) attrWithDefault;
    }

    public final String getNetflixClientPlatform() {
        Object attrWithDefault = getAttrWithDefault(SignupConstants.Key.NETFLIX_CLIENT_PLATFORM, SignupConstants.AndroidPlatform.ANDROID_WEBVIEW);
        C8632dsu.d(attrWithDefault);
        return (String) attrWithDefault;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FlowMode) {
            FlowMode flowMode = (FlowMode) obj;
            if (C8632dsu.c((Object) getFlow(), (Object) flowMode.getFlow()) && C8632dsu.c((Object) getMode(), (Object) flowMode.getMode())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getData().hashCode() * 31) + getFields().hashCode();
    }
}
