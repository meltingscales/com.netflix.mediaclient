package androidx.room;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class RoomMasterTable {
    public static final RoomMasterTable INSTANCE = new RoomMasterTable();

    private RoomMasterTable() {
    }

    public static final String createInsertQuery(String str) {
        C8632dsu.c((Object) str, "");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
