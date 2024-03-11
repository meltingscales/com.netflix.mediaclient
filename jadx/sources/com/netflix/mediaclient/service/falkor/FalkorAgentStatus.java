package com.netflix.mediaclient.service.falkor;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import o.InterfaceC1078Nw;

/* loaded from: classes3.dex */
public class FalkorAgentStatus extends NetflixStatus {
    private final String f;
    private final boolean g;
    private final String j;

    public String m() {
        return this.f;
    }

    public String n() {
        return this.j;
    }

    public boolean o() {
        return this.g;
    }

    protected FalkorAgentStatus(StatusCode statusCode, String str, String str2, boolean z) {
        super(statusCode);
        this.f = str;
        this.j = str2;
        this.g = z;
    }

    public static Status c(NetflixImmutableStatus netflixImmutableStatus, String str, String str2, boolean z) {
        return netflixImmutableStatus == InterfaceC1078Nw.aJ ? new FalkorAgentStatus(StatusCode.OK, str, str2, z) : netflixImmutableStatus;
    }
}
