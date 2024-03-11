package com.netflix.mediaclient.ui.games.impl.identity;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IdentityViewModel$checkHandleAvailability$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ String a;
    int c;
    final /* synthetic */ IdentityViewModel d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityViewModel$checkHandleAvailability$3(String str, IdentityViewModel identityViewModel, InterfaceC8585dra<? super IdentityViewModel$checkHandleAvailability$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = str;
        this.d = identityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new IdentityViewModel$checkHandleAvailability$3(this.a, this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((IdentityViewModel$checkHandleAvailability$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = o.C8588drd.c()
            int r1 = r5.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            o.C8556dpz.d(r6)
            goto Lb9
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            o.C8556dpz.d(r6)
            goto Lac
        L20:
            o.C8556dpz.d(r6)
            java.lang.String r6 = r5.a
            int r6 = r6.length()
            if (r6 != 0) goto L34
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$1 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.1
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$1 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$1) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.1.a com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass1.<init>():void");
                }

                @Override // o.drM
                /* renamed from: c */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$j r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.j.d
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass1.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        L34:
            if (r3 > r6) goto L47
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r1 = r5.d
            int r1 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b(r1)
            if (r6 >= r1) goto L47
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$2 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.2
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$2 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$2) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.2.d com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass2.<init>():void");
                }

                @Override // o.drM
                /* renamed from: b */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$h r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.h.a
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass2.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        L47:
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r1 = r5.d
            int r1 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r1)
            int r1 = r1 + r3
            if (r1 > r6) goto L5d
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r6 > r1) goto L5d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$3 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.3
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$3 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$3) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.3.c com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass3.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass3.<init>():void");
                }

                @Override // o.drM
                /* renamed from: a */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$d r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.d.a
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass3.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass3.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        L5d:
            java.lang.String r6 = r5.a
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r1 = r5.d
            kotlin.text.Regex r1 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a(r1)
            boolean r6 = r1.e(r6)
            if (r6 != 0) goto L73
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$4 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.4
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$4 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$4
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$4) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.4.a com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$4
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass4.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass4.<init>():void");
                }

                @Override // o.drM
                /* renamed from: c */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$o r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.o.d
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass4.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass4.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        L73:
            java.lang.String r6 = r5.a
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r1 = r5.d
            java.lang.String r1 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.d(r1)
            boolean r6 = o.C8684dus.e(r6, r1, r3)
            if (r6 == 0) goto L89
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$5 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.5
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$5 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$5
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$5) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.5.a com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$5
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass5.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass5.<init>():void");
                }

                @Override // o.drM
                /* renamed from: a */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$c r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.c.e
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass5.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass5.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        L89:
            o.Xp r6 = o.C1332Xp.b
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Object r6 = o.C1332Xp.b(r6)
            android.content.Context r6 = (android.content.Context) r6
            boolean r6 = com.netflix.mediaclient.util.ConnectivityUtils.n(r6)
            if (r6 != 0) goto La1
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$6 r0 = new o.drM<com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b, com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b>() { // from class: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.6
                static {
                    /*
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$6 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$6
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$6) com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.6.a com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$6
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass6.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass6.<init>():void");
                }

                @Override // o.drM
                /* renamed from: e */
                public final com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r10) {
                    /*
                        r9 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r10, r0)
                        r2 = 0
                        r3 = 0
                        o.gl r4 = new o.gl
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$a$g r0 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a.g.d
                        r4.<init>(r0)
                        r5 = 0
                        r6 = 0
                        r7 = 27
                        r8 = 0
                        r1 = r10
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r10 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass6.invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b):com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b");
                }

                @Override // o.drM
                public /* synthetic */ com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b invoke(com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b r1) {
                    /*
                        r0 = this;
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = (com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b) r1
                        com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$b r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.AnonymousClass6.invoke(java.lang.Object):java.lang.Object");
                }
            }
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.c(r6, r0)
            goto Lb9
        La1:
            r5.c = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = o.C8749dxc.b(r3, r5)
            if (r6 != r0) goto Lac
            return r0
        Lac:
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            java.lang.String r1 = r5.a
            r5.c = r2
            java.lang.Object r6 = com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.a(r6, r1, r5)
            if (r6 != r0) goto Lb9
            return r0
        Lb9:
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel r6 = r5.d
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$7 r0 = new com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3$7
            r0.<init>()
            com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel.b(r6, r0)
            o.dpR r6 = o.dpR.c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.games.impl.identity.IdentityViewModel$checkHandleAvailability$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
