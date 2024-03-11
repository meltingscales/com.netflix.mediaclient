package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class InvalidationLiveDataContainer {
    private final RoomDatabase database;
    private final Set<LiveData<?>> liveDataSet;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        C8632dsu.c((Object) roomDatabase, "");
        this.database = roomDatabase;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C8632dsu.a(newSetFromMap, "");
        this.liveDataSet = newSetFromMap;
    }
}
