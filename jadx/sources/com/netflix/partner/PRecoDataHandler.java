package com.netflix.partner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.pservice.PDiskData;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.partner.PRecoDataHandler;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import o.C1044Mm;
import o.C4933bpI;
import o.C4935bpK;
import o.C8004dcG;
import o.C8157dfA;
import o.C8166dfJ;
import o.C8168dfL;
import o.C8175dfS;
import o.C8187dfe;
import o.C8432dlj;
import o.C8438dlp;
import o.C8447dly;
import o.InterfaceC8445dlw;
import o.InterfaceC9638uF;
import o.dlG;
import o.dlN;

/* loaded from: classes7.dex */
public class PRecoDataHandler implements InterfaceC8445dlw {
    static final String SFINDER_RECOMMENDATION = "sFinderRecommendation";
    private static final int SOME_BIG_NUM_FOR_RECO_USAGE = 100;
    private static final String TAG = "nf_partner_reco_data";
    private Context mContext;
    private long mPartnerInputContextId;
    private Long mSearchActionId;
    private ServiceManager mServiceManager;
    private Handler mWorkHandler;

    public PRecoDataHandler(Context context, ServiceManager serviceManager, Handler handler, long j, Long l) {
        Objects.requireNonNull(context);
        this.mContext = context;
        this.mServiceManager = serviceManager;
        this.mPartnerInputContextId = j;
        this.mSearchActionId = l;
        this.mWorkHandler = handler;
    }

    @Override // o.InterfaceC8445dlw
    public void refreshData(final boolean z) {
        if (this.mServiceManager.c()) {
            try {
                loadFromDisk(new C4933bpI.d() { // from class: com.netflix.partner.PRecoDataHandler.4
                    @Override // o.C4933bpI.d
                    public void d(PDiskData pDiskData) {
                        if (pDiskData == null || C8175dfS.e(pDiskData.dataTime)) {
                            Object[] objArr = new Object[3];
                            objArr[0] = Boolean.valueOf(pDiskData != null);
                            objArr[1] = Long.valueOf(pDiskData != null ? pDiskData.dataTime : 0L);
                            objArr[2] = Boolean.valueOf(pDiskData != null ? C8175dfS.e(pDiskData.dataTime) : false);
                            C1044Mm.a(PRecoDataHandler.TAG, "data on disk: %s, %s, expired : %s", objArr);
                            PRecoDataHandler pRecoDataHandler = PRecoDataHandler.this;
                            pRecoDataHandler.clearRecoIndex(pRecoDataHandler.mContext);
                            if (z) {
                                PRecoDataHandler pRecoDataHandler2 = PRecoDataHandler.this;
                                pRecoDataHandler2.triggerMemberPreAppFetch(pRecoDataHandler2.mContext);
                                return;
                            }
                            PRecoDataHandler pRecoDataHandler3 = PRecoDataHandler.this;
                            pRecoDataHandler3.triggerNonMemberPreAppFetch(pRecoDataHandler3.mServiceManager);
                        }
                    }
                });
            } catch (Exception e) {
                C1044Mm.e(TAG, "skip refresh. unable to load data from disk", e);
            }
        }
    }

    private void loadFromDisk(final C4933bpI.d dVar) {
        this.mWorkHandler.post(new Runnable() { // from class: com.netflix.partner.PRecoDataHandler.5
            @Override // java.lang.Runnable
            public void run() {
                C4933bpI.d(PRecoDataHandler.this.mContext, dVar);
            }
        });
    }

