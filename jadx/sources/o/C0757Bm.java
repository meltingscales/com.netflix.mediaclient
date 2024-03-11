package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AX;
import o.C0754Bj;

/* renamed from: o.Bm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0757Bm {
    public static final C0757Bm e = new C0757Bm();

    /* renamed from: o.Bm$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0754Bj> {
        private static final List<String> a;
        public static final int b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "color");
            a = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0754Bj b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C0754Bj.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C0754Bj.d) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0754Bj(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0754Bj c0754Bj) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0754Bj, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0754Bj.a());
            interfaceC9069id.e("color");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, c0754Bj.b());
        }
    }

    private C0757Bm() {
    }

    /* renamed from: o.Bm$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0754Bj.d> {
        public static final e b = new e();
        public static final int c;
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0754Bj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            AW b2 = AX.a.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0754Bj.d(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0754Bj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            AX.a.e.e(interfaceC9069id, c9028hp, dVar.d());
        }
    }
}
