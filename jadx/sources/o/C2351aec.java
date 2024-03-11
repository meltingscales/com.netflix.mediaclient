package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2353aee;

/* renamed from: o.aec  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2351aec {
    public static final C2351aec c = new C2351aec();

    /* renamed from: o.aec$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2353aee> {
        private static final List<String> a;
        public static final a b = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "horizontalBackgroundAsset");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2353aee b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2353aee.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2353aee.b) C8953gT.d(C8953gT.c(e.b, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2353aee(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2353aee c2353aee) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2353aee, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2353aee.c());
            interfaceC9069id.e("horizontalBackgroundAsset");
            C8953gT.d(C8953gT.c(e.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2353aee.e());
        }
    }

    private C2351aec() {
    }

    /* renamed from: o.aec$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2353aee.b> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2353aee.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 4) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 5) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2353aee.b(str, str2, str3, num, num2, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2353aee.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.h());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            c8994hH2.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
