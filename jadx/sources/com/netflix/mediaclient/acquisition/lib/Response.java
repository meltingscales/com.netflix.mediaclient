package com.netflix.mediaclient.acquisition.lib;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class Response {
    private final int httpStatusCode;
    private final MoneyballData moneyballData;
    private final Request request;
    private final String resErrorKey;
    private final Status status;

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final MoneyballData getMoneyballData() {
        return this.moneyballData;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final String getResErrorKey() {
        return this.resErrorKey;
    }

    public final Status getStatus() {
        return this.status;
    }

    public Response(Status status, int i, MoneyballData moneyballData, Request request, String str) {
        C8632dsu.c((Object) status, "");
        C8632dsu.c((Object) request, "");
        this.status = status;
        this.httpStatusCode = i;
        this.moneyballData = moneyballData;
        this.request = request;
        this.resErrorKey = str;
    }

    public final boolean isValidState() {
        MoneyballData moneyballData;
        return (!this.status.j() || (moneyballData = this.moneyballData) == null || NetworkRequestResponseListenerKt.access$isWarnUserMode(moneyballData)) ? false : true;
    }
}
