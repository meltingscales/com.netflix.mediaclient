package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import java.util.Map;
import o.C8632dsu;
import o.dqE;

/* loaded from: classes2.dex */
public final class OptionField extends Field implements GetField {
    private Map<String, ? extends Field> fields;

    @Override // com.netflix.android.moneyball.GetField
    public Map<String, Field> getFields() {
        return this.fields;
    }

    @Override // com.netflix.android.moneyball.GetField
    public void setFields(Map<String, ? extends Field> map) {
        C8632dsu.c((Object) map, "");
        this.fields = map;
    }

    @Override // com.netflix.android.moneyball.GetField
    public OptionField findOptionField(String str, ChoiceField choiceField) {
        return GetField.DefaultImpls.findOptionField(this, str, choiceField);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        Map<String, ? extends Field> d;
        Map d2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
        d = dqE.d();
        this.fields = d;
        d2 = dqE.d();
        Object attrWithDefault = getAttrWithDefault("fields", d2);
        C8632dsu.d(attrWithDefault);
        initFields((Map) attrWithDefault, flowMode);
    }
}
