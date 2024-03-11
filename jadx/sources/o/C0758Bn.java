package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0755Bk;

/* renamed from: o.Bn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0758Bn {
    public static final C0758Bn c = new C0758Bn();

    /* renamed from: o.Bn$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0755Bk> {
        public static final c c = new c();
        public static final int d;
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0755Bk b(JsonReader jsonReader, C9028hp c9028hp) {
            C0755Bk.d dVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0755Bk.a aVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSScreen"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.e.b(jsonReader, c9028hp);
            } else {
                dVar = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSFlowComplete"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = b.a.b(jsonReader, c9028hp);
            }
            return new C0755Bk(str, dVar, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0755Bk c0755Bk) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0755Bk, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0755Bk.d());
            if (c0755Bk.e() != null) {
                d.e.e(interfaceC9069id, c9028hp, c0755Bk.e());
            }
            if (c0755Bk.b() != null) {
                b.a.e(interfaceC9069id, c9028hp, c0755Bk.b());
            }
        }
    }

    private C0758Bn() {
    }

    /* renamed from: o.Bn$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0755Bk.d> {
        public static final d e = new d();

        private d() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0755Bk.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C0755Bk.d(BP.j.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0755Bk.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            BP.j.e.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.Bn$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0755Bk.a> {
        public static final b a = new b();
        private static final List<String> d;
        public static final int e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("account");
            d = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0755Bk.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0755Bk.b bVar = null;
            while (jsonReader.a(d) == 0) {
                bVar = (C0755Bk.b) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C0755Bk.a(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0755Bk.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("account");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.e());
        }
    }

    /* renamed from: o.Bn$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0755Bk.b> {
        private static final List<String> a;
        public static final e d = new e();
        public static final int e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "ownerGuid");
            a = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0755Bk.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C0755Bk.b(str, str2);
            } else {
                C8956gW.a(jsonReader, "ownerGuid");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0755Bk.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("ownerGuid");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }
}
