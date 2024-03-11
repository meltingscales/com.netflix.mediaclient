package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2382afG;
import o.C2435afy;

/* renamed from: o.afE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2380afE {
    public static final C2380afE b = new C2380afE();

    /* renamed from: o.afE$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2382afG> {
        public static final c a = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2382afG b(JsonReader jsonReader, C9028hp c9028hp) {
            C2382afG.e eVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2382afG.c cVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Show"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = d.b.b(jsonReader, c9028hp);
            } else {
                eVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.d.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new C2382afG(str, num.intValue(), eVar, cVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2382afG c2382afG) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2382afG, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2382afG.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2382afG.b()));
            if (c2382afG.d() != null) {
                d.b.e(interfaceC9069id, c9028hp, c2382afG.d());
            }
            if (c2382afG.a() != null) {
                e.d.e(interfaceC9069id, c9028hp, c2382afG.a());
            }
        }
    }

    private C2380afE() {
    }

    /* renamed from: o.afE$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2382afG.e> {
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("nextLiveEvent");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2382afG.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2382afG.d dVar = null;
            while (jsonReader.a(c) == 0) {
                dVar = (C2382afG.d) C8953gT.d(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
            }
            return new C2382afG.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2382afG.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("nextLiveEvent");
            C8953gT.d(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    /* renamed from: o.afE$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2382afG.d> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2382afG.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2376afA b = C2435afy.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2382afG.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2382afG.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            C2435afy.a.a.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.afE$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2382afG.c> {
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("liveEvent");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2382afG.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2382afG.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (C2382afG.b) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
            }
            return new C2382afG.c(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2382afG.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("liveEvent");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.afE$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2382afG.b> {
        private static final List<String> a;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2382afG.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2376afA b = C2435afy.a.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2382afG.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2382afG.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            C2435afy.a.a.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
