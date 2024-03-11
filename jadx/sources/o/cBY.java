package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.leafs.originals.interactive.AssetManifest;
import com.netflix.model.leafs.originals.interactive.Audio;
import com.netflix.model.leafs.originals.interactive.BaseLayout;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.Style;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.C5662cDs;
import o.C5666cDw;
import o.C8632dsu;
import o.C9703vR;
import o.cBY;
import o.cBZ;
import o.cIE;

/* loaded from: classes4.dex */
public abstract class cBY extends cBZ {
    protected Map<String, ? extends Style> c;
    protected InteractiveMoments d;
    protected UiDefinition.Layout e;
    private final Subject<C5651cDh> g;
    private cBU h;
    private HashMap<String, MediaPlayer> i;
    protected cCW j;
    private boolean k;
    private int l;
    private int m;
    private final Observable<C5651cDh> n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList<AbstractC5649cDf> f13649o;
    private final ArrayList<String> q;
    private final HashMap<String, Image> r;
    private Disposable s;
    private float t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBY(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cBY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final cBU a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z) {
        this.k = z;
    }

    public final ArrayList<AbstractC5649cDf> b() {
        return this.f13649o;
    }

    protected final void d(InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        this.d = interactiveMoments;
    }

    protected final void d(UiDefinition.Layout layout) {
        C8632dsu.c((Object) layout, "");
        this.e = layout;
    }

    protected final void d(Map<String, ? extends Style> map) {
        C8632dsu.c((Object) map, "");
        this.c = map;
    }

    protected final void d(cCW ccw) {
        C8632dsu.c((Object) ccw, "");
        this.j = ccw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.k;
    }

    public final float h() {
        return this.t;
    }

    public final HashMap<String, Image> i() {
        return this.r;
    }

    public final Observable<C5651cDh> j() {
        return this.n;
    }

    public final void setAutoSizeTextViewHandler$netflix_modules_ui_player_controls_impl_release(cBU cbu) {
        C8632dsu.c((Object) cbu, "");
        this.h = cbu;
    }

    public final void setPlayerUIEventsObservable(Disposable disposable) {
        this.s = disposable;
    }

    public abstract void setupObservable();

    public abstract void setupUI();

    public /* synthetic */ cBY(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cBY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        Subject serialized = PublishSubject.create().toSerialized();
        C8632dsu.a(serialized, "");
        this.g = serialized;
        this.n = serialized;
        this.r = new HashMap<>();
        this.f13649o = new ArrayList<>();
        this.t = 1.0f;
        this.h = new cBU(this);
        this.i = new HashMap<>();
        this.q = new ArrayList<>(1);
    }

    public final cCW o() {
        cCW ccw = this.j;
        if (ccw != null) {
            return ccw;
        }
        C8632dsu.d("");
        return null;
    }

    public final Map<String, Style> f() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        C8632dsu.d("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final UiDefinition.Layout c() {
        UiDefinition.Layout layout = this.e;
        if (layout != null) {
            return layout;
        }
        C8632dsu.d("");
        return null;
    }

    public final InteractiveMoments d() {
        InteractiveMoments interactiveMoments = this.d;
        if (interactiveMoments != null) {
            return interactiveMoments;
        }
        C8632dsu.d("");
        return null;
    }

    public final void b(C5651cDh c5651cDh) {
        C8632dsu.c((Object) c5651cDh, "");
        this.g.onNext(c5651cDh);
    }

