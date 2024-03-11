package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import java.util.Map;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes2.dex */
public final class BooleanField extends Field {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
    }

    @Override // com.netflix.android.moneyball.fields.Field
    public Object getValue() {
        boolean a;
        Object value = super.getValue();
        if (value instanceof String) {
            a = C8691duz.a("true", (String) value, true);
            if (a) {
                return Boolean.TRUE;
            }
        }
        return value instanceof Boolean ? value : Boolean.FALSE;
    }

    @Override // com.netflix.android.moneyball.fields.Field
    public void setValue(Object obj) {
        boolean a;
        C8632dsu.c(obj, "");
        if (obj instanceof String) {
            a = C8691duz.a("true", (String) obj, true);
            if (a) {
                super.setValue(Boolean.TRUE);
                return;
            }
        }
        if (obj instanceof Boolean) {
            super.setValue(obj);
        } else {
            super.setValue(Boolean.FALSE);
        }
    }
}
