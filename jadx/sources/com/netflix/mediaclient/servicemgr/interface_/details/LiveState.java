package com.netflix.mediaclient.servicemgr.interface_.details;

import com.google.gson.annotations.SerializedName;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LiveState {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ LiveState[] f;
    @SerializedName("None")
    public static final LiveState e = new LiveState("None", 0);
    @SerializedName("Upcoming")
    public static final LiveState c = new LiveState("Upcoming", 1);
    @SerializedName("Now")
    public static final LiveState a = new LiveState("Now", 2);
    @SerializedName("Past")
    public static final LiveState d = new LiveState("Past", 3);

    private static final /* synthetic */ LiveState[] c() {
        return new LiveState[]{e, c, a, d};
    }

    public static LiveState valueOf(String str) {
        return (LiveState) Enum.valueOf(LiveState.class, str);
    }

    public static LiveState[] values() {
        return (LiveState[]) f.clone();
    }

    public final boolean b() {
        return this != e;
    }

    private LiveState(String str, int i) {
    }

    static {
        LiveState[] c2 = c();
        f = c2;
        b = C8600drp.e(c2);
    }
}
