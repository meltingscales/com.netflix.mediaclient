package com.apollographql.apollo3.network.ws;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class WsFrameType {
    public static final WsFrameType a = new WsFrameType("Text", 0);
    public static final WsFrameType b = new WsFrameType("Binary", 1);
    private static final /* synthetic */ WsFrameType[] c;
    private static final /* synthetic */ InterfaceC8598drn e;

    private static final /* synthetic */ WsFrameType[] a() {
        return new WsFrameType[]{a, b};
    }

    public static WsFrameType valueOf(String str) {
        return (WsFrameType) Enum.valueOf(WsFrameType.class, str);
    }

    public static WsFrameType[] values() {
        return (WsFrameType[]) c.clone();
    }

    private WsFrameType(String str, int i) {
    }

    static {
        WsFrameType[] a2 = a();
        c = a2;
        e = C8600drp.e(a2);
    }
}
