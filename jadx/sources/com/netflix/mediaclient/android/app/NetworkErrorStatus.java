package com.netflix.mediaclient.android.app;

import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.StatusCode;
import o.C8169dfM;

/* loaded from: classes3.dex */
public class NetworkErrorStatus extends BaseStatus {
    private VolleyError b;
    private Error c;

    @Override // com.netflix.mediaclient.android.app.BaseStatus
    public Error a() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean k() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String l() {
        return null;
    }

    public NetworkErrorStatus(VolleyError volleyError) {
        this.e = StatusCode.NETWORK_ERROR;
        this.b = volleyError;
        this.c = C8169dfM.b(volleyError);
    }

    public String toString() {
        return "NetworkErrorStatus{VolleyError=" + this.b + ", Error=" + this.c + '}';
    }
}
