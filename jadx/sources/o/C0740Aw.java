package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C0726Ai;

/* renamed from: o.Aw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0740Aw {
    public static final C0740Aw c = new C0740Aw();

    /* renamed from: o.Aw$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0726Ai.d> {
        public static final int a;
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsSendFeedback");
            d = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0726Ai.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Boolean bool = null;
            while (jsonReader.a(d) == 0) {
                bool = C8953gT.l.b(jsonReader, c9028hp);
            }
            return new C0726Ai.d(bool);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0726Ai.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("clcsSendFeedback");
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C0740Aw() {
    }
}
