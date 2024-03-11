package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.ViewModelProvider;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BasePlayErrorStatus;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipChoicesResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.MembershipProductChoice;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.ui.offline.OfflineAdapterData;
import com.netflix.mediaclient.ui.offline.StorageSwitchHelper;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.PlayContext;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import o.AbstractC7480cwx;
import o.C7350cuZ;
import o.C7403cvZ;
import o.C9834xU;
import o.cQQ;
import org.json.JSONObject;

/* renamed from: o.ctt  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7317ctt extends NetflixDialogFrag {
    private static C7403cvZ.d i = new C7403cvZ.d(null, 0);
    protected String d;
    private DownloadState g;
    private C7403cvZ h;
    private String j;
    private InterfaceC4208baF l;
    private String m;
    private String p;
    private PlayContext q;
    private StopReason r;
    private VideoType u;
    private WatchState v;
    private Long w;
    private boolean t = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13772o = false;
    private String n = "";
    protected int a = InterfaceC1078Nw.aJ.c().getValue();
    private final DialogInterface.OnClickListener y = new DialogInterface.OnClickListener() { // from class: o.ctt.1
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NetflixActivity netflixActivity = C7317ctt.this.getNetflixActivity();
            if (!C8054ddD.l(netflixActivity)) {
                if (ConnectivityUtils.l(netflixActivity)) {
                    InterfaceC4208baF f = C7317ctt.this.f();
                    if (f != null) {
                        f.a(C7317ctt.this.n(), C7317ctt.this.m(), C7317ctt.this.i());
                    }
                } else {
                    C8054ddD.c(C7317ctt.this.getContext(), com.netflix.mediaclient.ui.R.o.ir, 0);
                }
            }
            dialogInterface.dismiss();
        }
    };
    protected final DialogInterface.OnClickListener c = new DialogInterface.OnClickListener() { // from class: o.ctt.3
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            InterfaceC4208baF f = C7317ctt.this.f();
            if (f != null) {
                f.d(C7317ctt.this.n());
                DownloadButton.c(C7317ctt.this.n());
            } else {
                C1044Mm.a("offlineErrorDialog", "deleteAction offlineAgent is null");
            }
            dialogInterface.dismiss();
        }
    };
    protected final DialogInterface.OnClickListener b = new DialogInterface.OnClickListener() { // from class: o.ctt.4
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    };
    protected final DialogInterface.OnClickListener e = new DialogInterface.OnClickListener() { // from class: o.ctt.2
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NetflixActivity netflixActivity = C7317ctt.this.getNetflixActivity();
            if (!C8054ddD.l(netflixActivity)) {
                if (ConnectivityUtils.l(netflixActivity)) {
                    InterfaceC4208baF f = C7317ctt.this.f();
                    if (f != null) {
                        f.h(C7317ctt.this.n());
                    } else {
                        C1044Mm.a("offlineErrorDialog", "downloadResumeAction offlineAgent is null");
                    }
                } else {
                    C8054ddD.c(C7317ctt.this.getContext(), com.netflix.mediaclient.ui.R.o.ir, 0);
                }
            }
            dialogInterface.dismiss();
        }
    };
    private final DialogInterface.OnClickListener f = new DialogInterface.OnClickListener() { // from class: o.ctt.6
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NetflixActivity netflixActivity = C7317ctt.this.getNetflixActivity();
            if (!C8054ddD.l(netflixActivity)) {
                if (ConnectivityUtils.l(netflixActivity)) {
                    InterfaceC4208baF f = C7317ctt.this.f();
                    if (f != null) {
                        f.e(C7317ctt.this.n(), C7317ctt.this.m(), C7317ctt.this.i());
                    }
                } else {
                    C8054ddD.c(C7317ctt.this.getContext(), com.netflix.mediaclient.ui.R.o.ir, 0);
                }
            }
            dialogInterface.dismiss();
        }
    };
    private final DialogInterface.OnClickListener k = new DialogInterface.OnClickListener() { // from class: o.ctt.8
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NetflixActivity netflixActivity = C7317ctt.this.getNetflixActivity();
            if (!C8054ddD.l(netflixActivity)) {
                netflixActivity.startActivity(OfflineActivityV2.b(C7317ctt.this.getNetflixActivity()));
            }
            dialogInterface.dismiss();
        }
    };
    private final DialogInterface.OnClickListener s = new DialogInterface.OnClickListener() { // from class: o.ctt.10
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            NetflixActivity netflixActivity = C7317ctt.this.getNetflixActivity();
            if (C8054ddD.l(netflixActivity)) {
                return;
            }
            if (C7317ctt.this.w != null) {
                Logger.INSTANCE.endSession(C7317ctt.this.w);
                C7317ctt.this.w = null;
            }
            C7317ctt.this.dismissAllowingStateLoss();
            netflixActivity.getSupportFragmentManager().executePendingTransactions();
            JSONObject a = C7317ctt.this.a(netflixActivity);
            if (a != null) {
                AbstractC7480cwx a2 = C7317ctt.a(a, C7317ctt.this.i());
                a2.onManagerReady(C7317ctt.this.getServiceManager(), InterfaceC1078Nw.aJ);
                a2.setCancelable(true);
                netflixActivity.showDialog(a2);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public VideoType m() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n() {
        return this.p;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.AbstractC1083Oa, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.h = new C7403cvZ(context.getApplicationContext());
    }

    public static AbstractC7480cwx a(JSONObject jSONObject, PlayContext playContext) {
        C7467cwk c7467cwk = new C7467cwk();
        c7467cwk.setStyle(2, 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("play_context", playContext);
        MembershipChoicesResponse membershipChoicesResponse = (MembershipChoicesResponse) C8118deO.a().fromJson(jSONObject.toString(), (Class<Object>) MembershipChoicesResponse.class);
        if (membershipChoicesResponse != null && !membershipChoicesResponse.isFallback()) {
            bundle.putParcelableArrayList("choices", new ArrayList<>(membershipChoicesResponse.getChoices()));
            bundle.putParcelable("bundleInfo", membershipChoicesResponse.getBundleInfo());
        }
        c7467cwk.setArguments(bundle);
        return c7467cwk;
    }

    static C7317ctt d(VideoType videoType, InterfaceC5206buQ interfaceC5206buQ, InterfaceC4208baF interfaceC4208baF) {
        return e(videoType, interfaceC5206buQ, interfaceC4208baF, interfaceC5206buQ.aA_());
    }

    private static C7317ctt e(VideoType videoType, InterfaceC5206buQ interfaceC5206buQ, InterfaceC4208baF interfaceC4208baF, Status status) {
        C7317ctt c7317ctt = new C7317ctt();
        Bundle bundle = new Bundle();
        bundle.putString("playableId", interfaceC5206buQ.aH_());
        bundle.putString("videoType", videoType.toString());
        bundle.putInt("watchState", interfaceC5206buQ.C().a());
        bundle.putInt("downloadState", interfaceC5206buQ.au_().b());
        bundle.putString("oxid", interfaceC5206buQ.y());
        bundle.putString("dxid", interfaceC5206buQ.t());
        bundle.putBundle("status_bundle", d(status));
        StopReason aM_ = interfaceC5206buQ.aM_();
        if (aM_ == null) {
            aM_ = StopReason.Unknown;
        }
        bundle.putInt("stopReason", aM_.e());
        bundle.putBoolean("hasNetflixDownloadedData", c(interfaceC4208baF));
        bundle.putBoolean("requiresWiFiConnection", interfaceC4208baF.o());
        c7317ctt.setArguments(bundle);
        return c7317ctt;
    }

    private static Bundle d(Status status) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("status_is_error_or_warning", status.f());
        bundle.putBoolean("status_show_message", status.k());
        bundle.putString("status_displayable_message", status.l());
        bundle.putInt("status_code_int_value", status.c().getValue());
        if (status instanceof BasePlayErrorStatus) {
            bundle.putString("raw_error_status_code", ((BasePlayErrorStatus) status).o());
        }
        return bundle;
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            this.t = bundle.getBoolean("status_is_error_or_warning", false);
            this.f13772o = bundle.getBoolean("status_show_message", false);
            this.n = bundle.getString("status_displayable_message", "");
            this.a = bundle.getInt("status_code_int_value", InterfaceC1078Nw.aJ.c().getValue());
            this.d = bundle.getString("raw_error_status_code", null);
            return;
        }
        this.t = false;
        this.f13772o = false;
        this.n = "";
        this.a = InterfaceC1078Nw.aJ.c().getValue();
        this.d = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165 A[PHI: r4 
      PHI: (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v6 java.lang.String), (r4v9 java.lang.String), (r4v3 java.lang.String) binds: [B:10:0x0080, B:33:0x0119, B:29:0x00f2, B:11:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166 A[FALL_THROUGH, PHI: r3 r4 
      PHI: (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v0 boolean), (r3v0 boolean) binds: [B:10:0x0080, B:44:0x0165, B:33:0x0119, B:13:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String), (r4v6 java.lang.String), (r4v9 java.lang.String) binds: [B:10:0x0080, B:44:0x0165, B:33:0x0119, B:13:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166 A[PHI: r3 r4 
      PHI: (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v0 boolean), (r3v0 boolean) binds: [B:10:0x0080, B:44:0x0165, B:33:0x0119, B:13:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String), (r4v6 java.lang.String), (r4v9 java.lang.String) binds: [B:10:0x0080, B:44:0x0165, B:33:0x0119, B:13:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7317ctt.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    /* renamed from: o.ctt$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[DownloadState.values().length];
            a = iArr;
            try {
                iArr[DownloadState.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DownloadState.Creating.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DownloadState.InProgress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[DownloadState.Stopped.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[DownloadState.Complete.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[DownloadState.Deleted.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[DownloadState.DeleteComplete.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[DownloadState.CreateFailed.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[WatchState.values().length];
            b = iArr2;
            try {
                iArr2[WatchState.NOT_WATCHABLE_DUE_TO_NOT_ENOUGH_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WatchState.WATCHING_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WatchState.LICENSE_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WatchState.PLAY_WINDOW_EXPIRED_BUT_RENEWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WatchState.PLAY_WINDOW_EXPIRED_FINAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WatchState.VIEW_WINDOW_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WatchState.GEO_BLOCKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[StopReason.values().length];
            d = iArr3;
            try {
                iArr3[StopReason.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                d[StopReason.WaitingToBeStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                d[StopReason.NetworkError.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                d[StopReason.StorageError.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                d[StopReason.NotEnoughSpace.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                d[StopReason.StoppedFromAgentAPI.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                d[StopReason.NotAllowedOnCurrentNetwork.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                d[StopReason.NoNetworkConnectivity.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                d[StopReason.PlayerStreaming.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                d[StopReason.AccountInActive.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                d[StopReason.EncodesAreNotAvailableAnyMore.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                d[StopReason.ManifestError.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                d[StopReason.GeoCheckError.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                d[StopReason.DownloadLimitRequiresManualResume.ordinal()] = 14;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                d[StopReason.EncodesRevoked.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    private void k() {
        NetflixActivity netflixActivity = getNetflixActivity();
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        netflixActivity.requestDownloadButtonRefresh(n());
    }

    private static boolean c(InterfaceC4208baF interfaceC4208baF) {
        InterfaceC7281ctJ a = C7353cuc.a();
        long j = 0;
        for (int i2 = 0; i2 < a.c(); i2++) {
            OfflineAdapterData.ViewType viewType = a.c(i2).a().b;
            if (viewType == OfflineAdapterData.ViewType.SHOW || viewType == OfflineAdapterData.ViewType.MOVIE) {
                j += a.b(i2);
            }
        }
        return j > 50000000;
    }

    private Dialog a() {
        C1044Mm.a("offlineErrorDialog", "createLicenseExpiredDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        builder.setTitle(com.netflix.mediaclient.ui.R.o.ij);
        builder.setNegativeButton(e(), this.c);
        if (ConnectivityUtils.l(getNetflixActivity())) {
            builder.setMessage(com.netflix.mediaclient.ui.R.o.il);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.hW, new DialogInterface.OnClickListener() { // from class: o.ctt.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    InterfaceC4208baF f = C7317ctt.this.f();
                    if (f != null) {
                        f.c(C7317ctt.this.n());
                    }
                    dialogInterface.dismiss();
                }
            });
        } else {
            builder.setMessage(com.netflix.mediaclient.ui.R.o.ih);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.hS, this.b);
        }
        return builder.create();
    }

    protected Dialog c(String str, boolean z, boolean z2) {
        AlertDialog.Builder a = a(str);
        if (z) {
            a.setNegativeButton(e(), this.c);
        }
        if (z2) {
            a.setPositiveButton(com.netflix.mediaclient.ui.R.o.hV, this.e);
        }
        a.setNeutralButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.b);
        return a.create();
    }

    protected AlertDialog d(boolean z) {
        String string;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        if (this.a == StatusCode.DL_NOT_ENOUGH_FREE_SPACE.getValue()) {
            return c(z);
        }
        if (this.f13772o) {
            string = this.n;
        } else {
            String e = C8181dfY.e(C8181dfY.b(this.a));
            int i2 = com.netflix.mediaclient.ui.R.o.f31if;
            if (StatusCode.isNetworkError(this.a)) {
                i2 = com.netflix.mediaclient.ui.R.o.ik;
            }
            string = getNetflixActivity().getString(i2, e);
        }
        builder.setMessage(string);
        if (this.a == StatusCode.DL_LIMIT_CANT_DOWNLOAD_TILL_DATE.getValue()) {
            builder.setTitle(com.netflix.mediaclient.ui.R.o.id).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.c);
        } else if (this.a == StatusCode.DL_LIMIT_TOO_MANY_DOWNLOADED_DELETE_SOME.getValue()) {
            builder.setTitle(com.netflix.mediaclient.ui.R.o.id).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.b);
            if (o()) {
                builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.hT, this.k);
            }
        } else if (this.a == StatusCode.DL_MONTHLY_DOWNLOAD_LIMIT.getValue()) {
            builder.setPositiveButton(e(), this.c).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ctu
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7317ctt.this.d(dialogInterface);
                }
            });
        } else if (this.a == StatusCode.DL_LIMIT_TOO_MANY_DEVICES_PLAN_OPTION.getValue()) {
            JSONObject a = a(getNetflixActivity());
            if (a != null) {
                MembershipChoicesResponse membershipChoicesResponse = (MembershipChoicesResponse) C8118deO.a().fromJson(a.toString(), (Class<Object>) MembershipChoicesResponse.class);
                AbstractC7480cwx.a aVar = AbstractC7480cwx.c;
                MembershipProductChoice b = aVar.b(membershipChoicesResponse.getChoices());
                if (b != null) {
                    builder.setMessage(getResources().getString(com.netflix.mediaclient.ui.R.o.hX, b.getAdditionalAmountOverCurrentFormatted()));
                    d(builder);
                }
                this.w = Logger.INSTANCE.startSession(new Presentation(AppView.planUpgradeGate, aVar.c(this.q, "DownloadLimitUpgrade", aVar.d(membershipChoicesResponse.getChoices()))));
            }
            builder.setTitle(com.netflix.mediaclient.ui.R.o.ic).setNegativeButton(com.netflix.mediaclient.ui.R.o.hV, this.f).setNeutralButton(e(), this.c).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ctw
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C7317ctt.this.c(dialogInterface);
                }
            });
        } else if (this.a == StatusCode.DL_WARNING_DL_N_TIMES_BEFORE_DATE.getValue()) {
            builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, this.c).setPositiveButton(C7350cuZ.a.a, this.e);
        } else if (this.a == StatusCode.DL_ENCODES_DELETE_ON_REVOCATION.getValue()) {
            builder.setTitle(com.netflix.mediaclient.ui.R.o.in).setMessage(com.netflix.mediaclient.ui.R.o.ii);
            builder.setPositiveButton(e(), this.c);
            builder.setNegativeButton(getString(com.netflix.mediaclient.ui.R.o.hN), this.f);
        } else if (this.a == StatusCode.DL_TOTAL_LICENSE_PER_DEVICE_LIMIT.getValue()) {
            builder.setTitle(com.netflix.mediaclient.ui.R.o.id).setMessage(com.netflix.mediaclient.ui.R.o.ix);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.c);
            builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.hT, this.k);
        } else {
            builder.setTitle(com.netflix.mediaclient.ui.R.o.ie).setMessage(string);
            builder.setNegativeButton(e(), this.c).setPositiveButton(com.netflix.mediaclient.ui.R.o.hV, this.f);
        }
        AlertDialog create = builder.create();
        if (this.h.b(this.d)) {
            C7403cvZ.b b2 = this.h.b(requireNetflixActivity(), this.d, i.e());
            create.setTitle(b2.a());
            create.setMessage(b2.e());
        }
        if (this.a == StatusCode.DL_WARNING_DL_N_TIMES_BEFORE_DATE.getValue()) {
            create.setTitle(com.netflix.mediaclient.ui.R.o.aQ);
        }
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(DialogInterface dialogInterface) {
        Long l = this.w;
        if (l != null) {
            Logger.INSTANCE.cancelSession(l);
            this.w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface) {
        Long l = this.w;
        if (l != null) {
            Logger.INSTANCE.cancelSession(l);
            this.w = null;
        }
    }

    public void d(AlertDialog.Builder builder) {
        getServiceManager();
        if (BrowseExperience.a() || C8153dex.e((Context) C1332Xp.b(Context.class))) {
            return;
        }
        builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.hZ, this.s);
    }

    private AlertDialog g() {
        C1044Mm.a("offlineErrorDialog", "createPlayWindowExpiredButRenewableDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        builder.setTitle(com.netflix.mediaclient.ui.R.o.ij);
        builder.setNegativeButton(e(), this.c);
        if (ConnectivityUtils.l(getNetflixActivity())) {
            builder.setMessage(com.netflix.mediaclient.ui.R.o.il);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.hW, new DialogInterface.OnClickListener() { // from class: o.ctt.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    InterfaceC4208baF f = C7317ctt.this.f();
                    if (f != null) {
                        f.a(C7317ctt.this.n());
                    } else {
                        C1044Mm.a("offlineErrorDialog", "createPlayWindowExpiredButRenewableDialog no offlineAgent");
                    }
                    dialogInterface.dismiss();
                }
            });
        } else {
            builder.setMessage(com.netflix.mediaclient.ui.R.o.ih);
            builder.setPositiveButton(com.netflix.mediaclient.ui.R.o.hS, this.b);
        }
        return builder.create();
    }

    private AlertDialog j() {
        C1044Mm.a("offlineErrorDialog", "createPlayWindowFinalExpiredDialog");
        C7316cts.a(getNetflixActivity(), n(), this.m, this.j, WatchState.PLAY_WINDOW_EXPIRED_FINAL);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        builder.setTitle(com.netflix.mediaclient.ui.R.o.ij).setMessage(com.netflix.mediaclient.ui.R.o.ii).setPositiveButton(e(), this.c);
        return builder.create();
    }

    protected AlertDialog b() {
        C1044Mm.a("offlineErrorDialog", "createGeoNotPlayableDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        builder.setTitle(com.netflix.mediaclient.ui.R.o.aR).setMessage(com.netflix.mediaclient.ui.R.o.aI).setNegativeButton(e(), this.c).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.b);
        return builder.create();
    }

    private AlertDialog c(boolean z) {
        StorageSwitchHelper.StorageSwitchOption b;
        InterfaceC4208baF f = f();
        if (this.g != DownloadState.CreateFailed || f == null || (b = StorageSwitchHelper.b(f, n())) == StorageSwitchHelper.StorageSwitchOption.CAN_NOT_SWITCH) {
            return b(z);
        }
        return e(b == StorageSwitchHelper.StorageSwitchOption.SWITCH_TO_INTERNAL_STORAGE);
    }

    private AlertDialog e(boolean z) {
        String string;
        String string2;
        if (z) {
            string = getNetflixActivity().getString(com.netflix.mediaclient.ui.R.o.ip);
        } else {
            string = getNetflixActivity().getString(com.netflix.mediaclient.ui.R.o.iF);
        }
        if (z) {
            string2 = getNetflixActivity().getString(com.netflix.mediaclient.ui.R.o.iF);
        } else {
            string2 = getNetflixActivity().getString(com.netflix.mediaclient.ui.R.o.ip);
        }
        AlertDialog.Builder title = new AlertDialog.Builder(getNetflixActivity(), C9834xU.o.c).setTitle(com.netflix.mediaclient.ui.R.o.is);
        title.setMessage(Html.fromHtml(getNetflixActivity().getResources().getString(com.netflix.mediaclient.ui.R.o.iL, string2, string))).setPositiveButton(com.netflix.mediaclient.ui.R.o.cL, this.c).setNegativeButton(com.netflix.mediaclient.ui.R.o.gy, this.y);
        return title.create();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.appcompat.app.AlertDialog b(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "offlineErrorDialog"
            java.lang.String r1 = "createNotEnoughSpaceDialog"
            o.C1044Mm.a(r0, r1)
            boolean r0 = r4.o()
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            com.netflix.mediaclient.android.activity.NetflixActivity r2 = r4.getNetflixActivity()
            int r3 = o.C9834xU.o.c
            r1.<init>(r2, r3)
            int r2 = com.netflix.mediaclient.ui.R.o.is
            androidx.appcompat.app.AlertDialog$Builder r1 = r1.setTitle(r2)
            if (r5 == 0) goto L2e
            int r5 = com.netflix.mediaclient.ui.R.o.iu
            r1.setMessage(r5)
            if (r0 == 0) goto L33
            int r5 = com.netflix.mediaclient.ui.R.o.hT
            android.content.DialogInterface$OnClickListener r2 = r4.k
            r1.setNegativeButton(r5, r2)
            r5 = 1
            goto L34
        L2e:
            int r5 = com.netflix.mediaclient.ui.R.o.it
            r1.setMessage(r5)
        L33:
            r5 = 0
        L34:
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r2 = r4.g
            com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState r3 = com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState.CreateFailed
            if (r2 != r3) goto L58
            int r2 = com.netflix.mediaclient.ui.R.o.f13253fi
            if (r0 == 0) goto L41
            android.content.DialogInterface$OnClickListener r0 = r4.c
            goto L43
        L41:
            android.content.DialogInterface$OnClickListener r0 = r4.b
        L43:
            r1.setPositiveButton(r2, r0)
            if (r5 == 0) goto L50
            int r5 = com.netflix.mediaclient.ui.R.o.hV
            android.content.DialogInterface$OnClickListener r0 = r4.f
            r1.setNeutralButton(r5, r0)
            goto L70
        L50:
            int r5 = com.netflix.mediaclient.ui.R.o.hV
            android.content.DialogInterface$OnClickListener r0 = r4.f
            r1.setNegativeButton(r5, r0)
            goto L70
        L58:
            int r0 = com.netflix.mediaclient.ui.R.o.f13253fi
            android.content.DialogInterface$OnClickListener r2 = r4.b
            r1.setPositiveButton(r0, r2)
            if (r5 == 0) goto L69
            int r5 = com.netflix.mediaclient.ui.R.o.hV
            android.content.DialogInterface$OnClickListener r0 = r4.e
            r1.setNeutralButton(r5, r0)
            goto L70
        L69:
            int r5 = com.netflix.mediaclient.ui.R.o.hV
            android.content.DialogInterface$OnClickListener r0 = r4.e
            r1.setNegativeButton(r5, r0)
        L70:
            androidx.appcompat.app.AlertDialog r5 = r1.create()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7317ctt.b(boolean):androidx.appcompat.app.AlertDialog");
    }

    private boolean o() {
        return !(getNetflixActivity() instanceof OfflineActivityV2);
    }

    private Dialog h() {
        C1044Mm.a("offlineErrorDialog", "createViewWindowExpiredDialog");
        C7316cts.a(getNetflixActivity(), n(), this.m, this.j, WatchState.VIEW_WINDOW_EXPIRED);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        builder.setMessage(com.netflix.mediaclient.ui.R.o.iq).setPositiveButton(e(), this.c);
        return builder.create();
    }

    protected Dialog d() {
        return a((String) null).setNegativeButton(com.netflix.mediaclient.ui.R.o.f13253fi, this.b).create();
    }

    protected int e() {
        return this.g == DownloadState.Complete ? com.netflix.mediaclient.ui.R.o.hP : com.netflix.mediaclient.ui.R.o.hK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlayContext i() {
        if (this.q == null) {
            if (getNetflixActivity() instanceof bDG) {
                this.q = ((bDG) getNetflixActivity()).y_();
            }
            if (this.q == null) {
                this.q = new EmptyPlayContext("offlineErrorDialog", -520);
            }
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC4208baF f() {
        ServiceManager serviceManager;
        if (this.l == null && (serviceManager = getServiceManager()) != null) {
            this.l = serviceManager.t();
        }
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(NetflixActivity netflixActivity) {
        InterfaceC5206buQ c;
        if (NetflixActivity.getOfflineAgentOrNull(netflixActivity) == null || (c = C7353cuc.a().c(this.p)) == null) {
            return null;
        }
        Status aA_ = c.aA_();
        if (aA_ instanceof BasePlayErrorStatus) {
            return ((BasePlayErrorStatus) aA_).s();
        }
        return null;
    }

    public static void c(final NetflixActivity netflixActivity, final VideoType videoType, final InterfaceC5206buQ interfaceC5206buQ, final InterfaceC4208baF interfaceC4208baF) {
        UserAgent c = C8126deW.c(netflixActivity);
        if (!i.a() && c != null) {
            ((SingleSubscribeProxy) new cQQ().a(C8051ddA.e(C7403cvZ.d.d())).as(AutoDispose.b(AndroidLifecycleScopeProvider.c(netflixActivity)))).a(new Consumer() { // from class: o.ctx
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7317ctt.c(r1, netflixActivity, videoType, interfaceC5206buQ, interfaceC4208baF, (cQQ.d) obj);
                }
            });
        } else {
            netflixActivity.showOfflineErrorDialog(d(videoType, interfaceC5206buQ, interfaceC4208baF));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(long j, NetflixActivity netflixActivity, VideoType videoType, InterfaceC5206buQ interfaceC5206buQ, InterfaceC4208baF interfaceC4208baF, cQQ.d dVar) {
        i = new C7403cvZ.d(dVar.b(), j);
        netflixActivity.showOfflineErrorDialog(d(videoType, interfaceC5206buQ, interfaceC4208baF));
    }

    private AlertDialog.Builder a(String str) {
        C7403cvZ.b b = this.h.b(requireNetflixActivity(), str, i.e());
        return new AlertDialog.Builder(requireNetflixActivity(), C9834xU.o.c).setTitle(b.a()).setMessage(b.e());
    }
}
