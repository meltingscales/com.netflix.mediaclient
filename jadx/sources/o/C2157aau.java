package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.EditProfileErrorCode;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1360Yr;
import o.C2623aja;

/* renamed from: o.aau  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2157aau {
    public static final C2157aau d = new C2157aau();

    /* renamed from: o.aau$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1360Yr.a> {
        public static final d a = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("editProfile");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1360Yr.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1360Yr.c cVar = null;
            while (jsonReader.a(d) == 0) {
                cVar = (C1360Yr.c) C8953gT.d(C8953gT.c(a.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1360Yr.a(cVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("editProfile");
            C8953gT.d(C8953gT.c(a.d, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    private C2157aau() {
    }

    /* renamed from: o.aau$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1360Yr.c> {
        private static final List<String> c;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "account", "errors");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1360Yr.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1360Yr.e eVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    eVar = (C1360Yr.e) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(e.e, true))).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1360Yr.c(str, eVar, list);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("errors");
            C8953gT.d(C8953gT.a(C8953gT.a(e.e, true))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.aau$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1360Yr.e> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "profiles");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1360Yr.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    list = C8953gT.a(C8953gT.a(h.a, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (list != null) {
                return new C1360Yr.e(str, list);
            } else {
                C8956gW.a(jsonReader, "profiles");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("profiles");
            C8953gT.a(C8953gT.a(h.a, true)).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aau$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC8949gP<C1360Yr.j> {
        public static final h a = new h();
        private static final List<String> d;

        private h() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1360Yr.j b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1360Yr.j(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.j jVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) jVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, jVar.c());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, jVar.b());
        }
    }

    /* renamed from: o.aau$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1360Yr.d> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1360Yr.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1360Yr.i iVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("EditProfileError"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                iVar = b.e.b(jsonReader, c9028hp);
            }
            return new C1360Yr.d(str, iVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            if (dVar.c() != null) {
                b.e.e(interfaceC9069id, c9028hp, dVar.c());
            }
        }
    }

    /* renamed from: o.aau$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1360Yr.i> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("code");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1360Yr.i b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            EditProfileErrorCode editProfileErrorCode = null;
            while (jsonReader.a(b) == 0) {
                editProfileErrorCode = C3348axL.d.b(jsonReader, c9028hp);
            }
            if (editProfileErrorCode != null) {
                return new C1360Yr.i(editProfileErrorCode);
            }
            C8956gW.a(jsonReader, "code");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1360Yr.i iVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) iVar, "");
            interfaceC9069id.e("code");
            C3348axL.d.e(interfaceC9069id, c9028hp, iVar.a());
        }
    }
}
