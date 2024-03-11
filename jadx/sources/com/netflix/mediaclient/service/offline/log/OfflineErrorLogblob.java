package com.netflix.mediaclient.service.offline.log;

import android.os.Environment;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.job.NetflixJob;
import com.netflix.mediaclient.service.logging.logblob.LogBlobType;
import com.netflix.mediaclient.service.offline.agent.OfflineUnavailableReason;
import com.netflix.mediaclient.service.webclient.model.leafs.SignInData;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import com.netflix.mediaclient.servicemgr.LogArguments;
import com.netflix.mediaclient.servicemgr.Logblob;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.io.File;
import o.AbstractC1974aVe;
import o.C1044Mm;
import o.C8128deY;
import o.C8168dfL;
import o.C8181dfY;
import o.InterfaceC4297bbp;
import o.InterfaceC5090bsG;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class OfflineErrorLogblob extends AbstractC1974aVe {
    private final boolean b;

    @Override // o.AbstractC5119bsj, com.netflix.mediaclient.servicemgr.Logblob
    public boolean e() {
        return this.b;
    }

    @Override // o.AbstractC5119bsj
    public Logblob.Severity j() {
        return this.f;
    }

    /* loaded from: classes3.dex */
    public enum ErrorCategory {
        License("license"),
        LicenseRefresh("licenseRefresh"),
        LicenseDelete("licenseDelete"),
        Manifest("manifest"),
        Network("network"),
        Account("account"),
        Client(SignInData.FLOW_CLIENT),
        Info(UmaAlert.ICON_INFO),
        Storage("storage");
        
        private final String m;

        public String b() {
            return this.m;
        }

        ErrorCategory(String str) {
            this.m = str;
        }

        public static ErrorCategory d(Status status, ErrorCategory errorCategory) {
            Status.ErrorGroup d = status.d();
            return (d == Status.ErrorGroup.DrmError || d == Status.ErrorGroup.MslError) ? Client : (d == Status.ErrorGroup.NetworkError || status.g()) ? Network : errorCategory;
        }
    }

    private OfflineErrorLogblob(Logblob.Severity severity, String str, String str2, String str3, String str4, String str5, String str6, boolean z, ErrorCategory errorCategory) {
        super(str2, str3);
        this.f = severity;
        this.i.put("level", LogArguments.LogLevel.ERROR.d());
        if (C8168dfL.h(str)) {
            this.i.put("mid", str);
        }
        if (C8168dfL.h(str6)) {
            this.i.put("errormsg", str6);
        }
        if (C8168dfL.h(str5)) {
            this.i.put("errorcode", str5);
        }
        if (C8168dfL.h(str4)) {
            this.i.put("downloadrequesttype", str4);
        }
        this.i.put("errorsubcategory", errorCategory.b());
        this.b = z;
    }

    private OfflineErrorLogblob(Logblob.Severity severity, InterfaceC4297bbp interfaceC4297bbp, String str, String str2, boolean z, ErrorCategory errorCategory) {
        this(severity, interfaceC4297bbp.h(), interfaceC4297bbp.i(), interfaceC4297bbp.g(), interfaceC4297bbp.f(), str, str2, z, errorCategory);
    }

    private OfflineErrorLogblob(Logblob.Severity severity, String str, String str2, String str3, String str4, String str5, boolean z) {
        this(severity, str, str2, str3, null, str4, str5, z, ErrorCategory.Info);
    }

    @Override // com.netflix.mediaclient.servicemgr.Logblob
    public String a() {
        return LogBlobType.OFFLINE_LOGBLOB_TYPE.a();
    }

    private void a(String str) {
        if (C8168dfL.h(str)) {
            try {
                this.i.put("dbgmsg", str);
            } catch (JSONException e) {
                C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
            }
        }
    }

    private void a(long j) {
        try {
            this.i.put("freespace", j);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        }
    }

    public static void a(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, Status status, ErrorCategory errorCategory) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            String a = C8128deY.a(status);
            String d = C8128deY.d(status);
            Logblob.Severity severity = Logblob.Severity.error;
            if (status.c() == StatusCode.DRM_FAILURE_CDM_NO_LICENSE_RELEASE_ACK) {
                severity = Logblob.Severity.info;
            }
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(severity, interfaceC4297bbp, a, d, true, errorCategory);
            offlineErrorLogblob.a(status.b());
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, StopReason stopReason, String str) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            Logblob.Severity severity = Logblob.Severity.error;
            ErrorCategory errorCategory = ErrorCategory.Info;
            boolean z = true;
            switch (AnonymousClass3.e[stopReason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                    z = false;
                    break;
                case 4:
                    errorCategory = ErrorCategory.Manifest;
                    break;
                case 8:
                    errorCategory = ErrorCategory.Storage;
                    break;
                case 9:
                    severity = Logblob.Severity.warn;
                    errorCategory = ErrorCategory.Storage;
                    break;
                case 10:
                    severity = Logblob.Severity.info;
                    break;
                case 11:
                case 12:
                    errorCategory = ErrorCategory.Account;
                    break;
                case 13:
                    errorCategory = ErrorCategory.License;
                    break;
                case 14:
                    errorCategory = ErrorCategory.License;
                    break;
                case 15:
                    severity = Logblob.Severity.info;
                    break;
                case 16:
                    severity = Logblob.Severity.info;
                    break;
                default:
                    C1044Mm.a("offlineErrorLogBlob", " onDownloadStopped stopReason: %s, no-op", stopReason);
                    z = false;
                    break;
            }
            Logblob.Severity severity2 = severity;
            ErrorCategory errorCategory2 = errorCategory;
            if (z) {
                OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(severity2, interfaceC4297bbp, C8181dfY.b(stopReason), "downloadStopError", true, errorCategory2);
                offlineErrorLogblob.a(str);
                interfaceC5090bsG.a(offlineErrorLogblob);
            }
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    /* renamed from: com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[StopReason.values().length];
            e = iArr;
            try {
                iArr[StopReason.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[StopReason.WaitingToBeStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[StopReason.NetworkError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[StopReason.ManifestError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[StopReason.NoNetworkConnectivity.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[StopReason.StoppedFromAgentAPI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[StopReason.NotAllowedOnCurrentNetwork.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[StopReason.StorageError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[StopReason.NotEnoughSpace.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[StopReason.PlayerStreaming.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                e[StopReason.AccountIneligible.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                e[StopReason.AccountInActive.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                e[StopReason.EncodesAreNotAvailableAnyMore.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                e[StopReason.GeoCheckError.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                e[StopReason.DownloadLimitRequiresManualResume.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                e[StopReason.EncodesRevoked.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static void a(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, Status status) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(Logblob.Severity.warn, interfaceC4297bbp, C8128deY.a(status), C8128deY.d(status), false, ErrorCategory.Storage);
            offlineErrorLogblob.a(status.b());
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void c(InterfaceC5090bsG interfaceC5090bsG, NetflixJob.NetflixJobId netflixJobId) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            Logblob.Severity severity = Logblob.Severity.info;
            interfaceC5090bsG.a(new OfflineErrorLogblob(severity, "-1", "-1", "-1", "" + netflixJobId.e(), "NetflixStartJob", false));
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void c(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, long j, String str, String str2) {
        boolean z;
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            z = Environment.isExternalStorageRemovable(new File(str));
        } catch (Exception unused) {
            z = false;
        }
        try {
            Logblob.Severity severity = Logblob.Severity.info;
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(severity, interfaceC4297bbp, "", "DlRequestStorageInfo removable=" + z, false, ErrorCategory.Info);
            offlineErrorLogblob.a(j);
            offlineErrorLogblob.a(str2);
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void e(InterfaceC5090bsG interfaceC5090bsG, OfflineUnavailableReason offlineUnavailableReason) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            Logblob.Severity severity = Logblob.Severity.info;
            interfaceC5090bsG.a(new OfflineErrorLogblob(severity, "-1", "-1", "-1", "" + offlineUnavailableReason.d(), "offline feature n/a", true));
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void b(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, String str) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(Logblob.Severity.info, interfaceC4297bbp, "manifestSaved", "", false, ErrorCategory.Info);
            offlineErrorLogblob.a(str);
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void e(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, String str) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(Logblob.Severity.info, interfaceC4297bbp, "manifestNotFound", "", false, ErrorCategory.Manifest);
            offlineErrorLogblob.a(str);
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void d(InterfaceC5090bsG interfaceC5090bsG, int i) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            Logblob.Severity severity = Logblob.Severity.info;
            interfaceC5090bsG.a(new OfflineErrorLogblob(severity, "-1", "-1", "-1", "storageAddedOrRemoved", "volumeCount=" + i, false));
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void c(InterfaceC5090bsG interfaceC5090bsG, String str, String str2) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(Logblob.Severity.info, str, "-1", "-1", "", "log", false);
            offlineErrorLogblob.a(str2);
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void a(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, String str) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(Logblob.Severity.info, interfaceC4297bbp, "", "log", false, ErrorCategory.Info);
            offlineErrorLogblob.a(str);
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }

    public static void c(InterfaceC5090bsG interfaceC5090bsG, InterfaceC4297bbp interfaceC4297bbp, Status status) {
        if (interfaceC5090bsG == null) {
            return;
        }
        try {
            String a = C8128deY.a(status);
            String d = C8128deY.d(status);
            Logblob.Severity severity = status.j() ? Logblob.Severity.info : Logblob.Severity.error;
            OfflineErrorLogblob offlineErrorLogblob = new OfflineErrorLogblob(severity, interfaceC4297bbp, "licenseReplace", a + " " + d, true, ErrorCategory.Info);
            offlineErrorLogblob.a(status.b());
            interfaceC5090bsG.a(offlineErrorLogblob);
        } catch (JSONException e) {
            C1044Mm.c("offlineErrorLogBlob", "JSONException:", e);
        } catch (Exception e2) {
            C1044Mm.c("offlineErrorLogBlob", "Exception:", e2);
        }
    }
}
