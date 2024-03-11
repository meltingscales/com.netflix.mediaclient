package androidx.core.performance.play.services;

import android.content.Context;
import android.util.Log;
import androidx.core.performance.DefaultDevicePerformance;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.deviceperformance.DevicePerformance;
import com.google.android.gms.deviceperformance.DevicePerformanceClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8632dsu;
import o.C8737dwr;
import o.C8740dwu;
import o.InterfaceC8554dpx;
import o.InterfaceC8585dra;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dwU;
import o.dyQ;
import o.dyR;
import o.dyS;

/* loaded from: classes2.dex */
public final class PlayServicesDevicePerformance {
    private final Context context;
    private final DefaultDevicePerformance defaultMpc;
    private final InterfaceC8554dpx<Integer> lazyMpc;
    private final Preferences.Key<Integer> mpcKey;
    private final DataStore<Preferences> performanceStore;
    private final String tag;

    public PlayServicesDevicePerformance(Context context, DevicePerformanceClient devicePerformanceClient, DataStore<Preferences> dataStore) {
        InterfaceC8554dpx<Integer> b;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) devicePerformanceClient, "");
        C8632dsu.c((Object) dataStore, "");
        this.context = context;
        this.performanceStore = dataStore;
        this.tag = "PlayServicesDevicePerformance";
        this.defaultMpc = new DefaultDevicePerformance();
        this.mpcKey = PreferencesKeys.intKey("mpc_value");
        b = dpB.b(new drO<Integer>() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance$lazyMpc$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.performance.play.services.PlayServicesDevicePerformance$lazyMpc$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super Integer>, Object> {
                int label;
                final /* synthetic */ PlayServicesDevicePerformance this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PlayServicesDevicePerformance playServicesDevicePerformance, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.this$0 = playServicesDevicePerformance;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    return new AnonymousClass1(this.this$0, interfaceC8585dra);
                }

                @Override // o.drX
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super Integer> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object e;
                    dyS performanceClass;
                    String str;
                    String str2;
                    DefaultDevicePerformance defaultDevicePerformance;
                    DefaultDevicePerformance defaultDevicePerformance2;
                    String str3;
                    e = C8586drb.e();
                    int i = this.label;
                    if (i == 0) {
                        C8556dpz.d(obj);
                        performanceClass = this.this$0.getPerformanceClass();
                        this.label = 1;
                        obj = dyR.c(performanceClass, (InterfaceC8585dra) this);
                        if (obj == e) {
                            return e;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C8556dpz.d(obj);
                    }
                    Integer num = (Integer) obj;
                    str = this.this$0.tag;
                    Log.v(str, "Stored mpc is " + num);
                    str2 = this.this$0.tag;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Default mpc is ");
                    defaultDevicePerformance = this.this$0.defaultMpc;
                    sb.append(defaultDevicePerformance.getMediaPerformanceClass());
                    Log.v(str2, sb.toString());
                    int intValue = num != null ? num.intValue() : 0;
                    defaultDevicePerformance2 = this.this$0.defaultMpc;
                    int max = Math.max(intValue, defaultDevicePerformance2.getMediaPerformanceClass());
                    str3 = this.this$0.tag;
                    Log.v(str3, "Mpc value used " + max);
                    return C8589dre.c(max);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Integer invoke() {
                Object b2;
                b2 = C8740dwu.b(null, new AnonymousClass1(PlayServicesDevicePerformance.this, null), 1, null);
                return (Integer) b2;
            }
        });
        this.lazyMpc = b;
        Log.v("PlayServicesDevicePerformance", "Getting mediaPerformanceClass from com.google.android.gms.deviceperformance.DevicePerformanceClient");
        updatePerformanceStore(devicePerformanceClient);
    }

    public int getMediaPerformanceClass() {
        return this.lazyMpc.getValue().intValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayServicesDevicePerformance(final Context context) {
        this(context, DevicePerformance.INSTANCE.getClient(context), PreferenceDataStoreFactory.create$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new drO<File>() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final File invoke() {
                return PreferenceDataStoreFile.preferencesDataStoreFile(context, "media_performance_class");
            }
        }, 7, null));
        C8632dsu.c((Object) context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dyS<Integer> getPerformanceClass() {
        final dyS<Preferences> data = this.performanceStore.getData();
        return new dyS<Integer>() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1
            @Override // o.dyS
            public Object collect(dyQ<? super Integer> dyq, InterfaceC8585dra interfaceC8585dra) {
                Object e;
                Object collect = dyS.this.collect(new AnonymousClass2(dyq, this), interfaceC8585dra);
                e = C8586drb.e();
                return collect == e ? collect : dpR.c;
            }

            /* renamed from: androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements dyQ {
                final /* synthetic */ dyQ $this_unsafeFlow;
                final /* synthetic */ PlayServicesDevicePerformance this$0;

                /* renamed from: androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC8585dra interfaceC8585dra) {
                        super(interfaceC8585dra);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(dyQ dyq, PlayServicesDevicePerformance playServicesDevicePerformance) {
                    this.$this_unsafeFlow = dyq;
                    this.this$0 = playServicesDevicePerformance;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        boolean r0 = r6 instanceof androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1$2$1 r0 = (androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 + r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1$2$1 r0 = new androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = o.C8588drd.c()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        o.C8556dpz.d(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        o.C8556dpz.d(r6)
                        o.dyQ r6 = r4.$this_unsafeFlow
                        androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                        androidx.core.performance.play.services.PlayServicesDevicePerformance r2 = r4.this$0
                        androidx.datastore.preferences.core.Preferences$Key r2 = androidx.core.performance.play.services.PlayServicesDevicePerformance.access$getMpcKey$p(r2)
                        java.lang.Object r5 = r5.get(r2)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        o.dpR r5 = o.dpR.c
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.core.performance.play.services.PlayServicesDevicePerformance$getPerformanceClass$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.dra):java.lang.Object");
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object savePerformanceClass(int i, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        Object e;
        Object edit = PreferencesKt.edit(this.performanceStore, new PlayServicesDevicePerformance$savePerformanceClass$2(this, i, null), interfaceC8585dra);
        e = C8586drb.e();
        return edit == e ? edit : dpR.c;
    }

    private final void updatePerformanceStore(DevicePerformanceClient devicePerformanceClient) {
        Task<Integer> mediaPerformanceClass = devicePerformanceClient.mediaPerformanceClass();
        final drM<Integer, dpR> drm = new drM<Integer, dpR>() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance$updatePerformanceStore$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.core.performance.play.services.PlayServicesDevicePerformance$updatePerformanceStore$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                final /* synthetic */ Integer $result;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ PlayServicesDevicePerformance this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PlayServicesDevicePerformance playServicesDevicePerformance, Integer num, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
                    super(2, interfaceC8585dra);
                    this.this$0 = playServicesDevicePerformance;
                    this.$result = num;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$result, interfaceC8585dra);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // o.drX
                public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    String str;
                    DefaultDevicePerformance defaultDevicePerformance;
                    C8586drb.e();
                    if (this.label == 0) {
                        C8556dpz.d(obj);
                        dwU dwu = (dwU) this.L$0;
                        str = this.this$0.tag;
                        Log.v(str, "Got mediaPerformanceClass " + this.$result);
                        Integer num = this.$result;
                        C8632dsu.a(num, "");
                        int intValue = num.intValue();
                        defaultDevicePerformance = this.this$0.defaultMpc;
                        C8737dwr.c(dwu, null, null, new C00331(this.this$0, Math.max(intValue, defaultDevicePerformance.getMediaPerformanceClass()), null), 3, null);
                        return dpR.c;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: androidx.core.performance.play.services.PlayServicesDevicePerformance$updatePerformanceStore$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C00331 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
                    final /* synthetic */ int $storedVal;
                    int label;
                    final /* synthetic */ PlayServicesDevicePerformance this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00331(PlayServicesDevicePerformance playServicesDevicePerformance, int i, InterfaceC8585dra<? super C00331> interfaceC8585dra) {
                        super(2, interfaceC8585dra);
                        this.this$0 = playServicesDevicePerformance;
                        this.$storedVal = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
                        return new C00331(this.this$0, this.$storedVal, interfaceC8585dra);
                    }

                    @Override // o.drX
                    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                        return ((C00331) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object e;
                        Object savePerformanceClass;
                        String str;
                        e = C8586drb.e();
                        int i = this.label;
                        if (i == 0) {
                            C8556dpz.d(obj);
                            PlayServicesDevicePerformance playServicesDevicePerformance = this.this$0;
                            int i2 = this.$storedVal;
                            this.label = 1;
                            savePerformanceClass = playServicesDevicePerformance.savePerformanceClass(i2, this);
                            if (savePerformanceClass == e) {
                                return e;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C8556dpz.d(obj);
                        }
                        str = this.this$0.tag;
                        Log.v(str, "Saved mediaPerformanceClass " + this.$storedVal);
                        return dpR.c;
                    }
                }
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Integer num) {
                invoke2(num);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                C8740dwu.b(null, new AnonymousClass1(PlayServicesDevicePerformance.this, num, null), 1, null);
            }
        };
        mediaPerformanceClass.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PlayServicesDevicePerformance.updatePerformanceStore$lambda$1(drM.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.core.performance.play.services.PlayServicesDevicePerformance$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PlayServicesDevicePerformance.updatePerformanceStore$lambda$2(PlayServicesDevicePerformance.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePerformanceStore$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePerformanceStore$lambda$2(PlayServicesDevicePerformance playServicesDevicePerformance, Exception exc) {
        C8632dsu.c((Object) playServicesDevicePerformance, "");
        C8632dsu.c((Object) exc, "");
        if (exc instanceof ApiException) {
            Log.e(playServicesDevicePerformance.tag, "Error saving mediaPerformanceClass", exc);
        } else if (exc instanceof IllegalStateException) {
            Log.e(playServicesDevicePerformance.tag, "Error saving mediaPerformanceClass", exc);
        }
    }
}
