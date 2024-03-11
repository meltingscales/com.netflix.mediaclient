package com.netflix.mediaclient.ui.details;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.games.game_details.GameDetailsActivity;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import io.reactivex.rxkotlin.SinglesKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import kotlin.Pair;
import o.C1045Mp;
import o.C1596aHd;
import o.C1641aIv;
import o.C3657bFz;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC3643bFl;
import o.InterfaceC5223buh;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;
import o.InterfaceC5344bww;
import o.bFM;
import o.bFS;
import o.cQQ;
import o.dpR;
import o.dqE;
import o.drM;
import o.duD;

/* loaded from: classes4.dex */
public final class DetailsActivityApiImpl implements InterfaceC3643bFl {
    public static final c b = new c(null);

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DetailsModule {
        @Binds
        InterfaceC3643bFl a(DetailsActivityApiImpl detailsActivityApiImpl);
    }

    @Override // o.InterfaceC3643bFl
    public void d(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str, Bundle bundle) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str, "");
        InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 1");
        c cVar = b;
        VideoType type = interfaceC5223buh.getType();
        String id = interfaceC5223buh.getId();
        C8632dsu.a(id, "");
        c.a(cVar, activity, type, id, interfaceC5223buh.getTitle(), trackingInfoHolder, null, null, str, bundle, 0, null, 1024, null);
    }

    @Override // o.InterfaceC3643bFl
    public void d(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str, "");
        d(activity, interfaceC5223buh, null, null, trackingInfoHolder, str);
    }

    public void d(Activity activity, InterfaceC5223buh interfaceC5223buh, String str, Long l, TrackingInfoHolder trackingInfoHolder, String str2) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str2, "");
        c cVar = b;
        if (cVar.b(interfaceC5223buh.getType())) {
            InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 2");
            VideoType type = interfaceC5223buh.getType();
            String id = interfaceC5223buh.getId();
            C8632dsu.a(id, "");
            c.c(cVar, activity, type, id, interfaceC5223buh.getTitle(), str, l, trackingInfoHolder, null, null, str2, null, 0, null, 4096, null);
        }
    }

    @Override // o.InterfaceC3643bFl
    public void b(Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3, PlayerExtras playerExtras) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str3, "");
        InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 3");
        b.c(activity, videoType, str, str2, trackingInfoHolder, null, null, str3, null, 0, playerExtras);
    }

    @Override // o.InterfaceC3643bFl
    public void e(Activity activity, InterfaceC5223buh interfaceC5223buh, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str3, "");
        c cVar = b;
        if (cVar.b(interfaceC5223buh.getType())) {
            InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 4");
            c.a(cVar, activity, interfaceC5223buh.getType(), str, str2, trackingInfoHolder, null, null, str3, null, 0, null, 1024, null);
        }
    }

    @Override // o.InterfaceC3643bFl
    public void c(Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3, String str4) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str4, "");
        c cVar = b;
        if (cVar.b(videoType)) {
            InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 6");
            c.a(cVar, activity, videoType, str, str2, trackingInfoHolder, detailsActivityAction, str3, str4, null, 0, null, 1024, null);
        }
    }

    @Override // o.InterfaceC3643bFl
    public void a(Activity activity, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str, String str2, Bundle bundle) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str2, "");
        c cVar = b;
        if (cVar.b(interfaceC5223buh.getType())) {
            InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 7");
            VideoType type = interfaceC5223buh.getType();
            String id = interfaceC5223buh.getId();
            C8632dsu.a(id, "");
            c.a(cVar, activity, type, id, interfaceC5223buh.getTitle(), trackingInfoHolder, detailsActivityAction, str, str2, bundle, 0, null, 1024, null);
        }
    }

    @Override // o.InterfaceC3643bFl
    public void c(Context context, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, String str3, Bundle bundle) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) str3, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        aVar.a("SPY-31405: DetailsActivityLauncher.show() -> 3");
        BrowseExperience c2 = BrowseExperience.c();
        c cVar = b;
        Class c3 = cVar.c(videoType);
        if (c3 == null) {
            C8632dsu.d(c2);
            cVar.a(c2, str, null, videoType, trackingInfoHolder, str3);
            return;
        }
        aVar.a("SPY-31405: DetailsActivityLauncher.show() -> 9");
        if (videoType == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        cVar.b(context, videoType, str, str2, trackingInfoHolder, null, null, bundle, 0, c3);
    }

    @Override // o.InterfaceC3643bFl
    public void c(Activity activity, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        Intent c2 = b.c(activity, str, str2, trackingInfoHolder, detailsActivityAction, str3);
        if (c2 == null) {
            return;
        }
        activity.startActivity(c2);
    }

    @Override // o.InterfaceC3643bFl
    public Class<?> c() {
        return NetflixApplication.getInstance().M() ? bFM.class : bFS.class;
    }

    @Override // o.InterfaceC3643bFl
    public boolean a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof DetailsActivity;
    }

    @Override // o.InterfaceC3643bFl
    public boolean d(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof KidsCharacterDetailsActivity;
    }

    @Override // o.InterfaceC3643bFl
    public InterfaceC5344bww e() {
        return new C3657bFz();
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("DetailsActivityApiImpl");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class<?> c(VideoType videoType) {
            if (videoType == VideoType.GAMES) {
                return GameDetailsActivity.class;
            }
            if (videoType == VideoType.CHARACTERS) {
                return KidsCharacterDetailsActivity.q();
            }
            if (videoType == VideoType.MOVIE || videoType == VideoType.SHOW) {
                return bFS.t();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(BrowseExperience browseExperience, String str, String str2, VideoType videoType, TrackingInfoHolder trackingInfoHolder, String str3) {
            Map d;
            Map k;
            Throwable th;
            String str4 = "DetailsActivityLauncher - Don't know how to handle parent ID: " + str + ", ep ID: " + str2 + ", type: " + videoType + ", trackId: " + (trackingInfoHolder != null ? Integer.valueOf(trackingInfoHolder.a()) : null) + ", source: " + str3 + ", experience: " + browseExperience;
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str4, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }

        private final Intent b(Activity activity, Class<?> cls, VideoType videoType, String str, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str4, PlayerExtras playerExtras) {
            boolean d;
            boolean d2;
            if (!(activity instanceof NetflixActivity)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_ID, str);
            intent.putExtra("extra_video_title", str2);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
            intent.putExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER, trackingInfoHolder);
            AppView uiScreen = ((NetflixActivity) activity).getUiScreen();
            if (uiScreen != null) {
                intent.putExtra("extra_model_view_id", uiScreen.ordinal());
            }
            if (detailsActivityAction != null) {
                intent.putExtra("extra_action", detailsActivityAction);
            }
            if (str4 != null) {
                intent.putExtra("extra_action_token", str4);
            }
            String name = cls.getName();
            C8632dsu.a(name, "");
            d = duD.d((CharSequence) name, (CharSequence) "etails", false, 2, (Object) null);
            if (d) {
                String name2 = activity.getClass().getName();
                C8632dsu.a(name2, "");
                d2 = duD.d((CharSequence) name2, (CharSequence) "etails", false, 2, (Object) null);
                if (d2) {
                    intent.putExtra("extra_same_activity_type", true);
                }
            }
            if (playerExtras != null) {
                intent.putExtra(NetflixActivity.EXTRA_PLAYER_EXTRAS, playerExtras);
            }
            if (str3 != null) {
                intent.putExtra(NetflixActivity.EXTRA_TRAILER_ID, str3);
            }
            if (l != null) {
                intent.putExtra(NetflixActivity.EXTRA_TRAILER_BOOKMARK_MS, l.longValue());
            }
            return intent;
        }

        static /* synthetic */ void a(c cVar, Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3, String str4, Bundle bundle, int i, PlayerExtras playerExtras, int i2, Object obj) {
            cVar.c(activity, videoType, str, str2, trackingInfoHolder, detailsActivityAction, str3, str4, bundle, i, (i2 & 1024) != 0 ? null : playerExtras);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(Activity activity, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3, String str4, Bundle bundle, int i, PlayerExtras playerExtras) {
            c(activity, videoType, str, str2, null, null, trackingInfoHolder, detailsActivityAction, str3, str4, bundle, i, playerExtras);
        }

        static /* synthetic */ void c(c cVar, Activity activity, VideoType videoType, String str, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str4, String str5, Bundle bundle, int i, PlayerExtras playerExtras, int i2, Object obj) {
            cVar.c(activity, videoType, str, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : l, trackingInfoHolder, detailsActivityAction, str4, str5, bundle, i, (i2 & 4096) != 0 ? null : playerExtras);
        }

        private final void c(Activity activity, VideoType videoType, String str, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str4, String str5, Bundle bundle, int i, PlayerExtras playerExtras) {
            BrowseExperience c = BrowseExperience.c();
            Class<?> c2 = c(videoType);
            if (c2 == null) {
                C8632dsu.d(c);
                a(c, str, null, videoType, null, str5);
                return;
            }
            InterfaceC1593aHa.c.a("SPY-31405: DetailsActivityLauncher.show() -> 9");
            if (videoType != null) {
                a(activity, videoType, str, str2, str3, l, trackingInfoHolder, detailsActivityAction, str4, bundle, i, c2, playerExtras);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(VideoType videoType) {
            Map d;
            Map k;
            Throwable th;
            if (videoType != null) {
                return true;
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-8330: Start intent must provide extra value: extra_video_type", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return false;
            }
            dVar.e().b(c1596aHd, th);
            return false;
        }

        private final Intent a(Context context, Class<?> cls, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3) {
            Intent intent = new Intent(context, cls);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_ID, str);
            intent.putExtra("extra_video_title", str2);
            intent.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
            intent.putExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER, trackingInfoHolder);
            if (detailsActivityAction != null) {
                intent.putExtra("extra_action", detailsActivityAction);
            }
            if (str3 != null) {
                intent.putExtra("extra_action_token", str3);
            }
            return intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Intent c(Activity activity, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3) {
            VideoType videoType = VideoType.SHOW;
            Class<?> c = c(videoType);
            if (c == null) {
                BrowseExperience c2 = BrowseExperience.c();
                C8632dsu.a(c2, "");
                a(c2, str, str2, videoType, trackingInfoHolder, "getEpisodeDetailsIntent");
                return null;
            } else if (!(activity instanceof NetflixActivity)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                Intent putExtra = new Intent(activity, c).putExtra(NetflixActivity.EXTRA_VIDEO_ID, str).putExtra(NetflixActivity.EXTRA_EPISODE_ID, str2).putExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER, trackingInfoHolder);
                C8632dsu.a(putExtra, "");
                if (detailsActivityAction != null) {
                    putExtra.putExtra("extra_action", detailsActivityAction);
                }
                AppView uiScreen = ((NetflixActivity) activity).getUiScreen();
                if (uiScreen != null) {
                    putExtra.putExtra("extra_model_view_id", uiScreen.ordinal());
                }
                if (str3 != null) {
                    putExtra.putExtra("extra_action_token", str3);
                }
                putExtra.putExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE, videoType.getValue());
                return putExtra;
            }
        }

        private final void a(Activity activity, VideoType videoType, String str, String str2, String str3, Long l, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str4, Bundle bundle, int i, Class<?> cls, PlayerExtras playerExtras) {
            Map d;
            Map k;
            Throwable th;
            boolean g;
            getLogTag();
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    Intent b = b(activity, cls, videoType, str, str2, str3, l, trackingInfoHolder, detailsActivityAction, str4, playerExtras);
                    if (bundle != null) {
                        b.putExtras(bundle);
                    }
                    if (i > 0) {
                        b.addFlags(i);
                    }
                    activity.startActivity(b);
                    return;
                }
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-31405: videoId is null in DetailsActivityLauncher", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"CheckResult"})
        public final void b(final Context context, VideoType videoType, String str, String str2, TrackingInfoHolder trackingInfoHolder, DetailsActivityAction detailsActivityAction, String str3, Bundle bundle, int i, Class<?> cls) {
            Map d;
            Map k;
            Throwable th;
            boolean g;
            getLogTag();
            if (str != null) {
                g = C8691duz.g(str);
                if (!g) {
                    final Intent a = a(context, cls, videoType, str, str2, trackingInfoHolder, detailsActivityAction, str3);
                    a.addFlags(268435456);
                    if (bundle != null) {
                        a.putExtras(bundle);
                    }
                    if (i > 0) {
                        a.addFlags(i);
                    }
                    cQQ cqq = new cQQ();
                    SubscribersKt.subscribeBy$default(SinglesKt.zipWith(cqq.b(), cqq.e()), (drM) null, new drM<Pair<? extends InterfaceC5282bvn, ? extends InterfaceC5283bvo>, dpR>() { // from class: com.netflix.mediaclient.ui.details.DetailsActivityApiImpl$Companion$startActivityFromAnywhere$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.drM
                        public /* synthetic */ dpR invoke(Pair<? extends InterfaceC5282bvn, ? extends InterfaceC5283bvo> pair) {
                            d(pair);
                            return dpR.c;
                        }

                        public final void d(Pair<? extends InterfaceC5282bvn, ? extends InterfaceC5283bvo> pair) {
                            C8632dsu.c((Object) pair, "");
                            InterfaceC5283bvo a2 = pair.a();
                            C8632dsu.a(a2, "");
                            C1641aIv.b(pair.d(), a2, a);
                            context.startActivity(a);
                        }
                    }, 1, (Object) null);
                    return;
                }
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-31405: videoId is null in DetailsActivityLauncher", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
