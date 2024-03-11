package com.netflix.mediaclient.acquisition.lib;

import o.C8632dsu;

/* loaded from: classes3.dex */
public final class Request {
    private final String action;
    private final String flow;
    private final String memberStatus;
    private final String mode;

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = request.flow;
        }
        if ((i & 2) != 0) {
            str2 = request.mode;
        }
        if ((i & 4) != 0) {
            str3 = request.action;
        }
        if ((i & 8) != 0) {
            str4 = request.memberStatus;
        }
        return request.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.flow;
    }

    public final String component2() {
        return this.mode;
    }

    public final String component3() {
        return this.action;
    }

    public final String component4() {
        return this.memberStatus;
    }

    public final Request copy(String str, String str2, String str3, String str4) {
        return new Request(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Request) {
            Request request = (Request) obj;
            return C8632dsu.c((Object) this.flow, (Object) request.flow) && C8632dsu.c((Object) this.mode, (Object) request.mode) && C8632dsu.c((Object) this.action, (Object) request.action) && C8632dsu.c((Object) this.memberStatus, (Object) request.memberStatus);
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getMemberStatus() {
        return this.memberStatus;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        String str = this.flow;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.action;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.memberStatus;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.flow;
        String str2 = this.mode;
        String str3 = this.action;
        String str4 = this.memberStatus;
        return "Request(flow=" + str + ", mode=" + str2 + ", action=" + str3 + ", memberStatus=" + str4 + ")";
    }

    public Request(String str, String str2, String str3, String str4) {
        this.flow = str;
        this.mode = str2;
        this.action = str3;
        this.memberStatus = str4;
    }
}
