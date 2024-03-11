package o;

import com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApplicationStartupListener;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.ckb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6824ckb implements MembersInjector<MhuEbiApplicationStartupListener> {
    private final Provider<InterfaceC6767cjX> b;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(MhuEbiApplicationStartupListener mhuEbiApplicationStartupListener) {
        e(mhuEbiApplicationStartupListener, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.multihouseholdebi.impl.MhuEbiApplicationStartupListener.mhuEbiApplicationApi")
    public static void e(MhuEbiApplicationStartupListener mhuEbiApplicationStartupListener, InterfaceC6767cjX interfaceC6767cjX) {
        mhuEbiApplicationStartupListener.mhuEbiApplicationApi = interfaceC6767cjX;
    }
}
