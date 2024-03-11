package o;

import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bAZ implements MembersInjector<CollectTasteDialogFrag> {
    private final Provider<CollectTaste> b;
    private final Provider<InterfaceC1573aGh> d;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(CollectTasteDialogFrag collectTasteDialogFrag) {
        C1095Om.d(collectTasteDialogFrag, DoubleCheck.lazy(this.d));
        d(collectTasteDialogFrag, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag.collectTaste")
    public static void d(CollectTasteDialogFrag collectTasteDialogFrag, Lazy<CollectTaste> lazy) {
        collectTasteDialogFrag.collectTaste = lazy;
    }
}
