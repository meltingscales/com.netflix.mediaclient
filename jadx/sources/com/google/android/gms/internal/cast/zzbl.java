package com.google.android.gms.internal.cast;

import android.content.Context;
import android.util.Base64;
import android.widget.ImageView;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class zzbl extends UIController {
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$76 = 24;
    private final ImageView zza;
    private final String zzb;
    private final String zzc;
    private final Context zzd;
    private Cast.Listener zze;

    public zzbl(ImageView imageView, Context context) {
        this.zza = imageView;
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        String string = applicationContext.getString(R.string.cast_mute);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            d(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i = 2 % 2;
        }
        this.zzb = string;
        String string2 = applicationContext.getString(R.string.cast_unmute);
        if (string2.startsWith("'!#+")) {
            int i2 = c + 35;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                d(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
                int i3 = 23 / 0;
            } else {
                Object[] objArr3 = new Object[1];
                d(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            int i4 = 2 % 2;
        }
        this.zzc = string2;
        imageView.setEnabled(false);
        this.zze = null;
        int i5 = b + 5;
        c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        if (this.zze == null) {
            this.zze = new zzbk(this);
        }
        castSession.addCastListener(this.zze);
        super.onSessionConnected(castSession);
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        Cast.Listener listener;
        this.zza.setEnabled(false);
        CastSession currentCastSession = CastContext.getSharedInstance(this.zzd).getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && (listener = this.zze) != null) {
            currentCastSession.removeCastListener(listener);
        }
        super.onSessionEnded();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        CastSession currentCastSession = CastContext.getSharedInstance(this.zzd).getSessionManager().getCurrentCastSession();
        if (currentCastSession == null || !currentCastSession.isConnected()) {
            this.zza.setEnabled(false);
            return;
        }
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession()) {
            this.zza.setEnabled(false);
        } else {
            this.zza.setEnabled(true);
        }
        boolean isMute = currentCastSession.isMute();
        this.zza.setSelected(isMute);
        this.zza.setContentDescription(isMute ? this.zzc : this.zzb);
    }

    private static void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$76);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
