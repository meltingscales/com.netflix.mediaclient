package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UpdateSubtitleAppearanceErrorCode;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1357Yo;
import o.C2623aja;

/* renamed from: o.aaC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2107aaC {
    public static final C2107aaC e = new C2107aaC();

    /* renamed from: o.aaC$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1357Yo.e> {
        public static final d a = new d();
        private static final List<String> b;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("updateSubtitleAppearance");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1357Yo.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1357Yo.f fVar = null;
            while (jsonReader.a(b) == 0) {
                fVar = (C1357Yo.f) C8953gT.d(C8953gT.c(i.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1357Yo.e(fVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("updateSubtitleAppearance");
            C8953gT.d(C8953gT.c(i.b, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private C2107aaC() {
    }

    /* renamed from: o.aaC$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C1357Yo.f> {
        public static final i b = new i();
        private static final List<String> d;

        private i() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "account", "errors");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1357Yo.f b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1357Yo.d dVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    dVar = (C1357Yo.d) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(c.c, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1357Yo.f(str, dVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.f fVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) fVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, fVar.d());
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, fVar.a());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.a(c.c, true))).e(interfaceC9069id, c9028hp, fVar.e());
        }
    }

    /* renamed from: o.aaC$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1357Yo.d> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "profiles");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1357Yo.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = C8953gT.a(C8953gT.a(a.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (list != null) {
                return new C1357Yo.d(str, list);
            } else {
                C8956gW.a(jsonReader, "profiles");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("profiles");
            C8953gT.a(C8953gT.a(a.d, true)).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.aaC$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1357Yo.j> {
        private static final List<String> a;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1357Yo.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1357Yo.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.d());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, jVar.e());
        }
    }

    /* renamed from: o.aaC$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1357Yo.b> {
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1357Yo.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1357Yo.c cVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("UpdateSubtitleAppearanceError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = e.e.b(jsonReader, c9028hp);
            }
            return new C1357Yo.b(str, cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            if (bVar.e() != null) {
                e.e.e(interfaceC9069id, c9028hp, bVar.e());
            }
        }
    }

    /* renamed from: o.aaC$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1357Yo.c> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("code");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1357Yo.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            UpdateSubtitleAppearanceErrorCode updateSubtitleAppearanceErrorCode = null;
            while (jsonReader.a(d) == 0) {
                updateSubtitleAppearanceErrorCode = C1464aCg.c.b(jsonReader, c9028hp);
            }
            if (updateSubtitleAppearanceErrorCode != null) {
                return new C1357Yo.c(updateSubtitleAppearanceErrorCode);
            }
            C8956gW.a(jsonReader, "code");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1357Yo.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("code");
            C1464aCg.c.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
