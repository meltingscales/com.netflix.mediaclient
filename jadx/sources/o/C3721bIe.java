package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bIe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3721bIe implements MembersInjector<FullDpFrag> {
    private final Provider<C3705bHp> a;
    private final Provider<InterfaceC1270Vf> b;
    private final Provider<InterfaceC5303bwH> c;
    private final Provider<C3706bHq> d;
    private final Provider<InterfaceC7303ctf> e;
    private final Provider<InterfaceC1573aGh> g;
    private final Provider<PlaybackLauncher> h;
    private final Provider<InterfaceC1126Pr> i;
    private final Provider<cWC> j;

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(FullDpFrag fullDpFrag) {
        C1092Oj.e(fullDpFrag, this.g);
        b(fullDpFrag, this.a.get());
        e(fullDpFrag, this.e.get());
        c(fullDpFrag, this.i.get());
        c(fullDpFrag, this.b.get());
        e(fullDpFrag, DoubleCheck.lazy(this.h));
        a(fullDpFrag, this.j.get());
        a(fullDpFrag, this.c.get());
        a(fullDpFrag, this.d.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.fullDpCl")
    public static void b(FullDpFrag fullDpFrag, C3705bHp c3705bHp) {
        fullDpFrag.fullDpCl = c3705bHp;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.offlineApi")
    public static void e(FullDpFrag fullDpFrag, InterfaceC7303ctf interfaceC7303ctf) {
        fullDpFrag.offlineApi = interfaceC7303ctf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.sharing")
    public static void c(FullDpFrag fullDpFrag, InterfaceC1126Pr interfaceC1126Pr) {
        fullDpFrag.sharing = interfaceC1126Pr;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.clock")
    public static void c(FullDpFrag fullDpFrag, InterfaceC1270Vf interfaceC1270Vf) {
        fullDpFrag.clock = interfaceC1270Vf;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.playbackLauncher")
    public static void e(FullDpFrag fullDpFrag, Lazy<PlaybackLauncher> lazy) {
        fullDpFrag.playbackLauncher = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.uma")
    public static void a(FullDpFrag fullDpFrag, cWC cwc) {
        fullDpFrag.uma = cwc;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.adsPlan")
    public static void a(FullDpFrag fullDpFrag, InterfaceC5303bwH interfaceC5303bwH) {
        fullDpFrag.adsPlan = interfaceC5303bwH;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.detailspage.impl.fulldp.FullDpFrag.migrationFeature")
    public static void a(FullDpFrag fullDpFrag, C3706bHq c3706bHq) {
        fullDpFrag.migrationFeature = c3706bHq;
    }
}
