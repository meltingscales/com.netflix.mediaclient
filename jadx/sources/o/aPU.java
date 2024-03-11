package o;

import android.os.AsyncTask;
import com.netflix.mediaclient.drm.NetflixMediaDrm;

/* loaded from: classes3.dex */
public abstract class aPU extends AsyncTask<Void, Void, byte[]> {
    protected InterfaceC1836aQa c;
    protected NetflixMediaDrm.ProvisionRequest d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aPU(NetflixMediaDrm.ProvisionRequest provisionRequest, InterfaceC1836aQa interfaceC1836aQa) {
        this.d = provisionRequest;
        this.c = interfaceC1836aQa;
    }
}
