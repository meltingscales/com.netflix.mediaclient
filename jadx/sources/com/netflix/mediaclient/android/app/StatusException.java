package com.netflix.mediaclient.android.app;

/* loaded from: classes3.dex */
public class StatusException extends Exception {
    private Status d;

    public StatusException(Status status) {
        super("status code: " + status.c() + " - " + status.l(), status.e());
        this.d = status;
    }
}
