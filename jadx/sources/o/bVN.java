package o;

import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTasteData;
import java.util.List;
import java.util.Map;
import o.C3796bKz;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bSJ;

/* loaded from: classes4.dex */
public final class bVN {
    private final bSY c;
    private final drM<bSJ, dpR> d;
    private final CollectTaste e;

    /* JADX WARN: Multi-variable type inference failed */
    public bVN(bSY bsy, CollectTaste collectTaste, drM<? super bSJ, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) collectTaste, "");
        C8632dsu.c((Object) drm, "");
        this.c = bsy;
        this.e = collectTaste;
        this.d = drm;
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>> list, final LoMo loMo, final TrackingInfoHolder trackingInfoHolder) {
        Map c;
        Map k;
        Throwable th;
        Map c2;
        Map k2;
        Throwable th2;
        boolean g;
        boolean g2;
        boolean g3;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        if (list.size() >= 3) {
            String boxshotUrl = list.get(0).getVideo().getBoxshotUrl();
            String boxshotUrl2 = list.get(1).getVideo().getBoxshotUrl();
            String boxshotUrl3 = list.get(2).getVideo().getBoxshotUrl();
            final int listPos = loMo.getListPos();
            final String listContext = loMo.getListContext();
            final String id = loMo.getId();
            final int trackId = loMo.getTrackId();
            if (boxshotUrl != null) {
                g = C8691duz.g(boxshotUrl);
                if (!g && boxshotUrl2 != null) {
                    g2 = C8691duz.g(boxshotUrl2);
                    if (!g2 && boxshotUrl3 != null) {
                        g3 = C8691duz.g(boxshotUrl3);
                        if (!g3) {
                            bSY bsy = this.c;
                            C3793bKw c3793bKw = new C3793bKw();
                            c3793bKw.e((CharSequence) ("collect-taste-row-group-" + listPos));
                            c3793bKw.c(C3796bKz.g.k);
                            c3793bKw.c(AppView.bulkRaterRow);
                            c3793bKw.d(bSI.c(loMo));
                            c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.rows.CollectTasteCreator$addCollectTasteLolomoModel$1$1$1
                                {
                                    super(0);
                                }

                                @Override // o.drO
                                /* renamed from: a */
                                public final TrackingInfo invoke() {
                                    return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
                                }
                            });
                            this.e.c(c3793bKw, boxshotUrl, boxshotUrl2, boxshotUrl3, new View.OnClickListener() { // from class: o.bVM
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    bVN.a(TrackingInfoHolder.this, this, listPos, listContext, id, trackId, view);
                                }
                            });
                            c3793bKw.d(bSY.a(bsy, false, 1, null));
                            c3793bKw.b(new InterfaceC4467bf() { // from class: o.bVS
                                @Override // o.InterfaceC4467bf
                                public final void c(AbstractC3073as abstractC3073as, Object obj, int i) {
                                    bVN.e(bVN.this, loMo, (C3793bKw) abstractC3073as, (C2077aZ) obj, i);
                                }
                            });
                            interfaceC2023aX.add(c3793bKw);
                            return;
                        }
                    }
                }
            }
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            c2 = dqE.c(dpD.a("trackingInfo", TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null).toJSONObject().toString()), dpD.a("topTitleCardUrl", boxshotUrl), dpD.a("middleTitleCardUrl", boxshotUrl2), dpD.a("bottomTitleCardUrl", boxshotUrl3));
            k2 = dqE.k(c2);
            C1596aHd c1596aHd = new C1596aHd("Empty BULK_RATER row is received", null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c3 = errorType.c();
                    c1596aHd.a(c3 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                th2 = c1596aHd.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th2);
                return;
            } else {
                dVar.e().b(c1596aHd, th2);
                return;
            }
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        c = dqE.c(dpD.a("trackingInfo", TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null).toJSONObject().toString()), dpD.a("rowSize", String.valueOf(list.size())));
        k = dqE.k(c);
        C1596aHd c1596aHd2 = new C1596aHd("Empty BULK_RATER row is received", null, null, true, k, false, false, 96, null);
        ErrorType errorType2 = c1596aHd2.a;
        if (errorType2 != null) {
            c1596aHd2.e.put("errorType", errorType2.c());
            String b2 = c1596aHd2.b();
            if (b2 != null) {
                String c4 = errorType2.c();
                c1596aHd2.a(c4 + " " + b2);
            }
        }
        if (c1596aHd2.b() != null && c1596aHd2.i != null) {
            th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
        } else if (c1596aHd2.b() != null) {
            th = new Throwable(c1596aHd2.b());
        } else {
            th = c1596aHd2.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar2.a();
        if (a2 != null) {
            a2.e(c1596aHd2, th);
        } else {
            dVar2.e().b(c1596aHd2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TrackingInfoHolder trackingInfoHolder, bVN bvn, int i, String str, String str2, int i2, View view) {
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) bvn, "");
        C8632dsu.c((Object) str2, "");
        Logger.INSTANCE.logEvent(new Selected(AppView.bulkRaterTryItNowButton, AppView.bulkRaterRow, CommandValue.EnterBulkRaterCommand, TrackingInfoHolder.a(trackingInfoHolder, null, null, null, 7, null)));
        bvn.e.e(new CollectTasteData(trackingInfoHolder, i, str, str2, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(bVN bvn, LoMo loMo, C3793bKw c3793bKw, C2077aZ c2077aZ, int i) {
        C8632dsu.c((Object) bvn, "");
        C8632dsu.c((Object) loMo, "");
        bvn.d.invoke(new bSJ.e(loMo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(bVN bvn, View view) {
        C8632dsu.c((Object) bvn, "");
        bvn.d.invoke(new bSJ.d(CollectTaste.MessageType.c));
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, LoMo loMo, AppView appView, final TrackingInfoHolder trackingInfoHolder, CollectTaste.MessageType messageType) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        C8632dsu.c((Object) messageType, "");
        C3793bKw c3793bKw = new C3793bKw();
        int listPos = loMo.getListPos();
        c3793bKw.e((CharSequence) ("collect-taste-message-group-" + listPos));
        c3793bKw.c(C3796bKz.g.k);
        c3793bKw.c(appView);
        c3793bKw.d(bSI.c(loMo));
        c3793bKw.b((drO<? extends TrackingInfo>) new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.rows.CollectTasteCreator$addCollectTasteMessageModel$1$1$1
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final TrackingInfo invoke() {
                return TrackingInfoHolder.e(TrackingInfoHolder.this, null, 1, null);
            }
        });
        c3793bKw.d(bSY.a(this.c, false, 1, null));
        c3793bKw.b(bSY.b(this.c, (InterfaceC5223buh) null, (LoMoType) null, 3, (Object) null));
        this.e.b(c3793bKw, new View.OnClickListener() { // from class: o.bVP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bVN.c(bVN.this, view);
            }
        }, messageType);
        interfaceC2023aX.add(c3793bKw);
    }
}
