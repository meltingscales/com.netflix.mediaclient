package com.netflix.mediaclient.ui.home.impl.lolomo.items;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.ui.home.impl.lolomo.items.ErrorCreator$errorLoadingLolomo$2$3;
import kotlin.jvm.internal.Lambda;
import o.drO;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ErrorCreator$errorLoadingLolomo$2$3 extends Lambda implements drO<TrackingInfo> {
    public static final ErrorCreator$errorLoadingLolomo$2$3 d = new ErrorCreator$errorLoadingLolomo$2$3();

    ErrorCreator$errorLoadingLolomo$2$3() {
        super(0);
    }

    @Override // o.drO
    /* renamed from: d */
    public final TrackingInfo invoke() {
        return new TrackingInfo() { // from class: o.bUz
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = ErrorCreator$errorLoadingLolomo$2$3.a();
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trackId", 260235066);
        return jSONObject;
    }
}
