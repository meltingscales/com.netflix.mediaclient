package com.google.android.gms.cast.framework.media.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzap;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;

/* loaded from: classes2.dex */
public final class zzp implements RemoteMediaClient.Listener {
    private static final Logger zza = new Logger("MediaSessionManager");
    private final Context zzb;
    private final CastOptions zzc;
    private final zzap zzd;
    private final ComponentName zze;
    private final zzb zzf;
    private final zzb zzg;
    private final Handler zzh;
    private final Runnable zzi;
    private RemoteMediaClient zzj;
    private CastDevice zzk;
    private String zzl;
    private MediaSessionCompat zzm;
    private MediaSessionCompat.Callback zzn;
    private boolean zzo;

    public zzp(Context context, CastOptions castOptions, zzap zzapVar) {
        this.zzb = context;
        this.zzc = castOptions;
        this.zzd = zzapVar;
        if (castOptions.getCastMediaOptions() == null || TextUtils.isEmpty(castOptions.getCastMediaOptions().getExpandedControllerActivityClassName())) {
            this.zze = null;
        } else {
            this.zze = new ComponentName(context, castOptions.getCastMediaOptions().getExpandedControllerActivityClassName());
        }
        zzb zzbVar = new zzb(context);
        this.zzf = zzbVar;
        zzbVar.zzc(new zzm(this));
        zzb zzbVar2 = new zzb(context);
        this.zzg = zzbVar2;
        zzbVar2.zzc(new zzn(this));
        this.zzh = new zzcv(Looper.getMainLooper());
        this.zzi = new Runnable() { // from class: com.google.android.gms.cast.framework.media.internal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzp.this.zzf();
            }
        };
    }

    public static Bitmap zza(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = (i - height) / 2;
        RectF rectF = new RectF(0.0f, f2, f, height + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    private final Uri zzi(MediaMetadata mediaMetadata, int i) {
        WebImage webImage;
        if (this.zzc.getCastMediaOptions().getImagePicker() != null) {
            webImage = this.zzc.getCastMediaOptions().getImagePicker().onPickImage(mediaMetadata, i);
        } else {
            webImage = mediaMetadata.hasImages() ? mediaMetadata.getImages().get(0) : null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.getUrl();
    }

    private final MediaMetadataCompat.Builder zzj() {
        MediaSessionCompat mediaSessionCompat = this.zzm;
        MediaMetadataCompat metadata = mediaSessionCompat == null ? null : mediaSessionCompat.getController().getMetadata();
        if (metadata == null) {
            return new MediaMetadataCompat.Builder();
        }
        return new MediaMetadataCompat.Builder(metadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(Bitmap bitmap, int i) {
        MediaSessionCompat mediaSessionCompat = this.zzm;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i != 0) {
            if (i == 3) {
                mediaSessionCompat.setMetadata(zzj().putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap).build());
            }
        } else if (bitmap != null) {
            mediaSessionCompat.setMetadata(zzj().putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap).build());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            this.zzm.setMetadata(zzj().putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, createBitmap).build());
        }
    }

    private final void zzl(boolean z) {
        if (this.zzc.getEnableReconnectionService()) {
            this.zzh.removeCallbacks(this.zzi);
            Intent intent = new Intent(this.zzb, ReconnectionService.class);
            intent.setPackage(this.zzb.getPackageName());
            try {
                this.zzb.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.zzh.postDelayed(this.zzi, 1000L);
                }
            }
        }
    }

    private final void zzm() {
        if (this.zzc.getCastMediaOptions().getNotificationOptions() == null) {
            return;
        }
        zza.d("Stopping notification service.", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            MediaNotificationService.zzc();
            return;
        }
        Intent intent = new Intent(this.zzb, MediaNotificationService.class);
        intent.setPackage(this.zzb.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        this.zzb.stopService(intent);
    }

    private final void zzn() {
        if (this.zzc.getEnableReconnectionService()) {
            this.zzh.removeCallbacks(this.zzi);
            Intent intent = new Intent(this.zzb, ReconnectionService.class);
            intent.setPackage(this.zzb.getPackageName());
            this.zzb.stopService(intent);
        }
    }

    private final void zzo(int i, MediaInfo mediaInfo) {
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat = this.zzm;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i == 0) {
            mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0L, 1.0f).build());
            this.zzm.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        this.zzm.setPlaybackState(new PlaybackStateCompat.Builder().setState(i, this.zzj.isLiveStream() ? 0L : this.zzj.getApproximateStreamPosition(), 1.0f).setActions(true != this.zzj.isLiveStream() ? 768L : 512L).build());
        MediaSessionCompat mediaSessionCompat2 = this.zzm;
        if (this.zze == null) {
            activity = null;
        } else {
            Intent intent = new Intent();
            intent.setComponent(this.zze);
            activity = PendingIntent.getActivity(this.zzb, 0, intent, zzcu.zza | 134217728);
        }
        mediaSessionCompat2.setSessionActivity(activity);
        if (this.zzm == null) {
            return;
        }
        MediaMetadata metadata = mediaInfo.getMetadata();
        this.zzm.setMetadata(zzj().putString(MediaMetadataCompat.METADATA_KEY_TITLE, metadata.getString("com.google.android.gms.cast.metadata.TITLE")).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, metadata.getString("com.google.android.gms.cast.metadata.TITLE")).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, metadata.getString("com.google.android.gms.cast.metadata.SUBTITLE")).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, this.zzj.isLiveStream() ? 0L : mediaInfo.getStreamDuration()).build());
        Uri zzi = zzi(metadata, 0);
        if (zzi != null) {
            this.zzf.zzd(zzi);
        } else {
            zzk(null, 0);
        }
        Uri zzi2 = zzi(metadata, 3);
        if (zzi2 != null) {
            this.zzg.zzd(zzi2);
        } else {
            zzk(null, 3);
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onAdBreakStatusUpdated() {
        zzg(false);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onMetadataUpdated() {
        zzg(false);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onPreloadStatusUpdated() {
        zzg(false);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onQueueStatusUpdated() {
        zzg(false);
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onSendingRemoteMediaRequest() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onStatusUpdated() {
        zzg(false);
    }

    public final void zzd(RemoteMediaClient remoteMediaClient, CastDevice castDevice) {
        CastOptions castOptions;
        if (this.zzo || (castOptions = this.zzc) == null || castOptions.getCastMediaOptions() == null || remoteMediaClient == null || castDevice == null) {
            return;
        }
        this.zzj = remoteMediaClient;
        remoteMediaClient.addListener(this);
        this.zzk = castDevice;
        if (!PlatformVersion.isAtLeastLollipop()) {
            ((AudioManager) this.zzb.getSystemService("audio")).requestAudioFocus(null, 3, 3);
        }
        ComponentName componentName = new ComponentName(this.zzb, this.zzc.getCastMediaOptions().getMediaIntentReceiverClassName());
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.zzb, 0, intent, zzcu.zza);
        if (this.zzc.getCastMediaOptions().getMediaSessionEnabled()) {
            this.zzm = new MediaSessionCompat(this.zzb, "CastMediaSession", componentName, broadcast);
            zzo(0, null);
            CastDevice castDevice2 = this.zzk;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.getFriendlyName())) {
                this.zzm.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, this.zzb.getResources().getString(R.string.cast_casting_to_device, this.zzk.getFriendlyName())).build());
            }
            zzo zzoVar = new zzo(this);
            this.zzn = zzoVar;
            this.zzm.setCallback(zzoVar);
            this.zzm.setActive(true);
            this.zzd.zzq(this.zzm);
        }
        this.zzo = true;
        zzg(false);
    }

    public final void zze(int i) {
        if (this.zzo) {
            this.zzo = false;
            RemoteMediaClient remoteMediaClient = this.zzj;
            if (remoteMediaClient != null) {
                remoteMediaClient.removeListener(this);
            }
            if (!PlatformVersion.isAtLeastLollipop()) {
                ((AudioManager) this.zzb.getSystemService("audio")).abandonAudioFocus(null);
            }
            this.zzd.zzq(null);
            this.zzf.zza();
            zzb zzbVar = this.zzg;
            if (zzbVar != null) {
                zzbVar.zza();
            }
            MediaSessionCompat mediaSessionCompat = this.zzm;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setSessionActivity(null);
                this.zzm.setCallback(null);
                this.zzm.setMetadata(new MediaMetadataCompat.Builder().build());
                zzo(0, null);
                this.zzm.setActive(false);
                this.zzm.release();
                this.zzm = null;
            }
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = null;
            zzm();
            if (i == 0) {
                zzn();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        zzl(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(boolean r8) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.zzp.zzg(boolean):void");
    }

    public final void zzh(String str) {
        this.zzl = str;
        zzg(false);
    }
}
