package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Pair;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.launch.LaunchActivity;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import com.netflix.mediaclient.util.PlayContext;
import java.nio.charset.StandardCharsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bDJ {
    private static int a = 0;
    private static int c = 1;
    private static byte e$ss2$141 = 24;

    private static void b(InterfaceC5131bsv interfaceC5131bsv) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(NetflixActivity netflixActivity, String str, boolean z, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        C1044Mm.e("nf_play", "PlayableId to playback: " + str);
        if (z) {
            videoType = VideoType.EPISODE;
        }
        b(netflixActivity, str, videoType, playContext, playerExtras);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(NetflixActivity netflixActivity, String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        playerExtras.e(aJY.e());
        if (C8168dfL.g(str)) {
            InterfaceC1598aHf.a("SPY-16126 Empty videoID");
            return;
        }
        PlaybackLauncher.PlayLaunchedBy c2 = c(netflixActivity);
        Intent intent = new Intent(netflixActivity, PlayerActivity.k());
        intent.addFlags(131072);
        intent.addFlags(268435456);
        intent.putExtra("play_launched_by", c2.ordinal());
        intent.putExtra(NetflixActivity.EXTRA_VIDEO_ID, str);
        intent.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
        intent.putExtra(NetflixActivity.EXTRA_PLAY_CONTEXT, playContext);
        intent.putExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS, playerExtras);
        netflixActivity.startActivity(intent);
    }

    private static PlaybackLauncher.PlayLaunchedBy c(NetflixActivity netflixActivity) {
        if (InterfaceC3643bFl.a((Context) netflixActivity).a((Activity) netflixActivity)) {
            return PlaybackLauncher.PlayLaunchedBy.b;
        }
        if (netflixActivity instanceof HomeActivity) {
            if (netflixActivity.getFragmentHelper().j()) {
                return PlaybackLauncher.PlayLaunchedBy.b;
            }
            return PlaybackLauncher.PlayLaunchedBy.c;
        } else if (netflixActivity instanceof PlayerActivity) {
            return PlaybackLauncher.PlayLaunchedBy.f;
        } else {
            if (netflixActivity instanceof LaunchActivity) {
                return PlaybackLauncher.PlayLaunchedBy.d;
            }
            if (InterfaceC6084cTg.e((Context) C1332Xp.b(Context.class)).b().isAssignableFrom(netflixActivity.getClass())) {
                return PlaybackLauncher.PlayLaunchedBy.g;
            }
            if (InterfaceC7306cti.d((Context) netflixActivity).a(netflixActivity)) {
                return PlaybackLauncher.PlayLaunchedBy.a;
            }
            if (InterfaceC6236cYx.c((Context) netflixActivity).c((Activity) netflixActivity)) {
                return PlaybackLauncher.PlayLaunchedBy.h;
            }
            return PlaybackLauncher.PlayLaunchedBy.j;
        }
    }

    public static PlaybackLauncher.PlaybackTarget d(NetflixActivity netflixActivity) {
        if (C8076ddZ.j((Activity) netflixActivity)) {
            return PlaybackLauncher.PlaybackTarget.d;
        }
        ServiceManager serviceManager = netflixActivity.getServiceManager();
        InterfaceC5131bsv q = serviceManager.q();
        aOV g = serviceManager.g();
        if (!serviceManager.c() || q == null) {
            C1044Mm.d("nf_play", "MDX or service manager are null! That should NOT happen. Default to local.");
            if (g != null) {
                if (g.J().b()) {
                    C1044Mm.j("nf_play", "MDX manager null, but configuration exist and local playback is enabled, go local.");
                    return PlaybackLauncher.PlaybackTarget.e;
                }
                C1044Mm.j("nf_play", "MDX manager null, but configuration exist and local playback is disabled, display an error.");
                return PlaybackLauncher.PlaybackTarget.b;
            }
            C1044Mm.j("nf_play", "Service manager not available or ready! Guess that local playback is enabled! We should never end here!");
            return PlaybackLauncher.PlaybackTarget.e;
        }
        b(q);
        boolean z = g != null && g.J().b();
        boolean z2 = netflixActivity.isConnectingToTarget() || q.r();
        boolean t = q.t();
        if (z2 || t) {
            if (e(q, q.i())) {
                return PlaybackLauncher.PlaybackTarget.d;
            }
            if (z) {
                C1044Mm.e("nf_play", "Remote target not available and local playback enabled, play on device");
                return PlaybackLauncher.PlaybackTarget.e;
            }
            C1044Mm.e("nf_play", "Remote target not available and local playback disabled, report an error!");
            return PlaybackLauncher.PlaybackTarget.c;
        } else if (z) {
            C1044Mm.e("nf_play", "Local target, play on device");
            return PlaybackLauncher.PlaybackTarget.e;
        } else {
            C1044Mm.e("nf_play", "Local target, but local playback disabled. Try to find at least one remote target");
            Pair<String, String>[] l = q.l();
            if (l == null || l.length < 1) {
                C1044Mm.e("nf_play", "Local target, local playback disabled and no remote targets. Display an error.");
                return PlaybackLauncher.PlaybackTarget.b;
            }
            q.c((String) l[0].first);
            return PlaybackLauncher.PlaybackTarget.d;
        }
    }

    private static boolean e(InterfaceC5131bsv interfaceC5131bsv, String str) {
        if (!interfaceC5131bsv.isReady()) {
            C1044Mm.j("nf_play", "MDX service is NOT ready");
            return false;
        }
        Pair<String, String>[] l = interfaceC5131bsv.l();
        if (l == null || l.length < 1) {
            C1044Mm.j("nf_play", "No MDX remote targets found");
            return false;
        }
        for (Pair<String, String> pair : l) {
            if (str.equals(pair.first)) {
                C1044Mm.e("nf_play", "Target found");
                return true;
            }
        }
        C1044Mm.j("nf_play", "Target NOT found!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        b(netflixActivity, interfaceC5160btX, videoType, playContext, true, new PlayerExtras(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras) {
        int i = AnonymousClass1.b[d(netflixActivity).ordinal()];
        if (i == 1) {
            b(netflixActivity, interfaceC5160btX, videoType, playContext, false, playerExtras);
        } else if (i == 2) {
            b(netflixActivity, interfaceC5160btX, videoType, playContext, true, playerExtras);
        } else if (i == 3) {
            e(netflixActivity, com.netflix.mediaclient.ui.R.o.hd);
        } else if (i != 4) {
        } else {
            e(netflixActivity, com.netflix.mediaclient.ui.R.o.hb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bDJ$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PlaybackLauncher.PlaybackTarget.values().length];
            b = iArr;
            try {
                iArr[PlaybackLauncher.PlaybackTarget.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[PlaybackLauncher.PlaybackTarget.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[PlaybackLauncher.PlaybackTarget.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[PlaybackLauncher.PlaybackTarget.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        b(netflixActivity, interfaceC5160btX, videoType, playContext, true, new PlayerExtras(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(NetflixActivity netflixActivity, InterfaceC5160btX interfaceC5160btX, VideoType videoType, PlayContext playContext, long j) {
        b(netflixActivity, interfaceC5160btX, videoType, playContext, false, new PlayerExtras(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(NetflixActivity netflixActivity, PlayVerifierVault playVerifierVault) {
        if (playVerifierVault.f()) {
            if (C8076ddZ.j((Activity) netflixActivity)) {
                C1044Mm.e("nf_play", "Starting CDX remote playback");
                C8076ddZ.d(netflixActivity, playVerifierVault.d());
                return;
            }
            C1044Mm.e("nf_play", "Starting MDX remote playback");
            if (C6575cfr.e(netflixActivity, playVerifierVault.d(), playVerifierVault.g(), playVerifierVault.h(), playVerifierVault.c(), playVerifierVault.e().e(), false)) {
                return;
            }
            C1044Mm.j("nf_play", "SPY-5248 -  request is not sent to target, no need to change miniplayer state");
        } else if (netflixActivity.getServiceManager().g() != null && netflixActivity.getServiceManager().g().J() != null && netflixActivity.getServiceManager().g().J().b()) {
            C1044Mm.e("nf_play", "Start local playback");
            b(netflixActivity, playVerifierVault.d(), playVerifierVault.g(), playVerifierVault.c(), playVerifierVault.e());
        } else {
            C1044Mm.j("nf_play", "Local playback is disabled, we can not start playback!");
            e(netflixActivity, com.netflix.mediaclient.ui.R.o.hd);
        }
    }

    private static void e(NetflixActivity netflixActivity, int i) {
        int i2 = 2 % 2;
        int i3 = a + 109;
        c = i3 % 128;
        int i4 = i3 % 2;
        String string = netflixActivity.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = a + 63;
            c = i5 % 128;
            int i6 = i5 % 2;
        }
        netflixActivity.displayDialog(C1163Rc.e(netflixActivity, null, new C1907aSr("", string, null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(com.netflix.mediaclient.android.activity.NetflixActivity r9, o.InterfaceC5160btX r10, com.netflix.mediaclient.servicemgr.interface_.VideoType r11, com.netflix.mediaclient.util.PlayContext r12, boolean r13, com.netflix.mediaclient.ui.player.PlayerExtras r14) {
        /*
            long r0 = o.aJY.e()
            r14.e(r0)
            boolean r0 = r10.aY_()
            if (r0 == 0) goto L27
            com.netflix.mediaclient.servicemgr.interface_.VideoType r11 = com.netflix.mediaclient.servicemgr.interface_.VideoType.EPISODE
            com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CurrentEpisodeForAgeDialog$e r0 = com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_CurrentEpisodeForAgeDialog.Companion
            boolean r0 = r0.c()
            if (r0 == 0) goto L27
            boolean r0 = r10 instanceof o.InterfaceC8366diy
            if (r0 == 0) goto L27
            r0 = r10
            o.diy r0 = (o.InterfaceC8366diy) r0
            o.diy r0 = r0.i()
            if (r0 == 0) goto L27
            r5 = r11
            r10 = r0
            goto L28
        L27:
            r5 = r11
        L28:
            com.netflix.mediaclient.servicemgr.interface_.VideoType r11 = com.netflix.mediaclient.servicemgr.interface_.VideoType.EPISODE
            if (r5 == r11) goto L36
            com.netflix.mediaclient.servicemgr.interface_.VideoType r11 = com.netflix.mediaclient.servicemgr.interface_.VideoType.MOVIE
            if (r5 != r11) goto L31
            goto L36
        L31:
            java.lang.String r11 = r10.aO_()
            goto L3a
        L36:
            java.lang.String r11 = r10.aH_()
        L3a:
            r2 = r11
            java.lang.String r11 = r10.aH_()
            boolean r0 = r10.aS_()
            boolean r1 = r10.aX_()
            boolean r3 = r10.H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1, r3}
            java.lang.String r0 = "nf_pin verifyPinAndPlay - %s ageProtected: %b, pinProtected:%b, previewProtected: %b"
            java.lang.String r1 = "nf_play"
            o.C1044Mm.a(r1, r0, r11)
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r11 = r14.b()
            boolean r0 = o.C8076ddZ.j(r9)
            r3 = 1
            if (r0 != 0) goto L76
            com.netflix.mediaclient.servicemgr.interface_.details.LiveState r0 = com.netflix.mediaclient.servicemgr.interface_.details.LiveState.e
            if (r11 != r0) goto L75
            if (r13 == 0) goto L75
            r13 = r3
            goto L76
        L75:
            r13 = 0
        L76:
            android.content.Context r11 = o.AbstractApplicationC1040Mh.d()
            o.ctf r11 = o.InterfaceC7303ctf.c(r11)
            boolean r11 = r11.c(r2)
            r11 = r11 ^ r3
            if (r11 == 0) goto Lbd
            boolean r11 = o.aQN.c()
            if (r11 == 0) goto Lbd
            long r3 = r14.e()
            r6 = -1
            int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r11 == 0) goto La7
            long r3 = r14.e()
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r0 = "using playerExtras.getBookmarkMs=%d"
            o.C1044Mm.c(r1, r0, r11)
            goto Lb8
        La7:
            long r3 = r10.aF_()
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r0 = "using getPlayableBookmarkPositionMs=%d"
            o.C1044Mm.c(r1, r0, r11)
        Lb8:
            com.netflix.mediaclient.servicemgr.PlayerPrefetchSource r11 = com.netflix.mediaclient.servicemgr.PlayerPrefetchSource.PlayByUser
            o.C8006dcI.e(r10, r11, r3)
        Lbd:
            r14.e(r10)
            com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault r11 = new com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault
            com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault$RequestedBy r0 = com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault.RequestedBy.a
            java.lang.String r1 = r0.c()
            boolean r3 = r10.H()
            boolean r4 = r10.aX_()
            r0 = r11
            r6 = r13
            r7 = r12
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.netflix.model.leafs.originals.interactive.InteractiveSummary r12 = r10.az_()
            if (r12 == 0) goto Lfb
            com.netflix.model.leafs.originals.interactive.InteractiveSummary r12 = r10.az_()
            boolean r12 = r12.isBranchingNarrative()
            if (r12 == 0) goto Lfb
            if (r13 == 0) goto Lfb
            boolean r12 = o.C8076ddZ.j(r9)
            if (r12 != 0) goto Lfb
            boolean r10 = r10.aS_()
            o.Ob r10 = o.C1084Ob.b(r10, r11)
            r10.b(r9)
            goto L102
        Lfb:
            boolean r10 = r10.aS_()
            o.C8021dcX.b(r9, r10, r11)
        L102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bDJ.b(com.netflix.mediaclient.android.activity.NetflixActivity, o.btX, com.netflix.mediaclient.servicemgr.interface_.VideoType, com.netflix.mediaclient.util.PlayContext, boolean, com.netflix.mediaclient.ui.player.PlayerExtras):void");
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$141);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
