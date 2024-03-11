package o;

import android.content.Context;
import android.util.LruCache;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import o.AbstractC7642d;
import o.C8632dsu;
import o.C9516r;
import o.C9632u;
import o.C9738w;
import o.InterfaceC9092j;
import o.InterfaceC9357o;
import o.InterfaceC9866y;

/* renamed from: o.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9632u implements InterfaceC9569s {
    private final d a;
    private final int b;
    private final LinkedHashMap<String, Set<AbstractC7642d.c>> c;
    private final InterfaceC8554dpx d;
    private final SupportSQLiteOpenHelper e;
    private final Long i;
    private final ThreadLocal<InterfaceC9092j.b> j;

    private C9632u(SupportSQLiteOpenHelper supportSQLiteOpenHelper, final SupportSQLiteDatabase supportSQLiteDatabase, int i, Long l) {
        InterfaceC8554dpx b2;
        this.e = supportSQLiteOpenHelper;
        this.b = i;
        this.i = l;
        if (!((supportSQLiteOpenHelper != null) ^ (supportSQLiteDatabase != null))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.j = new ThreadLocal<>();
        b2 = dpB.b(new drO<SupportSQLiteDatabase>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$database$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final SupportSQLiteDatabase invoke() {
                SupportSQLiteOpenHelper supportSQLiteOpenHelper2;
                SupportSQLiteDatabase writableDatabase;
                supportSQLiteOpenHelper2 = C9632u.this.e;
                if (supportSQLiteOpenHelper2 == null || (writableDatabase = supportSQLiteOpenHelper2.getWritableDatabase()) == null) {
                    SupportSQLiteDatabase supportSQLiteDatabase2 = supportSQLiteDatabase;
                    C8632dsu.d(supportSQLiteDatabase2);
                    return supportSQLiteDatabase2;
                }
                return writableDatabase;
            }
        });
        this.d = b2;
        this.a = new d(i);
        this.c = new LinkedHashMap<>();
    }

    /* synthetic */ C9632u(SupportSQLiteOpenHelper supportSQLiteOpenHelper, SupportSQLiteDatabase supportSQLiteDatabase, int i, Long l, int i2, C8627dsp c8627dsp) {
        this((i2 & 1) != 0 ? null : supportSQLiteOpenHelper, (i2 & 2) != 0 ? null : supportSQLiteDatabase, i, (i2 & 8) != 0 ? null : l);
    }

    @Override // o.InterfaceC9569s
    public /* synthetic */ InterfaceC9357o b(Integer num, String str, drM drm, int i, drM drm2) {
        return InterfaceC9357o.d.d(e(num, str, drm, i, drm2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteDatabase b() {
        return (SupportSQLiteDatabase) this.d.getValue();
    }

    public /* synthetic */ C9632u(InterfaceC9410p interfaceC9410p, Context context, String str, SupportSQLiteOpenHelper.Factory factory, SupportSQLiteOpenHelper.Callback callback, int i, boolean z, Long l, int i2, C8627dsp c8627dsp) {
        this(interfaceC9410p, context, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? new FrameworkSQLiteOpenHelperFactory() : factory, (i2 & 16) != 0 ? new c(interfaceC9410p, new C9198l[0]) : callback, (i2 & 32) != 0 ? 20 : i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9632u(InterfaceC9410p<InterfaceC9357o.d<dpR>> interfaceC9410p, Context context, String str, SupportSQLiteOpenHelper.Factory factory, SupportSQLiteOpenHelper.Callback callback, int i, boolean z, Long l) {
        this(factory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(context).callback(callback).name(str).noBackupDirectory(z).build()), null, i, l);
        C8632dsu.c((Object) interfaceC9410p, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) callback, "");
    }

    /* renamed from: o.u$d */
    /* loaded from: classes2.dex */
    public static final class d extends LruCache<Integer, InterfaceC9866y> {
        d(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, Integer num, InterfaceC9866y interfaceC9866y, InterfaceC9866y interfaceC9866y2) {
            d(z, num.intValue(), interfaceC9866y, interfaceC9866y2);
        }

        protected void d(boolean z, int i, InterfaceC9866y interfaceC9866y, InterfaceC9866y interfaceC9866y2) {
            C8632dsu.c((Object) interfaceC9866y, "");
            if (z) {
                interfaceC9866y.c();
            }
        }
    }

    @Override // o.InterfaceC9569s
    public void d(String... strArr) {
        C8632dsu.c((Object) strArr, "");
        LinkedHashSet<AbstractC7642d.c> linkedHashSet = new LinkedHashSet();
        synchronized (this.c) {
            for (String str : strArr) {
                Set<AbstractC7642d.c> set = this.c.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
            dpR dpr = dpR.c;
        }
        for (AbstractC7642d.c cVar : linkedHashSet) {
            cVar.a();
        }
    }

    @Override // o.InterfaceC9569s
    public InterfaceC9357o<InterfaceC9092j.b> a() {
        InterfaceC9092j.b bVar = this.j.get();
        b bVar2 = new b(bVar);
        this.j.set(bVar2);
        if (bVar == null) {
            b().beginTransactionNonExclusive();
        }
        return InterfaceC9357o.d.d(InterfaceC9357o.d.a(bVar2));
    }

    @Override // o.InterfaceC9569s
    public InterfaceC9092j.b d() {
        return this.j.get();
    }

    /* renamed from: o.u$b */
    /* loaded from: classes2.dex */
    public final class b extends InterfaceC9092j.b {
        private final InterfaceC9092j.b e;

        @Override // o.InterfaceC9092j.b
        public InterfaceC9092j.b a() {
            return this.e;
        }

        public b(InterfaceC9092j.b bVar) {
            this.e = bVar;
        }

        @Override // o.InterfaceC9092j.b
        public InterfaceC9357o<dpR> e(boolean z) {
            if (a() == null) {
                if (z) {
                    C9632u.this.b().setTransactionSuccessful();
                    C9632u.this.b().endTransaction();
                } else {
                    C9632u.this.b().endTransaction();
                }
            }
            C9632u.this.j.set(a());
            return InterfaceC9357o.d.d(InterfaceC9357o.e.e());
        }
    }

    private final <T> Object e(Integer num, drO<? extends InterfaceC9866y> dro, drM<? super InterfaceC9463q, dpR> drm, drM<? super InterfaceC9866y, ? extends T> drm2) {
        InterfaceC9866y remove = num != null ? this.a.remove(num) : null;
        if (remove == null) {
            remove = dro.invoke();
        }
        if (drm != null) {
            try {
                drm.invoke(remove);
            } catch (Throwable th) {
                if (num != null) {
                    InterfaceC9866y put = this.a.put(num, remove);
                    if (put != null) {
                        put.c();
                    }
                } else {
                    remove.c();
                }
                throw th;
            }
        }
        Object a = InterfaceC9357o.d.a(drm2.invoke(remove));
        if (num != null) {
            InterfaceC9866y put2 = this.a.put(num, remove);
            if (put2 != null) {
                put2.c();
            }
        } else {
            remove.c();
        }
        return a;
    }

    @Override // o.InterfaceC9569s
    public InterfaceC9357o<Long> b(Integer num, final String str, int i, drM<? super InterfaceC9463q, dpR> drm) {
        C8632dsu.c((Object) str, "");
        return InterfaceC9357o.d.d(e(num, new drO<InterfaceC9866y>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$execute$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final InterfaceC9866y invoke() {
                return new C9516r(C9632u.this.b().compileStatement(str));
            }
        }, drm, new drM<InterfaceC9866y, Long>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$execute$2
            @Override // o.drM
            /* renamed from: a */
            public final Long invoke(InterfaceC9866y interfaceC9866y) {
                C8632dsu.c((Object) interfaceC9866y, "");
                return Long.valueOf(interfaceC9866y.a());
            }
        }));
    }

    public <R> Object e(Integer num, final String str, final drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm, final int i, drM<? super InterfaceC9463q, dpR> drm2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        return e(num, new drO<InterfaceC9866y>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$executeQuery$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final InterfaceC9866y invoke() {
                Long l;
                String str2 = str;
                SupportSQLiteDatabase b2 = this.b();
                int i2 = i;
                l = this.i;
                return new C9738w(str2, b2, i2, l);
            }
        }, drm2, new drM<InterfaceC9866y, R>() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$executeQuery$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final R invoke(InterfaceC9866y interfaceC9866y) {
                C8632dsu.c((Object) interfaceC9866y, "");
                return (R) interfaceC9866y.e(drm);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dpR dpr;
        this.a.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.e;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            b().close();
        }
    }

    /* renamed from: o.u$c */
    /* loaded from: classes2.dex */
    public static class c extends SupportSQLiteOpenHelper.Callback {
        private final InterfaceC9410p<InterfaceC9357o.d<dpR>> a;
        private final C9198l[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC9410p<InterfaceC9357o.d<dpR>> interfaceC9410p, C9198l... c9198lArr) {
            super((int) interfaceC9410p.c());
            C8632dsu.c((Object) interfaceC9410p, "");
            C8632dsu.c((Object) c9198lArr, "");
            if (interfaceC9410p.c() <= 2147483647L) {
                this.a = interfaceC9410p;
                this.d = c9198lArr;
                return;
            }
            throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + interfaceC9410p.c() + '.').toString());
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            this.a.a(new C9632u(null, supportSQLiteDatabase, 1, null, 8, null));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            C8632dsu.c((Object) supportSQLiteDatabase, "");
            C9198l[] c9198lArr = this.d;
            this.a.e(new C9632u(null, supportSQLiteDatabase, 1, null, 8, null), i, i2, (C9198l[]) Arrays.copyOf(c9198lArr, c9198lArr.length));
        }
    }
}
