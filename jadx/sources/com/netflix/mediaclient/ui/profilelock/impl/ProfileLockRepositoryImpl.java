package com.netflix.mediaclient.ui.profilelock.impl;

import android.app.Activity;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.C1045Mp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5283bvo;
import o.InterfaceC8554dpx;
import o.aCG;
import o.cKA;
import o.dpB;
import o.drO;

/* loaded from: classes4.dex */
public final class ProfileLockRepositoryImpl implements cKA {
    public static final c b = new c(null);
    public static final int d = 8;
    private final InterfaceC8554dpx a;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public static final class ProfileLockRepositoryModule {
        @Provides
        @ActivityScoped
        public final cKA c(ProfileLockRepositoryImpl profileLockRepositoryImpl) {
            C8632dsu.c((Object) profileLockRepositoryImpl, "");
            return profileLockRepositoryImpl;
        }
    }

    @Inject
    public ProfileLockRepositoryImpl(final Activity activity) {
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) activity, "");
        b2 = dpB.b(new drO<aCG>() { // from class: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$graphQLRepository$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final aCG invoke() {
                UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
                InterfaceC5283bvo j = k != null ? k.j() : null;
                if (j == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C8632dsu.a(j, "");
                return aCG.b.e(activity, j);
            }
        });
        this.a = b2;
    }

    private final aCG c() {
        return (aCG) this.a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|(1:21)(1:15)|16|17|18))|29|6|7|(0)(0)|11|(1:13)|21|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.cKA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r11, o.InterfaceC8585dra<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$isPasswordVerified$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$isPasswordVerified$1 r0 = (com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$isPasswordVerified$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$isPasswordVerified$1 r0 = new com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$isPasswordVerified$1
            r0.<init>(r10, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.c
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r6.d
            r9 = 1
            if (r1 == 0) goto L32
            if (r1 != r9) goto L2a
            o.C8556dpz.d(r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            goto L4c
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r12)
            o.aCG r1 = r10.c()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            o.ZJ r2 = new o.ZJ     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            r2.<init>(r11)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            r6.d = r9     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            r3 = 0
            r4 = 0
            r5 = 1
            r7 = 6
            r8 = 0
            java.lang.Object r12 = o.aCE.d.d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            if (r12 != r0) goto L4c
            return r0
        L4c:
            o.gU r12 = (o.C8954gU) r12     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            D extends o.hE$b r11 = r12.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            o.ZJ$d r11 = (o.ZJ.d) r11     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            if (r11 == 0) goto L5f
            o.ZJ$a r11 = r11.d()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            if (r11 == 0) goto L5f
            java.lang.Boolean r11 = r11.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            goto L60
        L5f:
            r11 = 0
        L60:
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$c r12 = com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl.b     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            r12.getLogTag()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            java.lang.Boolean r12 = o.C8589dre.e(r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            boolean r11 = o.C8632dsu.c(r11, r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L6e
            goto L6f
        L6e:
            r11 = 0
        L6f:
            java.lang.Boolean r11 = o.C8589dre.e(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl.d(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(2:15|17)|19))|27|6|7|(0)(0)|11|(3:13|15|17)|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.cKA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r11, java.lang.String r12, o.InterfaceC8585dra<? super o.C1397Zv.b> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$updatePin$1
            if (r0 == 0) goto L13
            r0 = r13
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$updatePin$1 r0 = (com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$updatePin$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$updatePin$1 r0 = new com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$updatePin$1
            r0.<init>(r10, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.d
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r13)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            goto L54
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r13)
            o.aCG r1 = r10.c()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.Zv r13 = new o.Zv     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.aur r3 = new o.aur     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r3.<init>(r11, r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r13.<init>(r3)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r7.c = r2     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r8 = 14
            r9 = 0
            r2 = r13
            java.lang.Object r13 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r13 != r0) goto L54
            return r0
        L54:
            o.gU r13 = (o.C8954gU) r13     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            D extends o.hE$b r11 = r13.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.Zv$c r11 = (o.C1397Zv.c) r11     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r11 == 0) goto L67
            o.Zv$a r11 = r11.b()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r11 == 0) goto L67
            o.Zv$b r11 = r11.a()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            goto L68
        L67:
            r11 = 0
        L68:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl.d(java.lang.String, java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(2:15|17)|19))|27|6|7|(0)(0)|11|(3:13|15|17)|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // o.cKA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r11, o.InterfaceC8585dra<? super o.C1393Zr.c> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$deletePin$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$deletePin$1 r0 = (com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$deletePin$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.d = r1
            goto L18
        L13:
            com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$deletePin$1 r0 = new com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl$deletePin$1
            r0.<init>(r10, r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.a
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r7.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            o.C8556dpz.d(r12)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            goto L54
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            o.C8556dpz.d(r12)
            o.aCG r1 = r10.c()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.Zr r12 = new o.Zr     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.aud r3 = new o.aud     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r3.<init>(r11)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r12.<init>(r3)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r7.d = r2     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            r2 = r12
            java.lang.Object r12 = o.aCE.d.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r12 != r0) goto L54
            return r0
        L54:
            o.gU r12 = (o.C8954gU) r12     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            D extends o.hE$b r11 = r12.d     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            o.Zr$b r11 = (o.C1393Zr.b) r11     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r11 == 0) goto L67
            o.Zr$d r11 = r11.d()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            if (r11 == 0) goto L67
            o.Zr$c r11 = r11.d()     // Catch: com.apollographql.apollo3.exception.ApolloException -> L67
            goto L68
        L67:
            r11 = 0
        L68:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl.c(java.lang.String, o.dra):java.lang.Object");
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfileLockRepository");
        }
    }
}
