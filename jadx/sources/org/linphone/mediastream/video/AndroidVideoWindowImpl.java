package org.linphone.mediastream.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.video.display.OpenGLESDisplay;

/* loaded from: classes6.dex */
public class AndroidVideoWindowImpl {
    private Bitmap mBitmap;
    private VideoWindowListener mListener;
    private Surface mSurface;
    private SurfaceView mVideoPreviewView;
    private SurfaceView mVideoRenderingView;
    private Renderer renderer;
    private boolean useGLrendering;

    /* loaded from: classes6.dex */
    public interface VideoWindowListener {
        void onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl);

        void onVideoPreviewSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView);

        void onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl androidVideoWindowImpl);

        void onVideoRenderingSurfaceReady(AndroidVideoWindowImpl androidVideoWindowImpl, SurfaceView surfaceView);
    }

    public static int rotationToAngle(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 270;
            }
            return 180;
        }
        return 90;
    }

    public void release() {
    }

    public void setListener(VideoWindowListener videoWindowListener) {
        this.mListener = videoWindowListener;
    }

    public AndroidVideoWindowImpl(SurfaceView surfaceView, SurfaceView surfaceView2, VideoWindowListener videoWindowListener) {
        this.mBitmap = null;
        this.mSurface = null;
        this.mListener = null;
        this.mVideoRenderingView = surfaceView;
        this.mVideoPreviewView = surfaceView2;
        this.useGLrendering = surfaceView instanceof GLSurfaceView;
        this.mListener = videoWindowListener;
        init();
    }

    public AndroidVideoWindowImpl(SurfaceView surfaceView, SurfaceView surfaceView2) {
        this.mBitmap = null;
        this.mSurface = null;
        this.mListener = null;
        this.mVideoRenderingView = surfaceView;
        this.mVideoPreviewView = surfaceView2;
        this.useGLrendering = surfaceView instanceof GLSurfaceView;
    }

    public void init() {
        this.mVideoRenderingView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: org.linphone.mediastream.video.AndroidVideoWindowImpl.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Log.i("Video display surface is being changed.");
                if (!AndroidVideoWindowImpl.this.useGLrendering) {
                    synchronized (AndroidVideoWindowImpl.this) {
                        AndroidVideoWindowImpl.this.mBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.RGB_565);
                        AndroidVideoWindowImpl.this.mSurface = surfaceHolder.getSurface();
                    }
                }
                if (AndroidVideoWindowImpl.this.mListener != null) {
                    VideoWindowListener videoWindowListener = AndroidVideoWindowImpl.this.mListener;
                    AndroidVideoWindowImpl androidVideoWindowImpl = AndroidVideoWindowImpl.this;
                    videoWindowListener.onVideoRenderingSurfaceReady(androidVideoWindowImpl, androidVideoWindowImpl.mVideoRenderingView);
                }
                Log.w("Video display surface changed");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                Log.w("Video display surface created");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (!AndroidVideoWindowImpl.this.useGLrendering) {
                    synchronized (AndroidVideoWindowImpl.this) {
                        AndroidVideoWindowImpl.this.mSurface = null;
                        AndroidVideoWindowImpl.this.mBitmap = null;
                    }
                }
                if (AndroidVideoWindowImpl.this.mListener != null) {
                    AndroidVideoWindowImpl.this.mListener.onVideoRenderingSurfaceDestroyed(AndroidVideoWindowImpl.this);
                }
                Log.d("Video display surface destroyed");
            }
        });
        SurfaceView surfaceView = this.mVideoPreviewView;
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: org.linphone.mediastream.video.AndroidVideoWindowImpl.2
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    Log.i("Video preview surface is being changed.");
                    if (AndroidVideoWindowImpl.this.mListener != null) {
                        VideoWindowListener videoWindowListener = AndroidVideoWindowImpl.this.mListener;
                        AndroidVideoWindowImpl androidVideoWindowImpl = AndroidVideoWindowImpl.this;
                        videoWindowListener.onVideoPreviewSurfaceReady(androidVideoWindowImpl, androidVideoWindowImpl.mVideoPreviewView);
                    }
                    Log.w("Video preview surface changed");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    Log.w("Video preview surface created");
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    if (AndroidVideoWindowImpl.this.mListener != null) {
                        AndroidVideoWindowImpl.this.mListener.onVideoPreviewSurfaceDestroyed(AndroidVideoWindowImpl.this);
                    }
                    Log.d("Video preview surface destroyed");
                }
            });
        }
        if (this.useGLrendering) {
            Renderer renderer = new Renderer();
            this.renderer = renderer;
            ((GLSurfaceView) this.mVideoRenderingView).setRenderer(renderer);
            ((GLSurfaceView) this.mVideoRenderingView).setRenderMode(0);
        }
    }

    public Surface getSurface() {
        if (this.useGLrendering) {
            Log.e("View class does not match Video display filter used (you must use a non-GL View)");
        }
        return this.mVideoRenderingView.getHolder().getSurface();
    }

    public Bitmap getBitmap() {
        if (this.useGLrendering) {
            Log.e("View class does not match Video display filter used (you must use a non-GL View)");
        }
        return this.mBitmap;
    }

    public void setOpenGLESDisplay(long j) {
        if (!this.useGLrendering) {
            Log.e("View class does not match Video display filter used (you must use a GL View)");
        }
        this.renderer.setOpenGLESDisplay(j);
    }

    public void requestRender() {
        ((GLSurfaceView) this.mVideoRenderingView).requestRender();
    }

    public void update() {
        synchronized (this) {
            Surface surface = this.mSurface;
            if (surface != null) {
                try {
                    try {
                        Canvas lockCanvas = surface.lockCanvas(null);
                        lockCanvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, (Paint) null);
                        this.mSurface.unlockCanvasAndPost(lockCanvas);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    }
                } catch (Surface.OutOfResourcesException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class Renderer implements GLSurfaceView.Renderer {
        int height;
        int width;
        long ptr = 0;
        boolean initPending = false;

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            this.width = i;
            this.height = i2;
            this.initPending = true;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }

        public void setOpenGLESDisplay(long j) {
            synchronized (this) {
                long j2 = this.ptr;
                if (j2 != 0 && j != j2) {
                    this.initPending = true;
                }
                this.ptr = j;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                long j = this.ptr;
                if (j == 0) {
                    return;
                }
                if (this.initPending) {
                    OpenGLESDisplay.init(j, this.width, this.height);
                    this.initPending = false;
                }
                OpenGLESDisplay.render(this.ptr);
            }
        }
    }
}
