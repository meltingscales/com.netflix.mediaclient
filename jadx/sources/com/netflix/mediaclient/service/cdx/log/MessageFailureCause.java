package com.netflix.mediaclient.service.cdx.log;

import com.netflix.model.leafs.originals.interactive.Audio;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MessageFailureCause {
    private static final /* synthetic */ MessageFailureCause[] a;
    public static final MessageFailureCause b = new MessageFailureCause(Audio.TYPE.timeout, 0);
    public static final MessageFailureCause c = new MessageFailureCause("no_connectivity", 1);
    private static final /* synthetic */ InterfaceC8598drn e;

    private static final /* synthetic */ MessageFailureCause[] e() {
        return new MessageFailureCause[]{b, c};
    }

    public static MessageFailureCause valueOf(String str) {
        return (MessageFailureCause) Enum.valueOf(MessageFailureCause.class, str);
    }

    public static MessageFailureCause[] values() {
        return (MessageFailureCause[]) a.clone();
    }

    private MessageFailureCause(String str, int i) {
    }

    static {
        MessageFailureCause[] e2 = e();
        a = e2;
        e = C8600drp.e(e2);
    }
}
