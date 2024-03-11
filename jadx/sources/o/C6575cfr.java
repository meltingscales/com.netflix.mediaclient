package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.mdx2.MdxEventProducer;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.PlayContext;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import o.AbstractC7475cws;
import o.C8241dgf;

/* renamed from: o.cfr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6575cfr {
    public static boolean d(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j, boolean z) {
        return e(netflixActivity, interfaceC5160btX.aH_(), videoType, interfaceC5160btX.H(), playContext, j, z);
    }

    public static boolean e(NetflixActivity netflixActivity, String str, VideoType videoType, boolean z, PlayContext playContext, long j, boolean z2) {
        C8160dfD.c(playContext);
        if (!C8168dfL.i(str)) {
            InterfaceC1598aHf.a("Non numeric videoId passed in Mdx PlayVideo");
            return false;
        }
        InterfaceC5131bsv d = C8005dcH.d(netflixActivity.getServiceManager());
        if (d == null) {
            C1044Mm.j("MdxAgentApi", "MDX agent not available - can't play video");
            return false;
        }
        C8241dgf.e n = d.n();
        if (z2 || n == null || !C8168dfL.d(n.a, str)) {
            String i = d.i();
            Intent a = a(netflixActivity, "com.netflix.mediaclient.intent.action.MDX_ACTION_PLAY_VIDEOIDS", i);
            if (videoType == VideoType.MOVIE) {
                a.putExtra("catalogId", str);
            } else if (videoType == VideoType.EPISODE) {
                a.putExtra("episodeId", str);
            }
            a.putExtra("trackId", playContext.getTrackId());
            a.putExtra("time", (int) TimeUnit.MILLISECONDS.toSeconds(j));
            if (z) {
                a.putExtra("previewPinProtected", true);
                if (d.s()) {
                    b(netflixActivity, i, a);
                    return true;
                }
            }
            netflixActivity.sendIntentToNetflixService(a);
            if (d.t()) {
                MdxEventProducer.d(i, a);
            }
            C1044Mm.b("MdxAgentApi", "play done");
            netflixActivity.sendIntentToNetflixService(a(netflixActivity, "com.netflix.mediaclient.intent.action.MDX_ACTION_GETCAPABILITY", i));
            return true;
        }
        return false;
    }

    private static void b(final NetflixActivity netflixActivity, final String str, final Intent intent) {
        if (C8054ddD.l(netflixActivity) || netflixActivity.getSupportFragmentManager().isStateSaved()) {
            return;
        }
        final C7478cwv d = C7478cwv.d.d(netflixActivity, new PlayVerifierVault(PlayVerifierVault.RequestedBy.c.c(), "unused"));
        netflixActivity.getNetflixMdxController().n().d(AbstractC7431cwA.class).subscribe(new Consumer() { // from class: o.cft
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7478cwv.this.e((AbstractC7431cwA) obj);
            }
        }, new Consumer() { // from class: o.cfq
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InterfaceC1598aHf.e("Error from pin dialog", (Throwable) obj);
            }
        });
        ((ObservableSubscribeProxy) d.a().as(AutoDispose.b(AndroidLifecycleScopeProvider.d(netflixActivity.getLifecycle())))).b(new Consumer() { // from class: o.cfv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6575cfr.c(intent, netflixActivity, str, (AbstractC7475cws) obj);
            }
        }, new Consumer() { // from class: o.cfu
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InterfaceC1598aHf.e("Error from pin dialog", (Throwable) obj);
            }
        });
        d.show(netflixActivity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Intent intent, NetflixActivity netflixActivity, String str, AbstractC7475cws abstractC7475cws) {
        if (abstractC7475cws instanceof AbstractC7475cws.e) {
            intent.putExtra("prereleasePin", ((AbstractC7475cws.e) abstractC7475cws).b());
            netflixActivity.sendIntentToNetflixService(intent);
            MdxEventProducer.d(str, intent);
            C1044Mm.b("MdxAgentApi", "play done");
            netflixActivity.sendIntentToNetflixService(a(netflixActivity, "com.netflix.mediaclient.intent.action.MDX_ACTION_GETCAPABILITY", str));
        }
    }

    public static boolean c(NetflixActivity netflixActivity) {
        return netflixActivity.getDialogFragment() instanceof C7478cwv;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setClass(context, NetflixService.class);
        intent.addCategory("com.netflix.mediaclient.intent.category.MDX");
        intent.putExtra("uuid", str2);
        return intent;
    }
}
