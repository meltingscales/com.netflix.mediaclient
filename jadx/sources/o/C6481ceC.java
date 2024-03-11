package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ceC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6481ceC implements MembersInjector<QuickDrawDialogFrag> {
    private final Provider<InterfaceC7303ctf> a;
    private final Provider<PlaybackLauncher> b;
    private final Provider<InterfaceC5303bwH> c;
    private final Provider<C6488ceJ> d;
    private final Provider<InterfaceC1573aGh> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(QuickDrawDialogFrag quickDrawDialogFrag) {
        C1095Om.d(quickDrawDialogFrag, DoubleCheck.lazy(this.e));
        b(quickDrawDialogFrag, this.a.get());
        b(quickDrawDialogFrag, this.d.get());
        e(quickDrawDialogFrag, this.c.get());
        e(quickDrawDialogFrag, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag.offlineApi")
    public static void b(QuickDrawDialogFrag quickDrawDialogFrag, InterfaceC7303ctf interfaceC7303ctf) {
        quickDrawDialogFrag.offlineApi = interfaceC7303ctf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag.quickDrawRepo")
    public static void b(QuickDrawDialogFrag quickDrawDialogFrag, C6488ceJ c6488ceJ) {
        quickDrawDialogFrag.quickDrawRepo = c6488ceJ;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag.adsPlan")
    public static void e(QuickDrawDialogFrag quickDrawDialogFrag, InterfaceC5303bwH interfaceC5303bwH) {
        quickDrawDialogFrag.adsPlan = interfaceC5303bwH;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.lomo.qddp.QuickDrawDialogFrag.playbackLauncher")
    public static void e(QuickDrawDialogFrag quickDrawDialogFrag, Lazy<PlaybackLauncher> lazy) {
        quickDrawDialogFrag.playbackLauncher = lazy;
    }
}
