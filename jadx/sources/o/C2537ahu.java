package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2533ahq;

/* renamed from: o.ahu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2537ahu {
    public static final C2537ahu c = new C2537ahu();

    /* renamed from: o.ahu$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2533ahq> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2533ahq b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2533ahq.b bVar = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = d.e.b(jsonReader, c9028hp);
            }
            return new C2533ahq(str, bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2533ahq c2533ahq) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2533ahq, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2533ahq.d());
            if (c2533ahq.a() != null) {
                d.e.e(interfaceC9069id, c9028hp, c2533ahq.a());
            }
        }
    }

    private C2537ahu() {
    }

    /* renamed from: o.ahu$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2533ahq.b> {
        private static final List<String> b;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("nextEpisode");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2533ahq.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2533ahq.c cVar = null;
            while (jsonReader.a(b) == 0) {
                cVar = (C2533ahq.c) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C2533ahq.b(cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2533ahq.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("nextEpisode");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.a());
        }
    }

    /* renamed from: o.ahu$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2533ahq.c> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2533ahq.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2533ahq.c(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2533ahq.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.c()));
        }
    }
}
