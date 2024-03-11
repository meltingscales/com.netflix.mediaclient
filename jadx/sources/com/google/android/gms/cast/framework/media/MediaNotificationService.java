package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Base64;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.media.app.NotificationCompat;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzkk;
import com.netflix.model.leafs.originals.interactive.Moment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaNotificationService extends Service {
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$1718;
    private static final Logger zza;
    private static Runnable zzb;
    private NotificationOptions zzc;
    private ImagePicker zzd;
    private ComponentName zze;
    private ComponentName zzf;
    private List zzg = new ArrayList();
    private int[] zzh;
    private long zzi;
    private com.google.android.gms.cast.framework.media.internal.zzb zzj;
    private ImageHints zzk;
    private Resources zzl;
    private zzm zzm;
    private zzn zzn;
    private NotificationManager zzo;
    private Notification zzp;
    private CastContext zzq;

    static {
        b();
        zza = new Logger("MediaNotificationService");
    }

    static void b() {
        e$ss2$1718 = (byte) 24;
    }

    public static boolean isNotificationOptionsValid(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        CastMediaOptions castMediaOptions = castOptions.getCastMediaOptions();
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.getNotificationOptions()) == null) {
            return false;
        }
        zzg zzm = notificationOptions.zzm();
        if (zzm == null) {
            return true;
        }
        List zze = zze(zzm);
        int[] zzi = zzi(zzm);
        int size = zze == null ? 0 : zze.size();
        if (zze == null || zze.isEmpty()) {
            zza.e(NotificationActionsProvider.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
        } else if (zze.size() > 5) {
            zza.e(NotificationActionsProvider.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
        } else if (zzi != null && (r2 = zzi.length) != 0) {
            for (int i : zzi) {
                if (i < 0 || i >= size) {
                    zza.e(NotificationActionsProvider.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                }
            }
            return true;
        } else {
            zza.e(NotificationActionsProvider.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
        }
        return false;
    }

    public static void zzc() {
        Runnable runnable = zzb;
        if (runnable != null) {
            runnable.run();
        }
    }

    private static List zze(zzg zzgVar) {
        try {
            return zzgVar.zzf();
        } catch (RemoteException e2) {
            zza.e(e2, "Unable to call %s on %s.", "getNotificationActions", zzg.class.getSimpleName());
            return null;
        }
    }

    private final void zzf(zzg zzgVar) {
        NotificationCompat.Action zzd;
        int[] zzi = zzi(zzgVar);
        this.zzh = zzi == null ? null : (int[]) zzi.clone();
        List<NotificationAction> zze = zze(zzgVar);
        this.zzg = new ArrayList();
        if (zze == null) {
            return;
        }
        for (NotificationAction notificationAction : zze) {
            String action = notificationAction.getAction();
            if (action.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || action.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || action.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || action.equals(MediaIntentReceiver.ACTION_FORWARD) || action.equals(MediaIntentReceiver.ACTION_REWIND) || action.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || action.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                zzd = zzd(notificationAction.getAction());
            } else {
                Intent intent = new Intent(notificationAction.getAction());
                intent.setComponent(this.zze);
                zzd = new NotificationCompat.Action.Builder(notificationAction.getIconResId(), notificationAction.getContentDescription(), PendingIntent.getBroadcast(this, 0, intent, zzcu.zza)).build();
            }
            if (zzd != null) {
                this.zzg.add(zzd);
            }
        }
    }

    private final void zzg() {
        this.zzg = new ArrayList();
        for (String str : this.zzc.getActions()) {
            NotificationCompat.Action zzd = zzd(str);
            if (zzd != null) {
                this.zzg.add(zzd);
            }
        }
        this.zzh = (int[]) this.zzc.getCompatActionIndices().clone();
    }

    private static int[] zzi(zzg zzgVar) {
        try {
            return zzgVar.zzg();
        } catch (RemoteException e2) {
            zza.e(e2, "Unable to call %s on %s.", "getCompactViewActionIndices", zzg.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.zzo = (NotificationManager) getSystemService(Moment.TYPE.NOTIFICATION);
        CastContext sharedInstance = CastContext.getSharedInstance(this);
        this.zzq = sharedInstance;
        CastMediaOptions castMediaOptions = (CastMediaOptions) Preconditions.checkNotNull(sharedInstance.getCastOptions().getCastMediaOptions());
        this.zzc = (NotificationOptions) Preconditions.checkNotNull(castMediaOptions.getNotificationOptions());
        this.zzd = castMediaOptions.getImagePicker();
        this.zzl = getResources();
        this.zze = new ComponentName(getApplicationContext(), castMediaOptions.getMediaIntentReceiverClassName());
        this.zzf = !TextUtils.isEmpty(this.zzc.getTargetActivityClassName()) ? new ComponentName(getApplicationContext(), this.zzc.getTargetActivityClassName()) : null;
        this.zzi = this.zzc.getSkipStepMs();
        int dimensionPixelSize = this.zzl.getDimensionPixelSize(this.zzc.zze());
        this.zzk = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.zzj = new com.google.android.gms.cast.framework.media.internal.zzb(getApplicationContext(), this.zzk);
        if (PlatformVersion.isAtLeastO()) {
            NotificationChannel m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("cast_media_notification", "Cast", 2);
            m.setShowBadge(false);
            this.zzo.createNotificationChannel(m);
        }
        com.google.android.gms.internal.cast.zzl.zzd(zzkk.CAF_NOTIFICATION_SERVICE);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = this.zzj;
        if (zzbVar != null) {
            zzbVar.zza();
        }
        zzb = null;
        this.zzo.cancel(1);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, final int i2) {
        WebImage webImage;
        zzm zzmVar;
        MediaInfo mediaInfo = (MediaInfo) Preconditions.checkNotNull((MediaInfo) intent.getParcelableExtra("extra_media_info"));
        MediaMetadata mediaMetadata = (MediaMetadata) Preconditions.checkNotNull(mediaInfo.getMetadata());
        int intExtra = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        String stringExtra = intent.getStringExtra("extra_playback_session_name");
        CastDevice castDevice = (CastDevice) Preconditions.checkNotNull((CastDevice) intent.getParcelableExtra("extra_cast_device"));
        boolean z = intExtra == 2;
        int streamType = mediaInfo.getStreamType();
        String string = mediaMetadata.getString("com.google.android.gms.cast.metadata.TITLE");
        if (stringExtra == null) {
            stringExtra = castDevice.getFriendlyName();
        }
        zzm zzmVar2 = new zzm(z, streamType, string, stringExtra, (MediaSessionCompat.Token) intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        if (intent.getBooleanExtra("extra_media_notification_force_update", false) || (zzmVar = this.zzm) == null || zzmVar2.zzb != zzmVar.zzb || zzmVar2.zzc != zzmVar.zzc || !CastUtils.zzh(zzmVar2.zzd, zzmVar.zzd) || !CastUtils.zzh(zzmVar2.zze, zzmVar.zze) || zzmVar2.zzf != zzmVar.zzf || zzmVar2.zzg != zzmVar.zzg) {
            this.zzm = zzmVar2;
            zzh();
        }
        ImagePicker imagePicker = this.zzd;
        if (imagePicker != null) {
            webImage = imagePicker.onPickImage(mediaMetadata, this.zzk);
        } else {
            webImage = mediaMetadata.hasImages() ? mediaMetadata.getImages().get(0) : null;
        }
        zzn zznVar = new zzn(webImage);
        zzn zznVar2 = this.zzn;
        if (zznVar2 == null || !CastUtils.zzh(zznVar.zza, zznVar2.zza)) {
            this.zzj.zzc(new zzl(this, zznVar));
            this.zzj.zzd(zznVar.zza);
        }
        startForeground(1, this.zzp);
        zzb = new Runnable() { // from class: com.google.android.gms.cast.framework.media.zzk
            @Override // java.lang.Runnable
            public final void run() {
                MediaNotificationService.this.stopSelf(i2);
            }
        };
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        if (this.zzm == null) {
            return;
        }
        zzn zznVar = this.zzn;
        PendingIntent pendingIntent = null;
        NotificationCompat.Builder visibility = new NotificationCompat.Builder(this, "cast_media_notification").setLargeIcon(zznVar == null ? null : zznVar.zzb).setSmallIcon(this.zzc.getSmallIconDrawableResId()).setContentTitle(this.zzm.zzd).setContentText(this.zzl.getString(this.zzc.getCastingToDeviceStringResId(), this.zzm.zze)).setOngoing(true).setShowWhen(false).setVisibility(1);
        ComponentName componentName = this.zzf;
        if (componentName != null) {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            TaskStackBuilder create = TaskStackBuilder.create(this);
            create.addNextIntentWithParentStack(intent);
            pendingIntent = create.getPendingIntent(1, zzcu.zza | 134217728);
        }
        if (pendingIntent != null) {
            visibility.setContentIntent(pendingIntent);
        }
        zzg zzm = this.zzc.zzm();
        if (zzm != null) {
            zza.i("actionsProvider != null", new Object[0]);
            zzf(zzm);
        } else {
            zza.i("actionsProvider == null", new Object[0]);
            zzg();
        }
        for (NotificationCompat.Action action : this.zzg) {
            visibility.addAction(action);
        }
        NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
        int[] iArr = this.zzh;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.zzm.zza;
        if (token != null) {
            mediaStyle.setMediaSession(token);
        }
        visibility.setStyle(mediaStyle);
        Notification build = visibility.build();
        this.zzp = build;
        startForeground(1, build);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final NotificationCompat.Action zzd(String str) {
        char c2;
        int pauseDrawableResId;
        int zzf;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    int i2 = e + 71;
                    c = i2 % 128;
                    int i3 = i2 % 2;
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        PendingIntent pendingIntent = null;
        switch (c2) {
            case 0:
                zzm zzmVar = this.zzm;
                int i4 = zzmVar.zzc;
                boolean z = zzmVar.zzb;
                if (i4 == 2) {
                    pauseDrawableResId = this.zzc.getStopLiveStreamDrawableResId();
                    zzf = this.zzc.getStopLiveStreamTitleResId();
                } else {
                    pauseDrawableResId = this.zzc.getPauseDrawableResId();
                    zzf = this.zzc.zzf();
                }
                if (!z) {
                    pauseDrawableResId = this.zzc.getPlayDrawableResId();
                }
                if (!z) {
                    int i5 = e + 79;
                    c = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.zzc.zzg();
                        pendingIntent.hashCode();
                        throw null;
                    }
                    zzf = this.zzc.zzg();
                }
                Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent.setComponent(this.zze);
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, zzcu.zza);
                String string = this.zzl.getString(zzf);
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    d(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                return new NotificationCompat.Action.Builder(pauseDrawableResId, string, broadcast).build();
            case 1:
                if (this.zzm.zzf) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.zze);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent2, zzcu.zza);
                }
                PendingIntent pendingIntent2 = pendingIntent;
                int skipNextDrawableResId = this.zzc.getSkipNextDrawableResId();
                String string2 = this.zzl.getString(this.zzc.zzk());
                if (string2.startsWith("'!#+")) {
                    Object[] objArr2 = new Object[1];
                    d(string2.substring(4), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                    int i6 = e + 35;
                    c = i6 % 128;
                    int i7 = i6 % 2;
                }
                return new NotificationCompat.Action.Builder(skipNextDrawableResId, string2, pendingIntent2).build();
            case 2:
                if (this.zzm.zzg) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.zze);
                    pendingIntent = PendingIntent.getBroadcast(this, 0, intent3, zzcu.zza);
                }
                PendingIntent pendingIntent3 = pendingIntent;
                int skipPrevDrawableResId = this.zzc.getSkipPrevDrawableResId();
                String string3 = this.zzl.getString(this.zzc.zzl());
                if (string3.startsWith("'!#+")) {
                    Object[] objArr3 = new Object[1];
                    d(string3.substring(4), objArr3);
                    string3 = ((String) objArr3[0]).intern();
                }
                return new NotificationCompat.Action.Builder(skipPrevDrawableResId, string3, pendingIntent3).build();
            case 3:
                long j = this.zzi;
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent4.setComponent(this.zze);
                intent4.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent4, zzcu.zza | 134217728);
                int forwardDrawableResId = this.zzc.getForwardDrawableResId();
                int zzd = this.zzc.zzd();
                if (j == 10000) {
                    forwardDrawableResId = this.zzc.getForward10DrawableResId();
                    zzd = this.zzc.zzb();
                } else if (j == 30000) {
                    forwardDrawableResId = this.zzc.getForward30DrawableResId();
                    zzd = this.zzc.zzc();
                }
                String string4 = this.zzl.getString(zzd);
                if (string4.startsWith("'!#+")) {
                    Object[] objArr4 = new Object[1];
                    d(string4.substring(4), objArr4);
                    string4 = ((String) objArr4[0]).intern();
                }
                return new NotificationCompat.Action.Builder(forwardDrawableResId, string4, broadcast2).build();
            case 4:
                long j2 = this.zzi;
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent5.setComponent(this.zze);
                intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent5, zzcu.zza | 134217728);
                int rewindDrawableResId = this.zzc.getRewindDrawableResId();
                int zzj = this.zzc.zzj();
                if (j2 == 10000) {
                    int i8 = e + 107;
                    c = i8 % 128;
                    if (i8 % 2 != 0) {
                        this.zzc.getRewind10DrawableResId();
                        this.zzc.zzh();
                        throw null;
                    }
                    rewindDrawableResId = this.zzc.getRewind10DrawableResId();
                    zzj = this.zzc.zzh();
                } else if (j2 == 30000) {
                    rewindDrawableResId = this.zzc.getRewind30DrawableResId();
                    zzj = this.zzc.zzi();
                }
                String string5 = this.zzl.getString(zzj);
                if (string5.startsWith("'!#+")) {
                    Object[] objArr5 = new Object[1];
                    d(string5.substring(4), objArr5);
                    string5 = ((String) objArr5[0]).intern();
                }
                return new NotificationCompat.Action.Builder(rewindDrawableResId, string5, broadcast3).build();
            case 5:
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent6.setComponent(this.zze);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this, 0, intent6, zzcu.zza);
                int disconnectDrawableResId = this.zzc.getDisconnectDrawableResId();
                String string6 = this.zzl.getString(this.zzc.zza());
                if (string6.startsWith("'!#+")) {
                    Object[] objArr6 = new Object[1];
                    d(string6.substring(4), objArr6);
                    string6 = ((String) objArr6[0]).intern();
                }
                return new NotificationCompat.Action.Builder(disconnectDrawableResId, string6, broadcast4).build();
            case 6:
                Intent intent7 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                intent7.setComponent(this.zze);
                return new NotificationCompat.Action.Builder(this.zzc.getDisconnectDrawableResId(), this.zzl.getString(this.zzc.zza(), ""), PendingIntent.getBroadcast(this, 0, intent7, zzcu.zza)).build();
            default:
                zza.e("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1718);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
