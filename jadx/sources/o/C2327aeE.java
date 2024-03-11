package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2341aeS;
import o.C2346aeX;
import o.C2371aew;

/* renamed from: o.aeE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2327aeE {
    public static final C2327aeE a = new C2327aeE();

    /* renamed from: o.aeE$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2371aew> {
        public static final e b = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "isDeviceSupported", "androidInstallation", "playlistActions");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2371aew b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            C2371aew.b bVar = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bVar = (C2371aew.b) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C3480azl.d)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2344aeV b2 = C2346aeX.e.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2339aeQ b3 = C2341aeS.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2371aew(str, bool, bVar, list, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2371aew c2371aew) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2371aew, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2371aew.e());
            interfaceC9069id.e("isDeviceSupported");
            C8953gT.l.e(interfaceC9069id, c9028hp, c2371aew.i());
            interfaceC9069id.e("androidInstallation");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2371aew.d());
            interfaceC9069id.e("playlistActions");
            C8953gT.d(C8953gT.a(C3480azl.d)).e(interfaceC9069id, c9028hp, c2371aew.c());
            C2346aeX.e.e.e(interfaceC9069id, c9028hp, c2371aew.a());
            C2341aeS.b.e.e(interfaceC9069id, c9028hp, c2371aew.b());
        }
    }

    private C2327aeE() {
    }

    /* renamed from: o.aeE$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2371aew.b> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "packageName", "appStoreUrl");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2371aew.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C2371aew.b(str, str2, str3);
            } else {
                C8956gW.a(jsonReader, "packageName");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2371aew.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("packageName");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("appStoreUrl");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
