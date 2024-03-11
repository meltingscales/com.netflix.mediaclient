package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2348aeZ;
import o.C2404afc;

/* renamed from: o.afa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2402afa {
    public static final C2402afa a = new C2402afa();

    /* renamed from: o.afa$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2348aeZ> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "horizontalBackgroundAsset");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2348aeZ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2348aeZ.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2348aeZ.d) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2403afb b2 = C2404afc.b.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2348aeZ(str, dVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2348aeZ c2348aeZ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2348aeZ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2348aeZ.b());
            interfaceC9069id.e("horizontalBackgroundAsset");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2348aeZ.e());
            C2404afc.b.a.e(interfaceC9069id, c9028hp, c2348aeZ.c());
        }
    }

    private C2402afa() {
    }

    /* renamed from: o.afa$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2348aeZ.d> {
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL, "available");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2348aeZ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2348aeZ.d(str, str2, str3, bool);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2348aeZ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
