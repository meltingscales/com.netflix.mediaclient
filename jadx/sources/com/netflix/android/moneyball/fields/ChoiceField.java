package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class ChoiceField extends Field {
    private String _value;
    private OptionField option;
    private List<OptionField> options;

    public final OptionField getOption() {
        return this.option;
    }

    public final List<OptionField> getOptions() {
        return this.options;
    }

    public final void setOptions(List<OptionField> list) {
        C8632dsu.c((Object) list, "");
        this.options = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoiceField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        List<OptionField> i;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
        i = C8569dql.i();
        this.options = i;
        this._value = "";
        Object attrWithDefault = getAttrWithDefault("value", "");
        C8632dsu.d(attrWithDefault);
        this._value = (String) attrWithDefault;
        Object attr = getAttr("options");
        if (attr instanceof List) {
            initOptions((List) attr);
        }
    }

    public final void setOption(OptionField optionField) {
        Object value = optionField != null ? optionField.getValue() : null;
        this._value = value instanceof String ? (String) value : null;
        this.option = optionField;
    }

    public final int getIndex() {
        OptionField optionField = this.option;
        if (optionField != null) {
            List<OptionField> list = this.options;
            C8632dsu.d(optionField);
            return list.indexOf(optionField);
        }
        return 0;
    }

    @Override // com.netflix.android.moneyball.fields.Field
    public Object getValue() {
        OptionField optionField = this.option;
        if ((optionField != null ? optionField.getValue() : null) == null) {
            String str = this._value;
            return str == null ? "" : str;
        }
        OptionField optionField2 = this.option;
        Object value = optionField2 != null ? optionField2.getValue() : null;
        C8632dsu.d(value);
        return (String) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.netflix.android.moneyball.fields.Field
    public void setValue(Object obj) {
        C8632dsu.c(obj, "");
        List<OptionField> list = this.options;
        OptionField optionField = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C8632dsu.c(((OptionField) next).getValue(), obj)) {
                    optionField = next;
                    break;
                }
            }
            optionField = optionField;
        }
        if (optionField != null) {
            setOption(optionField);
            this._value = (String) obj;
        }
    }

    public final OptionField getOption(String str) {
        Object obj;
        C8632dsu.c((Object) str, "");
        Iterator<T> it = this.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C8632dsu.c(((OptionField) obj).getValue(), (Object) str)) {
                break;
            }
        }
        return (OptionField) obj;
    }

    public final void initOptions(List<? extends Map<String, Object>> list) {
        int d;
        C8632dsu.c((Object) list, "");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OptionField optionField = new OptionField(getId(), (Map) it.next(), getFlowMode());
            if (C8632dsu.c(optionField.getValue(), (Object) this._value)) {
                setOption(optionField);
            }
            arrayList.add(optionField);
        }
        this.options = arrayList;
    }
}
