package com.netflix.partner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.partner.PSearchDataHandler;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.AbstractC5164btb;
import o.C1044Mm;
import o.C8151dev;
import o.C8166dfJ;
import o.C8168dfL;
import o.C8187dfe;
import o.C8432dlj;
import o.C8438dlp;
import o.C8447dly;
import o.InterfaceC5275bvg;
import o.InterfaceC5277bvi;
import o.InterfaceC5278bvj;
import o.InterfaceC8448dlz;
import o.InterfaceC9638uF;
import o.dlG;
import o.dlP;

/* loaded from: classes7.dex */
public class PSearchDataHandler implements InterfaceC8448dlz {
    static final String SFINDER = "sFinder";
    static final String TAG = "nf_partner_search_data";
    private Context mContext;
    private long mPartnerInputContextId;
    private Long mSearchActionId;
    private ServiceManager mServiceManager;
    private Handler mWorkHandler;

    public PSearchDataHandler(ServiceManager serviceManager, Handler handler, long j, Long l) {
        Objects.requireNonNull(serviceManager);
        this.mServiceManager = serviceManager;
        this.mContext = serviceManager.f();
        this.mPartnerInputContextId = j;
        this.mSearchActionId = l;
        this.mWorkHandler = handler;
    }

    @Override // o.InterfaceC8448dlz
    public void doSearch(String str, final int i, final InterfaceC8448dlz.d dVar) {
        final ArrayList arrayList = new ArrayList();
        if (!this.mServiceManager.u().v()) {
            C1044Mm.e(TAG, "user not logged in - skip search");
            endClWithError(StatusCode.USER_NOT_AUTHORIZED.toString());
            dlG dlg = dlG.b;
            sendSearchComplete(arrayList, -2, dVar);
            return;
        }
        AbstractC5164btb abstractC5164btb = new AbstractC5164btb() { // from class: com.netflix.partner.PSearchDataHandler.1
            @Override // o.AbstractC5164btb, o.InterfaceC5094bsK
            public void c(InterfaceC5275bvg interfaceC5275bvg, Status status, boolean z) {
                super.c(interfaceC5275bvg, status, z);
                if (!status.j()) {
                    PSearchDataHandler.this.endClWithError(status.c().toString());
                    PSearchDataHandler pSearchDataHandler = PSearchDataHandler.this;
                    pSearchDataHandler.sendSearchComplete(arrayList, pSearchDataHandler.getMappedError(status), dVar);
                    return;
                }
                C1044Mm.a(PSearchDataHandler.TAG, "onSearchResultsFetched res: %s, searchResults: %s", status, interfaceC5275bvg);
                PSearchDataHandler.this.downloadBitmapsToContinue(arrayList, interfaceC5275bvg, i, PSearchDataHandler.this.getTrackingString(interfaceC5275bvg.getVideosListTrackable()), dVar);
            }
        };
        C1044Mm.a(TAG, "doing search for: %s", str);
        this.mServiceManager.j().b(str, TaskMode.FROM_CACHE_OR_NETWORK, C8151dev.f(), abstractC5164btb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTrackingString(InterfaceC5277bvi interfaceC5277bvi) {
        if (interfaceC5277bvi == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (interfaceC5277bvi.getListType() != null) {
            sb.append("listType=");
            sb.append(interfaceC5277bvi.getListType());
            sb.append("&");
        }
        if (interfaceC5277bvi.getTrackId() > 0) {
            sb.append("trkid=");
            sb.append(interfaceC5277bvi.getTrackId());
            sb.append("&");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endClWithError(String str) {
        ExtLogger.INSTANCE.failedAction(this.mSearchActionId, CLv2Utils.a(new Error(str, null, null)));
        Logger.INSTANCE.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    private void endCl() {
        Logger logger = Logger.INSTANCE;
        logger.endSession(this.mSearchActionId);
        logger.removeContext(Long.valueOf(this.mPartnerInputContextId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSearchComplete(List<dlP> list, int i, InterfaceC8448dlz.d dVar) {
        dVar.d(i, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadBitmapsToContinue(List<dlP> list, InterfaceC5275bvg interfaceC5275bvg, int i, String str, InterfaceC8448dlz.d dVar) {
        C8432dlj c8432dlj = new C8432dlj(Math.min(interfaceC5275bvg.getNumResultsVideos(), i));
        for (int i2 = 0; i2 < c8432dlj.d(); i2++) {
            InterfaceC5278bvj interfaceC5278bvj = interfaceC5275bvg.getResultsVideos().get(i2);
            dlP createPartnerVideo = createPartnerVideo(interfaceC5278bvj, str);
            list.add(createPartnerVideo);
            downloadBitmapToContinue(list, interfaceC5278bvj.getBoxshotUrl(), interfaceC5278bvj.getTitle(), createPartnerVideo, i2, c8432dlj, dVar);
        }
    }

    @SuppressLint({"CheckResult"})
    private void downloadBitmapToContinue(final List<dlP> list, final String str, final String str2, final dlP dlp, final int i, final C8432dlj c8432dlj, final InterfaceC8448dlz.d dVar) {
        if (C8168dfL.g(str)) {
            C1044Mm.j(TAG, "box shot URL was empty");
            respondIfLimitReached(list, c8432dlj, dVar);
            return;
        }
        InterfaceC9638uF.a.d(this.mContext).b(GetImageRequest.e().a(str).a()).subscribe(new Consumer() { // from class: o.dlt
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PSearchDataHandler.this.lambda$downloadBitmapToContinue$0(list, str2, dlp, i, c8432dlj, dVar, (GetImageRequest.a) obj);
            }
        }, new Consumer() { // from class: o.dlA
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PSearchDataHandler.this.lambda$downloadBitmapToContinue$1(str, list, c8432dlj, dVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadBitmapToContinue$0(List list, String str, dlP dlp, int i, C8432dlj c8432dlj, InterfaceC8448dlz.d dVar, GetImageRequest.a aVar) {
        continueWithSharedUri(list, aVar.b(), str, dlp, i, c8432dlj, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadBitmapToContinue$1(String str, List list, C8432dlj c8432dlj, InterfaceC8448dlz.d dVar, Throwable th) {
        C1044Mm.j(TAG, "failed to download image %s, error: %s", str, th);
        respondIfLimitReached(list, c8432dlj, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void respondIfLimitReached(List<dlP> list, C8432dlj c8432dlj, InterfaceC8448dlz.d dVar) {
        if (c8432dlj.b(c8432dlj.c())) {
            C8166dfJ.d();
            C1044Mm.a(TAG, "getImageLocalUrl: sending %s results to partner", Integer.valueOf(list.size()));
            endCl();
            dlG dlg = dlG.b;
            sendSearchComplete(list, 0, dVar);
        }
    }

    private void continueWithSharedUri(final List<dlP> list, final Bitmap bitmap, String str, final dlP dlp, final int i, final C8432dlj c8432dlj, final InterfaceC8448dlz.d dVar) {
        this.mWorkHandler.post(new Runnable() { // from class: com.netflix.partner.PSearchDataHandler.5
            @Override // java.lang.Runnable
            public void run() {
                PSearchDataHandler pSearchDataHandler = PSearchDataHandler.this;
                pSearchDataHandler.storeBitmapToFileSystem(pSearchDataHandler.mContext, bitmap, i);
                PSearchDataHandler pSearchDataHandler2 = PSearchDataHandler.this;
                Uri imageUriFromProvider = pSearchDataHandler2.getImageUriFromProvider(pSearchDataHandler2.mContext, i);
                if (imageUriFromProvider != null) {
                    C8447dly.b(PSearchDataHandler.this.mContext, imageUriFromProvider);
                    dlp.a = imageUriFromProvider.toString();
                }
                C8187dfe.c(new Runnable() { // from class: com.netflix.partner.PSearchDataHandler.5.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        PSearchDataHandler.this.respondIfLimitReached(list, c8432dlj, dVar);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void storeBitmapToFileSystem(Context context, Bitmap bitmap, int i) {
        try {
            File file = new File(context.getCacheDir(), "partnerImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file + "/" + C8447dly.c(i));
            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            C1044Mm.e(TAG, "error storing bitmap ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getImageUriFromProvider(Context context, int i) {
        return C8447dly.e(context, C8447dly.d(context, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getMappedError(Status status) {
        if (status.j()) {
            dlG dlg = dlG.b;
            return 0;
        } else if (status.g()) {
            dlG dlg2 = dlG.b;
            return -3;
        } else {
            dlG dlg3 = dlG.b;
            return -4;
        }
    }

    private dlP createPartnerVideo(InterfaceC5278bvj interfaceC5278bvj, String str) {
        dlP dlp = new dlP();
        dlp.d = C8438dlp.b(interfaceC5278bvj.getId(), SFINDER, str);
        dlp.b = interfaceC5278bvj.getTitle();
        return dlp;
    }
}
