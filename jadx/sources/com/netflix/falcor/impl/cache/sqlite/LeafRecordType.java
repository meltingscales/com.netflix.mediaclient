package com.netflix.falcor.impl.cache.sqlite;

/* loaded from: classes3.dex */
public enum LeafRecordType {
    ATOM_STRING(1),
    ATOM_NUMBER(2),
    ATOM_BOOLEAN(3),
    ATOM_NULL(4),
    ATOM_JSON(5),
    REF(6),
    UNDEFINED(7),
    ERROR(8),
    LEAFY_OBJECT(9);
    
    public final int f;

    LeafRecordType(int i) {
        this.f = i;
    }

    public static LeafRecordType d(int i) {
        switch (i) {
            case 1:
                return ATOM_STRING;
            case 2:
                return ATOM_NUMBER;
            case 3:
                return ATOM_BOOLEAN;
            case 4:
                return ATOM_NULL;
            case 5:
                return ATOM_JSON;
            case 6:
                return REF;
            case 7:
                return UNDEFINED;
            case 8:
                return ERROR;
            case 9:
                return LEAFY_OBJECT;
            default:
                throw new IllegalArgumentException("id out of bounds: " + i);
        }
    }
}
