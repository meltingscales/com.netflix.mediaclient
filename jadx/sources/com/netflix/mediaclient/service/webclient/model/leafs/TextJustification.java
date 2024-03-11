package com.netflix.mediaclient.service.webclient.model.leafs;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TextJustification {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ TextJustification[] $VALUES;
    public static final TextJustification START = new TextJustification("START", 0);
    public static final TextJustification END = new TextJustification("END", 1);
    public static final TextJustification LEFT = new TextJustification("LEFT", 2);
    public static final TextJustification CENTER = new TextJustification("CENTER", 3);
    public static final TextJustification RIGHT = new TextJustification("RIGHT", 4);

    private static final /* synthetic */ TextJustification[] $values() {
        return new TextJustification[]{START, END, LEFT, CENTER, RIGHT};
    }

    public static InterfaceC8598drn<TextJustification> getEntries() {
        return $ENTRIES;
    }

    public static TextJustification valueOf(String str) {
        return (TextJustification) Enum.valueOf(TextJustification.class, str);
    }

    public static TextJustification[] values() {
        return (TextJustification[]) $VALUES.clone();
    }

    private TextJustification(String str, int i) {
    }

    static {
        TextJustification[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
    }
}
