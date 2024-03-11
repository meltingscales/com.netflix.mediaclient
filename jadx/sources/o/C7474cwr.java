package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.ui.pauseads.api.PauseAdsUiModel;
import com.netflix.mediaclient.ui.pauseads.impl.PauseAdsDialogFragment;
import com.netflix.mediaclient.ui.pauseads.impl.PauseAdsManagerImpl$prepareAd$2;
import com.netflix.mediaclient.ui.pauseads.impl.PauseAdsManagerImpl$showPauseAd$1;
import javax.inject.Inject;

/* renamed from: o.cwr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7474cwr implements InterfaceC7468cwl {
    private final dwQ b;
    public static final e e = new e(null);
    public static final int a = 8;

    @Inject
    public C7474cwr(dwQ dwq) {
        C8632dsu.c((Object) dwq, "");
        this.b = dwq;
    }

    /* renamed from: o.cwr$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.InterfaceC7468cwl
    public void d(NetflixFrag netflixFrag) {
        C8632dsu.c((Object) netflixFrag, "");
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(netflixFrag), null, null, new PauseAdsManagerImpl$showPauseAd$1(this, netflixFrag, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(PauseAdsUiModel pauseAdsUiModel, NetflixFrag netflixFrag) {
        return netflixFrag.by_().showFullScreenDialog(PauseAdsDialogFragment.d.b(pauseAdsUiModel));
    }

    public Object d(InterfaceC8585dra<? super InterfaceC7466cwj> interfaceC8585dra) {
        return C8738dws.c(this.b, new PauseAdsManagerImpl$prepareAd$2(this, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(InterfaceC8585dra<? super C7465cwi> interfaceC8585dra) {
        return C7465cwi.e.b();
    }
}
