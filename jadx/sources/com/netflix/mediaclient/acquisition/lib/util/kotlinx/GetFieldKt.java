package com.netflix.mediaclient.acquisition.lib.util.kotlinx;

import com.netflix.android.moneyball.GetField;
import com.netflix.android.moneyball.fields.Field;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import java.util.List;
import java.util.Map;
import o.C8576dqs;
import o.C8632dsu;
import o.InterfaceC8612dsa;
import o.dpR;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GetFieldKt {
    public static /* synthetic */ Object getTypedPathValue$default(Map map, List list, boolean z, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj) {
        String d;
        if ((i & 2) != 0) {
            z = false;
        }
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) list);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        if (pathValue == null) {
            pathValue = null;
            if (z) {
                interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return pathValue;
    }

    public static final /* synthetic */ <T> T getTypedPathValue(Map<String, ? extends Object> map, List<String> list, boolean z, InterfaceC8612dsa<? super String, ? super String, ? super JSONObject, dpR> interfaceC8612dsa) {
        String d;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        T t = (T) KeyPathEvaluationKt.getPathValue((Object) map, list);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        if (t == null) {
            t = null;
            if (z) {
                interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }

    public static /* synthetic */ Object getTypedFieldValue$default(GetField getField, String str, JSONObject jSONObject, boolean z, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj) {
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        Field field = getField.getField(str);
        Object value = field != null ? field.getValue() : null;
        if (value != null) {
            C8632dsu.a(3, "T?");
            return value;
        } else if (z) {
            interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
            return null;
        } else {
            return null;
        }
    }

    public static final /* synthetic */ <T> T getTypedFieldValue(GetField getField, String str, JSONObject jSONObject, boolean z, InterfaceC8612dsa<? super String, ? super String, ? super JSONObject, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        Field field = getField.getField(str);
        Object value = field != null ? field.getValue() : null;
        if (value != null) {
            C8632dsu.a(3, "T?");
            return (T) value;
        } else if (z) {
            interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ Field getTypedField$default(GetField getField, String str, boolean z, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        Field field = getField.getField(str);
        if (field == null) {
            field = null;
            if (z) {
                interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return field;
    }

    public static final /* synthetic */ <T extends Field> T getTypedField(GetField getField, String str, boolean z, InterfaceC8612dsa<? super String, ? super String, ? super JSONObject, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        T t = (T) getField.getField(str);
        if (t == null) {
            t = null;
            if (z) {
                interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }

    public static /* synthetic */ Object attemptAndLogTypedCast$default(Object obj, String str, JSONObject jSONObject, boolean z, InterfaceC8612dsa interfaceC8612dsa, int i, Object obj2) {
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        if (obj != null) {
            C8632dsu.a(3, "T");
            return obj;
        }
        if (z) {
            interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T attemptAndLogTypedCast(Object obj, String str, JSONObject jSONObject, boolean z, InterfaceC8612dsa<? super String, ? super String, ? super JSONObject, dpR> interfaceC8612dsa) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC8612dsa, "");
        if (obj != 0) {
            C8632dsu.a(3, "T");
            return obj;
        }
        if (z) {
            interfaceC8612dsa.invoke(SignupConstants.Error.MISSING_FIELD_ERROR, str, jSONObject);
        }
        return null;
    }

    public static /* synthetic */ Object getTypedPathValue$default(Map map, SignupErrorReporter signupErrorReporter, List list, boolean z, int i, Object obj) {
        String d;
        if ((i & 4) != 0) {
            z = false;
        }
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) list, "");
        Object pathValue = KeyPathEvaluationKt.getPathValue((Object) map, (List<String>) list);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        if (pathValue == null) {
            pathValue = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return pathValue;
    }

    public static /* synthetic */ Object getTypedFieldValue$default(GetField getField, SignupErrorReporter signupErrorReporter, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) str, "");
        Field field = getField.getField(str);
        Object value = field != null ? field.getValue() : null;
        if (value != null) {
            C8632dsu.a(3, "T?");
            return value;
        } else if (z) {
            signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ Field getTypedField$default(GetField getField, SignupErrorReporter signupErrorReporter, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) str, "");
        Field field = getField.getField(str);
        if (field == null) {
            field = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return field;
    }

    public static final /* synthetic */ <T> T getTypedPathValue(Map<String, ? extends Object> map, SignupErrorReporter signupErrorReporter, List<String> list, boolean z) {
        String d;
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) list, "");
        T t = (T) KeyPathEvaluationKt.getPathValue((Object) map, list);
        d = C8576dqs.d(list, ",", null, null, 0, null, null, 62, null);
        if (t == null) {
            t = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, d, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }

    public static final /* synthetic */ <T> T getTypedFieldValue(GetField getField, SignupErrorReporter signupErrorReporter, String str, boolean z) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) str, "");
        Field field = getField.getField(str);
        Object value = field != null ? field.getValue() : null;
        if (value != null) {
            C8632dsu.a(3, "T?");
            return (T) value;
        } else if (z) {
            signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            return null;
        } else {
            return null;
        }
    }

    public static final /* synthetic */ <T extends Field> T getTypedField(GetField getField, SignupErrorReporter signupErrorReporter, String str, boolean z) {
        C8632dsu.c((Object) getField, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        C8632dsu.c((Object) str, "");
        T t = (T) getField.getField(str);
        if (t == null) {
            t = null;
            if (z) {
                signupErrorReporter.onDataError(SignupConstants.Error.MISSING_FIELD_ERROR, str, null);
            }
        } else {
            C8632dsu.a(3, "T?");
        }
        return t;
    }
}
