package o;

import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bYs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4167bYs implements MembersInjector<KidsCharacterFrag> {
    private final Provider<InterfaceC1573aGh> a;
    private final Provider<PlaybackLauncher> b;

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(KidsCharacterFrag kidsCharacterFrag) {
        C1092Oj.e(kidsCharacterFrag, this.a);
        e(kidsCharacterFrag, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag.playbackLauncher")
    public static void e(KidsCharacterFrag kidsCharacterFrag, Lazy<PlaybackLauncher> lazy) {
        kidsCharacterFrag.playbackLauncher = lazy;
    }
}
