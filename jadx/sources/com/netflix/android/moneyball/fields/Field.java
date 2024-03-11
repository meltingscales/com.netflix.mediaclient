package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.fields.DataBacked;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class Field implements DataBacked {
    private final Map<String, Object> data;
    private final FlowMode flowMode;
    private final String id;

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Map<String, Object> getData() {
        return this.data;
    }

    public FlowMode getFlowMode() {
        return this.flowMode;
    }

    public final String getId() {
        return this.id;
    }

    public Field(String str, Map<String, Object> map, FlowMode flowMode) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
        this.id = str;
        this.data = map;
        this.flowMode = flowMode;
    }

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Object getAttr(String str) {
        return DataBacked.DefaultImpls.getAttr(this, str);
    }

    @Override // com.netflix.android.moneyball.fields.DataBacked
    public Object getAttrWithDefault(String str, Object obj) {
        return DataBacked.DefaultImpls.getAttrWithDefault(this, str, obj);
    }

    public Object getValue() {
        return getAttrWithDefault("value", "");
    }

    public void setValue(Object obj) {
        C8632dsu.c(obj, "");
        getData().put("value", obj);
    }

    public final boolean isEmpty() {
        return getAttr("value") == null;
    }

    public final boolean isHidden() {
        Object attrWithDefault = getAttrWithDefault("hidden", Boolean.FALSE);
        if (attrWithDefault instanceof String) {
            return Boolean.parseBoolean((String) attrWithDefault);
        }
        C8632dsu.d(attrWithDefault);
        return ((Boolean) attrWithDefault).booleanValue();
    }

    public final boolean isReadOnly() {
        if (getData().containsKey("readOnly")) {
            Object obj = getData().get("readOnly");
            return C8632dsu.c(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE);
        }
        return false;
    }

    public final boolean isRequired() {
        if (getData().containsKey("required")) {
            Object obj = getData().get("required");
            return C8632dsu.c(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE);
        }
        return false;
    }
}
