package androidx.core.performance.play.services;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayServicesDevicePerformance$savePerformanceClass$2 extends SuspendLambda implements drX<MutablePreferences, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ int $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayServicesDevicePerformance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayServicesDevicePerformance$savePerformanceClass$2(PlayServicesDevicePerformance playServicesDevicePerformance, int i, InterfaceC8585dra<? super PlayServicesDevicePerformance$savePerformanceClass$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.this$0 = playServicesDevicePerformance;
        this.$value = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayServicesDevicePerformance$savePerformanceClass$2 playServicesDevicePerformance$savePerformanceClass$2 = new PlayServicesDevicePerformance$savePerformanceClass$2(this.this$0, this.$value, interfaceC8585dra);
        playServicesDevicePerformance$savePerformanceClass$2.L$0 = obj;
        return playServicesDevicePerformance$savePerformanceClass$2;
    }

    @Override // o.drX
    public final Object invoke(MutablePreferences mutablePreferences, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayServicesDevicePerformance$savePerformanceClass$2) create(mutablePreferences, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        C8586drb.e();
        if (this.label == 0) {
            C8556dpz.d(obj);
            key = this.this$0.mpcKey;
            ((MutablePreferences) this.L$0).set(key, C8589dre.c(this.$value));
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
