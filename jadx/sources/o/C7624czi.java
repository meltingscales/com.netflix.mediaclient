package o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.cl.model.event.session.Focus;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.cl.model.event.session.command.Command;
import com.netflix.cl.model.event.session.command.PlayCommand;
import com.netflix.cl.model.event.session.command.PlayNextCommand;
import com.netflix.cl.model.event.session.command.ViewDetailsCommand;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.PostPlayAction;
import com.netflix.model.leafs.PostPlayExperience;
import com.netflix.model.leafs.PostPlayItem;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.C8175dfS;
import o.cIE;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.czi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7624czi {
    private static byte e$ss2$3614 = 24;
    private static int n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13791o = 1;
    private C1203Sq a;
    private final PlayLocationType c;
    protected C9935zP d;
    private final PostPlayAction e;
    private final NetflixActivity f;
    private final IPlayerFragment g;
    private C6950cmv h;
    private final PostPlayItem i;
    private C8175dfS.d j;
    private Long k;
    private final C7641czz l;
    private final String b = "PostPlayCallToAction";
    private final Runnable m = new Runnable() { // from class: o.czi.5
        @Override // java.lang.Runnable
        public void run() {
            C7624czi.this.j();
        }
    };

    public C7624czi(NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PostPlayAction postPlayAction, PlayLocationType playLocationType, View view, C7641czz c7641czz, PostPlayItem postPlayItem) {
        this.d = C9935zP.d((LifecycleOwner) C8141del.e(iPlayerFragment.d(), LifecycleOwner.class));
        Objects.requireNonNull(c7641czz);
        this.l = c7641czz;
        this.i = postPlayItem;
        this.f = netflixActivity;
        this.g = iPlayerFragment;
        this.c = playLocationType;
        this.e = postPlayAction;
        this.k = null;
        if (view != null) {
            if (view instanceof C1203Sq) {
                this.a = (C1203Sq) view;
                Button button = (Button) view;
                d(button);
                a(button);
            }
            b(view);
        }
    }

    private void d(Button button) {
        button.setText(e(button));
    }

    public CharSequence e(Button button) {
        char c;
        String string;
        Object obj;
        int i = 2 % 2;
        String name = this.e.getName();
        String type = this.e.getType();
        type.hashCode();
        int hashCode = type.hashCode();
        if (hashCode == 107961) {
            if (type.equals("mdp")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3443508) {
            if (hashCode == 1557721666) {
                if (type.equals("details")) {
                    c = 2;
                } else {
                    int i2 = f13791o + 1;
                    n = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
            c = 65535;
        } else {
            if (type.equals("play")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                PostPlayItem postPlayItem = this.i;
                if ((postPlayItem != null && TextUtils.equals(postPlayItem.getExperienceType(), "episodicTeaser")) || TextUtils.equals(name, "play")) {
                    if (m()) {
                        int i4 = n + 107;
                        f13791o = i4 % 128;
                        int i5 = i4 % 2;
                        if (k() != 0) {
                            int i6 = n + 57;
                            f13791o = i6 % 128;
                            if (i6 % 2 == 0) {
                                NetflixActivity netflixActivity = this.f;
                                int i7 = cIE.a.b;
                                Object[] objArr = new Object[0];
                                objArr[1] = Integer.valueOf(k());
                                return netflixActivity.getString(i7, objArr);
                            }
                            return this.f.getString(cIE.a.b, Integer.valueOf(k()));
                        }
                    }
                    String string2 = this.f.getString(com.netflix.mediaclient.ui.R.o.ad);
                    if (!string2.startsWith("'!#+")) {
                        return string2;
                    }
                    Object[] objArr2 = new Object[1];
                    q(string2.substring(4), objArr2);
                    return ((String) objArr2[0]).intern();
                } else if (TextUtils.equals(name, "playEpisode")) {
                    PostPlayItem postPlayItem2 = this.i;
                    if (postPlayItem2 == null || !postPlayItem2.isEpisodeNumberHidden()) {
                        String seasonSequenceAbbr = this.e.getSeasonSequenceAbbr();
                        int season = this.e.getSeason();
                        int episode = this.e.getEpisode();
                        return C8168dfL.g(seasonSequenceAbbr) ? this.f.getString(cIE.a.f, Integer.valueOf(season), Integer.valueOf(episode)) : this.f.getString(cIE.a.g, seasonSequenceAbbr, Integer.valueOf(episode));
                    }
                    String string3 = this.f.getString(com.netflix.mediaclient.ui.R.o.ad);
                    if (string3.startsWith("'!#+")) {
                        Object[] objArr3 = new Object[1];
                        q(string3.substring(4), objArr3);
                        return ((String) objArr3[0]).intern();
                    }
                    return string3;
                } else if (TextUtils.equals(name, "playTrailer")) {
                    if (this.i == null || !m() || k() == 0) {
                        String string4 = this.f.getString(cIE.a.i);
                        if (string4.startsWith("'!#+")) {
                            Object[] objArr4 = new Object[1];
                            q(string4.substring(4), objArr4);
                            obj = objArr4[0];
                            return ((String) obj).intern();
                        }
                        return string4;
                    }
                    return this.f.getString(cIE.a.h, Integer.valueOf(k()));
                } else if (m()) {
                    return this.f.getString(cIE.a.b, Integer.valueOf(k()));
                } else {
                    string = this.f.getString(com.netflix.mediaclient.ui.R.o.ad);
                    if (string.startsWith("'!#+")) {
                        int i8 = f13791o + 35;
                        n = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = new Object[1];
                        q(string.substring(4), objArr5);
                        string = ((String) objArr5[0]).intern();
                        int i10 = n + 1;
                        f13791o = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    return string;
                }
            } else if (c != 2) {
                return "";
            }
        }
        if ("moreEpisodes".equals(name)) {
            string = this.f.getString(cIE.a.d);
            if (string.startsWith("'!#+")) {
                int i12 = n + 87;
                f13791o = i12 % 128;
                if (i12 % 2 != 0) {
                    String substring = string.substring(4);
                    Object[] objArr6 = new Object[1];
                    q(substring, objArr6);
                    return ((String) objArr6[0]).intern();
                }
                String substring2 = string.substring(4);
                Object[] objArr7 = new Object[1];
                q(substring2, objArr7);
                ((String) objArr7[0]).intern();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } else {
            string = this.f.getString(com.netflix.mediaclient.ui.R.o.eq);
            if (string.startsWith("'!#+")) {
                int i13 = n + 89;
                f13791o = i13 % 128;
                if (i13 % 2 != 0) {
                    String substring3 = string.substring(4);
                    Object[] objArr8 = new Object[1];
                    q(substring3, objArr8);
                    obj = objArr8[0];
                    return ((String) obj).intern();
                }
                String substring4 = string.substring(4);
                Object[] objArr9 = new Object[1];
                q(substring4, objArr9);
                String intern = ((String) objArr9[0]).intern();
                int i14 = 8 / 0;
                return intern;
            }
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r0 != 2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.widget.Button r7) {
        /*
            r6 = this;
            com.netflix.model.leafs.PostPlayAction r0 = r6.e
            java.lang.String r0 = r0.getType()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 107961(0x1a5b9, float:1.51286E-40)
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L36
            r2 = 3443508(0x348b34, float:4.825382E-39)
            if (r1 == r2) goto L2b
            r2 = 1557721666(0x5cd8f242, float:4.88519682E17)
            if (r1 == r2) goto L20
            goto L3e
        L20:
            java.lang.String r1 = "details"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L3e
        L29:
            r0 = r3
            goto L41
        L2b:
            java.lang.String r1 = "play"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L3e
        L34:
            r0 = r4
            goto L41
        L36:
            java.lang.String r1 = "mdp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
        L3e:
            r0 = -1
            goto L41
        L40:
            r0 = r5
        L41:
            if (r0 == 0) goto L4b
            if (r0 == r4) goto L48
            if (r0 == r3) goto L4b
            goto L5e
        L48:
            int r5 = com.netflix.mediaclient.ui.R.e.aJ
            goto L5e
        L4b:
            com.netflix.model.leafs.PostPlayAction r0 = r6.e
            java.lang.String r1 = "moreEpisodes"
            java.lang.String r0 = r0.getName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
            int r5 = com.netflix.mediaclient.ui.R.e.F
            goto L5e
        L5c:
            int r5 = com.netflix.mediaclient.ui.R.e.y
        L5e:
            if (r5 == 0) goto L6d
            com.netflix.mediaclient.android.activity.NetflixActivity r0 = r6.f
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r5)
            r1 = 0
            r7.setCompoundDrawablesRelative(r0, r1, r1, r1)
            r7.invalidate()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7624czi.a(android.widget.Button):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(View view) {
        char c;
        String type = this.e.getType();
        type.hashCode();
        switch (type.hashCode()) {
            case -1059321782:
                if (type.equals("mylist")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 107961:
                if (type.equals("mdp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (type.equals("play")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1557721666:
                if (type.equals("details")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1879474642:
                if (type.equals("playlist")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    if (this.e.getPlayBackVideo() != null) {
                        e(view);
                        return;
                    }
                    return;
                } else if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                }
            }
            d(view);
            return;
        }
        if (view instanceof C1206St) {
            a((C1206St) view);
        }
    }

    private void e(View view) {
        view.setOnClickListener(c());
    }

    public View.OnClickListener c() {
        return new View.OnClickListener() { // from class: o.czi.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C7624czi.this.c(new PlayCommand(null));
                C7624czi.this.c(false);
                C7624czi.this.e(true);
            }
        };
    }

    public void c(boolean z) {
        if (PlayLocationType.MDX.equals(this.c)) {
            d(z);
        } else {
            b(z);
        }
    }

    protected void b(boolean z) {
        long millis;
        C7641czz c7641czz;
        IPlayerFragment iPlayerFragment;
        if (!this.e.getType().equals("play") || this.g == null || this.e.getPlayBackVideo() == null || this.e.getPlayBackVideo().aE_() == null) {
            return;
        }
        if (this.g.f()) {
            C1044Mm.e("PostPlayCallToAction", "Playback currently in Pip, ingoring");
            return;
        }
        j(z);
        boolean z2 = !this.e.isDoNotIncrementInterrupter() && z;
        C7631czp c7631czp = new C7631czp(true, this.i.getUiLabel(), this.i.getImpressionData(), p());
        if (this.e.getSeamlessStart() > 0) {
            millis = this.e.getSeamlessStart();
        } else {
            millis = TimeUnit.SECONDS.toMillis(this.e.getBookmarkPosition());
        }
        long j = millis;
        VideoType videoType = this.e.getVideoType();
        InterfaceC1593aHa.b("PostPlayCallToAction#playerPlayAction actionVideoType = " + videoType);
        if (C1877aRo.j() && (c7641czz = this.l) != null && c7641czz.c() != null && "nextEpisodeSeamless".equals(this.l.c().getType()) && (iPlayerFragment = this.g) != null && !iPlayerFragment.j()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ab55877Action", z ? "autoPlayNextEp" : "manualPlayNextEp");
                Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
            } catch (JSONException unused) {
            }
        }
        this.g.d(this.e.getPlayBackVideo().aE_().aH_(), this.e.getPlayBackVideo().aE_().aY_(), videoType, a(z), z2, z, j, c7631czp);
    }

    protected void d(boolean z) {
        if (this.e.getPlayBackVideo() != null) {
            s();
            C6575cfr.d(this.f, this.e.getPlayBackVideo().aE_(), this.e.getVideoType(), PlayContextImp.d, -1L, true);
        }
    }

    private void g() {
        Fragment i = this.g.i();
        if (i instanceof NetflixFrag) {
            ((NetflixFrag) i).bg_();
        }
    }

    private void s() {
        InterfaceC5131bsv q = this.f.getServiceManager().q();
        if (q != null) {
            q.u();
        }
    }

    private void j(boolean z) {
        C1044Mm.e("PostPlayCallToAction", "User starts next play, report as such");
        if (z) {
            return;
        }
        CLv2Utils.INSTANCE.e(new Focus(AppView.nextEpisodeButton, CLv2Utils.a(Collections.singletonMap("trackId", this.e.getAdditionalTrackIds().get(PostPlayAction.USER_ACTION_POST_PLAY_TRACK_ID_KEY)))), new PlayNextCommand());
    }

    private void d(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: o.czi.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                C7624czi.this.c(new ViewDetailsCommand());
                C7624czi.this.a();
            }
        });
    }

    public void a() {
        g();
        h();
    }

    protected void h() {
        if (this.e != null) {
            boolean m = this.i != null ? m() : false;
            int videoId = this.e.getVideoId();
            PlayContext a = a(m);
            TrackingInfoHolder d = new TrackingInfoHolder(a.j()).d(videoId, a);
            InterfaceC3643bFl a2 = InterfaceC3643bFl.a((Context) this.f);
            NetflixActivity netflixActivity = this.f;
            VideoType videoType = this.e.getVideoType();
            VideoType videoType2 = VideoType.MOVIE;
            a2.b(netflixActivity, videoType.equals(videoType2) ? videoType2 : VideoType.SHOW, String.valueOf(videoId), this.e.getAncestorTitle(), d, "PostPlay", new PlayerExtras());
            e(true);
        }
    }

    private void a(C1206St c1206St) {
        boolean z = this.i != null && m();
        this.h = new C6950cmv(this.f, C6906cmD.b((CompoundButton) c1206St), this.d.d());
        PlayContext a = a(z);
        this.h.e(String.valueOf(this.e.getVideoId()), this.e.getVideoType(), new TrackingInfoHolder(a.j()).d(this.e.getVideoId(), a), false);
        this.f.getServiceManager().d(String.valueOf(this.e.getVideoId()), this.e.isInMyList());
    }

    public void b() {
        f();
        C8175dfS.d dVar = this.j;
        if (dVar != null) {
            dVar.e();
        }
        C6950cmv c6950cmv = this.h;
        if (c6950cmv != null) {
            c6950cmv.b();
            this.h = null;
        }
    }

    private PlayContext a(boolean z) {
        Integer num = this.e.getAdditionalTrackIds().get(z ? PostPlayAction.AUTO_ACTION_POST_PLAY_TRACK_ID_KEY : PostPlayAction.USER_ACTION_POST_PLAY_TRACK_ID_KEY);
        if (num != null) {
            this.e.setTrackId(num.intValue());
        }
        if (this.l.c().getUuid() != null) {
            this.e.setListId(this.l.c().getUuid());
        }
        PostPlayAction postPlayAction = this.e;
        int listPos = postPlayAction.getListPos();
        PlayLocationType playLocationType = PlayLocationType.POST_PLAY;
        PlayContextImp playContextImp = new PlayContextImp(postPlayAction, listPos, null, playLocationType, null, null);
        playContextImp.b(z);
        playContextImp.d(playLocationType);
        return playContextImp;
    }

    public void i() {
        if (r() && this.i != null) {
            C8175dfS.d dVar = this.j;
            if (dVar != null) {
                dVar.e();
            }
            C8175dfS.d dVar2 = new C8175dfS.d(this.f);
            this.j = dVar2;
            dVar2.c(this.m);
            this.j.d(k());
            this.j.b(new Runnable() { // from class: o.czi.3
                @Override // java.lang.Runnable
                public void run() {
                    C7624czi.this.c(true);
                }
            });
            this.j.d();
        }
    }

    public void e(boolean z) {
        C8175dfS.d dVar = this.j;
        if (dVar != null) {
            dVar.e();
        }
        if (z || !r()) {
            return;
        }
        e(k());
    }

    public void j() {
        e(Math.max(1, this.j.a()));
    }

    private int n() {
        PostPlayAction postPlayAction;
        String name = this.e.getName();
        if (this.i != null && (postPlayAction = this.e) != null && TextUtils.equals(postPlayAction.getType(), "play")) {
            if (Boolean.valueOf(TextUtils.equals(this.i.getExperienceType(), "episodicTeaser")).booleanValue()) {
                return m() ? cIE.a.b : com.netflix.mediaclient.ui.R.o.ad;
            } else if (TextUtils.equals(name, "playTrailer")) {
                return m() ? cIE.a.h : cIE.a.i;
            }
        }
        return 0;
    }

    private void e(int i) {
        int n2;
        if (this.a == null || (n2 = n()) == 0) {
            return;
        }
        this.a.setText(this.f.getString(n2, Integer.valueOf(i)));
    }

    private boolean r() {
        if (this.i != null) {
            if (m() && "play".equals(this.e.getType()) && "playTrailer".equals(this.e.getName())) {
                return true;
            }
            return this.i.isAutoPlay() && this.i.getExperienceType().equals("episodicTeaser") && "play".equals(this.e.getName());
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private AppView o() {
        char c;
        String type = this.e.getType();
        type.hashCode();
        switch (type.hashCode()) {
            case -1059321782:
                if (type.equals("mylist")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 107961:
                if (type.equals("mdp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3443508:
                if (type.equals("play")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1557721666:
                if (type.equals("details")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1879474642:
                if (type.equals("playlist")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return AppView.playButton;
                }
                if (c != 3) {
                    if (c != 4) {
                        return null;
                    }
                }
            }
            return AppView.moreInfoButton;
        }
        return AppView.addToMyListButton;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        Long l = this.k;
        if (l != null) {
            Logger.INSTANCE.cancelSession(l);
        }
        this.k = Logger.INSTANCE.startSession(new Presentation(o(), C7638czw.d.d(l())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        f();
    }

    private void f() {
        Long l = this.k;
        if (l != null) {
            Logger.INSTANCE.endSession(l);
        }
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Command command) {
        Logger logger = Logger.INSTANCE;
        logger.endSession(logger.startSession(command));
    }

    private boolean m() {
        PostPlayItem postPlayItem;
        return this.e.isAutoPlay() && C6692ciB.a.b() && (postPlayItem = this.i) != null && postPlayItem.isPlayable();
    }

    private int k() {
        if (this.i.isAutoPlay()) {
            if (this.i.getAutoPlayAction() != null && this.i.getAutoPlayAction().getAutoplaySeconds() != 0) {
                return this.i.getAutoPlayAction().getAutoplaySeconds();
            }
            return this.i.getAutoPlaySeconds();
        }
        return 0;
    }

    private boolean p() {
        PostPlayItem postPlayItem = this.i;
        return postPlayItem != null && TextUtils.equals(postPlayItem.getExperienceType(), "originalsPostPlay") && TextUtils.equals(this.e.getType(), "play") && TextUtils.equals(this.e.getName(), "playTrailer") && (m() || !this.i.isPlayable());
    }

    private PostPlayExperience l() {
        return this.l.c();
    }

    private void q(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3614);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
