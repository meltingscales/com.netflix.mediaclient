package com.netflix.mediaclient.android.app;

import android.media.MediaDrmException;
import com.netflix.android.volley.AuthFailureError;
import com.netflix.android.volley.ServerError;
import com.netflix.android.volley.TimeoutError;
import com.netflix.android.volley.VolleyError;
import com.netflix.cl.model.Error;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.msl.MslErrorException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpRetryException;
import o.C1044Mm;
import org.chromium.net.CronetException;

/* loaded from: classes.dex */
public abstract class BaseStatus implements Status {
    private String c;
    protected Throwable d;
    public StatusCode e;

    public abstract Error a();

    @Override // com.netflix.mediaclient.android.app.Status
    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public StatusCode c() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public Throwable e() {
        return this.d;
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean j() {
        return this.e.isSucess();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean h() {
        return this.e.isWarning();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean i() {
        return this.e.isError();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean f() {
        return i() || h();
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public boolean g() {
        return StatusCode.isNetworkError(this.e.getValue());
    }

    public void c(VolleyError volleyError) {
        this.c = volleyError.a();
        this.d = volleyError.getCause();
    }

    public void b(Throwable th) {
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            this.c = stringWriter.toString();
            this.d = th;
        }
    }

    @Override // com.netflix.mediaclient.android.app.Status
    public Status.ErrorGroup d() {
        Throwable th = this.d;
        if (th != null) {
            return d(th, this, this.c);
        }
        return a(this);
    }

    private static Status.ErrorGroup d(Throwable th, Status status, String str) {
        C1044Mm.c("nf_baseStatus", "fromException status=%s", status);
        if ((th instanceof HttpRetryException) || (th instanceof AuthFailureError) || c(str) || (th instanceof ServerError)) {
            return Status.ErrorGroup.HttpError;
        }
        if ((th instanceof TimeoutError) || (th instanceof CronetException) || (th instanceof IOException) || e(str)) {
            return Status.ErrorGroup.NetworkError;
        }
        if ((th instanceof MslErrorException) || d(str)) {
            return Status.ErrorGroup.MslError;
        }
        if (th instanceof MediaDrmException) {
            return Status.ErrorGroup.DrmError;
        }
        return a(status);
    }

    private static Status.ErrorGroup a(Status status) {
        C1044Mm.c("nf_baseStatus", "fromStatusCode status=%s", status);
        if (status.c().isHttpError()) {
            return Status.ErrorGroup.HttpError;
        }
        if (status.c().isDrmError()) {
            return Status.ErrorGroup.DrmError;
        }
        if (status.c().isMslError()) {
            return Status.ErrorGroup.MslError;
        }
        if (status.g()) {
            return Status.ErrorGroup.NetworkError;
        }
        if (status.c().isManifestError()) {
            return Status.ErrorGroup.ManifestError;
        }
        return null;
    }

    private static boolean c(String str) {
        return str != null && str.contains("500 internal server error");
    }

    private static boolean e(String str) {
        return str != null && (str.contains("org.chromium.net.impl.NetworkExceptionImpl") || str.contains("com.netflix.mediaclient.service.msl.client.MslUrlHttpURLConnectionImpl"));
    }

    private static boolean d(String str) {
        return str != null && (str.contains("com.netflix.msl") || str.contains("AndroidMslClient"));
    }
}
