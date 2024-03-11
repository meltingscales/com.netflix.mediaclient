package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media.VolumeProviderCompat;
import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.service.pushnotification.Payload;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* renamed from: o.aWj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2006aWj implements aVI {
    private static byte e$ss2$3618 = 24;
    private static int p = 1;
    private static int q;
    private aVM b;
    private Context c;
    private BroadcastReceiver e;
    private boolean f;
    private MediaSessionCompat g;
    private boolean h;
    private boolean i;
    private InterfaceC1820aPl j;
    private VolumeProviderCompat l;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f13453o;
    private PlaybackStateCompat.Builder s;
    private String k = "";
    int d = 8;
    long a = -1;
    private boolean r = false;
    private final BroadcastReceiver m = null;

    private long c(int i) {
        long j = i != 2 ? i != 3 ? i != 6 ? 4L : 329L : 331L : 333L;
        return this.f ? j | 32 : j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e() {
        return this.f13453o;
    }

    private void l() {
    }

    private void n() {
    }

    public C2006aWj(aVM avm, InterfaceC1820aPl interfaceC1820aPl) {
        C1044Mm.a("nf_media_session_controller", "Initializing MediaSessionController");
        this.c = avm.getContext();
        this.b = avm;
        this.j = interfaceC1820aPl;
        if (this.g != null) {
            C1044Mm.j("nf_media_session_controller", "MediaSession was not destroyed correctly! Destroying it now.");
            d();
        }
        this.g = new MediaSessionCompat(this.c.getApplicationContext(), "Netflix media session");
        m();
        n();
    }

    @Override // o.TV
    public MediaSessionCompat.Token a() {
        return this.g.getSessionToken();
    }

    @Override // o.aVI
    public void e(String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = q + 83;
        p = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            C8168dfL.h(str);
            throw null;
        }
        if (!(!C8168dfL.h(str))) {
            this.k = str;
        }
        MediaSessionCompat mediaSessionCompat = this.g;
        if (mediaSessionCompat != null) {
            int i4 = p + 53;
            q = i4 % 128;
            if (i4 % 2 != 0) {
                mediaSessionCompat.getController();
                obj.hashCode();
                throw null;
            } else if (mediaSessionCompat.getController() != null) {
                this.f = z;
                MediaMetadataCompat metadata = this.g.getController().getMetadata();
                MediaMetadataCompat.Builder builder = metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
                builder.putText(MediaMetadataCompat.METADATA_KEY_TITLE, this.k);
                int b = ((InterfaceC5346bwy) C1332Xp.b(InterfaceC5346bwy.class)).b(this.f);
                Context context = this.c;
                String string = context.getString(b);
                if (string.startsWith("'!#+")) {
                    int i5 = q + 69;
                    p = i5 % 128;
                    int i6 = i5 % 2;
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    t(substring, objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(b);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        string = spannableString;
                    }
                }
                builder.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, string);
                builder.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, i * 1000);
                this.g.setMetadata(builder.build());
                q();
                return;
            }
        }
        C1044Mm.e("nf_media_session_controller", "unable to update mediaSession metadata");
    }

    private void q() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRemote", true);
        String i = this.b.i();
        bundle.putString("uuid", i);
        JSONObject j = this.b.j();
        if (j != null && C8168dfL.d(i, j.optString("uuid"))) {
            bundle.putString("friendlyName", j.optString("fName"));
        } else {
            C1044Mm.j("nf_media_session_controller", "not sending extra via mde");
        }
        C1044Mm.a("nf_media_session_controller", "extrasInSession %s", bundle);
        this.g.setExtras(bundle);
    }

    @Override // o.aVI
    public void a(Bitmap bitmap) {
        MediaMetadataCompat.Builder builder;
        MediaSessionCompat mediaSessionCompat = this.g;
        if (mediaSessionCompat == null || mediaSessionCompat.getController() == null) {
            C1044Mm.e("nf_media_session_controller", "could not update bitmap in mediaSession");
            return;
        }
        MediaMetadataCompat metadata = this.g.getController().getMetadata();
        if (metadata == null) {
            builder = new MediaMetadataCompat.Builder();
        } else {
            builder = new MediaMetadataCompat.Builder(metadata);
        }
        builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        this.g.setMetadata(builder.build());
    }

    @Override // o.aVI
    public void b() {
        C1044Mm.a("nf_media_session_controller", "startMediaSession");
        if (this.g.isActive()) {
            return;
        }
        this.n = true;
        this.g.setActive(true);
        this.a = -1L;
        C1044Mm.c("nf_media_session_controller", "startMediaSession mIsVolumeControlSupported=%b mIsMediaVolumeControlSupported=%b", Boolean.valueOf(this.i), Boolean.valueOf(this.h));
        if ((this.i || this.h) && this.l == null) {
            j();
            this.g.setPlaybackToRemote(this.l);
        }
        this.g.setCallback(new e());
        c(8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        C1044Mm.e("nf_media_session_controller", "handlePauseEvent");
        try {
            PendingIntent a = this.b.a();
            if (a != null) {
                a.send();
            }
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        C1044Mm.e("nf_media_session_controller", "handlePlayEvent");
        try {
            if (this.f) {
                PendingIntent d = this.b.d();
                if (d != null) {
                    d.send();
                }
            } else {
                PendingIntent e2 = this.b.e();
                if (e2 != null) {
                    e2.send();
                }
            }
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        C1044Mm.e("nf_media_session_controller", "handlePlayNext");
        try {
            PendingIntent d = this.b.d();
            if (d != null) {
                d.send();
            }
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        C1044Mm.e("nf_media_session_controller", "handleStopEvent");
        try {
            PendingIntent d = this.b.d(MdxNotificationIntentRetriever.InvocSource.LockScreen);
            if (d != null) {
                d.send();
            }
        } catch (PendingIntent.CanceledException unused) {
        }
    }

    @Override // o.aVI
    public void c() {
        C1044Mm.a("nf_media_session_controller", "stopMediaSession");
        this.n = false;
        b(1);
        this.g.setActive(false);
    }

    @Override // o.aVI
    public void e(String str, int i) {
        this.a = i < 0 ? -1L : i * 1000;
        b(b(str));
    }

    @Override // o.aVI
    public void c(boolean z, boolean z2, boolean z3) {
        c(z2 ? 6 : z ? 2 : 3, z3);
    }

    private void c(int i, boolean z) {
        this.f = z;
        b(i);
    }

    private void b(int i) {
        if (this.g != null) {
            this.d = i;
            PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
            this.s = builder;
            builder.setActions(c(i));
            this.s.setState(i, this.a, 1.0f);
            this.g.setPlaybackState(this.s.build());
        }
    }

    @Override // o.aVI
    public void d(int i, boolean z) {
        this.f13453o = C8186dfd.b(i, 0, 100);
        if (k()) {
            return;
        }
        if (this.l != null) {
            C1044Mm.c("nf_media_session_controller", "setCurrentVolume:%d", Integer.valueOf(this.f13453o));
            VolumeProviderCompat volumeProviderCompat = this.l;
            if (volumeProviderCompat != null && this.g != null) {
                volumeProviderCompat.setCurrentVolume(this.f13453o / 10);
            }
        }
        if (z) {
            this.b.c(d(this.c, this.b.i(), this.f13453o));
        }
    }

    private boolean k() {
        if (this.j.c()) {
            return false;
        }
        if (this.n) {
            C1044Mm.j("nf_media_session_controller", "Lock screen is visible and lock screen is NOT enabled! Remove it!");
            c();
            return true;
        }
        return true;
    }

    @Override // o.aVI
    public void d() {
        C1044Mm.e("nf_media_session_controller", "destroy");
        o();
        l();
        this.g.release();
        this.g = null;
    }

    private void j() {
        this.l = new VolumeProviderCompat(2, 10, this.f13453o / 10) { // from class: o.aWj.5
            @Override // androidx.media.VolumeProviderCompat
            public void onAdjustVolume(int i) {
                if (i == 1 || i == -1) {
                    C1044Mm.c("nf_media_session_controller", "onAdjustVolume: %d", Integer.valueOf(i));
                    C2006aWj.this.d(C2006aWj.this.e() + (i * 10), true);
                    return;
                }
                C1044Mm.e("nf_media_session_controller", "onAdjustVolume strange direction %d, skipping", Integer.valueOf(i));
            }

            @Override // androidx.media.VolumeProviderCompat
            public void onSetVolumeTo(int i) {
                C1044Mm.c("nf_media_session_controller", "onSetVolumeTo:%d", Integer.valueOf(i));
                C2006aWj.this.d(i * 10, true);
            }
        };
    }

    private void m() {
        o();
        this.e = new BroadcastReceiver() { // from class: o.aWj.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C1044Mm.c("nf_media_session_controller", intent);
                String stringExtra = intent.getStringExtra("stringBlob");
                C2006aWj.this.i = false;
                C2006aWj.this.h = false;
                try {
                    C2005aWi c2005aWi = new C2005aWi(stringExtra);
                    C2006aWj.this.i = c2005aWi.h();
                    C2006aWj.this.h = c2005aWi.a();
                } catch (Exception e2) {
                    C1044Mm.e("nf_media_session_controller", "Failed to extract capability data: ", e2);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDX_ACTION_UPDATE_CAPABILITY");
        intentFilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        LocalBroadcastManager.getInstance(this.c).registerReceiver(this.e, intentFilter);
    }

    private void o() {
        if (this.e != null) {
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.e);
            this.e = null;
        }
    }

    public static Intent d(Context context, String str, int i) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_ACTION_SETVOLUME");
        intent.putExtra("uuid", str);
        intent.putExtra("volume", i);
        intent.setClass(context, aMH.c().c());
        intent.addCategory("com.netflix.mediaclient.intent.category.MDX");
        return intent;
    }

    /* renamed from: o.aWj$e */
    /* loaded from: classes3.dex */
    class e extends MediaSessionCompat.Callback {
        private e() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onCustomAction(String str, Bundle bundle) {
            if ("customActionSeek".equals(str)) {
                int i = bundle != null ? bundle.getInt("offset") : 0;
                C1044Mm.c("nf_media_session_controller", "mdx onCustomAction action=%s offset=%d", str, Integer.valueOf(i));
                try {
                    PendingIntent c = C2006aWj.this.b.c(i / 1000);
                    if (c != null) {
                        c.send();
                    }
                } catch (PendingIntent.CanceledException e) {
                    C1044Mm.e("nf_media_session_controller", "mdx onCustomAction fail", e);
                }
            } else {
                C1044Mm.c("nf_media_session_controller", "mdx onCustomAction unsupported action=%s", str);
            }
            super.onCustomAction(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onFastForward() {
            try {
                PendingIntent c = C2006aWj.this.b.c(30);
                if (c != null) {
                    c.send();
                }
            } catch (PendingIntent.CanceledException e) {
                C1044Mm.e("nf_media_session_controller", "onFastForward fail", e);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onRewind() {
            try {
                PendingIntent c = C2006aWj.this.b.c(-30);
                if (c != null) {
                    c.send();
                }
            } catch (PendingIntent.CanceledException e) {
                C1044Mm.e("nf_media_session_controller", "onRewind fail", e);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSeekTo(long j) {
            C1044Mm.c("nf_media_session_controller", "mdx onSeekTo=%d", Long.valueOf(j));
            try {
                PendingIntent a = C2006aWj.this.b.a(((int) j) / 1000);
                if (a != null) {
                    a.send();
                }
            } catch (PendingIntent.CanceledException e) {
                C1044Mm.e("nf_media_session_controller", "onSeekTo fail", e);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPause() {
            C1044Mm.e("nf_media_session_controller", "onPause");
            C2006aWj.this.f();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onStop() {
            C1044Mm.e("nf_media_session_controller", "onStop");
            C2006aWj.this.i();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onPlay() {
            C1044Mm.e("nf_media_session_controller", "onPlay");
            C2006aWj.this.h();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public void onSkipToNext() {
            C1044Mm.e("nf_media_session_controller", "onSkipToNext");
            C2006aWj.this.g();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int b(String str) {
        char c;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1279549133:
                if (str.equals("prepause")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1179388897:
                if (str.equals("STALLED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1054174766:
                if (str.equals("AUTO_ADVANCE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -318360489:
                if (str.equals("preplay")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -318277733:
                if (str.equals("preseek")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -218451411:
                if (str.equals("PROGRESS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -132182753:
                if (str.equals("END_PLAYBACK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2458420:
                if (str.equals(Payload.Action.PLAY)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2555906:
                if (str.equals("STOP")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 224418830:
                if (str.equals("PLAYING")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 507002573:
                if (str.equals("FATAL_ERROR")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case '\t':
                return 2;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
                return 6;
            case 6:
            case '\b':
                return 1;
            case '\n':
                return 3;
            case 11:
                return 7;
            default:
                return 0;
        }
    }

    private void t(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3618);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
