package o;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.netflix.mediaclient.api.res.AssetType;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public class bDC implements TextureView.SurfaceTextureListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnInfoListener {
    protected AssetType a;
    public long b;
    public String c;
    public TextureView d;
    public long e;
    public boolean f;
    boolean g;
    public Surface h;
    private int i;
    private c j;
    private Handler k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private MediaPlayer f13497o;
    private float r;
    private Runnable t;

    /* loaded from: classes4.dex */
    public interface c {
        void b();

        void c();

        void d();

        void e(int i, int i2);
    }

    public void d(String str, long j, long j2) {
        this.c = str;
        this.e = j;
        this.b = j2;
    }

    public boolean d() {
        int i = this.n;
        if (i == -1) {
            return false;
        }
        int i2 = this.i;
        if (!this.g) {
            i = 0;
        }
        return i2 >= i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public bDC(TextureView textureView, boolean z, int i, float f, AssetType assetType, c cVar) {
        this.r = 0.0f;
        this.f = false;
        this.a = assetType;
        this.j = cVar;
        if (textureView != null) {
            this.d = textureView;
            textureView.setSurfaceTextureListener(this);
        } else {
            this.f = true;
        }
        this.g = z;
        this.n = i;
        this.r = f;
    }

    public void a() {
        if (this.f) {
            try {
                if (this.f13497o == null) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    this.f13497o = mediaPlayer;
                    this.l = 0;
                    mediaPlayer.setOnErrorListener(this);
                    this.f13497o.setAudioStreamType(3);
                    this.f13497o.setScreenOnWhilePlaying(false);
                    this.f13497o.setOnInfoListener(this);
                    this.f13497o.setOnPreparedListener(this);
                    this.f13497o.setOnVideoSizeChangedListener(this);
                    h();
                }
                Surface surface = this.h;
                if (surface != null) {
                    this.f13497o.setSurface(surface);
                }
                int i = this.l;
                if (i != 6 && i != 2) {
                    if ((i == 0 || i == 5) && !TextUtils.isEmpty(this.c)) {
                        File file = new File(this.c);
                        if (file.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            this.f13497o.setDataSource(fileInputStream.getFD(), this.e, this.b);
                            fileInputStream.close();
                            this.l = 1;
                            this.f13497o.prepareAsync();
                            this.l = 3;
                            return;
                        }
                        c();
                        return;
                    }
                    return;
                }
                i();
            } catch (IOException | RuntimeException unused) {
                c();
            }
        }
    }

    public boolean j() {
        if (this.f) {
            i();
            return true;
        }
        return false;
    }

    public void b() {
        MediaPlayer mediaPlayer = this.f13497o;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.m = this.f13497o.getCurrentPosition();
        this.f13497o.pause();
        this.l = 6;
    }

    private void g() {
        int i;
        MediaPlayer mediaPlayer = this.f13497o;
        if (mediaPlayer == null || (i = this.l) == 0 || i == 1 || i == 9) {
            return;
        }
        this.m = mediaPlayer.getCurrentPosition();
        this.f13497o.stop();
        this.l = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        MediaPlayer mediaPlayer = this.f13497o;
        if (mediaPlayer == null) {
            return;
        }
        boolean isPlaying = mediaPlayer.isPlaying();
        if (!this.f || isPlaying) {
            return;
        }
        int i = this.l;
        if (i == 2 || i == 6 || i == 7) {
            if (i != 6) {
                this.f13497o.seekTo(this.m);
            }
            this.f13497o.start();
            this.l = 4;
            this.f13497o.setOnCompletionListener(this);
        }
    }

    private void h() {
        MediaPlayer mediaPlayer = this.f13497o;
        if (mediaPlayer != null) {
            float f = this.r;
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.l = 2;
        i();
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            c cVar = this.j;
            if (cVar != null) {
                cVar.c();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.l = 7;
        this.i++;
        this.m = 0;
        if (d()) {
            c cVar = this.j;
            if (cVar != null) {
                cVar.b();
            }
            c();
            return;
        }
        MediaPlayer mediaPlayer2 = this.f13497o;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            d(100);
        } else {
            i();
        }
    }

    public void d(int i) {
        if (this.k == null) {
            this.k = new Handler();
        }
        if (this.t == null) {
            this.t = new Runnable() { // from class: o.bDC.5
                @Override // java.lang.Runnable
                public void run() {
                    bDC.this.i();
                }
            };
        }
        this.k.postDelayed(this.t, i);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.l = 9;
        c cVar = this.j;
        if (cVar != null) {
            cVar.e(i, i2);
        }
        c();
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        i();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.h = new Surface(surfaceTexture);
        this.f = true;
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b(surfaceTexture);
        return false;
    }

    public void c() {
        b(false);
    }

    public void b(boolean z) {
        Runnable runnable;
        b(z ? this.d.getSurfaceTexture() : null);
        Handler handler = this.k;
        if (handler == null || (runnable = this.t) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    private void b(SurfaceTexture surfaceTexture) {
        e();
        a(surfaceTexture);
        c cVar = this.j;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void e() {
        MediaPlayer mediaPlayer = this.f13497o;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                g();
            }
            this.f13497o.reset();
            this.l = 0;
            this.f13497o.release();
            this.l = 8;
            this.f13497o = null;
        }
    }

    private void a(SurfaceTexture surfaceTexture) {
        this.f = false;
        Surface surface = this.h;
        if (surface != null) {
            surface.release();
            this.h = null;
        }
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }
}
