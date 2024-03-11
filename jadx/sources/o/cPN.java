package o;

import android.os.Bundle;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsPage;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import kotlin.Pair;
import o.C8632dsu;
import o.cPM;

/* loaded from: classes4.dex */
public final class cPN extends AbstractC8899fS<cPM> {
    private final InterfaceC5984cPr b;
    public static final b c = new b(null);
    public static final int a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public cPN(@Assisted cPM cpm, InterfaceC5984cPr interfaceC5984cPr) {
        super(cpm, null, 2, null);
        C8632dsu.c((Object) cpm, "");
        C8632dsu.c((Object) interfaceC5984cPr, "");
        this.b = interfaceC5984cPr;
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC8906fZ<cPN, cPM> {
        private final /* synthetic */ C1644aIy<cPN, cPM> e;

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public cPN create(AbstractC8979gt abstractC8979gt, cPM cpm) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) cpm, "");
            return this.e.create(abstractC8979gt, cpm);
        }

        private b() {
            this.e = new C1644aIy<>(cPN.class);
        }

        /* renamed from: initialState */
        public cPM m3173initialState(AbstractC8979gt abstractC8979gt) {
            List i;
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            String string = ((Bundle) b).getString("extra_profile_id");
            if (string == null) {
                throw new IllegalArgumentException("ProfileId extra not set".toString());
            }
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            InterfaceC5283bvo b2 = k != null ? k.b(string) : null;
            boolean z = (b2 == null || b2.isKidsProfile()) ? false : true;
            boolean z2 = b2 != null && b2.isPrimaryProfile();
            ProfileViewingRestrictionsPage profileViewingRestrictionsPage = ProfileViewingRestrictionsPage.a;
            i = C8569dql.i();
            return new cPM(profileViewingRestrictionsPage, i, b2 != null ? Integer.valueOf(b2.getMaturityValue()) : null, !z, z2, false);
        }
    }

    public final void b(final ProfileViewingRestrictionsPage profileViewingRestrictionsPage) {
        C8632dsu.c((Object) profileViewingRestrictionsPage, "");
        b(new drM<cPM, cPM>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$updatePage$1
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final cPM invoke(cPM cpm) {
                C8632dsu.c((Object) cpm, "");
                return cPM.copy$default(cpm, ProfileViewingRestrictionsPage.this, null, null, false, false, false, 62, null);
            }
        });
    }

    public final void b(final int i) {
        b(new drM<cPM, cPM>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$updateMaturityLevel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final cPM invoke(cPM cpm) {
                C8632dsu.c((Object) cpm, "");
                return cPM.copy$default(cpm, null, null, Integer.valueOf(i), false, false, false, 59, null);
            }
        });
        if (i > 70) {
            a(false);
        }
    }

    public final void a(final boolean z) {
        b(new drM<cPM, cPM>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$updateKidsOptIn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final cPM invoke(cPM cpm) {
                C8632dsu.c((Object) cpm, "");
                return cPM.copy$default(cpm, null, null, null, false, false, z, 31, null);
            }
        });
    }

    public final void d(final List<Pair<Integer, String>> list) {
        C8632dsu.c((Object) list, "");
        b(new drM<cPM, cPM>() { // from class: com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$updateMaturityRatings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final cPM invoke(cPM cpm) {
                C8632dsu.c((Object) cpm, "");
                return cPM.copy$default(cpm, null, list, null, false, false, false, 61, null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o.InterfaceC8585dra<? super java.util.List<o.C1343Ya.a>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$fetchMaturityRatings$1
            if (r0 == 0) goto L13
            r0 = r5
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$fetchMaturityRatings$1 r0 = (com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$fetchMaturityRatings$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$fetchMaturityRatings$1 r0 = new com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ViewingRestrictionsViewModel$fetchMaturityRatings$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            o.C8556dpz.d(r5)
            o.cPr r5 = r4.b
            r0.d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L47
            java.util.List r5 = o.C8570dqm.c()
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cPN.a(o.dra):java.lang.Object");
    }
}
