package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.util.PlatformVersion;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class zzbm extends UIController {
    private static int d = 0;
    private static int e = 1;
    private static byte e$ss2$911 = 24;
    private final ImageView zza;
    private final View zzb;
    private final boolean zzc;
    private final Drawable zzd;
    private final String zze;
    private final Drawable zzf;
    private final String zzg;
    private final Drawable zzh;
    private final String zzi;
    private boolean zzj = false;

    public zzbm(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.zza = imageView;
        this.zzd = drawable;
        this.zzf = drawable2;
        if (drawable3 != null) {
            int i = d + 1;
            e = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
            drawable2 = drawable3;
        }
        this.zzh = drawable2;
        this.zze = context.getString(R.string.cast_play);
        String string = context.getString(R.string.cast_pause);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        this.zzg = string;
        String string2 = context.getString(R.string.cast_stop);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            b(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i3 = d + 103;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 5;
            } else {
                int i5 = 2 % 2;
            }
        }
        this.zzi = string2;
        this.zzb = view;
        this.zzc = z;
        imageView.setEnabled(false);
        int i6 = e + 25;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void zza(Drawable drawable, String str) {
        boolean equals = drawable.equals(this.zza.getDrawable());
        this.zza.setImageDrawable(drawable);
        this.zza.setContentDescription(str);
        this.zza.setVisibility(0);
        this.zza.setEnabled(true);
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(8);
        }
        if ((!equals) && this.zzj) {
            this.zza.sendAccessibilityEvent(8);
        }
    }

    @TargetApi(21)
    private final void zzb(boolean z) {
        if (PlatformVersion.isAtLeastLollipop()) {
            this.zzj = this.zza.isAccessibilityFocused();
        }
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(0);
            if (this.zzj) {
                this.zzb.sendAccessibilityEvent(8);
            }
        }
        this.zza.setVisibility(true == this.zzc ? 4 : 0);
        this.zza.setEnabled(!z);
    }

    private final void zzc() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.hasMediaSession()) {
            this.zza.setEnabled(false);
        } else if (remoteMediaClient.isPlaying()) {
            if (remoteMediaClient.isLiveStream()) {
                zza(this.zzh, this.zzi);
            } else {
                zza(this.zzf, this.zzg);
            }
        } else if (remoteMediaClient.isBuffering()) {
            zzb(false);
        } else if (remoteMediaClient.isPaused()) {
            zza(this.zzd, this.zze);
        } else if (remoteMediaClient.isLoadingNextItem()) {
            zzb(true);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSendingRemoteMediaRequest() {
        zzb(true);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$911);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
