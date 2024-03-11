package o;

import android.content.Context;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import o.C5618cCb;
import o.C5639cCw;
import o.C8632dsu;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.cCw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5639cCw extends C1045Mp {
    public static final C5639cCw e = new C5639cCw();
    private static final HashMap<String, C5618cCb> d = new HashMap<>();

    private C5639cCw() {
        super("InteractiveUtil");
    }

    /* renamed from: o.cCw$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC5164btb {
        public static final c a = new c();

        private c() {
        }

        @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
        public void a(String str, String str2, final long j, final long j2, Status status) {
            C5639cCw.e.getLogTag();
            C9726vo.d(str, str2, new drX<String, String, C5618cCb>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveUtil$PrefetchListener$onResourceCached$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                /* renamed from: a */
                public final C5618cCb invoke(String str3, String str4) {
                    HashMap hashMap;
                    C8632dsu.c((Object) str3, "");
                    C8632dsu.c((Object) str4, "");
                    hashMap = C5639cCw.d;
                    return (C5618cCb) hashMap.put(str3, new C5618cCb(str4, j, j2));
                }
            });
        }
    }

    public final void c(Context context, List<Image> list) {
        ServiceManager serviceManager;
        C8632dsu.c((Object) list, "");
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        if (netflixActivity == null || (serviceManager = netflixActivity.getServiceManager()) == null) {
            return;
        }
        for (Image image : list) {
            serviceManager.c(image.url(), AssetType.interactiveContent, c.a);
        }
    }

    public final Moment e(Moment moment, InteractiveMoments interactiveMoments) {
        Object obj;
        Condition condition;
        C8632dsu.c((Object) moment, "");
        C8632dsu.c((Object) interactiveMoments, "");
        List<Moment.MomentOverride> overrides = moment.overrides();
        Moment moment2 = null;
        if (overrides != null) {
            Iterator<T> it = overrides.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String preconditionId = ((Moment.MomentOverride) obj).preconditionId();
                if (preconditionId == null || ((condition = interactiveMoments.preconditions().get(preconditionId)) != null && condition.meetsCondition(interactiveMoments))) {
                    break;
                }
            }
            Moment.MomentOverride momentOverride = (Moment.MomentOverride) obj;
            if (momentOverride != null) {
                moment2 = momentOverride.data();
            }
        }
        Moment merge = moment.merge(moment2);
        C8632dsu.a(merge, "");
        return merge;
    }

    public final boolean b(final aJY ajy, PlaylistTimestamp playlistTimestamp, PlaylistMap<?> playlistMap, final long j, Map<String, ? extends List<? extends Moment>> map, final C9935zP c9935zP) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) c9935zP, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C9726vo.d(playlistTimestamp, playlistMap, map, new InterfaceC8612dsa<PlaylistTimestamp, PlaylistMap<?>, Map<String, ? extends List<? extends Moment>>, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveUtil$interactiveSeekTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // o.InterfaceC8612dsa
            public /* synthetic */ dpR invoke(PlaylistTimestamp playlistTimestamp2, PlaylistMap<?> playlistMap2, Map<String, ? extends List<? extends Moment>> map2) {
                a(playlistTimestamp2, playlistMap2, map2);
                return dpR.c;
            }

            /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01a3  */
            /* JADX WARN: Type inference failed for: r6v0, types: [o.buT] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp r28, com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap<?> r29, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.netflix.model.leafs.originals.interactive.Moment>> r30) {
                /*
                    Method dump skipped, instructions count: 432
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.player.v2.interactive.InteractiveUtil$interactiveSeekTo$1.a(com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp, com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap, java.util.Map):void");
            }
        });
        return booleanRef.a;
    }

    public final IPlaylistControl e(aJY ajy) {
        if (ajy instanceof IPlaylistControl) {
            return ajy;
        }
        return null;
    }

    public final Long d(aJY ajy) {
        return a(e(ajy));
    }

    public final Long a(IPlaylistControl iPlaylistControl) {
        PlaylistTimestamp l;
        if (iPlaylistControl == null || (l = iPlaylistControl.l()) == null) {
            return null;
        }
        return Long.valueOf(l.e(iPlaylistControl.H()));
    }

    public final long d(aJY ajy, Moment moment) {
        C8632dsu.c((Object) moment, "");
        return e(e(ajy), moment);
    }

    public final long e(IPlaylistControl iPlaylistControl, Moment moment) {
        long e2;
        C8632dsu.c((Object) moment, "");
        Long a = a(iPlaylistControl);
        long longValue = a != null ? a.longValue() : 0L;
        Long uiHideMS = moment.uiHideMS();
        C8632dsu.a(uiHideMS, "");
        Long valueOf = uiHideMS.longValue() <= -1 ? Long.valueOf(moment.endMs().longValue() - 3000) : moment.uiHideMS();
        Long startMs = moment.startMs();
        C8632dsu.a(startMs, "");
        if (longValue < startMs.longValue()) {
            Long startMs2 = moment.startMs();
            C8632dsu.a(startMs2, "");
            longValue = startMs2.longValue();
        }
        e2 = C8657dts.e(valueOf.longValue() - longValue, 0L);
        return e2;
    }

    public final Interactivity e(InteractiveSummary interactiveSummary, InteractiveMoments interactiveMoments) {
        if (interactiveMoments == null || interactiveSummary == null) {
            return null;
        }
        if (interactiveSummary.isBranchingNarrative()) {
            return Interactivity.e;
        }
        if (interactiveSummary.features().videoMoments()) {
            return Interactivity.b;
        }
        return null;
    }

    public final void b(boolean z, final Image image, final Moment moment) {
        C8632dsu.c((Object) image, "");
        CLv2Utils.c(z, AppView.ixChoicePointOptionArt, new TrackingInfo() { // from class: o.cCv
            @Override // com.netflix.cl.model.JsonSerializer
            public final JSONObject toJSONObject() {
                JSONObject c2;
                c2 = C5639cCw.c(Moment.this, image);
                return c2;
            }
        }, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(Moment moment, Image image) {
        com.netflix.model.leafs.originals.interactive.TrackingInfo trackingInfo;
        C8632dsu.c((Object) image, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imageFile", image.url());
        if (moment != null && (trackingInfo = moment.trackingInfo(null)) != null) {
            trackingInfo.copyValues(jSONObject);
        }
        return jSONObject;
    }

    public final C5618cCb a(String str) {
        C8632dsu.c((Object) str, "");
        return d.get(str);
    }
}
