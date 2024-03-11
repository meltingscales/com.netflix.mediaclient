package o;

import android.database.sqlite.SQLiteStatement;
import com.google.gson.Gson;
import kotlin.Triple;

/* renamed from: o.Hz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0928Hz extends AbstractC0924Hv<Triple<? extends String, ? extends HZ, ? extends Long>> implements InterfaceC0913Hk {
    public static final a c = new a(null);
    private final C0916Hn b;
    private final Gson d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928Hz(C0915Hm c0915Hm, Gson gson, C0916Hn c0916Hn, long j) {
        super(c0915Hm, "INSERT OR REPLACE INTO falcor_leafs(path, path_hashcode, type, expires, timestamp, size, write_time, access_time, value) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", j);
        C8632dsu.c((Object) c0915Hm, "");
        C8632dsu.c((Object) gson, "");
        C8632dsu.c((Object) c0916Hn, "");
        this.d = gson;
        this.b = c0916Hn;
    }

    /* renamed from: o.Hz$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("SqliteDiskCacheWriter");
        }
    }

    @Override // o.InterfaceC0913Hk
    public void c(String str, HZ hz, Long l) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) hz, "");
        b((C0928Hz) new Triple(str, hz, l));
    }

    private final void c(SQLiteStatement sQLiteStatement, int i, Long l) {
        if (l != null) {
            sQLiteStatement.bindLong(i, l.longValue());
        } else {
            sQLiteStatement.bindNull(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.database.sqlite.SQLiteStatement r22, java.lang.String r23, o.HZ r24, long r25, java.lang.Long r27) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0928Hz.b(android.database.sqlite.SQLiteStatement, java.lang.String, o.HZ, long, java.lang.Long):void");
    }

    private final void e(SQLiteStatement sQLiteStatement, String str, int i, Long l, Long l2, Integer num, long j, Object obj) {
        sQLiteStatement.bindString(1, str);
        sQLiteStatement.bindLong(2, str.hashCode());
        sQLiteStatement.bindLong(3, i);
        c(sQLiteStatement, 4, l);
        c(sQLiteStatement, 5, l2);
        c(sQLiteStatement, 6, num != null ? Long.valueOf(num.intValue()) : null);
        sQLiteStatement.bindLong(7, j);
        sQLiteStatement.bindLong(8, j);
        if ((obj instanceof byte[]) && this.b.b()) {
            sQLiteStatement.bindBlob(9, (byte[]) obj);
        } else if ((obj instanceof String) && !this.b.b()) {
            sQLiteStatement.bindString(9, (String) obj);
        } else if (obj == null) {
            sQLiteStatement.bindNull(9);
        } else {
            Class<?> cls = obj.getClass();
            throw new UnsupportedOperationException("unsupported value type: " + cls);
        }
        c.getLogTag();
        sQLiteStatement.execute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0924Hv
    /* renamed from: b */
    public void d(SQLiteStatement sQLiteStatement, Triple<String, ? extends HZ, Long> triple, long j) {
        C8632dsu.c((Object) sQLiteStatement, "");
        C8632dsu.c((Object) triple, "");
        c.getLogTag();
        b(sQLiteStatement, triple.c(), triple.b(), j, triple.f());
    }
}
