package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CommanderState {
    private static final /* synthetic */ CommanderState[] c;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final CommanderState b = new CommanderState("CONDENSED", 0);
    public static final CommanderState d = new CommanderState("COLLAPSED", 1);
    public static final CommanderState a = new CommanderState("EXPANDED", 2);

    private static final /* synthetic */ CommanderState[] b() {
        return new CommanderState[]{b, d, a};
    }

    public static CommanderState valueOf(String str) {
        return (CommanderState) Enum.valueOf(CommanderState.class, str);
    }

    public static CommanderState[] values() {
        return (CommanderState[]) c.clone();
    }

    private CommanderState(String str, int i) {
    }

    static {
        CommanderState[] b2 = b();
        c = b2;
        e = C8600drp.e(b2);
    }
}
