package com.netflix.partner.card;

import android.util.SparseArray;

/* loaded from: classes7.dex */
public enum CardCommandType {
    WARMUP(1),
    ENTRY(2),
    USER_REFRESH(3),
    IMPRESSION(4),
    USER_HIDE_CARD(5),
    USER_REMOVE_CARD(6);
    
    private static SparseArray h = new SparseArray();
    public int g;

    static {
        CardCommandType[] values;
        int i;
        for (CardCommandType cardCommandType : values()) {
            h.put(cardCommandType.g, cardCommandType);
        }
    }

    CardCommandType(int i) {
        this.g = i;
    }

    public static CardCommandType b(int i) {
        return (CardCommandType) h.get(i);
    }
}
