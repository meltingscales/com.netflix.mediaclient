package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* renamed from: o.Bu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0765Bu {
    public static final C0765Bu b = new C0765Bu();

    /* renamed from: o.Bu$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0767Bw> {
        public static final int b;
        public static final c d = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", InteractiveAnimation.ANIMATION_TYPE.WIDTH, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, SignupConstants.Field.URL);
            e = j;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0767Bw b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    num2 = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C0767Bw(str, num, num2, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0767Bw c0767Bw) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c0767Bw, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c0767Bw.a());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, c0767Bw.b());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            c8994hH.e(interfaceC9069id, c9028hp, c0767Bw.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c0767Bw.c());
        }
    }

    private C0765Bu() {
    }
}
