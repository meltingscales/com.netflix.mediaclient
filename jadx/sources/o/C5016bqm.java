package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.graphql.models.type.SubtitleColor;
import com.netflix.mediaclient.graphql.models.type.SubtitleOpacity;
import com.netflix.mediaclient.service.user.UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import dagger.Lazy;
import java.util.Locale;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: o.bqm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5016bqm extends C5014bqk {
    public static final c c = new c(null);
    private final Context a;
    private final dwU d;
    private final Lazy<aCI> e;
    private final dwQ i;

    /* renamed from: o.bqm$a */
    /* loaded from: classes4.dex */
    public static final class a extends dqT implements CoroutineExceptionHandler {
        final /* synthetic */ C5016bqm b;
        final /* synthetic */ InterfaceC4986bqI d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.c cVar, C5016bqm c5016bqm, InterfaceC4986bqI interfaceC4986bqI) {
            super(cVar);
            this.b = c5016bqm;
            this.d = interfaceC4986bqI;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C5016bqm c5016bqm = this.b;
            NetflixImmutableStatus a = c5016bqm.a(th);
            C8632dsu.a(a, "");
            c5016bqm.c((AccountData) null, a, this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5016bqm(Context context, aOV aov, drO<? extends TQ> dro, dwU dwu, dwQ dwq, Lazy<aCI> lazy) {
        super(context, aov, dro, dwu, dwq, lazy);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) aov, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) lazy, "");
        this.a = context;
        this.d = dwu;
        this.i = dwq;
        this.e = lazy;
    }

    @Override // o.C5014bqk, o.InterfaceC5012bqi
    public void a(String str, InterfaceC5284bvp interfaceC5284bvp, InterfaceC4986bqI interfaceC4986bqI) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC5284bvp, "");
        if (!C1887aRy.b.b().a()) {
            super.a(str, interfaceC5284bvp, interfaceC4986bqI);
            return;
        }
        C8737dwr.c(this.d, new a(CoroutineExceptionHandler.Key, this, interfaceC4986bqI), null, new UserAccountRepositoryV2Impl$updateUserProfileSubtitlePrefs$1(this, str, interfaceC5284bvp, interfaceC4986bqI, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (r2 == com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute.h) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r2 == com.netflix.mediaclient.graphql.models.type.SubtitleSize.b) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r2 == com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity.e) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C3374axl e(java.lang.String r16, o.InterfaceC5284bvp r17) {
        /*
            r15 = this;
            r0 = r15
            o.hK$c r1 = o.AbstractC8997hK.d
            java.lang.String r2 = r17.getBackgroundColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleColor r2 = r15.b(r2)
            o.hK r2 = r1.b(r2)
            java.lang.String r3 = r17.getBackgroundOpacity()
            java.lang.String r4 = r17.getBackgroundColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r3 = r15.d(r3, r4)
            o.hK r3 = r1.b(r3)
            o.auu r4 = new o.auu
            r4.<init>(r2, r3)
            java.lang.String r2 = r17.getCharOpacity()
            java.lang.String r3 = r17.getCharEdgeAttrs()
            java.lang.String r5 = r17.getCharSize()
            java.lang.String r6 = r17.getCharStyle()
            java.lang.String r7 = r17.getCharColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleColor r7 = r15.b(r7)
            o.hK r9 = r1.b(r7)
            r7 = 0
            if (r2 == 0) goto L54
            boolean r8 = o.C8684dus.a(r2)
            if (r8 == 0) goto L4a
            goto L54
        L4a:
            com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity$e r8 = com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity.a
            com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity r2 = r8.b(r2)
            com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity r8 = com.netflix.mediaclient.graphql.models.type.SubtitleTextOpacity.e
            if (r2 != r8) goto L55
        L54:
            r2 = r7
        L55:
            o.hK r10 = r1.b(r2)
            if (r3 == 0) goto L6c
            boolean r2 = o.C8684dus.a(r3)
            if (r2 == 0) goto L62
            goto L6c
        L62:
            com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute$b r2 = com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute.a
            com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute r2 = r2.e(r3)
            com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute r3 = com.netflix.mediaclient.graphql.models.type.SubtitleEdgeAttribute.h
            if (r2 != r3) goto L6d
        L6c:
            r2 = r7
        L6d:
            o.hK r11 = r1.b(r2)
            java.lang.String r2 = r17.getCharEdgeColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleColor r2 = r15.b(r2)
            o.hK r12 = r1.b(r2)
            if (r5 == 0) goto L90
            boolean r2 = o.C8684dus.a(r5)
            if (r2 == 0) goto L86
            goto L90
        L86:
            com.netflix.mediaclient.graphql.models.type.SubtitleSize$c r2 = com.netflix.mediaclient.graphql.models.type.SubtitleSize.e
            com.netflix.mediaclient.graphql.models.type.SubtitleSize r2 = r2.c(r5)
            com.netflix.mediaclient.graphql.models.type.SubtitleSize r3 = com.netflix.mediaclient.graphql.models.type.SubtitleSize.b
            if (r2 != r3) goto L91
        L90:
            r2 = r7
        L91:
            o.hK r13 = r1.b(r2)
            if (r6 == 0) goto Lb8
            boolean r2 = o.C8684dus.a(r6)
            if (r2 == 0) goto L9e
            goto Lb8
        L9e:
            com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle$d r2 = com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle.d
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r5 = ""
            o.C8632dsu.a(r3, r5)
            java.lang.String r3 = r6.toUpperCase(r3)
            o.C8632dsu.a(r3, r5)
            com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle r2 = r2.d(r3)
            com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle r3 = com.netflix.mediaclient.graphql.models.type.SubtitleFontStyle.g
            if (r2 != r3) goto Lb7
            goto Lb8
        Lb7:
            r7 = r2
        Lb8:
            o.hK r14 = r1.b(r7)
            o.aut r2 = new o.aut
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.lang.String r3 = r17.getWindowColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleColor r3 = r15.b(r3)
            o.hK r3 = r1.b(r3)
            java.lang.String r5 = r17.getWindowOpacity()
            java.lang.String r6 = r17.getWindowColor()
            com.netflix.mediaclient.graphql.models.type.SubtitleOpacity r5 = r15.d(r5, r6)
            o.hK r5 = r1.b(r5)
            o.auD r6 = new o.auD
            r6.<init>(r3, r5)
            com.netflix.mediaclient.graphql.models.type.SubtitleDeviceGroup r3 = com.netflix.mediaclient.graphql.models.type.SubtitleDeviceGroup.d
            o.hK$b r10 = r1.e(r3)
            o.hK$b r9 = r1.e(r4)
            o.hK$b r11 = r1.e(r2)
            o.hK$b r12 = r1.e(r6)
            o.axl r1 = new o.axl
            r7 = r1
            r8 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5016bqm.e(java.lang.String, o.bvp):o.axl");
    }

    private final SubtitleColor b(String str) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                SubtitleColor.d dVar = SubtitleColor.d;
                Locale locale = Locale.US;
                C8632dsu.a(locale, "");
                String upperCase = str.toUpperCase(locale);
                C8632dsu.a(upperCase, "");
                SubtitleColor d = dVar.d(upperCase);
                if (d != SubtitleColor.i) {
                    return d;
                }
            }
        }
        return null;
    }

    private final SubtitleOpacity d(String str, String str2) {
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g && str2 != null && !C8632dsu.c((Object) str2, (Object) "none")) {
                SubtitleOpacity a2 = SubtitleOpacity.a.a(str);
                return a2 == SubtitleOpacity.b ? SubtitleOpacity.e : a2;
            }
        }
        return SubtitleOpacity.e;
    }

    /* renamed from: o.bqm$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("nf_service_useraccountrepoV2");
        }
    }
}
