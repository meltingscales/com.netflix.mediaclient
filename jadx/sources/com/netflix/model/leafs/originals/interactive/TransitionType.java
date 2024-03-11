package com.netflix.model.leafs.originals.interactive;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TransitionType {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ TransitionType[] $VALUES;
    private final String transition;
    public static final TransitionType LAZY = new TransitionType("LAZY", 0, "lazy");
    public static final TransitionType IMMEDIATE = new TransitionType("IMMEDIATE", 1, "immediate");
    public static final TransitionType DELAYED_SEAMLESS = new TransitionType("DELAYED_SEAMLESS", 2, "delayedSeamless");

    private static final /* synthetic */ TransitionType[] $values() {
        return new TransitionType[]{LAZY, IMMEDIATE, DELAYED_SEAMLESS};
    }

    public static InterfaceC8598drn<TransitionType> getEntries() {
        return $ENTRIES;
    }

    public static TransitionType valueOf(String str) {
        return (TransitionType) Enum.valueOf(TransitionType.class, str);
    }

    public static TransitionType[] values() {
        return (TransitionType[]) $VALUES.clone();
    }

    public final String getTransition() {
        return this.transition;
    }

    private TransitionType(String str, int i, String str2) {
        this.transition = str2;
    }

    static {
        TransitionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
