package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2516ahZ;
import o.C2552aiI;
import o.C2581ail;
import o.C2582aim;

/* renamed from: o.aiH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2551aiH {
    public static final C2551aiH c = new C2551aiH();

    /* renamed from: o.aiH$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2552aiI> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "currentEpisode");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2552aiI b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2552aiI.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    dVar = (C2552aiI.d) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2576aig b = C2581ail.a.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2552aiI(str, dVar, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2552aiI c2552aiI) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2552aiI, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2552aiI.c());
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, c2552aiI.d());
            C2581ail.a.c.e(interfaceC9069id, c9028hp, c2552aiI.a());
        }
    }

    private C2551aiH() {
    }

    /* renamed from: o.aiH$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2552aiI.d> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2552aiI.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2579aij b2 = C2582aim.d.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2572aic b3 = C2516ahZ.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2552aiI.d(str, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2552aiI.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            C2582aim.d.a.e(interfaceC9069id, c9028hp, dVar.b());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }
}
