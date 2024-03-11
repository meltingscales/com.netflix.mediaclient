package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.XW;

/* loaded from: classes3.dex */
public final class ZR {
    public static final ZR a = new ZR();

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<XW.d> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("addEntityToPlaylist");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XW.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XW.b bVar = null;
            while (jsonReader.a(e) == 0) {
                bVar = (XW.b) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XW.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XW.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("addEntityToPlaylist");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    private ZR() {
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<XW.b> {
        private static final List<String> a;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entity");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XW.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            XW.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    aVar = (XW.a) C8953gT.d(C8953gT.a(c.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new XW.b(str, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XW.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("entity");
            C8953gT.d(C8953gT.a(c.a, true)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XW.a> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XW.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XW.e eVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(d);
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
                eVar = b.c.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new XW.a(str, str2, eVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XW.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.d());
            if (aVar.b() != null) {
                b.c.e(interfaceC9069id, c9028hp, aVar.b());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<XW.e> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j(SignupConstants.Field.VIDEO_ID, "isInPlaylist");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public XW.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (num != null) {
                return new XW.e(num.intValue(), bool);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XW.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.c()));
            interfaceC9069id.e("isInPlaylist");
            C8953gT.l.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }
}
