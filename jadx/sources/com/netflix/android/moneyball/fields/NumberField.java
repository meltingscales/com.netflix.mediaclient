package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import java.util.Map;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class NumberField extends Field implements FieldValidator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
    }

    @Override // com.netflix.android.moneyball.fields.Field
    public Object getValue() {
        if (super.getValue() instanceof String) {
            String obj = super.getValue().toString();
            return obj.length() > 0 ? Long.valueOf(Long.parseLong(obj)) : obj;
        } else if (super.getValue() instanceof Number) {
            Object value = super.getValue();
            C8632dsu.d(value);
            return Long.valueOf(((Number) value).longValue());
        } else {
            return super.getValue();
        }
    }

    @Override // com.netflix.android.moneyball.fields.Field
    public void setValue(Object obj) {
        Long l;
        C8632dsu.c(obj, "");
        if (obj instanceof String) {
            String obj2 = obj.toString();
            int length = obj2.length();
            l = obj2;
            if (length > 0) {
                l = Long.valueOf(Long.parseLong(obj2));
            }
        } else {
            l = obj;
        }
        Long l2 = l;
        if (obj instanceof Number) {
            l2 = Long.valueOf(((Number) obj).longValue());
        }
        super.setValue(l2);
    }

    public final long getMinValue() {
        if (getData().containsKey("minValue")) {
            if (getData().get("minValue") instanceof String) {
                return Long.parseLong(String.valueOf(getData().get("minValue")));
            }
            Object obj = getData().get("minValue");
            C8632dsu.d(obj);
            return ((Number) obj).longValue();
        }
        return Long.MIN_VALUE;
    }

    public final long getMaxValue() {
        if (getData().containsKey("maxValue")) {
            if (getData().get("maxValue") instanceof String) {
                Object obj = getData().get("maxValue");
                C8632dsu.d(obj);
                return Long.parseLong((String) obj);
            }
            Object obj2 = getData().get("maxValue");
            C8632dsu.d(obj2);
            return ((Number) obj2).longValue();
        }
        return Long.MAX_VALUE;
    }

    @Override // com.netflix.android.moneyball.fields.FieldValidator
    public boolean isValid() {
        boolean z = true;
        boolean z2 = getMinValue() > Long.MIN_VALUE;
        boolean z3 = getMaxValue() < Long.MAX_VALUE;
        if (getValue() instanceof Number) {
            if (z2) {
                Object value = getValue();
                C8632dsu.d(value);
                if (((Long) value).longValue() < getMinValue()) {
                    z = false;
                }
            }
            if (z3) {
                Object value2 = getValue();
                C8632dsu.d(value2);
                if (((Long) value2).longValue() > getMaxValue()) {
                    return false;
                }
            }
            return z;
        }
        return false;
    }
}
