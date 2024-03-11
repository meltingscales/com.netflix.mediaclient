package o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.netflix.clcs.client.InterstitialClient;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;

/* renamed from: o.Af  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0723Af implements InterstitialClient {
    private final InterfaceC0721Ad b;
    private final String e;

    public C0723Af(InterfaceC0721Ad interfaceC0721Ad, String str) {
        C8632dsu.c((Object) interfaceC0721Ad, "");
        this.b = interfaceC0721Ad;
        this.e = str;
    }

    private final CLCSImageResolutionMode a() {
        DisplayMetrics displayMetrics;
        Resources system = Resources.getSystem();
        int i = (system == null || (displayMetrics = system.getDisplayMetrics()) == null) ? 160 : displayMetrics.densityDpi;
        if (i < 0 || i >= 160) {
            if (160 > i || i >= 240) {
                if (240 > i || i >= 320) {
                    if (320 <= i && i < 480) {
                        return CLCSImageResolutionMode.b;
                    }
                    return CLCSImageResolutionMode.c;
                }
                return CLCSImageResolutionMode.e;
            }
            return CLCSImageResolutionMode.a;
        }
        return CLCSImageResolutionMode.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(o.FM r11, o.InterfaceC8585dra<? super o.FX> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$1 r0 = (com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$1 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r12)
            goto L53
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r12)
            o.Ad r12 = r10.b
            java.lang.String r5 = r10.e
            com.netflix.clcs.codegen.type.StringFormat r6 = com.netflix.clcs.codegen.type.StringFormat.b
            com.netflix.clcs.codegen.type.CLCSImageResolutionMode r7 = r10.a()
            com.netflix.clcs.codegen.type.CLCSImageFormat r8 = com.netflix.clcs.codegen.type.CLCSImageFormat.b
            o.DU r9 = o.C0871Fu.b(r11)
            o.Ah r11 = new o.Ah
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r3
            java.lang.Object r12 = r12.d(r11, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            o.gU r12 = (o.C8954gU) r12
            boolean r11 = r12.a()
            r0 = 0
            if (r11 == 0) goto L75
            java.util.List<o.hw> r1 = r12.e
            if (r1 == 0) goto L6f
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2 r7 = new o.drM<o.C9035hw, java.lang.CharSequence>() { // from class: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2
                static {
                    /*
                        com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2) com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2.a com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: b */
                public final java.lang.CharSequence invoke(o.C9035hw r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.c()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2.invoke(o.hw):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* synthetic */ java.lang.CharSequence invoke(o.C9035hw r1) {
                    /*
                        r0 = this;
                        o.hw r1 = (o.C9035hw) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForUnspecifiedLocation$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r8 = 30
            r9 = 0
            java.lang.String r0 = o.C8570dqm.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L6f:
            com.netflix.clcs.client.InterstitialClient$ServerException r11 = new com.netflix.clcs.client.InterstitialClient$ServerException
            r11.<init>(r0)
            throw r11
        L75:
            D extends o.hE$b r11 = r12.d
            o.Ah$a r11 = (o.C0725Ah.a) r11
            if (r11 == 0) goto L8b
            o.Ah$c r11 = r11.c()
            if (r11 == 0) goto L8b
            o.BR r11 = r11.a()
            if (r11 == 0) goto L8b
            o.FX r0 = o.C0871Fu.b(r11)
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.b(o.FM, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r12, o.FM r13, o.InterfaceC8585dra<? super o.FX> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$1
            if (r0 == 0) goto L13
            r0 = r14
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$1 r0 = (com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$1) r0
            int r1 = r0.a
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.a = r1
            goto L18
        L13:
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$1 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.a
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r14)
            goto L54
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            o.C8556dpz.d(r14)
            o.Ad r14 = r11.b
            java.lang.String r6 = r11.e
            com.netflix.clcs.codegen.type.StringFormat r7 = com.netflix.clcs.codegen.type.StringFormat.b
            com.netflix.clcs.codegen.type.CLCSImageResolutionMode r8 = r11.a()
            com.netflix.clcs.codegen.type.CLCSImageFormat r9 = com.netflix.clcs.codegen.type.CLCSImageFormat.b
            o.DU r10 = o.C0871Fu.b(r13)
            o.Ac r13 = new o.Ac
            r4 = r13
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.a = r3
            java.lang.Object r14 = r14.d(r13, r0)
            if (r14 != r1) goto L54
            return r1
        L54:
            o.gU r14 = (o.C8954gU) r14
            boolean r12 = r14.a()
            r13 = 0
            if (r12 == 0) goto L76
            java.util.List<o.hw> r0 = r14.e
            if (r0 == 0) goto L70
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2 r6 = new o.drM<o.C9035hw, java.lang.CharSequence>() { // from class: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2
                static {
                    /*
                        com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2) com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2.a com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: e */
                public final java.lang.CharSequence invoke(o.C9035hw r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.c()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2.invoke(o.hw):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* synthetic */ java.lang.CharSequence invoke(o.C9035hw r1) {
                    /*
                        r0 = this;
                        o.hw r1 = (o.C9035hw) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchInterstitialForPlaybackError$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 30
            r8 = 0
            java.lang.String r13 = o.C8570dqm.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L70:
            com.netflix.clcs.client.InterstitialClient$ServerException r12 = new com.netflix.clcs.client.InterstitialClient$ServerException
            r12.<init>(r13)
            throw r12
        L76:
            D extends o.hE$b r12 = r14.d
            o.Ac$c r12 = (o.C0720Ac.c) r12
            if (r12 == 0) goto L8c
            o.Ac$b r12 = r12.e()
            if (r12 == 0) goto L8c
            o.BR r12 = r12.c()
            if (r12 == 0) goto L8c
            o.FX r13 = o.C0871Fu.b(r12)
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.d(java.lang.String, o.FM, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r24, java.util.Map<java.lang.String, ? extends java.lang.Object> r25, o.InterfaceC8585dra<? super o.FX> r26) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.c(java.lang.String, java.util.Map, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, o.InterfaceC8585dra<? super o.FX> r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.c(java.lang.String, java.lang.String, java.util.Map, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, o.InterfaceC8585dra<? super com.netflix.clcs.client.InterstitialClient.e> r23) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.d(java.lang.String, java.lang.String, java.util.Map, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r11, o.InterfaceC8585dra<? super o.FX> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$1 r0 = (com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.b = r1
            goto L18
        L13:
            com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$1 r0 = new com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.d
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r12)
            goto L50
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r12)
            o.Ad r12 = r10.b
            java.lang.String r6 = r10.e
            com.netflix.clcs.codegen.type.StringFormat r7 = com.netflix.clcs.codegen.type.StringFormat.b
            com.netflix.clcs.codegen.type.CLCSImageResolutionMode r8 = r10.a()
            com.netflix.clcs.codegen.type.CLCSImageFormat r9 = com.netflix.clcs.codegen.type.CLCSImageFormat.b
            o.Ak r2 = new o.Ak
            r4 = r2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r12 = r12.d(r2, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            o.gU r12 = (o.C8954gU) r12
            boolean r11 = r12.a()
            r0 = 0
            if (r11 == 0) goto L72
            java.util.List<o.hw> r1 = r12.e
            if (r1 == 0) goto L6c
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2 r7 = new o.drM<o.C9035hw, java.lang.CharSequence>() { // from class: com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2
                static {
                    /*
                        com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2 r0 = new com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2) com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2.e com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: b */
                public final java.lang.CharSequence invoke(o.C9035hw r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.c()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2.invoke(o.hw):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* synthetic */ java.lang.CharSequence invoke(o.C9035hw r1) {
                    /*
                        r0 = this;
                        o.hw r1 = (o.C9035hw) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$restoreScreen$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r8 = 30
            r9 = 0
            java.lang.String r0 = o.C8570dqm.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L6c:
            com.netflix.clcs.client.InterstitialClient$ServerException r11 = new com.netflix.clcs.client.InterstitialClient$ServerException
            r11.<init>(r0)
            throw r11
        L72:
            D extends o.hE$b r11 = r12.d
            o.Ak$e r11 = (o.C0728Ak.e) r11
            if (r11 == 0) goto L88
            o.Ak$a r11 = r11.d()
            if (r11 == 0) goto L88
            o.BR r11 = r11.e()
            if (r11 == 0) goto L88
            o.FX r0 = o.C0871Fu.b(r11)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.c(java.lang.String, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r20, java.lang.String r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, o.InterfaceC8585dra<? super o.dpR> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$1
            if (r2 == 0) goto L17
            r2 = r1
            com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$1 r2 = (com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$1) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 + r4
            r2.b = r3
            goto L1c
        L17:
            com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$1 r2 = new com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.c
            java.lang.Object r3 = o.C8588drd.c()
            int r4 = r2.b
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            o.C8556dpz.d(r1)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            o.C8556dpz.d(r1)
            o.Ad r1 = r0.b
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = r22.size()
            r4.<init>(r7)
            java.util.Set r7 = r22.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L4d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            o.hK$c r10 = o.AbstractC8997hK.d
            boolean r11 = r8 instanceof java.lang.String
            if (r11 == 0) goto L6d
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            goto L6e
        L6d:
            r11 = r6
        L6e:
            o.hK r13 = r10.b(r11)
            boolean r11 = r8 instanceof java.lang.Integer
            if (r11 == 0) goto L7a
            r11 = r8
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L7b
        L7a:
            r11 = r6
        L7b:
            o.hK r14 = r10.b(r11)
            boolean r11 = r8 instanceof java.lang.Boolean
            if (r11 == 0) goto L86
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L87
        L86:
            r8 = r6
        L87:
            o.hK r15 = r10.b(r8)
            o.DQ r8 = new o.DQ
            r16 = 0
            r17 = 8
            r18 = 0
            r12 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            o.DR r10 = new o.DR
            r10.<init>(r9, r8)
            r4.add(r10)
            goto L4d
        La0:
            o.Ai r7 = new o.Ai
            r8 = r20
            r9 = r21
            r7.<init>(r8, r9, r4)
            r2.b = r5
            java.lang.Object r1 = r1.b(r7, r2)
            if (r1 != r3) goto Lb2
            return r3
        Lb2:
            o.gU r1 = (o.C8954gU) r1
            boolean r2 = r1.a()
            if (r2 == 0) goto Ld3
            java.util.List<o.hw> r7 = r1.e
            if (r7 == 0) goto Lcd
            java.lang.String r8 = "\n"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2 r13 = new o.drM<o.C9035hw, java.lang.CharSequence>() { // from class: com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2
                static {
                    /*
                        com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2 r0 = new com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2) com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2.b com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: e */
                public final java.lang.CharSequence invoke(o.C9035hw r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.c()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2.invoke(o.hw):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* synthetic */ java.lang.CharSequence invoke(o.C9035hw r1) {
                    /*
                        r0 = this;
                        o.hw r1 = (o.C9035hw) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$sendFeedback$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r14 = 30
            r15 = 0
            java.lang.String r6 = o.C8570dqm.c(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        Lcd:
            com.netflix.clcs.client.InterstitialClient$ServerException r1 = new com.netflix.clcs.client.InterstitialClient$ServerException
            r1.<init>(r6)
            throw r1
        Ld3:
            o.dpR r1 = o.dpR.c
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.a(java.lang.String, java.lang.String, java.util.Map, o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    @Override // com.netflix.clcs.client.InterstitialClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(java.lang.String r11, o.InterfaceC8585dra<? super o.FX> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$1
            if (r0 == 0) goto L13
            r0 = r12
            com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$1 r0 = (com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.c = r1
            goto L18
        L13:
            com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$1 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o.C8556dpz.d(r12)
            goto L50
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            o.C8556dpz.d(r12)
            o.Ad r12 = r10.b
            java.lang.String r6 = r10.e
            com.netflix.clcs.codegen.type.StringFormat r7 = com.netflix.clcs.codegen.type.StringFormat.b
            com.netflix.clcs.codegen.type.CLCSImageResolutionMode r8 = r10.a()
            com.netflix.clcs.codegen.type.CLCSImageFormat r9 = com.netflix.clcs.codegen.type.CLCSImageFormat.b
            o.Ab r2 = new o.Ab
            r4 = r2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r12 = r12.d(r2, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            o.gU r12 = (o.C8954gU) r12
            boolean r11 = r12.a()
            r0 = 0
            if (r11 == 0) goto L72
            java.util.List<o.hw> r1 = r12.e
            if (r1 == 0) goto L6c
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2 r7 = new o.drM<o.C9035hw, java.lang.CharSequence>() { // from class: com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2
                static {
                    /*
                        com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2 r0 = new com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2) com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2.d com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: a */
                public final java.lang.CharSequence invoke(o.C9035hw r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r2, r0)
                        java.lang.String r2 = r2.c()
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2.invoke(o.hw):java.lang.CharSequence");
                }

                @Override // o.drM
                public /* synthetic */ java.lang.CharSequence invoke(o.C9035hw r1) {
                    /*
                        r0 = this;
                        o.hw r1 = (o.C9035hw) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.clcs.client.InterstitialApolloClient$fetchDemoScreen$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r8 = 30
            r9 = 0
            java.lang.String r0 = o.C8570dqm.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L6c:
            com.netflix.clcs.client.InterstitialClient$ServerException r11 = new com.netflix.clcs.client.InterstitialClient$ServerException
            r11.<init>(r0)
            throw r11
        L72:
            D extends o.hE$b r11 = r12.d
            o.Ab$e r11 = (o.C0719Ab.e) r11
            if (r11 == 0) goto L88
            o.Ab$b r11 = r11.d()
            if (r11 == 0) goto L88
            o.BR r11 = r11.d()
            if (r11 == 0) goto L88
            o.FX r0 = o.C0871Fu.b(r11)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0723Af.e(java.lang.String, o.dra):java.lang.Object");
    }
}
