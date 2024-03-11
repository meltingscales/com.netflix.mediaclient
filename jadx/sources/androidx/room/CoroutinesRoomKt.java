package androidx.room;

import java.util.Map;
import o.C8632dsu;
import o.C8767dxu;
import o.dwQ;

/* loaded from: classes5.dex */
public final class CoroutinesRoomKt {
    public static final dwQ getQueryDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = C8767dxu.e(roomDatabase.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        C8632dsu.d(obj);
        return (dwQ) obj;
    }

    public static final dwQ getTransactionDispatcher(RoomDatabase roomDatabase) {
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = C8767dxu.e(roomDatabase.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        C8632dsu.d(obj);
        return (dwQ) obj;
    }
}
