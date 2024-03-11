package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1350Yh;
import o.C2566aiW;

/* renamed from: o.aaf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2142aaf {
    public static final C2142aaf d = new C2142aaf();

    /* renamed from: o.aaf$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1350Yh.d> {
        public static final b b = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("profile");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1350Yh.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1350Yh.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (C1350Yh.a) C8953gT.d(C8953gT.a(c.d, true)).b(jsonReader, c9028hp);
            }
            return new C1350Yh.d(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1350Yh.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("profile");
            C8953gT.d(C8953gT.a(c.d, true)).e(interfaceC9069id, c9028hp, dVar.a());
        }
    }

    private C2142aaf() {
    }

    /* renamed from: o.aaf$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1350Yh.a> {
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1350Yh.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2569aiZ b = C2566aiW.g.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1350Yh.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1350Yh.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            C2566aiW.g.d.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
