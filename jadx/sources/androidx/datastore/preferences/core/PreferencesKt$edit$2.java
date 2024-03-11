package androidx.datastore.preferences.core;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* loaded from: classes2.dex */
final class PreferencesKt$edit$2 extends SuspendLambda implements drX<Preferences, InterfaceC8585dra<? super Preferences>, Object> {
    final /* synthetic */ drX<MutablePreferences, InterfaceC8585dra<? super dpR>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(drX<? super MutablePreferences, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, InterfaceC8585dra<? super PreferencesKt$edit$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$transform = drx;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, interfaceC8585dra);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // o.drX
    public final Object invoke(Preferences preferences, InterfaceC8585dra<? super Preferences> interfaceC8585dra) {
        return ((PreferencesKt$edit$2) create(preferences, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                C8556dpz.d(obj);
                return mutablePreferences;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C8556dpz.d(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
        drX<MutablePreferences, InterfaceC8585dra<? super dpR>, Object> drx = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        return drx.invoke(mutablePreferences2, this) == e ? e : mutablePreferences2;
    }
}