    @Override // o.InterfaceC8445dlw
    public void getRecommendations(String str, final int i, final int i2, final InterfaceC8445dlw.a aVar) {
        final ArrayList arrayList = new ArrayList();
        try {
            loadFromDisk(new C4933bpI.d() { // from class: com.netflix.partner.PRecoDataHandler.2
                @Override // o.C4933bpI.d
                public void d(PDiskData pDiskData) {
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(pDiskData != null);
                    C1044Mm.a(PRecoDataHandler.TAG, "data on disk: %s, ", objArr);
                    if (pDiskData != null) {
                        PRecoDataHandler pRecoDataHandler = PRecoDataHandler.this;
                        pRecoDataHandler.useDataFromDisk(pRecoDataHandler.mContext, arrayList, i, i2, pDiskData, aVar);
                        return;
                    }
                    PRecoDataHandler.this.sendNoRecos("No data on disk", aVar);
                }
            });
        } catch (Exception e) {
            C1044Mm.e(TAG, "unable to load data from disk", e);
            sendNoRecos(e.getMessage(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useDataFromDisk(Context context, final List<dlN> list, int i, int i2, PDiskData pDiskData, final InterfaceC8445dlw.a aVar) {
        C1044Mm.a(TAG, "useDataFromDisk (%s, %s) ", Integer.valueOf(i), Integer.valueOf(i2));
        final List<C4935bpK> nextSetOfRecos = getNextSetOfRecos(context, Math.min(i, i2), Math.max(i, i2), pDiskData);
        if (nextSetOfRecos == null || nextSetOfRecos.size() == 0) {
            sendNoRecos("No videos", aVar);
            return;
        }
        final String e = C8438dlp.e(pDiskData, C8438dlp.e(pDiskData, nextSetOfRecos, C8438dlp.c(pDiskData)));
        C8187dfe.c(new Runnable() { // from class: o.dlq
            @Override // java.lang.Runnable
            public final void run() {
                PRecoDataHandler.this.lambda$useDataFromDisk$0(nextSetOfRecos, list, e, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadBitmapsToContinue */
    public void lambda$useDataFromDisk$0(List<C4935bpK> list, List<dlN> list2, String str, InterfaceC8445dlw.a aVar) {
        C1044Mm.a(TAG, "downloadBitmapsToContinue size: %s", Integer.valueOf(list.size()));
        C8432dlj c8432dlj = new C8432dlj(list.size());
        for (int i = 0; i < c8432dlj.d(); i++) {
            C4935bpK c4935bpK = list.get(i);
            dlN createPartnerVideo = createPartnerVideo(c4935bpK, str);
            list2.add(createPartnerVideo);
            downloadBitmapToContinue(list2, c4935bpK.d, createPartnerVideo, i, c8432dlj, aVar);
        }
    }

    @SuppressLint({"CheckResult"})
    private void downloadBitmapToContinue(final List<dlN> list, final String str, final dlN dln, final int i, final C8432dlj c8432dlj, final InterfaceC8445dlw.a aVar) {
        if (C8168dfL.g(str)) {
            C1044Mm.j(TAG, "box shot URL was empty");
            respondIfLimitReached(list, c8432dlj, aVar);
            return;
        }
        InterfaceC9638uF.a.d(this.mContext).b(GetImageRequest.e().a(str).a()).subscribe(new Consumer() { // from class: o.dlv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PRecoDataHandler.this.lambda$downloadBitmapToContinue$1(list, dln, i, c8432dlj, aVar, (GetImageRequest.a) obj);
            }
        }, new Consumer() { // from class: o.dls
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PRecoDataHandler.this.lambda$downloadBitmapToContinue$2(str, list, c8432dlj, aVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadBitmapToContinue$1(List list, dlN dln, int i, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar, GetImageRequest.a aVar2) {
        continueWithSharedUri(list, aVar2.b(), dln, i, c8432dlj, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadBitmapToContinue$2(String str, List list, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar, Throwable th) {
        C1044Mm.j(TAG, "failed to download image %s, error: %s", str, th);
        respondIfLimitReached(list, c8432dlj, aVar);
    }

    private List<C4935bpK> getNextSetOfRecos(Context context, int i, int i2, PDiskData pDiskData) {
        int suggestedRecoIndex = getSuggestedRecoIndex(context);
        int videoCountOnDisk = getVideoCountOnDisk(pDiskData);
        int min = Math.min(i, videoCountOnDisk);
        int min2 = Math.min(i2, videoCountOnDisk);
        C1044Mm.a(TAG, "getNextSetOfRecos index: %s, onDisk:%s, (%s, %s)", Integer.valueOf(suggestedRecoIndex), Integer.valueOf(videoCountOnDisk), Integer.valueOf(min), Integer.valueOf(min2));
        if (videoCountOnDisk == 0) {
            return null;
        }
        List<C4935bpK> setOfRecos = getSetOfRecos(suggestedRecoIndex, min2, pDiskData);
        if (setOfRecos != null && setOfRecos.size() > 0) {
            advanceIndex(context, suggestedRecoIndex, Math.min(min, setOfRecos.size()), videoCountOnDisk);
        }
        return setOfRecos;
    }

    private int getVideoCountOnDisk(PDiskData pDiskData) {
        if (hasMemberData(pDiskData)) {
            List<C4935bpK> list = pDiskData.billboardList;
            int size = list != null ? list.size() : 0;
            List<C4935bpK> list2 = pDiskData.cwList;
            int size2 = list2 != null ? list2.size() : 0;
            List<C4935bpK> list3 = pDiskData.iqList;
            int size3 = list3 != null ? list3.size() : 0;
            List<C4935bpK> list4 = pDiskData.standardFirstList;
            int size4 = list4 != null ? list4.size() : 0;
            List<C4935bpK> list5 = pDiskData.standardSecondList;
            return (list5 != null ? list5.size() : 0) + size + size2 + size3 + size4;
        }
        List<C4935bpK> list6 = pDiskData.nonMemberList;
        if (list6 != null) {
            return list6.size();
        }
        return 0;
    }

    private List<C4935bpK> getSetOfRecos(int i, int i2, PDiskData pDiskData) {
        if (i2 == 0 || pDiskData == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (hasMemberData(pDiskData)) {
            C8438dlp.c(pDiskData.billboardList, arrayList);
            C8438dlp.c(pDiskData.cwList, arrayList);
            C8438dlp.c(pDiskData.iqList, arrayList);
            C8438dlp.c(pDiskData.standardFirstList, arrayList);
            C8438dlp.c(pDiskData.standardSecondList, arrayList);
        } else {
            C8438dlp.c(pDiskData.nonMemberList, arrayList);
        }
        List<C4935bpK> pruneEntries = pruneEntries(dedupe(arrayList));
        if (pruneEntries == null || pruneEntries.size() == 0) {
            return pruneEntries;
        }
        int size = pruneEntries.size();
        ArrayList arrayList2 = new ArrayList();
        int min = Math.min(i2, size);
        int i3 = i % size;
        C1044Mm.a(TAG, "getSetOfRecos index: %s, listSize: %s, n:%s, currentIndex: %s, onDisk: %s", Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(min), Integer.valueOf(i3), Integer.valueOf(pruneEntries.size()));
        for (int i4 = 0; i4 < min; i4++) {
            arrayList2.add(pruneEntries.get(i3));
            i3 = (i3 + 1) % size;
        }
        C1044Mm.a(TAG, "getSetOfRecos %s", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    private List<C4935bpK> dedupe(List<C4935bpK> list) {
        if (list == null || list.size() == 0) {
            return list;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C4935bpK c4935bpK : list) {
            if (!hashSet.contains(C8438dlp.e(c4935bpK))) {
                arrayList.add(c4935bpK);
                hashSet.add(C8438dlp.e(c4935bpK));
            }
        }
        C1044Mm.a(TAG, "dedupe removed %s", Integer.valueOf(list.size() - arrayList.size()));
        return arrayList;
    }

    private List<C4935bpK> pruneEntries(List<C4935bpK> list) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (C4935bpK c4935bpK : list) {
            if (C8168dfL.h(C8438dlp.e(c4935bpK)) && C8168dfL.h(C8438dlp.a(c4935bpK))) {
                arrayList.add(c4935bpK);
            }
        }
        C1044Mm.a(TAG, "pruneEntries removed %s", Integer.valueOf(list.size() - arrayList.size()));
        return arrayList;
    }

    private List<dlN> prunePartnerRecos(List<dlN> list) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (dlN dln : list) {
            if (C8168dfL.h(dln.e) && C8168dfL.h(dln.g)) {
                arrayList.add(dln);
            }
        }
        C1044Mm.a(TAG, "prunePartnerRecos removed %s", Integer.valueOf(list.size() - arrayList.size()));
        return arrayList;
    }

    private boolean hasMemberData(PDiskData pDiskData) {
        if (pDiskData == null) {
            return false;
        }
        return C8438dlp.d(pDiskData.billboardList) || C8438dlp.d(pDiskData.cwList) || C8438dlp.d(pDiskData.iqList) || C8438dlp.d(pDiskData.standardFirstList) || C8438dlp.d(pDiskData.standardSecondList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendNoRecos(String str, InterfaceC8445dlw.a aVar) {
        endClWithError(str);
        dlG dlg = dlG.b;
        sendRecoComplete(null, 0, aVar);
    }

    private void endClWithError(String str) {
        ExtLogger.INSTANCE.failedAction(this.mSearchActionId, CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    private void endCl() {
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.mSearchActionId);
        logger.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    private void advanceIndex(Context context, int i, int i2, int i3) {
        setRecoIndex(context, (i + i2) % i3);
    }

    /* renamed from: com.netflix.partner.PRecoDataHandler$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ C8432dlj b;
        final /* synthetic */ dlN c;
        final /* synthetic */ Bitmap e;
        final /* synthetic */ InterfaceC8445dlw.a g;
        final /* synthetic */ List j;

        AnonymousClass3(Bitmap bitmap, int i, dlN dln, List list, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar) {
            this.e = bitmap;
            this.a = i;
            this.c = dln;
            this.j = list;
            this.b = c8432dlj;
            this.g = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            PRecoDataHandler pRecoDataHandler = PRecoDataHandler.this;
            if (pRecoDataHandler.storeBitmapToFileSystem(pRecoDataHandler.mContext, this.e, this.a)) {
                PRecoDataHandler pRecoDataHandler2 = PRecoDataHandler.this;
                Uri imageUriFromProvider = pRecoDataHandler2.getImageUriFromProvider(pRecoDataHandler2.mContext, this.a);
                if (imageUriFromProvider != null) {
                    C8447dly.b(PRecoDataHandler.this.mContext, imageUriFromProvider);
                    this.c.e = imageUriFromProvider.toString();
                }
            }
            final List list = this.j;
            final C8432dlj c8432dlj = this.b;
            final InterfaceC8445dlw.a aVar = this.g;
            C8187dfe.c(new Runnable() { // from class: o.dlu
                @Override // java.lang.Runnable
                public final void run() {
                    PRecoDataHandler.AnonymousClass3.this.c(list, c8432dlj, aVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(List list, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar) {
            PRecoDataHandler.this.respondIfLimitReached(list, c8432dlj, aVar);
        }
    }

    private void continueWithSharedUri(List<dlN> list, Bitmap bitmap, dlN dln, int i, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar) {
        this.mWorkHandler.post(new AnonymousClass3(bitmap, i, dln, list, c8432dlj, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void respondIfLimitReached(List<dlN> list, C8432dlj c8432dlj, InterfaceC8445dlw.a aVar) {
        if (c8432dlj.b(c8432dlj.c())) {
            C8166dfJ.d();
            List<dlN> prunePartnerRecos = prunePartnerRecos(list);
            dlG dlg = dlG.b;
            sendRecoComplete(prunePartnerRecos, 0, aVar);
            endCl();
        }
    }

    private void sendRecoComplete(List<dlN> list, int i, InterfaceC8445dlw.a aVar) {
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(list != null ? list.size() : 0);
        C1044Mm.a(TAG, "sending results to partner %s", objArr);
        aVar.e(i, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public boolean storeBitmapToFileSystem(Context context, Bitmap bitmap, int i) {
        try {
            File file = new File(context.getCacheDir(), "partnerImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file + "/" + C8447dly.d(i));
            bitmap.compress(Bitmap.CompressFormat.WEBP, SOME_BIG_NUM_FOR_RECO_USAGE, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            C1044Mm.e(TAG, "error storing bitmap ", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getImageUriFromProvider(Context context, int i) {
        return C8447dly.e(context, C8447dly.a(context, i));
    }

    private int getSuggestedRecoIndex(Context context) {
        return C8157dfA.d(context, "partner_reco_next_index", 0);
    }

    private void setRecoIndex(Context context, int i) {
        int i2 = i % SOME_BIG_NUM_FOR_RECO_USAGE;
        C1044Mm.a(TAG, "writing %s to PARTNERMODULE_NEXT_RECO_INDEX", Integer.valueOf(i2));
        C8157dfA.a(context, "partner_reco_next_index", i2);
    }

    private void setSuggestedRecoIndex(Context context, int i) {
        setRecoIndex(context, i + getSuggestedRecoIndex(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecoIndex(Context context) {
        setSuggestedRecoIndex(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerMemberPreAppFetch(Context context) {
        C1044Mm.e(TAG, "triggering member fetch");
        sendLocalBroadcast(context, "com.netflix.mediaclient.intent.action.PREAPP_AGENT_TO_ALL_MEMBER_UPDATED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void triggerNonMemberPreAppFetch(ServiceManager serviceManager) {
        if (serviceManager == null || serviceManager.m() == null) {
            return;
        }
        C1044Mm.e(TAG, "triggering non member fetch");
        try {
            serviceManager.m().d(80);
        } catch (NullPointerException e) {
            C1044Mm.e(TAG, "spy-32532: npe fetchNonMemberVideos ", e);
        }
    }

    private static void sendLocalBroadcast(Context context, String str) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(str));
    }

    private dlN createPartnerVideo(C4935bpK c4935bpK, String str) {
        dlN dln = new dlN();
        dln.a = C8438dlp.b(C8438dlp.e(c4935bpK), SFINDER_RECOMMENDATION, str);
        dln.g = C8438dlp.a(c4935bpK);
        dln.e = c4935bpK.d;
        if (c4935bpK.b) {
            dln.d = 1;
            dln.c = C8004dcG.e.a(c4935bpK.l, c4935bpK.n, null);
            dln.b = C8438dlp.a(c4935bpK.j, SFINDER_RECOMMENDATION, str);
        }
        return dln;
    }
}
