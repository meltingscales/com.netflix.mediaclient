package com.netflix.partner.card;

import android.content.Context;
import android.os.Handler;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.android.MinusOneCardType;
import com.netflix.cl.model.android.MinusOneRequestType;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.event.session.Session;
import com.netflix.cl.model.event.session.action.android.MinusOneRequest;
import com.netflix.cl.model.event.session.action.android.MinusOneRequestEnded;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pservice.PDiskData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.C1044Mm;
import o.C1655aJi;
import o.C4933bpI;
import o.C4935bpK;
import o.C8157dfA;
import o.C8168dfL;
import o.C8178dfV;
import o.C8438dlp;
import o.InterfaceC1598aHf;
import o.InterfaceC8437dlo;
import o.dlG;
import o.dlM;
import o.dlO;
import o.dlT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PCardDataHandler implements InterfaceC8437dlo {
    private static final String BIXBY_HOME = "bixbyHome";
    private static final String TAG = "nf_partner_PCardDataHandler";
    private long mCardActionId;
    private dlM mCardAlgo;
    private int mCardEventType;
    private Context mContext;
    private boolean mIsUserLoggedIn;
    private long mPartnerInputContextId;
    private Handler mWorkHandler;

    public PCardDataHandler(Context context, Handler handler, boolean z, long j, long j2) {
        this.mContext = context;
        this.mIsUserLoggedIn = z;
        this.mPartnerInputContextId = j;
        this.mCardActionId = j2;
        this.mWorkHandler = handler;
        this.mCardAlgo = new dlM(context);
    }

    @Override // o.InterfaceC8437dlo
    public void handleCardEvent(int i, String str, InterfaceC8437dlo.d dVar) {
        this.mCardEventType = i;
        if (this.mCardAlgo.a(i)) {
            buildAndSendNewCard(dVar);
            return;
        }
        endClWithError("refresh not needed");
        dlG dlg = dlG.b;
        sendNoCard(0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNoCard(int i, InterfaceC8437dlo.d dVar) {
        C1044Mm.e(TAG, "sendNoCard: ");
        dVar.c(i, "");
    }

    private void buildAndSendNewCard(final InterfaceC8437dlo.d dVar) {
        try {
            loadFromDisk(new C4933bpI.d() { // from class: com.netflix.partner.card.PCardDataHandler.1
                @Override // o.C4933bpI.d
                public void d(PDiskData pDiskData) {
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(pDiskData != null);
                    C1044Mm.a(PCardDataHandler.TAG, "data on disk: %s, ", objArr);
                    if (pDiskData != null) {
                        PCardDataHandler pCardDataHandler = PCardDataHandler.this;
                        pCardDataHandler.useDataFromDisk(pCardDataHandler.mContext, pDiskData, dVar);
                        return;
                    }
                    PCardDataHandler.this.endClWithError("no data on disk");
                    PCardDataHandler pCardDataHandler2 = PCardDataHandler.this;
                    dlG dlg = dlG.b;
                    pCardDataHandler2.sendNoCard(0, dVar);
                }
            });
        } catch (Exception e) {
            C1044Mm.e(TAG, "unable to load data from disk", e);
            endClWithError("cannot load from disk");
            dlG dlg = dlG.b;
            sendNoCard(0, dVar);
        }
    }

    private void loadFromDisk(final C4933bpI.d dVar) {
        this.mWorkHandler.post(new Runnable() { // from class: com.netflix.partner.card.PCardDataHandler.3
            @Override // java.lang.Runnable
            public void run() {
                C4933bpI.d(PCardDataHandler.this.mContext, dVar);
            }
        });
    }

    public static MinusOneRequestType getClCardRequestType(int i) {
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            return MinusOneRequestType.userDeleteCard;
                        }
                        return MinusOneRequestType.entry;
                    }
                    return MinusOneRequestType.userHideCard;
                }
                return MinusOneRequestType.impression;
            }
            return MinusOneRequestType.userRefresh;
        }
        return MinusOneRequestType.warmup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useDataFromDisk(Context context, PDiskData pDiskData, InterfaceC8437dlo.d dVar) {
        PDiskData.ListType b2 = this.mCardAlgo.b(pDiskData, C8438dlp.c(pDiskData));
        CardTemplate c = dlT.c(context, b2);
        CardTemplate b3 = dlT.b(context, c);
        int d = dlT.d(c);
        int d2 = dlT.d(b3);
        C1044Mm.a(TAG, "useDataFromDisk: listToUse %s (%s %s), fallback (%s, %s)", b2, c, Integer.valueOf(d), b3, Integer.valueOf(d2));
        List<C4935bpK> nextSetOfRecos = getNextSetOfRecos(b2, Math.min(d, d2), Math.max(d, d2), pDiskData);
        if (nextSetOfRecos == null || nextSetOfRecos.size() == 0 || (d2 < d && nextSetOfRecos.size() < d2)) {
            endClWithError("no videos");
            dlG dlg = dlG.b;
            sendNoCard(0, dVar);
            return;
        }
        CardTemplate templateToUse = getTemplateToUse(c, b3, d2, nextSetOfRecos);
        if (shouldTrimToSingleVideo(templateToUse, b2)) {
            nextSetOfRecos = trimListToSingleVideo(nextSetOfRecos, b2);
        }
        if (shouldShuffleVideos(templateToUse, b2)) {
            nextSetOfRecos = shuffleVideos(nextSetOfRecos);
        }
        String b4 = PDiskData.ListType.NON_MEMBER.equals(b2) ? "" : C8438dlp.b(pDiskData, b2);
        String b5 = C8438dlp.b(pDiskData, b2, b4, getClCardType(templateToUse.e()), getClCardRequestType(this.mCardEventType));
        JSONObject buildCard = buildCard(context, b2, b4, buildJsonVideos(context, b2, nextSetOfRecos, b5), templateToUse, b5);
        String jSONObject = buildCard != null ? buildCard.toString() : "";
        C8157dfA.a(this.mContext, "partner_curr_card_data", jSONObject);
        JSONObject buildLoggingCard = buildLoggingCard(buildCard, getClTrackingInfo(b2, b5, b4), templateToUse);
        C8157dfA.a(this.mContext, "partner_curr_card_log", buildLoggingCard != null ? buildLoggingCard.toString() : null);
        endCl(buildLoggingCard);
        dlG dlg2 = dlG.b;
        dVar.c(0, jSONObject);
    }

    private boolean shouldTrimToSingleVideo(CardTemplate cardTemplate, PDiskData.ListType listType) {
        return CardTemplate.a.equals(cardTemplate) && PDiskData.ListType.CW.equals(listType);
    }

    private boolean shouldShuffleVideos(CardTemplate cardTemplate, PDiskData.ListType listType) {
        return CardTemplate.f.equals(cardTemplate) && !PDiskData.ListType.CW.equals(listType);
    }

    private List<C4935bpK> shuffleVideos(List<C4935bpK> list) {
        if (list == null || list.size() < 3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.remove(0);
        Collections.shuffle(arrayList);
        arrayList.add(0, list.get(0));
        return arrayList;
    }

    private List<C4935bpK> trimListToSingleVideo(List<C4935bpK> list, PDiskData.ListType listType) {
        dlO a = this.mCardAlgo.a(listType);
        ArrayList arrayList = new ArrayList();
        Iterator<C4935bpK> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4935bpK next = it.next();
            if (!a.b(this.mCardAlgo.e(next))) {
                C1044Mm.a(TAG, "trimListToSingleVideo: returned %s", this.mCardAlgo.e(next));
                arrayList.add(next);
                this.mCardAlgo.e(listType, a, next, list.indexOf(next));
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C4935bpK c4935bpK = list.get(0);
            C1044Mm.a(TAG, "trimListToSingleVideo: Clearing presented list and returning first video in list %s", c4935bpK);
            arrayList.add(c4935bpK);
            this.mCardAlgo.e(listType, a, arrayList);
        }
        return arrayList;
    }

    private CardTemplate getTemplateToUse(CardTemplate cardTemplate, CardTemplate cardTemplate2, int i, List<C4935bpK> list) {
        if (cardTemplate != CardTemplate.f) {
            return cardTemplate;
        }
        if (list.size() < i || list.size() < dlT.e(cardTemplate)) {
            C1044Mm.a(TAG, "getTemplateToUse: using fallbackTemplate %s (%s), min: %s, have: %s", cardTemplate2, cardTemplate, Integer.valueOf(i), Integer.valueOf(list.size()));
            return cardTemplate2;
        }
        return cardTemplate;
    }

    private List<C4935bpK> getNextSetOfRecos(PDiskData.ListType listType, int i, int i2, PDiskData pDiskData) {
        List<C4935bpK> videoListByType = pDiskData.getVideoListByType(listType);
        if (videoListByType == null || videoListByType.size() == 0) {
            C1044Mm.e(TAG, "videoList %s is null or empty, should not be", listType);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        dlO a = this.mCardAlgo.a(listType);
        if (videoListByType.size() < i) {
            C1044Mm.e(TAG, "videoList %s has %s < %s(%s)", listType, Integer.valueOf(videoListByType.size()), Integer.valueOf(i), Integer.valueOf(i2));
            this.mCardAlgo.e(listType, a, videoListByType);
            return arrayList;
        } else if (PDiskData.ListType.CW.equals(listType)) {
            for (C4935bpK c4935bpK : videoListByType) {
                if (arrayList.size() >= i2) {
                    break;
                } else if (this.mCardAlgo.e(c4935bpK) == null) {
                    InterfaceC1598aHf.a("SPY-31901 getNextSetOfRecos(CW) videoId is null: " + c4935bpK.toString());
                } else {
                    arrayList.add(c4935bpK);
                }
            }
            if (arrayList.size() >= i) {
                this.mCardAlgo.e(listType, a, (C4935bpK) arrayList.get(0), 0);
            } else {
                arrayList.clear();
            }
            return arrayList;
        } else {
            C1044Mm.a(TAG, "getNextSetOfRecos: %s, prevIndex: %s ", listType, Integer.valueOf(a.d()));
            a.b(videoListByType.get(0).a, videoListByType.size() > 1 ? videoListByType.get(1).a : null);
            int i3 = 0;
            for (int d = a.d() + 1; d < videoListByType.size() && arrayList.size() < i2; d++) {
                C4935bpK c4935bpK2 = videoListByType.get(d);
                String e = this.mCardAlgo.e(c4935bpK2);
                if (e == null) {
                    InterfaceC1598aHf.a("SPY-31901 getNextSetOfRecos(" + listType.d() + ") videoId is null: " + c4935bpK2.toString());
                } else if (!a.b(e)) {
                    arrayList.add(c4935bpK2);
                    if (arrayList.size() == 1) {
                        i3 = d;
                    }
                }
            }
            if (arrayList.size() >= i) {
                this.mCardAlgo.e(listType, a, (C4935bpK) arrayList.get(0), i3);
                C1044Mm.a(TAG, "getNextSetOfRecos: %s, index %s -> %s(%s) ", listType, Integer.valueOf(a.d()), Integer.valueOf(i3), Integer.valueOf(videoListByType.size()));
                return arrayList;
            }
            this.mCardAlgo.e(listType, a, videoListByType);
            C1044Mm.a(TAG, "getNextSetOfRecos: index %s, %s -> %s(%s) - alldone", listType, Integer.valueOf(a.d()), Integer.valueOf(i3), Integer.valueOf(videoListByType.size()));
            return null;
        }
    }

    private JSONArray buildJsonVideos(Context context, PDiskData.ListType listType, List<C4935bpK> list, String str) {
        if (list == null || list.size() == 0) {
            return null;
        }
        C1044Mm.a(TAG, "buildJsonVideos %s, ", PDiskData.printList(list));
        JSONArray jSONArray = new JSONArray();
        for (C4935bpK c4935bpK : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("deeplinkUrl", C8438dlp.b(C8438dlp.e(c4935bpK), BIXBY_HOME, str));
                jSONObject.putOpt("imageUrl", c4935bpK.c);
                jSONObject.putOpt(SignupConstants.Field.VIDEO_TITLE, c4935bpK.s);
                jSONObject.putOpt("details", c4935bpK.q);
                jSONObject.putOpt("playableId", this.mCardAlgo.e(c4935bpK));
                jSONObject.putOpt("marker", C8438dlp.b(str, BIXBY_HOME));
                if (c4935bpK.b) {
                    jSONObject.putOpt("isPlayable", 1);
                    jSONObject.putOpt("playDeeplinkUrl", C8438dlp.a(c4935bpK.j, BIXBY_HOME, str));
                    jSONObject.putOpt("details", getCardPlayableDetail(context, c4935bpK));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    private JSONObject buildCard(Context context, PDiskData.ListType listType, String str, JSONArray jSONArray, CardTemplate cardTemplate, String str2) {
        String string;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        C1044Mm.a(TAG, "buildCard for %s, from %s", cardTemplate.e(), str);
        JSONObject jSONObject = new JSONObject();
        try {
            if (PDiskData.ListType.CW.equals(listType)) {
                jSONObject.putOpt("cardTitle", C8168dfL.d(C1655aJi.b.f));
            } else {
                jSONObject.putOpt("cardTitle", str);
            }
            jSONObject.putOpt("templateId", cardTemplate.e());
            context.getResources().updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
            if (this.mIsUserLoggedIn) {
                string = context.getResources().getString(C1655aJi.b.e);
            } else {
                string = context.getResources().getString(C1655aJi.b.a);
            }
            jSONObject.putOpt("ctaButtonText", string);
            jSONObject.putOpt("ctaDeeplink", C8438dlp.d(BIXBY_HOME, str2));
            jSONObject.putOpt(SignupConstants.Field.VIDEOS, jSONArray);
            jSONObject.putOpt("currentTime", String.valueOf(System.currentTimeMillis()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private JSONObject buildLoggingCard(JSONObject jSONObject, JSONObject jSONObject2, CardTemplate cardTemplate) {
        if (jSONObject == null || !jSONObject.has(SignupConstants.Field.VIDEOS)) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject3.putOpt(SignupConstants.Field.CARD_TYPE, getClCardType(jSONObject.getString("templateId")));
            jSONObject3.putOpt("listName", jSONObject.getString("cardTitle"));
            JSONArray jSONArray2 = jSONObject.getJSONArray(SignupConstants.Field.VIDEOS);
            int min = Math.min(dlT.a(cardTemplate), jSONArray2.length());
            for (int i = 0; i < min; i++) {
                String string = jSONArray2.getJSONObject(i).getString("playableId");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt(SignupConstants.Field.VIDEO_ID, string);
                jSONObject4.putOpt("trackingInfo", jSONObject2);
                jSONArray.put(jSONObject4);
            }
            jSONObject3.putOpt("videoImpressions", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    private static MinusOneCardType getClCardType(String str) {
        if (C8168dfL.g(str)) {
            return MinusOneCardType.single32;
        }
        if (C8168dfL.d(CardTemplate.a.e(), str.trim())) {
            return MinusOneCardType.single32;
        }
        if (C8168dfL.d(CardTemplate.f.e(), str.trim())) {
            return MinusOneCardType.onePlus;
        }
        if (C8168dfL.d(CardTemplate.c.e(), str.trim())) {
            return MinusOneCardType.full32;
        }
        if (C8168dfL.d(CardTemplate.d.e(), str.trim())) {
            return MinusOneCardType.full34;
        }
        if (C8168dfL.d(CardTemplate.b.e(), str.trim())) {
            return MinusOneCardType.full33;
        }
        return MinusOneCardType.single32;
    }

    private JSONObject getClTrackingInfo(PDiskData.ListType listType, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("listName", str2);
            jSONObject.putOpt("listType", listType.d());
            jSONObject.putOpt("marker", str);
            jSONObject.putOpt(NetflixActivity.EXTRA_SOURCE, BIXBY_HOME);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private String getCardPlayableDetail(Context context, C4935bpK c4935bpK) {
        String a;
        if (c4935bpK == null || !c4935bpK.b) {
            return "";
        }
        if (c4935bpK.i) {
            if (c4935bpK.e) {
                a = C8168dfL.a(C1655aJi.b.c, c4935bpK.k, c4935bpK.f13627o);
            } else {
                a = C8168dfL.a(C1655aJi.b.d, c4935bpK.k, Integer.valueOf(c4935bpK.h));
            }
        } else {
            long j = c4935bpK.l;
            a = C8168dfL.a(C1655aJi.b.b, C8178dfV.d(((long) c4935bpK.g) > j ? c4935bpK.n - ((int) TimeUnit.MILLISECONDS.toSeconds(j)) : c4935bpK.n, context));
        }
        return C8168dfL.c(a).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endClWithError(String str) {
        ExtLogger.INSTANCE.failedAction(Long.valueOf(this.mCardActionId), CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    private void endCl(JSONObject jSONObject) {
        C1044Mm.a(TAG, "endCl tosee cardImpression %s", jSONObject);
        Logger logger = Logger.INSTANCE;
        Session session = logger.getSession(Long.valueOf(this.mCardActionId));
        if (session != null && (session instanceof MinusOneRequest)) {
            logger.endSession(new MinusOneRequestEnded((MinusOneRequest) session, new b(), jSONObject));
        }
        logger.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class b implements TrackingInfo {
        private b() {
        }

        @Override // com.netflix.cl.model.JsonSerializer
        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt(NetflixActivity.EXTRA_SOURCE, PartnerInputSource.bixbyHome);
            return jSONObject;
        }
    }
}
