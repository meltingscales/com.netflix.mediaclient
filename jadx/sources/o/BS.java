package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AZ;
import o.BV;

/* loaded from: classes2.dex */
public final class BS {
    public static final BS c = new BS();

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<BV> {
        public static final int b;
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "size", "designSize");
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public BV b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            CLCSSpaceSize cLCSSpaceSize = null;
            BV.d dVar = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    cLCSSpaceSize = (CLCSSpaceSize) C8953gT.d(C0858Fh.b).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    dVar = (BV.d) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new BV(str, cLCSSpaceSize, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BV bv) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bv, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bv.c());
            interfaceC9069id.e("size");
            C8953gT.d(C0858Fh.b).e(interfaceC9069id, c9028hp, bv.a());
            interfaceC9069id.e("designSize");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, bv.e());
        }
    }

    private BS() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<BV.d> {
        public static final int a;
        private static final List<String> c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public BV.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0747Bc b = AZ.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new BV.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BV.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            AZ.c.d.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }
}