    public static /* synthetic */ void d(cBY cby, aJY ajy, InterfaceC9638uF interfaceC9638uF, cHR chr, Moment moment, BaseLayout baseLayout, InteractiveMoments interactiveMoments, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        cby.d(ajy, interfaceC9638uF, chr, moment, baseLayout, interactiveMoments, (i2 & 64) != 0 ? 0 : i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        r6 = r6.getCurrentWindowMetrics();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(o.aJY r4, o.InterfaceC9638uF r5, o.cHR r6, com.netflix.model.leafs.originals.interactive.Moment r7, com.netflix.model.leafs.originals.interactive.BaseLayout r8, com.netflix.model.leafs.originals.interactive.InteractiveMoments r9, int r10) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cBY.d(o.aJY, o.uF, o.cHR, com.netflix.model.leafs.originals.interactive.Moment, com.netflix.model.leafs.originals.interactive.BaseLayout, com.netflix.model.leafs.originals.interactive.InteractiveMoments, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i, String str) {
        C8632dsu.c((Object) str, "");
        switch (str.hashCode()) {
            case -934426595:
                if (str.equals(VisualStateDefinition.ELEMENT_STATE.RESULT)) {
                    for (AbstractC5649cDf abstractC5649cDf : this.f13649o) {
                        abstractC5649cDf.h(i);
                    }
                    return;
                }
                return;
            case -691041417:
                if (str.equals("focused")) {
                    for (AbstractC5649cDf abstractC5649cDf2 : this.f13649o) {
                        abstractC5649cDf2.c(i);
                    }
                    return;
                }
                return;
            case 113405357:
                if (str.equals(VisualStateDefinition.ELEMENT_STATE.WRONG)) {
                    for (AbstractC5649cDf abstractC5649cDf3 : this.f13649o) {
                        abstractC5649cDf3.a(i);
                    }
                    return;
                }
                return;
            case 270940796:
                if (str.equals(VisualStateDefinition.ELEMENT_STATE.DISABLED)) {
                    for (AbstractC5649cDf abstractC5649cDf4 : this.f13649o) {
                        abstractC5649cDf4.d(i);
                    }
                    return;
                }
                return;
            case 955164778:
                if (str.equals(VisualStateDefinition.ELEMENT_STATE.CORRECT)) {
                    for (AbstractC5649cDf abstractC5649cDf5 : this.f13649o) {
                        abstractC5649cDf5.e(i);
                    }
                    return;
                }
                return;
            case 1191572123:
                if (str.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                    for (AbstractC5649cDf abstractC5649cDf6 : this.f13649o) {
                        abstractC5649cDf6.g(i);
                    }
                    return;
                }
                return;
            case 1544803905:
                if (str.equals("default")) {
                    for (AbstractC5649cDf abstractC5649cDf7 : this.f13649o) {
                        abstractC5649cDf7.b(i);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void k() {
        NetflixActivity w;
        ServiceManager serviceManager;
        Audio audio;
        Audio audio2;
        Map<String, UiDefinition.AudioListAsset> audio3 = c().audio();
        if (audio3 == null || (w = w()) == null || (serviceManager = w.getServiceManager()) == null) {
            return;
        }
        for (Map.Entry<String, UiDefinition.AudioListAsset> entry : audio3.entrySet()) {
            AssetManifest assetManifest = c().assetManifest();
            if (assetManifest != null && (audio = assetManifest.getAudio(entry.getValue().assetId())) != null) {
                AssetManifest assetManifest2 = c().assetManifest();
                serviceManager.c((assetManifest2 == null || (audio2 = assetManifest2.getAudio(entry.getValue().assetId())) == null) ? null : audio2.url(), AssetType.interactiveContent, new c(audio, this, entry));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5164btb {
        final /* synthetic */ Audio b;
        final /* synthetic */ cBY c;
        final /* synthetic */ Map.Entry<String, UiDefinition.AudioListAsset> e;

        c(Audio audio, cBY cby, Map.Entry<String, UiDefinition.AudioListAsset> entry) {
            this.b = audio;
            this.c = cby;
            this.e = entry;
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(String str, String str2, long j, long j2, Status status) {
            if (status == null || !status.j() || str2 == null || str2.length() <= 0) {
                return;
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            Audio audio = this.b;
            final cBY cby = this.c;
            final Map.Entry<String, UiDefinition.AudioListAsset> entry = this.e;
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(1).build());
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.cCe
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    cBY.c.d(cBY.this, entry, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: o.cCd
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    boolean d;
                    d = cBY.c.d(mediaPlayer2, i, i2);
                    return d;
                }
            });
            mediaPlayer.setVolume(audio.volume(), audio.volume());
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                File file = new File(str2);
                if (file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    mediaPlayer.setDataSource(fileInputStream.getFD(), j, j2);
                    fileInputStream.close();
                    mediaPlayer.prepareAsync();
                }
            } catch (IllegalStateException unused) {
                cBZ.e eVar = cBZ.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(cBY cby, Map.Entry entry, MediaPlayer mediaPlayer) {
            C8632dsu.c((Object) cby, "");
            C8632dsu.c((Object) entry, "");
            if (mediaPlayer != null) {
                if (cby.q.contains(entry.getKey())) {
                    cby.q.remove(entry.getKey());
                    try {
                        mediaPlayer.start();
                        return;
                    } catch (IllegalStateException unused) {
                        cBZ.e eVar = cBZ.a;
                        return;
                    }
                }
                HashMap hashMap = cby.i;
                Object key = entry.getKey();
                C8632dsu.a(key, "");
                hashMap.put(key, mediaPlayer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(MediaPlayer mediaPlayer, int i, int i2) {
            cBZ.e eVar = cBZ.a;
            return false;
        }
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        MediaPlayer mediaPlayer = this.i.get(str);
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        this.q.add(str);
    }

    @Override // o.cBZ
    public void e() {
        for (final MediaPlayer mediaPlayer : this.i.values()) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.cCa
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer2) {
                            cBY.d(mediaPlayer, mediaPlayer2);
                        }
                    });
                } else {
                    mediaPlayer.release();
                }
            } catch (IllegalStateException unused) {
            }
        }
        this.q.clear();
        this.i.clear();
        Disposable disposable = this.s;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2) {
        C8632dsu.c((Object) mediaPlayer, "");
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(final Moment moment, UiDefinition.Layout layout) {
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) layout, "");
        this.k = false;
        String subType = moment.subType();
        switch (subType.hashCode()) {
            case -2054695778:
                if (subType.equals("streakCounter")) {
                    C9726vo.d(moment.counterValue(), moment.headerText(), layout.elements().notification(d()), new InterfaceC8612dsa<String, String, Notification, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.BaseInteractiveTemplateScene$setupNotification$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // o.InterfaceC8612dsa
                        /* renamed from: c */
                        public final Boolean invoke(String str, String str2, Notification notification) {
                            C8632dsu.c((Object) str, "");
                            C8632dsu.c((Object) str2, "");
                            C8632dsu.c((Object) notification, "");
                            return Boolean.valueOf(cBY.this.b().add(new C5662cDs(cBY.this.j(), cBY.this.d(), moment, C9703vR.e(cBY.this, cIE.c.l, 0, 2, null), notification, str, str2, cBY.this.f(), cBY.this.i(), cBY.this.h(), cBY.this.r())));
                        }
                    });
                    return;
                }
                break;
            case -1117992016:
                if (subType.equals("triviaverseRoundIntro")) {
                    Notification notification = layout.elements().notification(d());
                    if (notification != null) {
                        this.f13649o.add(new C5668cDy(this.n, d(), C9703vR.e(this, cIE.c.r, 0, 2, null), moment, notification, f(), this.r, this.t, r(), false, 512, null));
                        return;
                    }
                    return;
                }
                break;
            case -151942889:
                if (subType.equals("inlineTutorial")) {
                    Notification notification2 = layout.elements().notification(d());
                    if (notification2 != null) {
                        this.f13649o.add(new cCZ(this.n, d(), C9703vR.e(this, cIE.c.a, 0, 2, null), moment, notification2, f(), this.r, this.t, r()));
                        return;
                    }
                    return;
                }
                break;
            case -113729302:
                if (subType.equals("triviaQuestTheme")) {
                    Notification notification3 = layout.elements().notification(d());
                    if (notification3 != null) {
                        this.f13649o.add(new cCI(this.n, d(), C9703vR.e(this, cIE.c.f13668o, 0, 2, null), moment, notification3, f(), this.r, this.t, r()));
                        return;
                    }
                    return;
                }
                break;
            case 527573719:
                if (subType.equals("triviaQuestResults")) {
                    Notification notification4 = layout.elements().notification(d());
                    if (notification4 != null) {
                        this.f13649o.add(new cCJ(this.n, d(), C9703vR.e(this, cIE.c.n, 0, 2, null), moment, notification4, f(), this.r, this.t, r()));
                        return;
                    }
                    return;
                }
                break;
            case 1902848200:
                if (subType.equals("livesIndicator")) {
                    Notification notification5 = layout.elements().notification(d());
                    if (notification5 != null) {
                        this.f13649o.add(new C5648cDe(this.n, d(), C9703vR.e(this, cIE.c.b, 0, 2, null), moment, notification5, f(), this.r, this.t, r()));
                        return;
                    }
                    return;
                }
                break;
        }
        Notification notification6 = layout.elements().toast();
        if (notification6 == null) {
            notification6 = layout.elements().notification(d());
        }
        String str = moment.toastText();
        if (str == null && (str = moment.ftueText()) == null) {
            str = moment.text(d());
        }
        C9726vo.d(notification6, str, new drX<Notification, String, Boolean>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.BaseInteractiveTemplateScene$setupNotification$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: a */
            public final Boolean invoke(Notification notification7, String str2) {
                C8632dsu.c((Object) notification7, "");
                C8632dsu.c((Object) str2, "");
                return Boolean.valueOf(cBY.this.b().add(new C5666cDw(cBY.this.j(), cBY.this.d(), moment, C9703vR.e(cBY.this, cIE.c.g, 0, 2, null), notification7, str2, cBY.this.f(), cBY.this.i(), cBY.this.h(), cBY.this.r())));
            }
        });
    }
}
