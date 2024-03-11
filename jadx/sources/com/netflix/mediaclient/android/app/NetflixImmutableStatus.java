package com.netflix.mediaclient.android.app;

import com.netflix.cl.model.Error;
import com.netflix.mediaclient.StatusCode;

/* loaded from: classes3.dex */
public final class NetflixImmutableStatus extends BaseStatus {
    private static final long serialVersionUID = -5942279556763023564L;

    @Override // com.netflix.mediaclient.android.app.BaseStatus
    public Error a() {
        return null;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean k() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public String l() {
        return null;
    }

    public NetflixImmutableStatus(StatusCode statusCode) {
        this.e = statusCode;
    }

    public String toString() {
        return "NetflixImmutableStatus, " + this.e;
    }
}
