package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.AG;
import o.C0774Cb;

/* renamed from: o.Bl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0756Bl {
    public static final C0756Bl a = new C0756Bl();

    /* renamed from: o.Bl$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0751Bg> {
        private static final List<String> a;
        public static final b b = new b();
        public static final int c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C0751Bg b(JsonReader jsonReader, C9028hp c9028hp) {
            BU bu;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            AI ai = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("CLCSStringField"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bu = C0774Cb.b.e.b(jsonReader, c9028hp);
            } else {
                bu = null;
            }
            if (C9014hb.d(C9014hb.c("CLCSBooleanField"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                ai = AG.c.a.b(jsonReader, c9028hp);
            }
            return new C0751Bg(str, bu, ai);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0751Bg c0751Bg) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0751Bg, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c0751Bg.c());
            if (c0751Bg.d() != null) {
                C0774Cb.b.e.e(interfaceC9069id, c9028hp, c0751Bg.d());
            }
            if (c0751Bg.e() != null) {
                AG.c.a.e(interfaceC9069id, c9028hp, c0751Bg.e());
            }
        }
    }

    private C0756Bl() {
    }
}
