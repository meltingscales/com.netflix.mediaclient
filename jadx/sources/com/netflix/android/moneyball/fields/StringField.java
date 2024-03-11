package com.netflix.android.moneyball.fields;

import com.netflix.android.moneyball.FlowMode;
import java.math.BigDecimal;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class StringField extends Field implements FieldValidator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringField(String str, Map<String, Object> map, FlowMode flowMode) {
        super(str, map, flowMode);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) flowMode, "");
    }

    public final int getMinLength() {
        if (getData().containsKey("minLength")) {
            if (getData().get("minLength") instanceof Long) {
                Object obj = getData().get("minLength");
                C8632dsu.d(obj);
                return (int) ((Long) obj).longValue();
            }
            return new BigDecimal(String.valueOf(getData().get("minLength"))).intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final int getMaxLength() {
        if (getData().containsKey("maxLength")) {
            if (getData().get("maxLength") instanceof Long) {
                Object obj = getData().get("maxLength");
                C8632dsu.d(obj);
                return (int) ((Long) obj).longValue();
            }
            return new BigDecimal(String.valueOf(getData().get("maxLength"))).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final Boolean localize() {
        if (getData().containsKey("localize")) {
            if (getData().get("localize") instanceof Boolean) {
                Object obj = getData().get("localize");
                C8632dsu.d(obj);
                return (Boolean) obj;
            }
            Object obj2 = getData().get("localize");
            C8632dsu.d(obj2);
            return Boolean.valueOf(Boolean.parseBoolean((String) obj2));
        }
        return Boolean.FALSE;
    }

    public final Pattern getValidationRegex() {
        if (getData().containsKey("validationRegex")) {
            Object obj = getData().get("validationRegex");
            C8632dsu.d(obj);
            return Pattern.compile((String) obj, 2);
        }
        return null;
    }

    @Override // com.netflix.android.moneyball.fields.FieldValidator
    public boolean isValid() {
        boolean containsKey = getData().containsKey("minLength");
        boolean containsKey2 = getData().containsKey("maxLength");
        boolean z = true;
        boolean z2 = getValidationRegex() != null;
        if (getValue() instanceof String) {
            if (z2) {
                Pattern validationRegex = getValidationRegex();
                if (validationRegex != null) {
                    Object value = getValue();
                    C8632dsu.d(value);
                    Matcher matcher = validationRegex.matcher((String) value);
                    if (matcher != null) {
                        z = matcher.matches();
                    }
                }
                z = false;
            }
            if (containsKey && getValue().toString().length() < getMinLength()) {
                z = false;
            }
            if (containsKey2) {
                Object value2 = getValue();
                C8632dsu.d(value2);
                if (((String) value2).length() > getMaxLength()) {
                    return false;
                }
            }
            return z;
        }
        return false;
    }
}
