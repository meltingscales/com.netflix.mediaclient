package o;

import android.content.Intent;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.action.Search;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.SearchCommand;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.protocol.netflixcom.DeepLinkUtils;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.text.similarity.JaroWinklerSimilarity;

/* renamed from: o.aLb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1702aLb implements aKP {
    private long a;
    private Map<String, String> b;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.aLb$d */
    /* loaded from: classes3.dex */
    interface d {
        InterfaceC6042cRv u();
    }

    @Override // o.aKP
    public boolean c(List<String> list) {
        return true;
    }

    public C1702aLb(Map<String, String> map) {
        this.b = map;
    }

    @Override // o.aKP
    public NflxHandler.Response d(NetflixActivity netflixActivity, Intent intent, List<String> list, String str) {
        boolean z = true;
        String str2 = list.size() > 1 ? list.get(1) : null;
        String str3 = this.b.get(NetflixActivity.EXTRA_SOURCE);
        String str4 = this.b.get(SignupConstants.Error.DEBUG_INFO_ACTION);
        boolean j = C8151dev.j();
        boolean z2 = "bixbymde".equals(str3) && j;
        if (!"bixbyvoice".equals(str3) || !j) {
            z = false;
        }
        boolean a = DeepLinkUtils.a();
        C1044Mm.a("NetflixComSearchHandler", "tryHandle source=" + str3 + " isBixbyMde=" + z2 + " isBixbyVoice=" + z + " isSamsungDevice=" + j + " mdeDisabled= action=" + str4);
        if (DeepLinkUtils.a(netflixActivity, intent, this.b)) {
            return NflxHandler.Response.HANDLING;
        }
        if (z2 && !a && "play".equals(str4)) {
            String str5 = this.b.get("internalCurrentLocalPlayableId");
            boolean g = C8168dfL.g(this.b.get("targetip"));
            C1044Mm.c("NetflixComSearchHandler", "remoteIpMissing %b", Boolean.valueOf(g));
            if (g) {
                str5 = this.b.get("internalCurrentRemotePlayableId");
                C1044Mm.a("NetflixComSearchHandler", "using remote playableId " + str5);
            }
            C1044Mm.a("NetflixComSearchHandler", "tryHandle bixbymde " + str5);
            if (C8168dfL.g(str2) && C8168dfL.h(str5)) {
                c(netflixActivity, intent, str5, 253758410);
                return NflxHandler.Response.HANDLING_WITH_DELAY;
            }
        }
        if ((z2 || z) && C8168dfL.h(str2)) {
            return b(netflixActivity, intent, str2);
        }
        String str6 = this.b.get("suggestionId");
        if (C8168dfL.h(str6)) {
            ((d) EntryPointAccessors.fromActivity(netflixActivity, d.class)).u().b(str6, str2);
        } else {
            d(netflixActivity, str2);
        }
        return NflxHandler.Response.HANDLING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(NetflixActivity netflixActivity, String str) {
        InterfaceC6068cSu.c(netflixActivity).c(str);
    }

    private NflxHandler.Response b(final NetflixActivity netflixActivity, final Intent intent, final String str) {
        final String str2 = this.b.get(SignupConstants.Error.DEBUG_INFO_ACTION);
        this.a = Logger.INSTANCE.startSession(new Search(null, str, AppView.notificationItem, null, null)).longValue();
        netflixActivity.getServiceManager().j().b(str, TaskMode.FROM_CACHE_OR_NETWORK, C8150deu.h(), new AbstractC5164btb() { // from class: o.aLb.2
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void c(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
                boolean z2 = true;
                if (status.c().isError() || interfaceC5275bvg == null || interfaceC5275bvg.getResultsVideos() == null || interfaceC5275bvg.getResultsVideos().size() == 0) {
                    C1044Mm.d("NetflixComSearchHandler", status.c().toString() + " No result for query: " + str);
                    if (status.c().isError()) {
                        ExtLogger.INSTANCE.failedAction(Long.valueOf(C1702aLb.this.a), C8169dfM.d(status));
                    } else {
                        Logger.INSTANCE.endSession(Long.valueOf(C1702aLb.this.a));
                    }
                    C8159dfC.c(new aUM("bixbyvoice", str, true));
                    C1702aLb.d(netflixActivity, str);
                } else {
                    Logger.INSTANCE.endSession(Long.valueOf(C1702aLb.this.a));
                    boolean z3 = false;
                    InterfaceC5278bvj interfaceC5278bvj = interfaceC5275bvg.getResultsVideos().get(0);
                    if ("play".equals(str2)) {
                        if (C1702aLb.c(interfaceC5278bvj.getTitle(), str, netflixActivity.getServiceManager().g().T())) {
                            C1702aLb.this.c(netflixActivity, intent, interfaceC5278bvj.getId(), 253758410);
                            z2 = false;
                        } else {
                            C1702aLb.d(netflixActivity, str);
                        }
                        C8159dfC.c(new aUK("bixbyvoice", 253758410, str, interfaceC5278bvj.getId(), true));
                    } else {
                        if (C1702aLb.c(interfaceC5278bvj.getTitle(), str, netflixActivity.getServiceManager().g().T())) {
                            C1702aLb.this.e(netflixActivity, intent, interfaceC5278bvj.getId(), 253758410);
                        } else {
                            C1702aLb.d(netflixActivity, str);
                            z3 = true;
                        }
                        C8159dfC.c(new aUM("bixbyvoice", str, true));
                        z2 = z3;
                    }
                    if (!z2) {
                        C1044Mm.b("NetflixComSearchHandler", "reportDelayedActonDone is delayed");
                        return;
                    }
                }
                C1702aLb.this.a(netflixActivity);
            }
        });
        return NflxHandler.Response.HANDLING_WITH_DELAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetflixActivity netflixActivity) {
        C1044Mm.b("NetflixComSearchHandler", "reportDelayedActonDone");
        C8194dfl.c(netflixActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str, String str2, SearchResultsSimilarityAlgorithm searchResultsSimilarityAlgorithm) {
        double jaroWinklerSimilarityThreshold = searchResultsSimilarityAlgorithm != null ? searchResultsSimilarityAlgorithm.jaroWinklerSimilarityThreshold() : 0.87d;
        double doubleValue = new JaroWinklerSimilarity(searchResultsSimilarityAlgorithm != null ? searchResultsSimilarityAlgorithm.jaroWinklerPrefixLengthLimit() : 0).apply(str.toLowerCase(Locale.getDefault()), str2.toLowerCase(Locale.getDefault())).doubleValue();
        C1044Mm.b("NetflixComSearchHandler", "similarity score (" + str + ", " + str2 + ") = " + doubleValue + ", threshold = " + jaroWinklerSimilarityThreshold);
        return doubleValue > jaroWinklerSimilarityThreshold;
    }

    void c(NetflixActivity netflixActivity, Intent intent, String str, int i) {
        C1713aLm c1713aLm = new C1713aLm();
        c1713aLm.e(-1L);
        DeepLinkUtils deepLinkUtils = DeepLinkUtils.INSTANCE;
        String e = deepLinkUtils.e(this.b);
        c1713aLm.e(e, C8168dfL.h(e), deepLinkUtils.a(this.b));
        c1713aLm.e(deepLinkUtils.d(this.b));
        C1707aLg c1707aLg = new C1707aLg(c1713aLm);
        ArrayList arrayList = new ArrayList();
        arrayList.add("watch");
        arrayList.add(str);
        c1707aLg.d(netflixActivity, intent, arrayList, String.valueOf(i));
    }

    void e(NetflixActivity netflixActivity, Intent intent, String str, int i) {
        C1705aLe c1705aLe = new C1705aLe(this.b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(SignupConstants.Field.VIDEO_TITLE);
        arrayList.add(str);
        c1705aLe.d(netflixActivity, intent, arrayList, String.valueOf(i));
    }

    @Override // o.aKP
    public Command d() {
        if ("play".equals(this.b.get(SignupConstants.Error.DEBUG_INFO_ACTION))) {
            return new PlayCommand(null);
        }
        return new SearchCommand();
    }
}
