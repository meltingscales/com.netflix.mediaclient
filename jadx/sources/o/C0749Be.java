package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C0750Bf;
import o.C0753Bi;

/* renamed from: o.Be  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0749Be {
    public static final C0749Be d = new C0749Be();

    /* renamed from: o.Be$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0753Bi> {
        public static final int a;
        public static final c c = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0753Bi b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0753Bi.d dVar = null;
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSSequentialEffect"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = d.d.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            return new C0753Bi(str, dVar, C0750Bf.e.a.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0753Bi c0753Bi) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0753Bi, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0753Bi.b());
            if (c0753Bi.e() != null) {
                d.d.e(interfaceC9069id, c9028hp, c0753Bi.e());
            }
            C0750Bf.e.a.e(interfaceC9069id, c9028hp, c0753Bi.a());
        }
    }

    private C0749Be() {
    }

    /* renamed from: o.Be$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0753Bi.d> {
        private static final List<String> a;
        public static final int b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("effects");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0753Bi.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.a(e.b, true))).b(jsonReader, c9028hp);
            }
            return new C0753Bi.d(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0753Bi.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("effects");
            C8953gT.d(C8953gT.a(C8953gT.a(e.b, true))).e(interfaceC9069id, c9028hp, dVar.c());
        }
    }

    /* renamed from: o.Be$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0753Bi.c> {
        private static final List<String> a;
        public static final e b = new e();
        public static final int c;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0753Bi.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0752Bh b2 = C0750Bf.e.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0753Bi.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0753Bi.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            C0750Bf.e.a.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }
}
