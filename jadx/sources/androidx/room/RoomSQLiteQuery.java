package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes5.dex */
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    public static final Companion Companion = new Companion(null);
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();
    private int argCount;
    private final int[] bindingTypes;
    public final byte[][] blobBindings;
    private final int capacity;
    public final double[] doubleBindings;
    public final long[] longBindings;
    private volatile String query;
    public final String[] stringBindings;

    public /* synthetic */ RoomSQLiteQuery(int i, C8627dsp c8627dsp) {
        this(i);
    }

    public static final RoomSQLiteQuery acquire(String str, int i) {
        return Companion.acquire(str, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int getArgCount() {
        return this.argCount;
    }

    public final void init(String str, int i) {
        C8632dsu.c((Object) str, "");
        this.query = str;
        this.argCount = i;
    }

    private RoomSQLiteQuery(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2];
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            Companion.prunePoolLocked$room_runtime_release();
            dpR dpr = dpR.c;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        C8632dsu.c((Object) supportSQLiteProgram, "");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                supportSQLiteProgram.bindNull(i);
            } else if (i2 == 2) {
                supportSQLiteProgram.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                supportSQLiteProgram.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                supportSQLiteProgram.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                supportSQLiteProgram.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        this.bindingTypes[i] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        this.bindingTypes[i] = 2;
        this.longBindings[i] = j;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        this.bindingTypes[i] = 3;
        this.doubleBindings[i] = d;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        C8632dsu.c((Object) str, "");
        this.bindingTypes[i] = 4;
        this.stringBindings[i] = str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        this.bindingTypes[i] = 5;
        this.blobBindings[i] = bArr;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final RoomSQLiteQuery acquire(String str, int i) {
            C8632dsu.c((Object) str, "");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    RoomSQLiteQuery value = ceilingEntry.getValue();
                    value.init(str, i);
                    C8632dsu.a(value, "");
                    return value;
                }
                dpR dpr = dpR.c;
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i, null);
                roomSQLiteQuery.init(str, i);
                return roomSQLiteQuery;
            }
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() > 15) {
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                C8632dsu.a(it, "");
                for (int size = treeMap.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }
}
