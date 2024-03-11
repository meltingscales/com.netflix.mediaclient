package o;

import android.content.Context;
import android.os.Bundle;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import com.netflix.mediaclient.graphqlplatform.api.client.fetcher.RequestPriority;
import com.netflix.mediaclient.graphqlrepo.api.client.fetcher.QueryMode;
import com.netflix.mediaclient.service.configuration.ImageResolutionClass;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import dagger.hilt.android.qualifiers.ApplicationContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1135Qa;
import o.C1137Qc;
import o.C1370Yu;
import o.C8556dpz;
import o.C8586drb;
import o.C8954gU;
import o.InterfaceC8585dra;
import o.InterfaceC8999hM;
import o.XY;
import o.aCE;
import o.aCG;
import o.dpR;
import o.drM;

/* renamed from: o.Qa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1135Qa extends AbstractC8899fS<C1137Qc> {
    public static final a c = new a(null);
    public static final int e = 8;
    private final InterfaceC1469aCl a;
    private final aCG b;
    private final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public C1135Qa(@Assisted C1137Qc c1137Qc, @ApplicationContext Context context, aCG acg, InterfaceC1469aCl interfaceC1469aCl) {
        super(c1137Qc, null, 2, null);
        C8632dsu.c((Object) c1137Qc, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) acg, "");
        C8632dsu.c((Object) interfaceC1469aCl, "");
        this.d = context;
        this.b = acg;
        this.a = interfaceC1469aCl;
        e(new drM<C1137Qc, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareSheetViewModel$1

            /* loaded from: classes6.dex */
            public final /* synthetic */ class e {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[ImageResolutionClass.values().length];
                    try {
                        iArr[ImageResolutionClass.HIGH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ImageResolutionClass.MEDIUM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ImageResolutionClass.LOW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C1137Qc c1137Qc2) {
                a(c1137Qc2);
                return dpR.c;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(o.C1137Qc r33) {
                /*
                    Method dump skipped, instructions count: 319
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.android.sharing.impl.ShareSheetViewModel$1.a(o.Qc):void");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.android.sharing.impl.ShareSheetViewModel$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass3 extends SuspendLambda implements drM<InterfaceC8585dra<? super C8954gU<C1370Yu.d>>, Object> {
                final /* synthetic */ C1135Qa c;
                final /* synthetic */ C1370Yu d;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(C1135Qa c1135Qa, C1370Yu c1370Yu, InterfaceC8585dra<? super AnonymousClass3> interfaceC8585dra) {
                    super(1, interfaceC8585dra);
                    this.c = c1135Qa;
                    this.d = c1370Yu;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass3(this.c, this.d, interfaceC8585dra);
                }

                @Override // o.drM
                /* renamed from: d */
                public final Object invoke(InterfaceC8585dra<? super C8954gU<C1370Yu.d>> interfaceC8585dra) {
                    return ((AnonymousClass3) create(interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    aCG acg;
                    e = C8586drb.e();
                    int i = this.e;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        acg = this.c.b;
                        C1370Yu c1370Yu = this.d;
                        RequestPriority requestPriority = RequestPriority.d;
                        this.e = 1;
                        obj = aCE.d.d((aCE) acg, (InterfaceC8999hM) c1370Yu, (QueryMode) null, requestPriority, false, (InterfaceC8585dra) this, 10, (Object) null);
                        if (obj == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    return obj;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.netflix.mediaclient.android.sharing.impl.ShareSheetViewModel$1$5  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass5 extends SuspendLambda implements drM<InterfaceC8585dra<? super C8954gU<XY.e>>, Object> {
                final /* synthetic */ C1135Qa a;
                final /* synthetic */ XY b;
                int e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(C1135Qa c1135Qa, XY xy, InterfaceC8585dra<? super AnonymousClass5> interfaceC8585dra) {
                    super(1, interfaceC8585dra);
                    this.a = c1135Qa;
                    this.b = xy;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass5(this.a, this.b, interfaceC8585dra);
                }

                @Override // o.drM
                /* renamed from: e */
                public final Object invoke(InterfaceC8585dra<? super C8954gU<XY.e>> interfaceC8585dra) {
                    return ((AnonymousClass5) create(interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    aCG acg;
                    e = C8586drb.e();
                    int i = this.e;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        acg = this.a.b;
                        XY xy = this.b;
                        RequestPriority requestPriority = RequestPriority.d;
                        this.e = 1;
                        obj = aCE.d.d((aCE) acg, (InterfaceC8999hM) xy, (QueryMode) null, requestPriority, false, (InterfaceC8585dra) this, 10, (Object) null);
                        if (obj == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    return obj;
                }
            }
        });
    }

    /* renamed from: o.Qa$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8906fZ<C1135Qa, C1137Qc> {
        private final /* synthetic */ C1644aIy<C1135Qa, C1137Qc> c;

        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        public C1135Qa create(AbstractC8979gt abstractC8979gt, C1137Qc c1137Qc) {
            C8632dsu.c((Object) abstractC8979gt, "");
            C8632dsu.c((Object) c1137Qc, "");
            return this.c.create(abstractC8979gt, c1137Qc);
        }

        private a() {
            this.c = new C1644aIy<>(C1135Qa.class);
        }

        /* renamed from: initialState */
        public C1137Qc m3150initialState(AbstractC8979gt abstractC8979gt) {
            C8632dsu.c((Object) abstractC8979gt, "");
            Object b = abstractC8979gt.b();
            C8632dsu.d(b);
            ShareableInternal shareableInternal = (ShareableInternal) ((Bundle) b).getParcelable("Shareable");
            if (shareableInternal != null) {
                return new C1137Qc(shareableInternal.c(), C8974go.e, shareableInternal, null, 8, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
