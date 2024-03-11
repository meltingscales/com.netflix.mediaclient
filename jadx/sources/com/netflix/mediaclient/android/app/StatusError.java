package com.netflix.mediaclient.android.app;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class StatusError extends Error {
    private final Status c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatusError) && C8632dsu.c(this.c, ((StatusError) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        Status status = this.c;
        return "StatusError(status=" + status + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusError(Status status) {
        super(status.e());
        C8632dsu.c((Object) status, "");
        this.c = status;
    }
}
