package com.netflix.mediaclient.ui.home.impl.mynetflix;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.ui.home.impl.mynetflix.MyNetflixEpoxyController$errorLoadingLolomo$2$3;
import kotlin.jvm.internal.Lambda;
import o.drO;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MyNetflixEpoxyController$errorLoadingLolomo$2$3 extends Lambda implements drO<TrackingInfo> {
    public static final MyNetflixEpoxyController$errorLoadingLolomo$2$3 b = new MyNetflixEpoxyController$errorLoadingLolomo$2$3();

    MyNetflixEpoxyController$errorLoadingLolomo$2$3() {
        super(0);
    }

    @Override // o.drO
    /* renamed from: b */
    public final TrackingInfo invoke() {
        return new TrackingInfo() { // from class: o.bWd
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = MyNetflixEpoxyController$errorLoadingLolomo$2$3.a();
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
