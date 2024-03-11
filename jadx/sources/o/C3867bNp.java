package o;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bNp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3867bNp implements MembersInjector<MagicPathFragment> {
    private final Provider<InterfaceC3861bNj> e;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(MagicPathFragment magicPathFragment) {
        d(magicPathFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.MagicPathFragment.magicPathOutboundNavigation")
    public static void d(MagicPathFragment magicPathFragment, InterfaceC3861bNj interfaceC3861bNj) {
        magicPathFragment.magicPathOutboundNavigation = interfaceC3861bNj;
    }
}
