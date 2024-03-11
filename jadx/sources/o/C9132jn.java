package o;

import java.util.Collection;
import o.C8569dql;
import o.C8632dsu;
import o.C9129jk;
import o.C9130jl;
import o.C9132jn;
import o.InterfaceC9145k;
import o.InterfaceC9463q;
import o.InterfaceC9569s;
import o.dpR;
import o.drM;
import o.drX;

/* renamed from: o.jn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9132jn extends AbstractC8933g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9132jn(InterfaceC9569s interfaceC9569s) {
        super(interfaceC9569s);
        C8632dsu.c((Object) interfaceC9569s, "");
    }

    public final <T> AbstractC7642d<T> a(String str, final drX<? super String, ? super String, ? extends T> drx) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drx, "");
        return new b(this, str, new drM<InterfaceC9145k, T>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$recordForKey$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final T invoke(InterfaceC9145k interfaceC9145k) {
                C8632dsu.c((Object) interfaceC9145k, "");
                drX<String, String, T> drx2 = drx;
                String e = interfaceC9145k.e(0);
                C8632dsu.d((Object) e);
                String e2 = interfaceC9145k.e(1);
                C8632dsu.d((Object) e2);
                return drx2.invoke(e, e2);
            }
        });
    }

    public final AbstractC7642d<C9130jl> b(String str) {
        C8632dsu.c((Object) str, "");
        return a(str, new drX<String, String, C9130jl>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$recordForKey$2
            @Override // o.drX
            /* renamed from: d */
            public final C9130jl invoke(String str2, String str3) {
                C8632dsu.c((Object) str2, "");
                C8632dsu.c((Object) str3, "");
                return new C9130jl(str2, str3);
            }
        });
    }

    public final <T> AbstractC7642d<T> b(Collection<String> collection, final drX<? super String, ? super String, ? extends T> drx) {
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) drx, "");
        return new a(this, collection, new drM<InterfaceC9145k, T>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$recordsForKeys$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final T invoke(InterfaceC9145k interfaceC9145k) {
                C8632dsu.c((Object) interfaceC9145k, "");
                drX<String, String, T> drx2 = drx;
                String e = interfaceC9145k.e(0);
                C8632dsu.d((Object) e);
                String e2 = interfaceC9145k.e(1);
                C8632dsu.d((Object) e2);
                return drx2.invoke(e, e2);
            }
        });
    }

    public final AbstractC7642d<C9129jk> d(Collection<String> collection) {
        C8632dsu.c((Object) collection, "");
        return b(collection, new drX<String, String, C9129jk>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$recordsForKeys$2
            @Override // o.drX
            /* renamed from: b */
            public final C9129jk invoke(String str, String str2) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str2, "");
                return new C9129jk(str, str2);
            }
        });
    }

    public final AbstractC3495b<Long> c() {
        return C8986h.c(-1095725844, getDriver(), "json.sq", "changes", "SELECT changes()", new drM<InterfaceC9145k, Long>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$changes$1
            @Override // o.drM
            /* renamed from: d */
            public final Long invoke(InterfaceC9145k interfaceC9145k) {
                C8632dsu.c((Object) interfaceC9145k, "");
                Long b2 = interfaceC9145k.b(0);
                C8632dsu.d(b2);
                return b2;
            }
        });
    }

    public final void d(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        getDriver().b(1943613296, "INSERT INTO records (key, record) VALUES (?,?)", 2, new drM<InterfaceC9463q, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$insert$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                a(interfaceC9463q);
                return dpR.c;
            }

            public final void a(InterfaceC9463q interfaceC9463q) {
                C8632dsu.c((Object) interfaceC9463q, "");
                interfaceC9463q.e(0, str);
                interfaceC9463q.e(1, str2);
            }
        });
        notifyQueries(1943613296, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$insert$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                e(drm);
                return dpR.c;
            }

            public final void e(drM<? super String, dpR> drm) {
                C8632dsu.c((Object) drm, "");
                drm.invoke("records");
            }
        });
    }

    public final void a(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        getDriver().b(-2006407808, "UPDATE records SET record=? WHERE key=?", 2, new drM<InterfaceC9463q, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$update$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                b(interfaceC9463q);
                return dpR.c;
            }

            public final void b(InterfaceC9463q interfaceC9463q) {
                C8632dsu.c((Object) interfaceC9463q, "");
                interfaceC9463q.e(0, str);
                interfaceC9463q.e(1, str2);
            }
        });
        notifyQueries(-2006407808, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$update$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                a(drm);
                return dpR.c;
            }

            public final void a(drM<? super String, dpR> drm) {
                C8632dsu.c((Object) drm, "");
                drm.invoke("records");
            }
        });
    }

    public final void e(final String str) {
        C8632dsu.c((Object) str, "");
        getDriver().b(1791947362, "DELETE FROM records WHERE key=?", 1, new drM<InterfaceC9463q, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$delete$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                b(interfaceC9463q);
                return dpR.c;
            }

            public final void b(InterfaceC9463q interfaceC9463q) {
                C8632dsu.c((Object) interfaceC9463q, "");
                interfaceC9463q.e(0, str);
            }
        });
        notifyQueries(1791947362, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$delete$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                e(drm);
                return dpR.c;
            }

            public final void e(drM<? super String, dpR> drm) {
                C8632dsu.c((Object) drm, "");
                drm.invoke("records");
            }
        });
    }

    public final void b(final String str, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        getDriver().b(1083807030, "DELETE FROM records WHERE key LIKE ? ESCAPE ?", 2, new drM<InterfaceC9463q, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$deleteRecordsWithKeyMatching$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                e(interfaceC9463q);
                return dpR.c;
            }

            public final void e(InterfaceC9463q interfaceC9463q) {
                C8632dsu.c((Object) interfaceC9463q, "");
                interfaceC9463q.e(0, str);
                interfaceC9463q.e(1, str2);
            }
        });
        notifyQueries(1083807030, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$deleteRecordsWithKeyMatching$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                a(drm);
                return dpR.c;
            }

            public final void a(drM<? super String, dpR> drm) {
                C8632dsu.c((Object) drm, "");
                drm.invoke("records");
            }
        });
    }

    public final void d() {
        InterfaceC9569s.e.a(getDriver(), 1755405279, "DELETE FROM records", 0, null, 8, null);
        notifyQueries(1755405279, new drM<drM<? super String, ? extends dpR>, dpR>() { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$deleteAll$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(drM<? super String, ? extends dpR> drm) {
                e(drm);
                return dpR.c;
            }

            public final void e(drM<? super String, dpR> drm) {
                C8632dsu.c((Object) drm, "");
                drm.invoke("records");
            }
        });
    }

    /* renamed from: o.jn$b */
    /* loaded from: classes2.dex */
    public final class b<T> extends AbstractC7642d<T> {
        final /* synthetic */ C9132jn a;
        private final String c;

        public final String e() {
            return this.c;
        }

        public String toString() {
            return "json.sq:recordForKey";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9132jn c9132jn, String str, drM<? super InterfaceC9145k, ? extends T> drm) {
            super(drm);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) drm, "");
            this.a = c9132jn;
            this.c = str;
        }

        @Override // o.AbstractC3495b
        public <R> InterfaceC9357o<R> e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm) {
            C8632dsu.c((Object) drm, "");
            return this.a.getDriver().b(-1788979202, "SELECT key, record FROM records WHERE key=?", drm, 1, new drM<InterfaceC9463q, dpR>(this) { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$RecordForKeyQuery$execute$1
                final /* synthetic */ C9132jn.b<T> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.c = this;
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                    e(interfaceC9463q);
                    return dpR.c;
                }

                public final void e(InterfaceC9463q interfaceC9463q) {
                    C8632dsu.c((Object) interfaceC9463q, "");
                    interfaceC9463q.e(0, this.c.e());
                }
            });
        }
    }

    /* renamed from: o.jn$a */
    /* loaded from: classes2.dex */
    public final class a<T> extends AbstractC7642d<T> {
        final /* synthetic */ C9132jn b;
        private final Collection<String> c;

        public final Collection<String> e() {
            return this.c;
        }

        public String toString() {
            return "json.sq:recordsForKeys";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9132jn c9132jn, Collection<String> collection, drM<? super InterfaceC9145k, ? extends T> drm) {
            super(drm);
            C8632dsu.c((Object) collection, "");
            C8632dsu.c((Object) drm, "");
            this.b = c9132jn;
            this.c = collection;
        }

        @Override // o.AbstractC3495b
        public <R> InterfaceC9357o<R> e(drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm) {
            C8632dsu.c((Object) drm, "");
            String createArguments = this.b.createArguments(this.c.size());
            InterfaceC9569s driver = this.b.getDriver();
            return driver.b(null, "SELECT key, record FROM records WHERE key IN " + createArguments, drm, this.c.size(), new drM<InterfaceC9463q, dpR>(this) { // from class: com.apollographql.apollo3.cache.normalized.sql.internal.json.JsonQueries$RecordsForKeysQuery$execute$1
                final /* synthetic */ C9132jn.a<T> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.b = this;
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(InterfaceC9463q interfaceC9463q) {
                    a(interfaceC9463q);
                    return dpR.c;
                }

                public final void a(InterfaceC9463q interfaceC9463q) {
                    C8632dsu.c((Object) interfaceC9463q, "");
                    int i = 0;
                    for (Object obj : this.b.e()) {
                        if (i < 0) {
                            C8569dql.h();
                        }
                        interfaceC9463q.e(i, (String) obj);
                        i++;
                    }
                }
            });
        }
    }
}
