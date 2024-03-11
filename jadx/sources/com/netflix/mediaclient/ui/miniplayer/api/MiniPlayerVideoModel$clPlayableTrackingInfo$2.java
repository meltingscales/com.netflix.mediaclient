package com.netflix.mediaclient.ui.miniplayer.api;

import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoModel$clPlayableTrackingInfo$2;
import kotlin.jvm.internal.Lambda;
import o.C6728cil;
import o.C8632dsu;
import o.drO;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class MiniPlayerVideoModel$clPlayableTrackingInfo$2 extends Lambda implements drO<TrackingInfo> {
    final /* synthetic */ C6728cil b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerVideoModel$clPlayableTrackingInfo$2(C6728cil c6728cil) {
        super(0);
        this.b = c6728cil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject a(JSONObject jSONObject) {
        C8632dsu.c((Object) jSONObject, "");
        return jSONObject;
    }

    @Override // o.drO
    /* renamed from: e */
    public final TrackingInfo invoke() {
        final JSONObject jSONObject = new JSONObject();
        C6728cil c6728cil = this.b;
        jSONObject.put("uiLabel", String.valueOf(c6728cil.b()));
        jSONObject.put("location", c6728cil.i());
        jSONObject.put("listId", c6728cil.n().getListId());
        jSONObject.put(Payload.PARAM_RENO_REQUEST_ID, c6728cil.n().getRequestId());
        jSONObject.put("trackId", c6728cil.n().getTrackId());
        jSONObject.put("videoMerchComputeId", c6728cil.n().h());
        jSONObject.put(SignupConstants.Field.VIDEO_ID, c6728cil.k());
        jSONObject.put("row", c6728cil.r());
        jSONObject.put("rank", c6728cil.s());
        jSONObject.put("unifiedEntityId", c6728cil.n().f());
        jSONObject.put("isUIAutoPlay", c6728cil.n().b());
        return new TrackingInfo() { // from class: o.cij
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject a;
                a = MiniPlayerVideoModel$clPlayableTrackingInfo$2.a(JSONObject.this);
                return a;
            }
        };
    }
}
