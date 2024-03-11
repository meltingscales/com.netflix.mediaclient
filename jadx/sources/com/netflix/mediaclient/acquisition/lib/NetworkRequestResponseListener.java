package com.netflix.mediaclient.acquisition.lib;

/* loaded from: classes3.dex */
public interface NetworkRequestResponseListener {
    void onAfterNetworkAction(Response response);

    void onBeforeNetworkAction(Request request);
}
