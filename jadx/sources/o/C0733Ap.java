package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0720Ac;

/* renamed from: o.Ap  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0733Ap {
    public static final C0733Ap d = new C0733Ap();

    /* renamed from: o.Ap$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0720Ac.c> {
        public static final int c;
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsInterstitialPlaybackError");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0720Ac.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0720Ac.b bVar = null;
            while (jsonReader.a(e) == 0) {
                bVar = (C0720Ac.b) C8953gT.d(C8953gT.a(d.d, true)).b(jsonReader, c9028hp);
            }
            return new C0720Ac.c(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0720Ac.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("clcsInterstitialPlaybackError");
            C8953gT.d(C8953gT.a(d.d, true)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    private C0733Ap() {
    }

    /* renamed from: o.Ap$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0720Ac.b> {
        private static final List<String> a;
        public static final int b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0720Ac.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b2 = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0720Ac.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0720Ac.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            BP.j.e.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }
}
