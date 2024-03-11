package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1;
import dagger.Lazy;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C7011coC;
import o.C7013coE;
import o.C7052cot;
import o.C8632dsu;
import o.C8737dwr;
import o.C8932fz;
import o.InterfaceC8585dra;
import o.dpR;
import o.dqT;
import o.dqZ;
import o.drM;
import o.drX;
import o.dwU;

/* renamed from: o.cot  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7052cot extends AbstractC7015coG {
    public static final b b = new b(null);
    public static final int e = 8;
    private final aDB c;
    private final Lazy<bZI> i;
    private final InterfaceC7005cnx j;

    /* renamed from: o.cot$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC8906fZ<C7052cot, C7011coC> {
        private final /* synthetic */ C1644aIy<C7052cot, C7011coC> c;

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        public C7052cot create(AbstractC8979gt abstractC8979gt, C7011coC c7011coC) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c7011coC, "");
            return this.c.create(abstractC8979gt, c7011coC);
        }

        private b() {
            this.c = new C1644aIy<>(C7052cot.class);
        }

        /* renamed from: initialState */
        public C7011coC m3182initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            return new C7011coC(MyListTabItems.Type.e, null, false, null, null, InterfaceC6972cnQ.c.b(), null, 0, null, null, false, null, 4062, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C7052cot(@Assisted C7011coC c7011coC, Lazy<bZI> lazy, aDB adb, InterfaceC7005cnx interfaceC7005cnx, dwQ dwq) {
        super(c7011coC, dwq);
        C8632dsu.c((Object) c7011coC, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) adb, "");
        C8632dsu.c((Object) interfaceC7005cnx, "");
        C8632dsu.c((Object) dwq, "");
        this.i = lazy;
        this.c = adb;
        this.j = interfaceC7005cnx;
        f();
    }

    @Override // o.AbstractC7015coG
    public void b(final boolean z, final int i) {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* loaded from: classes4.dex */
            public static final class b extends dqT implements CoroutineExceptionHandler {
                final /* synthetic */ C7052cot d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CoroutineExceptionHandler.c cVar, C7052cot c7052cot) {
                    super(cVar);
                    this.d = c7052cot;
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(dqZ dqz, final Throwable th) {
                    this.d.b(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                          (wrap: o.cot : 0x0000: IGET  (r2v1 o.cot A[REMOVE]) = (r1v0 'this' com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$b A[IMMUTABLE_TYPE, THIS]) com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1.b.d o.cot)
                          (wrap: o.drM<o.coC, o.coC> : 0x0004: CONSTRUCTOR  (r0v0 o.drM<o.coC, o.coC> A[REMOVE]) = (r3v0 'th' java.lang.Throwable A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$handler$1$1.<init>(java.lang.Throwable):void type: CONSTRUCTOR)
                         type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1.b.handleException(o.dqZ, java.lang.Throwable):void, file: classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$handler$1$1, state: NOT_LOADED
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
                        o.cot r2 = r1.d
                        com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$handler$1$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$handler$1$1
                        r0.<init>(r3)
                        o.C7052cot.d(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1.b.handleException(o.dqZ, java.lang.Throwable):void");
                }
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                b(c7011coC);
                return dpR.c;
            }

            public final void b(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                if (c7011coC.p() || i == 0) {
                    return;
                }
                C7052cot c7052cot = this;
                final boolean z2 = z;
                c7052cot.b(new drM<C7011coC, C7011coC>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    /* renamed from: a */
                    public final C7011coC invoke(C7011coC c7011coC2) {
                        C7011coC b2;
                        C7011coC b3;
                        C8632dsu.c((Object) c7011coC2, "");
                        if (z2) {
                            b2 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : true, (r26 & 8) != 0 ? c7011coC2.i : null, (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                            return b2;
                        }
                        b3 = c7011coC2.b((r26 & 1) != 0 ? c7011coC2.m : null, (r26 & 2) != 0 ? c7011coC2.h : null, (r26 & 4) != 0 ? c7011coC2.a : true, (r26 & 8) != 0 ? c7011coC2.i : new C8932fz(null, 1, null), (r26 & 16) != 0 ? c7011coC2.j : null, (r26 & 32) != 0 ? c7011coC2.d : null, (r26 & 64) != 0 ? c7011coC2.l : null, (r26 & 128) != 0 ? c7011coC2.f : 0, (r26 & JSONzip.end) != 0 ? c7011coC2.g : null, (r26 & 512) != 0 ? c7011coC2.e : null, (r26 & 1024) != 0 ? c7011coC2.c : false, (r26 & 2048) != 0 ? c7011coC2.b : null);
                        return b3;
                    }
                });
                C8737dwr.c(this.e(), new b(CoroutineExceptionHandler.Key, this), null, new AnonymousClass2(this, c7011coC, null), 2, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1$2  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                int c;
                final /* synthetic */ C7011coC d;
                final /* synthetic */ C7052cot e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(C7052cot c7052cot, C7011coC c7011coC, InterfaceC8585dra<? super AnonymousClass2> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.e = c7052cot;
                    this.d = c7011coC;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass2(this.e, this.d, interfaceC8585dra);
                }

                @Override // o.drX
                /* renamed from: e */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00a7 A[SYNTHETIC] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        Method dump skipped, instructions count: 238
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetch$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
        });
    }

    @Override // o.AbstractC7015coG
    public void h() {
        e(new drM<C7011coC, dpR>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1
            {
                super(1);
            }

            /* loaded from: classes4.dex */
            public static final class a extends dqT implements CoroutineExceptionHandler {
                final /* synthetic */ C7052cot c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(CoroutineExceptionHandler.c cVar, C7052cot c7052cot) {
                    super(cVar);
                    this.c = c7052cot;
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public void handleException(dqZ dqz, final Throwable th) {
                    this.c.b(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                          (wrap: o.cot : 0x0000: IGET  (r2v1 o.cot A[REMOVE]) = (r1v0 'this' com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$a A[IMMUTABLE_TYPE, THIS]) com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1.a.c o.cot)
                          (wrap: o.drM<o.coC, o.coC> : 0x0004: CONSTRUCTOR  (r0v0 o.drM<o.coC, o.coC> A[REMOVE]) = (r3v0 'th' java.lang.Throwable A[DONT_INLINE]) call: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$handler$1$1.<init>(java.lang.Throwable):void type: CONSTRUCTOR)
                         type: VIRTUAL call: o.fS.b(o.drM):void in method: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1.a.handleException(o.dqZ, java.lang.Throwable):void, file: classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$handler$1$1, state: NOT_LOADED
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
                        o.cot r2 = r1.c
                        com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$handler$1$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$handler$1$1
                        r0.<init>(r3)
                        o.C7052cot.d(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1.a.handleException(o.dqZ, java.lang.Throwable):void");
                }
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7011coC c7011coC) {
                e(c7011coC);
                return dpR.c;
            }

            public final void e(C7011coC c7011coC) {
                C8632dsu.c((Object) c7011coC, "");
                C7013coE c = c7011coC.h().c();
                if ((c7011coC.h() instanceof C8932fz) || c == null || !c.e()) {
                    return;
                }
                C8737dwr.c(C7052cot.this.e(), new a(CoroutineExceptionHandler.Key, C7052cot.this), null, new AnonymousClass1(C7052cot.this, c7011coC, c, null), 2, null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1$1  reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ C7013coE a;
                int b;
                final /* synthetic */ C7052cot c;
                final /* synthetic */ C7011coC d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C7052cot c7052cot, C7011coC c7011coC, C7013coE c7013coE, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.c = c7052cot;
                    this.d = c7011coC;
                    this.a = c7013coE;
                }

                @Override // o.drX
                /* renamed from: b */
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.c, this.d, this.a, interfaceC8585dra);
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00db A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00a7 A[SYNTHETIC] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        Method dump skipped, instructions count: 242
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$fetchMore$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
        });
    }

    /* renamed from: o.cot$a */
    /* loaded from: classes6.dex */
    public static final class a implements dyS<C7011coC> {
        final /* synthetic */ dyS b;

        public a(dyS dys) {
            this.b = dys;
        }

        @Override // o.dyS
        public Object collect(dyQ<? super C7011coC> dyq, InterfaceC8585dra interfaceC8585dra) {
            Object collect = this.b.collect(new AnonymousClass4(dyq), interfaceC8585dra);
            return collect == C8588drd.c() ? collect : dpR.c;
        }

        /* renamed from: o.cot$a$4  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass4<T> implements dyQ {
            final /* synthetic */ dyQ c;

            public AnonymousClass4(dyQ dyq) {
                this.c = dyq;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.dyQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, o.InterfaceC8585dra r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1 r0 = (com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.e = r1
                    goto L18
                L13:
                    com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1 r0 = new com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = o.C8588drd.c()
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    o.C8556dpz.d(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    o.C8556dpz.d(r6)
                    o.dyQ r6 = r4.c
                    r2 = r5
                    o.coC r2 = (o.C7011coC) r2
                    o.fl r2 = r2.h()
                    boolean r2 = r2 instanceof o.C8971gl
                    if (r2 == 0) goto L4a
                    r0.e = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    o.dpR r5 = o.dpR.c
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.C7052cot.a.AnonymousClass4.emit(java.lang.Object, o.dra):java.lang.Object");
            }
        }
    }

    private final void f() {
        dyR.e(dyR.a(dyR.c((dyS) new a(dyR.c(a(), new drX<C7011coC, C7011coC, Boolean>() { // from class: com.netflix.mediaclient.ui.mylist.impl.video.MyListViewModelVideo$observeVideosLiveState$1
            @Override // o.drX
            /* renamed from: c */
            public final Boolean invoke(C7011coC c7011coC, C7011coC c7011coC2) {
                C8632dsu.c((Object) c7011coC, "");
                C8632dsu.c((Object) c7011coC2, "");
                return Boolean.valueOf(C8632dsu.c(c7011coC.h(), c7011coC2.h()));
            }
        })), (InterfaceC8612dsa) new MyListViewModelVideo$observeVideosLiveState$$inlined$flatMapLatest$1(null, this)), i()), e());
    }
}
