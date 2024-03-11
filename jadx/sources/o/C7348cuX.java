package o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.InterfaceC5206buQ;
import o.dpR;

/* renamed from: o.cuX  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7348cuX extends C7172crG {
    public static final c d = new c(null);
    public static final int e = 8;
    private final ViewGroup c;

    /* renamed from: o.cuX$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ActivityPageOfflineAgentListener_Ab18255");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7348cuX(ViewGroup viewGroup, boolean z) {
        super(viewGroup, z);
        C8632dsu.c((Object) viewGroup, "");
        this.c = viewGroup;
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(final InterfaceC5206buQ interfaceC5206buQ, final int i) {
        if (interfaceC5206buQ != null) {
            ViewGroup viewGroup = this.c;
            String aH_ = interfaceC5206buQ.aH_();
            View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + aH_);
            DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
            DownloadButton b = b();
            drM<DownloadButton, dpR> drm = new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.offline.VideoDetailsOfflineListener$onOfflinePlayableProgress$1$action$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DownloadButton downloadButton2) {
                    b(downloadButton2);
                    return dpR.c;
                }

                public final void b(DownloadButton downloadButton2) {
                    C8632dsu.c((Object) downloadButton2, "");
                    if (InterfaceC5206buQ.this.au_() == DownloadState.Complete) {
                        downloadButton2.e(DownloadButton.ButtonState.SAVED, InterfaceC5206buQ.this.aH_());
                        return;
                    }
                    downloadButton2.e(DownloadButton.ButtonState.DOWNLOADING, InterfaceC5206buQ.this.aH_());
                    downloadButton2.setProgress(i);
                }
            };
            if (downloadButton != null) {
                drm.invoke(downloadButton);
            }
            if (b != null) {
                drm.invoke(b);
            }
            e(false, true);
        }
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void a(final InterfaceC5206buQ interfaceC5206buQ) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        ViewGroup viewGroup = this.c;
        String aH_ = interfaceC5206buQ.aH_();
        View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + aH_);
        DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
        DownloadButton b = b();
        drM<DownloadButton, dpR> drm = new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.offline.VideoDetailsOfflineListener$onDownloadCompleted$action$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DownloadButton downloadButton2) {
                a(downloadButton2);
                return dpR.c;
            }

            public final void a(DownloadButton downloadButton2) {
                C8632dsu.c((Object) downloadButton2, "");
                downloadButton2.e(DownloadButton.ButtonState.SAVED, InterfaceC5206buQ.this.aH_());
            }
        };
        if (downloadButton != null) {
            drm.invoke(downloadButton);
        }
        if (b != null) {
            drm.invoke(b);
        }
        C7353cuc.c(this.c.getContext(), false);
        if (C7353cuc.e(interfaceC5206buQ.aH_()) == null) {
            return;
        }
        e(true, false);
    }

    private final DownloadButton b() {
        View findViewWithTag = this.c.findViewWithTag("SeasonDownloadButton");
        if (findViewWithTag instanceof SeasonDownloadButton) {
            return (SeasonDownloadButton) findViewWithTag;
        }
        return null;
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(final InterfaceC5206buQ interfaceC5206buQ, final StopReason stopReason) {
        C8632dsu.c((Object) interfaceC5206buQ, "");
        if (stopReason != null) {
            ViewGroup viewGroup = this.c;
            String aH_ = interfaceC5206buQ.aH_();
            View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + aH_);
            DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
            DownloadButton b = b();
            drM<DownloadButton, dpR> drm = new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.offline.VideoDetailsOfflineListener$onDownloadStopped$1$action$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DownloadButton downloadButton2) {
                    c(downloadButton2);
                    return dpR.c;
                }

                public final void c(DownloadButton downloadButton2) {
                    C8632dsu.c((Object) downloadButton2, "");
                    if (StopReason.this.a()) {
                        downloadButton2.e(DownloadButton.ButtonState.ERROR, interfaceC5206buQ.aH_());
                    } else if (StopReason.this != StopReason.WaitingToBeStarted) {
                        downloadButton2.e(DownloadButton.ButtonState.PAUSED, interfaceC5206buQ.aH_());
                    }
                }
            };
            if (downloadButton != null) {
                drm.invoke(downloadButton);
            }
            if (b != null) {
                drm.invoke(b);
            }
            C7353cuc.c(this.c.getContext(), false);
            e(true, true);
            C7310ctm c7310ctm = this.b;
            if (c7310ctm != null) {
                c7310ctm.i();
            }
            C7310ctm c7310ctm2 = this.b;
            if (c7310ctm2 != null) {
                c7310ctm2.m();
            }
        }
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(final String str, Status status, final boolean z) {
        if (str != null) {
            ViewGroup viewGroup = this.c;
            View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + str);
            DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
            DownloadButton b = b();
            drM<DownloadButton, dpR> drm = new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.offline.VideoDetailsOfflineListener$onOfflinePlayableDeleted$1$action$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(DownloadButton downloadButton2) {
                    d(downloadButton2);
                    return dpR.c;
                }

                public final void d(DownloadButton downloadButton2) {
                    DownloadButton.ButtonState buttonState;
                    C8632dsu.c((Object) downloadButton2, "");
                    if (z) {
                        buttonState = DownloadButton.ButtonState.QUEUED;
                    } else {
                        buttonState = DownloadButton.ButtonState.AVAILABLE;
                    }
                    downloadButton2.e(buttonState, str);
                    DownloadButton.c(str);
                }
            };
            if (downloadButton != null) {
                drm.invoke(downloadButton);
            }
            if (b != null) {
                drm.invoke(b);
            }
            if (z) {
                return;
            }
            e(true, false);
        }
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void c(List<String> list, Status status) {
        if (list != null) {
            for (String str : list) {
                C7172crG.a.remove(str);
                ViewGroup viewGroup = this.c;
                DownloadButton downloadButton = (DownloadButton) viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + str);
                if (downloadButton != null) {
                    C8632dsu.d(downloadButton);
                    downloadButton.e(DownloadButton.ButtonState.AVAILABLE, str);
                    DownloadButton.c(str);
                }
                ViewGroup viewGroup2 = this.c;
                DownloadButton downloadButton2 = (DownloadButton) viewGroup2.findViewWithTag("download_btn" + str);
                if (downloadButton2 != null) {
                    C8632dsu.d(downloadButton2);
                    downloadButton2.e(DownloadButton.ButtonState.AVAILABLE, str);
                    DownloadButton.c(str);
                }
            }
            e(true, false);
        }
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void d(Status status) {
        List<View> g;
        C7172crG.a.clear();
        C7353cuc.b(this.c.getContext());
        ArrayList<View> arrayList = new ArrayList<>();
        this.c.findViewsWithText(arrayList, "DownloadButtonForDetailsPage", 2);
        ArrayList<View> arrayList2 = new ArrayList<>();
        this.c.findViewsWithText(arrayList2, "download_btn", 2);
        DownloadButton.d();
        g = C8576dqs.g((Collection) arrayList, (Iterable) arrayList2);
        for (View view : g) {
            if (view instanceof DownloadButton) {
                DownloadButton downloadButton = (DownloadButton) view;
                downloadButton.e(DownloadButton.ButtonState.AVAILABLE, downloadButton.b());
            }
        }
        e(true, false);
    }

    @Override // o.C7172crG
    protected void d(final String str, final Status status) {
        C8632dsu.c((Object) str, "");
        ViewGroup viewGroup = this.c;
        View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + str);
        DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
        DownloadButton b = b();
        drM<DownloadButton, dpR> drm = new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.offline.VideoDetailsOfflineListener$handlePlayRightsRenewDone$action$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DownloadButton downloadButton2) {
                b(downloadButton2);
                return dpR.c;
            }

            public final void b(DownloadButton downloadButton2) {
                DownloadButton.ButtonState buttonState;
                C8632dsu.c((Object) downloadButton2, "");
                Status status2 = Status.this;
                if (status2 != null && status2.j()) {
                    buttonState = DownloadButton.ButtonState.SAVED;
                } else {
                    buttonState = DownloadButton.ButtonState.ERROR;
                }
                downloadButton2.e(buttonState, str);
                downloadButton2.setEnabled(true);
            }
        };
        if (downloadButton != null) {
            drm.invoke(downloadButton);
        }
        if (b != null) {
            drm.invoke(b);
        }
    }

    @Override // o.C7172crG, o.InterfaceC7216cry
    public void b(Activity activity, String str) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) str, "");
        ViewGroup viewGroup = this.c;
        View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + str);
        DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
        if (downloadButton != null) {
            downloadButton.b(str, activity);
        }
        DownloadButton b = b();
        if (b != null) {
            b.b(str, activity);
        }
    }

    @Override // o.C7172crG, o.AbstractC5166btd, o.InterfaceC4209baG
    public void b(String str, Status status) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) status, "");
        d.getLogTag();
        ViewGroup viewGroup = this.c;
        View findViewWithTag = viewGroup.findViewWithTag("DownloadButtonForDetailsPage" + str);
        DownloadButton downloadButton = findViewWithTag instanceof DownloadButton ? (DownloadButton) findViewWithTag : null;
        DownloadButton b = b();
        if (downloadButton != null) {
            downloadButton.e(status.j() ? DownloadButton.ButtonState.QUEUED : DownloadButton.ButtonState.ERROR, str);
            downloadButton.setEnabled(true);
        }
        if (b != null) {
            b.e(status.j() ? DownloadButton.ButtonState.QUEUED : DownloadButton.ButtonState.ERROR, str);
            b.setEnabled(true);
        }
        C7353cuc.c(this.c.getContext(), false);
        e(true, true);
        if (status.j()) {
            if (status.h()) {
                if (downloadButton != null) {
                    downloadButton.e(DownloadButton.ButtonState.ERROR, str);
                }
                if (b != null) {
                    b.e(DownloadButton.ButtonState.ERROR, str);
                    return;
                }
                return;
            }
            return;
        }
        d();
        if (downloadButton != null && status.c() == StatusCode.DL_NOT_ENOUGH_FREE_SPACE) {
            downloadButton.f();
        }
        if (b == null || status.c() != StatusCode.DL_NOT_ENOUGH_FREE_SPACE) {
            return;
        }
        b.f();
    }
}
