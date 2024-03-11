package o;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.VolumeProviderCompat;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import java.util.concurrent.TimeUnit;
import o.C1308Wr;

/* loaded from: classes3.dex */
public final class WX implements WZ {
    public static final b c = new b(null);
    private boolean a;
    private MediaSessionCompat d;
    private boolean e;
    private PlaybackStateCompat.Builder h;
    private final WW j;
    private String i = "";

    /* renamed from: o  reason: collision with root package name */
    private String f13405o = "";
    private int g = 8;
    private long f = -1;

    public WX(boolean z, WW ww) {
        this.j = ww;
        c.getLogTag();
        this.e = z;
        this.d = new MediaSessionCompat(AbstractApplicationC1040Mh.d().getApplicationContext(), "Netflix media session");
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MediaSessionManagerImpl");
        }
    }

    @Override // o.TV
    public MediaSessionCompat.Token a() {
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat.getSessionToken();
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class d extends VolumeProviderCompat {
        d() {
            super(0, 100, 0);
        }
    }

    private final void c() {
        PlaybackStateCompat.Builder builder;
        PlaybackStateCompat.Builder builder2 = this.h;
        if (builder2 != null) {
            builder2.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("custom_action_rewind_10", AbstractApplicationC1040Mh.d().getString(C1308Wr.d.i), HawkinsIcon.R.b.d()).build());
        }
        PlaybackStateCompat.Builder builder3 = this.h;
        if (builder3 != null) {
            builder3.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("custom_action_forward_10", AbstractApplicationC1040Mh.d().getString(C1308Wr.d.d), HawkinsIcon.dK.e.d()).build());
        }
        if (!this.a || (builder = this.h) == null) {
            return;
        }
        builder.addCustomAction(new PlaybackStateCompat.CustomAction.Builder("custom_action_skip_intro", this.i, HawkinsIcon.hW.c.d()).build());
    }

    private final void d(VZ vz) {
        boolean g;
        boolean g2;
        if (vz != null) {
            String a = vz.a();
            String d2 = vz.d();
            g = C8691duz.g(a);
            if (!(!g) || d2 == null) {
                return;
            }
            g2 = C8691duz.g(d2);
            if (g2) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("isRemote", true);
            bundle.putString("uuid", a);
            bundle.putString("friendlyName", d2);
            c.getLogTag();
            MediaSessionCompat mediaSessionCompat = this.d;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setExtras(bundle);
            }
        }
    }

    private final void a(int i) {
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat != null) {
            this.g = i;
            PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
            this.h = builder;
            builder.setActions(WZ.b.a(i));
            c();
            PlaybackStateCompat.Builder builder2 = this.h;
            if (builder2 != null) {
                builder2.setState(i, this.f, 1.0f);
            }
            PlaybackStateCompat.Builder builder3 = this.h;
            mediaSessionCompat.setPlaybackState(builder3 != null ? builder3.build() : null);
        }
    }

    @Override // o.WZ
    public void d(VU vu) {
        c.getLogTag();
        this.a = vu != null && vu.a();
        String c2 = vu != null ? vu.c() : null;
        if (c2 == null || c2.length() == 0) {
            c2 = C1333Xq.d(C1308Wr.d.h).c();
            C8632dsu.d((Object) c2);
        }
        this.i = c2;
        this.g = (vu == null || !vu.g()) ? 2 : 3;
        this.f = TimeUnit.SECONDS.toMillis(vu != null ? vu.d() : 0L);
        a(this.g);
    }

    @Override // o.WZ
    public void c(C1295We c1295We, VZ vz) {
        MediaControllerCompat controller;
        String e;
        c.getLogTag();
        String str = "";
        this.f13405o = (c1295We == null || (r1 = c1295We.c()) == null) ? "" : "";
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat == null || (controller = mediaSessionCompat.getController()) == null) {
            return;
        }
        MediaMetadataCompat metadata = controller.getMetadata();
        MediaMetadataCompat.Builder builder = metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
        builder.putText(MediaMetadataCompat.METADATA_KEY_TITLE, this.f13405o);
        if (c1295We != null && (e = c1295We.e()) != null) {
            str = e;
        }
        builder.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, str);
        MediaSessionCompat mediaSessionCompat2 = this.d;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.setMetadata(builder.build());
        }
        d(vz);
    }

    @Override // o.WZ
    public void c(float f) {
        MediaControllerCompat controller;
        c.getLogTag();
        MediaSessionCompat mediaSessionCompat = this.d;
        MediaMetadataCompat metadata = (mediaSessionCompat == null || (controller = mediaSessionCompat.getController()) == null) ? null : controller.getMetadata();
        MediaMetadataCompat.Builder builder = metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
        builder.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, TimeUnit.SECONDS.toMillis(f));
        MediaSessionCompat mediaSessionCompat2 = this.d;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.setMetadata(builder.build());
        }
    }

    @Override // o.WZ
    public void c(Bitmap bitmap) {
        MediaControllerCompat controller;
        c.getLogTag();
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat == null || (controller = mediaSessionCompat.getController()) == null) {
            return;
        }
        MediaMetadataCompat metadata = controller.getMetadata();
        MediaMetadataCompat.Builder builder = metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
        builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        MediaSessionCompat mediaSessionCompat2 = this.d;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.setMetadata(builder.build());
        }
    }

    @Override // o.WZ
    public void e() {
        c.getLogTag();
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat == null || mediaSessionCompat.isActive()) {
            return;
        }
        mediaSessionCompat.setActive(true);
        this.f = -1L;
        mediaSessionCompat.setPlaybackToRemote(new d());
        mediaSessionCompat.setCallback(new WQ(this.j));
        c(8);
    }

    @Override // o.WZ
    public void b() {
        c.getLogTag();
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat != null) {
            this.g = 1;
            PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
            this.h = builder;
            builder.setState(1, -1L, 0.0f);
            PlaybackStateCompat.Builder builder2 = this.h;
            mediaSessionCompat.setPlaybackState(builder2 != null ? builder2.build() : null);
            mediaSessionCompat.setActive(false);
            mediaSessionCompat.release();
        }
    }

    @Override // o.WZ
    public void d() {
        c.getLogTag();
        MediaSessionCompat mediaSessionCompat = this.d;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.release();
        }
        this.d = null;
    }

    private final void c(int i) {
        c.getLogTag();
        a(i);
    }
}
