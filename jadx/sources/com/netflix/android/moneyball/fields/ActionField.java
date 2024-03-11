package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import com.netflix.android.moneyball.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C8168dfL;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.dqC;
import o.dsA;
import o.dtC;

/* loaded from: classes2.dex */
public final class ActionField extends Field {
    static final /* synthetic */ dtC<Object>[] $$delegatedProperties = {dsA.b(new MutablePropertyReference1Impl(ActionField.class, "withFields", "getWithFields()Ljava/util/List;", 0))};
    private final Map withFields$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        List<String> j;
        int d;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
        this.withFields$delegate = map;
        Object attrWithDefault = getAttrWithDefault("withFields", "");
        if (attrWithDefault instanceof String) {
            String[] b = C8168dfL.b((String) attrWithDefault, ",");
            C8632dsu.a(b, "");
            j = C8569dql.j(Arrays.copyOf(b, b.length));
            d = C8572dqo.d(j, 10);
            ArrayList arrayList = new ArrayList(d);
            for (String str2 : j) {
                arrayList.add(C8168dfL.j(str2));
            }
            setWithFields(arrayList);
            return;
        }
        C8632dsu.d(attrWithDefault);
        setWithFields((List) attrWithDefault);
    }

    private final List<String> getWithFields() {
        Object b;
        b = dqC.b(this.withFields$delegate, $$delegatedProperties[0].getName());
        return (List) b;
    }

    private final void setWithFields(List<String> list) {
        this.withFields$delegate.put($$delegatedProperties[0].getName(), list);
    }

    public final String getMode() {
        Object attrWithDefault = getAttrWithDefault("mode", "");
        C8632dsu.d(attrWithDefault);
        return (String) attrWithDefault;
    }

    public final String getFlow() {
        Object attrWithDefault = getAttrWithDefault("flow", "");
        C8632dsu.d(attrWithDefault);
        return (String) attrWithDefault;
    }

    public final List<Field> getRequiredFields() {
        Field field;
        GetField findParent = findParent(getFlowMode());
        List<String> withFields = getWithFields();
        ArrayList arrayList = new ArrayList();
        for (String str : withFields) {
            if (findParent == null || (field = findParent.getField(str)) == null) {
                field = getFlowMode().getField(str);
            }
            if (field != null) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    private final GetField findParent(GetField getField) {
        if (getField.getFields().containsValue(this)) {
            return getField;
        }
        for (Field field : getField.getFields().values()) {
            if (field instanceof GetField) {
                GetField findParent = findParent((GetField) field);
                if (findParent != null) {
                    return findParent;
                }
            } else if (field instanceof ChoiceField) {
                for (OptionField optionField : ((ChoiceField) field).getOptions()) {
                    GetField findParent2 = findParent(optionField);
                    if (findParent2 != null) {
                        return findParent2;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return null;
    }

    public final ActionExecutionResult execute() {
        return new ActionExecutionResult(this, getRequiredFields(), null, null, 12, null);
    }
}
