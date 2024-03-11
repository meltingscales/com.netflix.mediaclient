package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2379afD;
import o.YF;

/* renamed from: o.abe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2194abe {
    public static final C2194abe c = new C2194abe();

    /* renamed from: o.abe$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YF.b> {
        private static final List<String> c;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YF.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.e, true)))).b(jsonReader, c9028hp);
            }
            return new YF.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YF.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.e, true)))).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    private C2194abe() {
    }

    /* renamed from: o.abe$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YF.c> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YF.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2383afH b = C2379afD.c.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new YF.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YF.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            C2379afD.c.a.e(interfaceC9069id, c9028hp, cVar.d());
        }
    }
}
