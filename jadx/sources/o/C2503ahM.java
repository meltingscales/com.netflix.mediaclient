package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2430aft;
import o.C2504ahN;
import o.C2505ahO;

/* renamed from: o.ahM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2503ahM {
    public static final C2503ahM d = new C2503ahM();

    /* renamed from: o.ahM$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2504ahN> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "entities");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2504ahN b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2504ahN.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2504ahN.c) C8953gT.d(C8953gT.c(c.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2504ahN(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2504ahN c2504ahN) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2504ahN, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2504ahN.b());
            interfaceC9069id.e("entities");
            C8953gT.d(C8953gT.c(c.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2504ahN.a());
        }
    }

    private C2503ahM() {
    }

    /* renamed from: o.ahM$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2504ahN.c> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2504ahN.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.c(d.b, false, 1, null))).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2504ahN.c(str, num.intValue(), list);
            } else {
                C8956gW.a(jsonReader, "totalCount");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2504ahN.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e("totalCount");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.d()));
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.c(d.b, false, 1, null))).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.ahM$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2504ahN.d> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "cursor", "node");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2504ahN.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            C2504ahN.b bVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bVar = (C2504ahN.b) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2504ahN.d(str, str2, bVar);
            } else {
                C8956gW.a(jsonReader, "cursor");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2504ahN.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("cursor");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.ahM$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2504ahN.b> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2504ahN.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C2506ahP c2506ahP;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2431afu c2431afu = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotBasicSearchEntity"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2506ahP = C2505ahO.a.d.b(jsonReader, c9028hp);
            } else {
                c2506ahP = null;
            }
            if (C9014hb.d(C9014hb.c("IrmaAndroidPreQuerySearchEntityTreatment"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2431afu = C2430aft.e.d.b(jsonReader, c9028hp);
            }
            return new C2504ahN.b(str, c2506ahP, c2431afu);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2504ahN.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            if (bVar.c() != null) {
                C2505ahO.a.d.e(interfaceC9069id, c9028hp, bVar.c());
            }
            if (bVar.b() != null) {
                C2430aft.e.d.e(interfaceC9069id, c9028hp, bVar.b());
            }
        }
    }
}
