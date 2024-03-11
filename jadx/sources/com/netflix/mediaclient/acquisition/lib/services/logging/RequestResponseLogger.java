package com.netflix.mediaclient.acquisition.lib.services.logging;

import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.webclient.model.leafs.AUIContextData;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import javax.inject.Inject;
import o.C8632dsu;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class RequestResponseLogger implements NetworkRequestResponseListener {
    private final ClientNetworkDetails clientNetworkDetails;
    private final SignupLogger signupLogger;

    @Inject
    public RequestResponseLogger(ClientNetworkDetails clientNetworkDetails, SignupLogger signupLogger) {
        C8632dsu.c((Object) clientNetworkDetails, "");
        C8632dsu.c((Object) signupLogger, "");
        this.clientNetworkDetails = clientNetworkDetails;
        this.signupLogger = signupLogger;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onBeforeNetworkAction(Request request) {
        C8632dsu.c((Object) request, "");
        DebugEvent addProperty = new DebugEvent(getRequestJson(request)).addProperty("message", "auiClientMoneyballRequest");
        C8632dsu.a(addProperty, "");
        this.signupLogger.logEvent(addProperty);
    }

    private final JSONObject getRequestJson(Request request) {
        JSONObject jSONObject = new JSONObject();
        Object flow = request.getFlow();
        if (flow == null) {
            flow = JSONObject.NULL;
        }
        JSONObject put = jSONObject.put("reqFlow", flow);
        Object mode = request.getMode();
        if (mode == null) {
            mode = JSONObject.NULL;
        }
        JSONObject put2 = put.put("reqMode", mode);
        Object memberStatus = request.getMemberStatus();
        if (memberStatus == null) {
            memberStatus = JSONObject.NULL;
        }
        JSONObject put3 = put2.put("reqMemberStatus", memberStatus);
        Object action = request.getAction();
        if (action == null) {
            action = JSONObject.NULL;
        }
        return put3.put(SignupConstants.Error.DEBUG_INFO_ACTION, action).put("clientPlatform", this.clientNetworkDetails.getClientPlatform()).put("swVersion", this.clientNetworkDetails.getSwVersion()).put("endpointVersion", this.clientNetworkDetails.getEndpointVersion());
    }

    @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
    public void onAfterNetworkAction(Response response) {
        Object obj;
        Object obj2;
        Object obj3;
        AUIContextData contextData;
        C8632dsu.c((Object) response, "");
        JSONObject requestJson = getRequestJson(response.getRequest());
        MoneyballData moneyballData = response.getMoneyballData();
        if (moneyballData == null || (obj = moneyballData.getFlow()) == null) {
            obj = JSONObject.NULL;
        }
        JSONObject put = requestJson.put("resFlow", obj);
        MoneyballData moneyballData2 = response.getMoneyballData();
        if (moneyballData2 == null || (obj2 = moneyballData2.getMode()) == null) {
            obj2 = JSONObject.NULL;
        }
        JSONObject put2 = put.put("resMode", obj2);
        MoneyballData moneyballData3 = response.getMoneyballData();
        if (moneyballData3 == null || (contextData = moneyballData3.getContextData()) == null || (obj3 = contextData.getMembershipStatus()) == null) {
            obj3 = JSONObject.NULL;
        }
        DebugEvent addProperty = new DebugEvent(put2.put("resMemberStatus", obj3).put("dynecomError", response.getResErrorKey()).put("httpStatus", response.getHttpStatusCode())).addProperty("message", "auiClientMoneyballResponse");
        C8632dsu.a(addProperty, "");
        this.signupLogger.logEvent(addProperty);
    }
}
