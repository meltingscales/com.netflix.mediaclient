package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import io.reactivex.Single;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C5839cKg;
import o.C6971cnP;
import o.C6975cnT;
import o.C6977cnV;
import o.C7011coC;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.C8737dwr;
import o.C8932fz;
import o.InterfaceC8585dra;
import o.dAU;
import o.dpR;
import o.dqT;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwU;

/* renamed from: o.cnT  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6975cnT extends AbstractC7015coG {
    public static final e b = new e(null);
    public static final int c = 8;
    private final C6977cnV e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C6975cnT(@Assisted C7011coC c7011coC, C6977cnV c6977cnV, dwQ dwq) {
        super(c7011coC, dwq);
        C8632dsu.c((Object) c7011coC, "");
        C8632dsu.c((Object) c6977cnV, "");
        C8632dsu.c((Object) dwq, "");
        this.e = c6977cnV;
    }

    /* renamed from: o.cnT$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC8906fZ<C6975cnT, C7011coC> {
        private final /* synthetic */ C1644aIy<C6975cnT, C7011coC> e;

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        public C6975cnT create(AbstractC8979gt abstractC8979gt, C7011coC c7011coC) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c7011coC, "");
            return this.e.create(abstractC8979gt, c7011coC);
        }

        private e() {
            this.e = new C1644aIy<>(C6975cnT.class);
        }

        /* renamed from: initialState */
        public C7011coC m3180initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new C7011coC(MyListTabItems.Type.a, null, false, null, null, InterfaceC6972cnQ.c.e(), null, 0, null, null, false, null, 4062, null);
        }
    }

    @Override // o.AbstractC7015coG
    public void b(final boolean z, final int i) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                d(c7011coC);
                return dpR.c;
            }

            public final void d(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                if (c7011coC.p() || i == 0) {
                    return;
                }
                C6975cnT c6975cnT = this;
                final boolean z2 = z;
                c6975cnT.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: e */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b2;
                        C7011coC b3;
                        C8632dsu.c((Object) c7011coC2, "");
                        if (z2) {
                            b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : true, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                            return b2;
                        }
                        b3 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : true, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : new C8932fz(null, 1, null), (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b3;
                    }
                });
                C8737dwr.c(this.e(), new a(CoroutineExceptionHandler.Key, this), null, new AnonymousClass2(this, i, c7011coC, null), 2, null);
            }

            /* loaded from: classes4.dex */
            public static final class a extends dqT implements CoroutineExceptionHandler {
                final /* synthetic */ C6975cnT d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(CoroutineExceptionHandler.c cVar, C6975cnT c6975cnT) {
                    super(cVar);
                    this.d = c6975cnT;
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(dqZ dqz, final Throwable th) {
                    this.d.b(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                          (wrap: o.cnT : 0x0000: IGET  (r2v1 o.cnT A[REMOVE]) = (r1v0 'this' com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$a A[IMMUTABLE_TYPE, THIS]) com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.a.d o.cnT)
                          (wrap: o.drM<o.coC, o.coC> : 0x0004: CONSTRUCTOR  (r0v0 o.drM<o.coC, o.coC> A[REMOVE]) = (r3v0 'th' java.lang.Throwable A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$handler$1$1.<init>(java.lang.Throwable):void type: CONSTRUCTOR)
                         type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.a.handleException(o.dqZ, java.lang.Throwable):void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$handler$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 15 more
                        */
                    /*
                        this = this;
                        o.cnT r2 = r1.d
                        com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$handler$1$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$handler$1$1
                        r0.<init>(r3)
                        o.C6975cnT.b(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.a.handleException(o.dqZ, java.lang.Throwable):void");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ C7011coC a;
                final /* synthetic */ int b;
                private /* synthetic */ Object c;
                final /* synthetic */ C6975cnT d;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(C6975cnT c6975cnT, int i, C7011coC c7011coC, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.d = c6975cnT;
                    this.b = i;
                    this.a = c7011coC;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, this.b, this.a, interfaceC8585dra);
                    anonymousClass2.c = obj;
                    return anonymousClass2;
                }

                @Override // o.drX
                /* renamed from: e */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    C6977cnV c6977cnV;
                    C6975cnT c6975cnT;
                    e = C8586drb.e();
                    int i = this.e;
                    try {
                        if (i == 0) {
                            C8556dpz.d(obj);
                            dwU dwu = (dwU) this.c;
                            C6975cnT c6975cnT2 = this.d;
                            int i2 = this.b;
                            C7011coC c7011coC = this.a;
                            Result.c cVar = Result.e;
                            c6977cnV = c6975cnT2.e;
                            Single<C6971cnP> b = c6977cnV.b(i2, null, c7011coC.a());
                            this.c = c6975cnT2;
                            this.e = 1;
                            Object d = dAU.d(b, this);
                            if (d == e) {
                                return e;
                            }
                            c6975cnT = c6975cnT2;
                            obj = d;
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            c6975cnT = (C6975cnT) this.c;
                            C8556dpz.d(obj);
                        }
                        final C6971cnP c6971cnP = (C6971cnP) obj;
                        final C5839cKg c5839cKg = new C5839cKg();
                        c6975cnT.b(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: INVOKE  
                              (r0v3 'c6975cnT' o.cnT)
                              (wrap: o.drM<o.coC, o.coC> : 0x004d: CONSTRUCTOR  (r2v1 o.drM<o.coC, o.coC> A[REMOVE]) = (r7v9 'c6971cnP' o.cnP A[DONT_INLINE]), (r1v4 'c5839cKg' o.cKg A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$2$1$1.<init>(o.cnP, o.cKg):void type: CONSTRUCTOR)
                             type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.2.invokeSuspend(java.lang.Object):java.lang.Object, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$2$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 21 more
                            */
                        /*
                            this = this;
                            java.lang.Object r0 = o.C8588drd.c()
                            int r1 = r6.e
                            r2 = 1
                            if (r1 == 0) goto L1b
                            if (r1 != r2) goto L13
                            java.lang.Object r0 = r6.c
                            o.cnT r0 = (o.C6975cnT) r0
                            o.C8556dpz.d(r7)     // Catch: java.lang.Throwable -> L59
                            goto L44
                        L13:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r0)
                            throw r7
                        L1b:
                            o.C8556dpz.d(r7)
                            java.lang.Object r7 = r6.c
                            o.dwU r7 = (o.dwU) r7
                            o.cnT r7 = r6.d
                            int r1 = r6.b
                            o.coC r3 = r6.a
                            kotlin.Result$c r4 = kotlin.Result.e     // Catch: java.lang.Throwable -> L59
                            o.cnV r4 = o.C6975cnT.c(r7)     // Catch: java.lang.Throwable -> L59
                            java.util.List r3 = r3.a()     // Catch: java.lang.Throwable -> L59
                            r5 = 0
                            io.reactivex.Single r1 = r4.b(r1, r5, r3)     // Catch: java.lang.Throwable -> L59
                            r6.c = r7     // Catch: java.lang.Throwable -> L59
                            r6.e = r2     // Catch: java.lang.Throwable -> L59
                            java.lang.Object r1 = o.dAU.d(r1, r6)     // Catch: java.lang.Throwable -> L59
                            if (r1 != r0) goto L42
                            return r0
                        L42:
                            r0 = r7
                            r7 = r1
                        L44:
                            o.cnP r7 = (o.C6971cnP) r7     // Catch: java.lang.Throwable -> L59
                            o.cKg r1 = new o.cKg     // Catch: java.lang.Throwable -> L59
                            r1.<init>()     // Catch: java.lang.Throwable -> L59
                            com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$2$1$1 r2 = new com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1$2$1$1     // Catch: java.lang.Throwable -> L59
                            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L59
                            o.C6975cnT.b(r0, r2)     // Catch: java.lang.Throwable -> L59
                            o.dpR r7 = o.dpR.c     // Catch: java.lang.Throwable -> L59
                            kotlin.Result.e(r7)     // Catch: java.lang.Throwable -> L59
                            goto L63
                        L59:
                            r7 = move-exception
                            kotlin.Result$c r0 = kotlin.Result.e
                            java.lang.Object r7 = o.C8556dpz.a(r7)
                            kotlin.Result.e(r7)
                        L63:
                            o.dpR r7 = o.dpR.c
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetch$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }
            });
        }

        @Override // o.AbstractC7015coG
        public void h() {
            e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1
                {
                    super(1);
                }

                /* loaded from: classes4.dex */
                public static final class b extends dqT implements CoroutineExceptionHandler {
                    final /* synthetic */ C6975cnT c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(CoroutineExceptionHandler.c cVar, C6975cnT c6975cnT) {
                        super(cVar);
                        this.c = c6975cnT;
                    }

                    @Override // kotlinx.coroutines.CoroutineExceptionHandler
                    public void handleException(dqZ dqz, final Throwable th) {
                        this.c.b(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                              (wrap: o.cnT : 0x0000: IGET  (r2v1 o.cnT A[REMOVE]) = (r1v0 'this' com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$b A[IMMUTABLE_TYPE, THIS]) com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1.b.c o.cnT)
                              (wrap: o.drM<o.coC, o.coC> : 0x0004: CONSTRUCTOR  (r0v0 o.drM<o.coC, o.coC> A[REMOVE]) = (r3v0 'th' java.lang.Throwable A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$1$handler$1$1.<init>(java.lang.Throwable):void type: CONSTRUCTOR)
                             type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1.b.handleException(o.dqZ, java.lang.Throwable):void, file: classes4.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$1$handler$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 15 more
                            */
                        /*
                            this = this;
                            o.cnT r2 = r1.c
                            com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$1$handler$1$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1$1$handler$1$1
                            r0.<init>(r3)
                            o.C6975cnT.b(r2, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.game.MyListViewModelGame$fetchMore$1.b.handleException(o.dqZ, java.lang.Throwable):void");
                    }
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                    b(c7011coC);
                    return dpR.c;
                }

                public final void b(C7011coC c7011coC) {
                    String b2;
                    C8632dsu.c((Object) c7011coC, "");
                    C6971cnP c2 = c7011coC.f().c();
                    if (c2 == null || !c2.d() || (b2 = c2.b()) == null) {
                        return;
                    }
                    C6975cnT c6975cnT = C6975cnT.this;
                    C8737dwr.c(c6975cnT.e(), new b(CoroutineExceptionHandler.Key, c6975cnT), null, new MyListViewModelGame$fetchMore$1$1$1(c6975cnT, b2, c7011coC, c2, null), 2, null);
                }
            });
        }
    }
