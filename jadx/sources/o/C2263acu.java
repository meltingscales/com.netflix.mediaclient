package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1389Zn;

/* renamed from: o.acu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2263acu {
    public static final C2263acu b = new C2263acu();

    /* renamed from: o.acu$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1389Zn.a> {
        public static final b a = new b();
        private static final List<String> b;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("removeEntityFromPlaylist");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1389Zn.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1389Zn.b bVar = null;
            while (jsonReader.a(b) == 0) {
                bVar = (C1389Zn.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1389Zn.a(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1389Zn.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("removeEntityFromPlaylist");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    private C2263acu() {
    }

    /* renamed from: o.acu$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1389Zn.b> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entity");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1389Zn.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1389Zn.c cVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C1389Zn.c) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1389Zn.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1389Zn.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("entity");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, bVar.c());
        }
    }

    /* renamed from: o.acu$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1389Zn.c> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1389Zn.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1389Zn.e eVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = a.e.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C1389Zn.c(str, str2, eVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1389Zn.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.b());
            if (cVar.a() != null) {
                a.e.e(interfaceC9069id, c9028hp, cVar.a());
            }
        }
    }

    /* renamed from: o.acu$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1389Zn.e> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "isInPlaylist");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1389Zn.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new C1389Zn.e(num.intValue(), bool);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1389Zn.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.a()));
            interfaceC9069id.e("isInPlaylist");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
