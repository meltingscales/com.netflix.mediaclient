package androidx.datastore.preferences.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes2.dex */
final class PreferenceDataStore$updateData$2 extends SuspendLambda implements drX<Preferences, InterfaceC8585dra<? super Preferences>, Object> {
    final /* synthetic */ drX<Preferences, InterfaceC8585dra<? super Preferences>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStore$updateData$2(drX<? super Preferences, ? super InterfaceC8585dra<? super Preferences>, ? extends Object> drx, InterfaceC8585dra<? super PreferenceDataStore$updateData$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$transform = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, interfaceC8585dra);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // o.drX
    public final Object invoke(Preferences preferences, InterfaceC8585dra<? super Preferences> interfaceC8585dra) {
        return ((PreferenceDataStore$updateData$2) create(preferences, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            drX<Preferences, InterfaceC8585dra<? super Preferences>, Object> drx = this.$transform;
            this.label = 1;
            obj = drx.invoke((Preferences) this.L$0, this);
            if (obj == e) {
                return e;
            }
        } else if (i == 1) {
            C8556dpz.d(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Preferences preferences = (Preferences) obj;
        ((MutablePreferences) preferences).freeze$datastore_preferences_core();
        return preferences;
    }
}
