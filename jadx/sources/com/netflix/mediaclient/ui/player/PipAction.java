package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.service.pushnotification.Payload;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class PipAction {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ PipAction[] i;
    public static final PipAction d = new PipAction("PAUSE", 0);
    public static final PipAction e = new PipAction(Payload.Action.PLAY, 1);
    public static final PipAction c = new PipAction("FASTFORWARD", 2);
    public static final PipAction b = new PipAction("REWIND", 3);

    private static final /* synthetic */ PipAction[] c() {
        return new PipAction[]{d, e, c, b};
    }

    public static PipAction valueOf(String str) {
        return (PipAction) Enum.valueOf(PipAction.class, str);
    }

    public static PipAction[] values() {
        return (PipAction[]) i.clone();
    }

    private PipAction(String str, int i2) {
    }

    static {
        PipAction[] c2 = c();
        i = c2;
        a = C8600drp.e(c2);
    }
}
