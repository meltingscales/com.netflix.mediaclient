package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2340aeR;

/* renamed from: o.aeP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2338aeP {
    public static final C2338aeP b = new C2338aeP();

    /* renamed from: o.aeP$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2340aeR> {
        private static final List<String> b;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId", "androidInstallation");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2340aeR b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2340aeR.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    cVar = (C2340aeR.c) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2340aeR(str, num.intValue(), cVar);
            } else {
                C8956gW.a(jsonReader, "gameId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2340aeR c2340aeR) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2340aeR, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2340aeR.b());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2340aeR.e()));
            interfaceC9069id.e("androidInstallation");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2340aeR.c());
        }
    }

    private C2338aeP() {
    }

    /* renamed from: o.aeP$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2340aeR.c> {
        private static final List<String> a;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "minMemoryGb", "minSdkVersion", "packageSizeInMb", "numProcessors", "packageName", "appStoreUrl");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2340aeR.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num4 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str2 != null) {
                            return new C2340aeR.c(str, num, num2, num3, num4, str2, str3);
                        } else {
                            C8956gW.a(jsonReader, "packageName");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2340aeR.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.j());
            interfaceC9069id.e("minMemoryGb");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e("minSdkVersion");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e("packageSizeInMb");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.f());
            interfaceC9069id.e("numProcessors");
            c8994hH.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("packageName");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("appStoreUrl");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.b());
        }
    }
}
