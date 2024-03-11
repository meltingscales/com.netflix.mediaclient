package o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphqlrepo.api.errors.ErrorDetail;
import com.netflix.mediaclient.graphqlrepo.api.errors.ErrorType;
import java.util.Map;
import o.aCR;

/* loaded from: classes3.dex */
public final class aCR {
    private final InterfaceC8554dpx a;
    private final Map<String, Object> c;
    private final InterfaceC8554dpx d;
    private final InterfaceC8554dpx e;

    public aCR(Map<String, ? extends Object> map) {
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        this.c = map;
        b = dpB.b(new drO<ErrorType>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.TypedError$errorType$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final ErrorType invoke() {
                Map map2;
                ErrorType.e eVar = ErrorType.c;
                map2 = aCR.this.c;
                Object obj = map2 != null ? map2.get("errorType") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    str = "UNKNOWN";
                }
                return eVar.d(str);
            }
        });
        this.e = b;
        b2 = dpB.b(new drO<String>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.TypedError$origin$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final String invoke() {
                Map map2;
                map2 = aCR.this.c;
                Object obj = map2 != null ? map2.get(AppMeasurementSdk.ConditionalUserProperty.ORIGIN) : null;
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            }
        });
        this.d = b2;
        b3 = dpB.b(new drO<ErrorDetail>() { // from class: com.netflix.mediaclient.graphqlrepo.api.errors.TypedError$errorDetail$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final ErrorDetail invoke() {
                Map map2;
                map2 = aCR.this.c;
                Object obj = map2 != null ? map2.get("errorDetail") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    return ErrorDetail.c.e(str);
                }
                return null;
            }
        });
        this.a = b3;
    }

    public final ErrorType c() {
        return (ErrorType) this.e.getValue();
    }

    public final String d() {
        return (String) this.d.getValue();
    }

    public final ErrorDetail a() {
        return (ErrorDetail) this.a.getValue();
    }

    public final Map<?, ?> e() {
        Map<String, Object> map = this.c;
        Object obj = map != null ? map.get(SignupConstants.Error.DEBUG_FIELD_INFO) : null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public String toString() {
        ErrorType c = c();
        String d = d();
        ErrorDetail a = a();
        Map<?, ?> e = e();
        return "TypedError(errorType = " + c + ", origin = " + d + ", errorDetail = " + a + ", debugInfo = " + e + ")";
    }
}
