package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.ZF;

/* renamed from: o.adg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2302adg {
    public static final C2302adg b = new C2302adg();

    /* renamed from: o.adg$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<ZF.a> {
        private static final List<String> c;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("uxConfigCreate");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public ZF.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZF.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (ZF.b) C8953gT.c(b.e, false, 1, null).b(jsonReader, c9028hp);
            }
            if (bVar != null) {
                return new ZF.a(bVar);
            }
            C8956gW.a(jsonReader, "uxConfigCreate");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZF.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("uxConfigCreate");
            C8953gT.c(b.e, false, 1, null).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    private C2302adg() {
    }

    /* renamed from: o.adg$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<ZF.b> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public ZF.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new ZF.b(str, str2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZF.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
