package androidx.media3.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
public final class GlUtil {
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {12445, 13120, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    /* loaded from: classes2.dex */
    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        int i = Util.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                return Api17.isExtensionSupported("EGL_EXT_protected_content");
            }
            return false;
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return Util.SDK_INT >= 17 && Api17.isExtensionSupported("EGL_KHR_surfaceless_context");
    }

    public static void checkGlError() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i2, i3);
        checkGlError();
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    private static FloatBuffer createBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int createExternalTexture() {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture);
        return generateTexture;
    }

    private static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static void bindTexture(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        checkGlError();
        GLES20.glTexParameteri(i, 10240, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10241, 9729);
        checkGlError();
        GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static void checkGlException(boolean z, String str) {
        if (!z) {
            throw new GlException(str);
        }
    }

    /* loaded from: classes2.dex */
    static final class Api17 {
        public static EGLDisplay getDefaultEglDisplay() {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.checkGlException(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            GlUtil.checkGlException(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            GlUtil.checkGlError();
            return eglGetDisplay;
        }

        public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
            if (eglCreateContext == null) {
                EGL14.eglTerminate(eGLDisplay);
                throw new GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
            }
            GlUtil.checkGlError();
            return eglCreateContext;
        }

        public static EGLContext getCurrentContext() {
            return EGL14.eglGetCurrentContext();
        }

        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }

        public static boolean isExtensionSupported(String str) {
            String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }

        public static int getContextMajorVersion() {
            int[] iArr = new int[1];
            EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
            GlUtil.checkGlError();
            return iArr[0];
        }

        public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
            checkEglException("Error creating a new EGL surface");
            return eglCreateWindowSurface;
        }

        public static EGLSurface createEglPbufferSurface(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), iArr2, 0);
            checkEglException("Error creating a new EGL Pbuffer surface");
            return eglCreatePbufferSurface;
        }

        public static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2, int i3) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            checkEglException("Error making context current");
            GlUtil.focusFramebufferUsingCurrentContext(i, i2, i3);
        }

        public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            checkEglException("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                checkEglException("Error destroying context");
            }
            EGL14.eglReleaseThread();
            checkEglException("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            checkEglException("Error terminating display");
        }

        public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (eGLDisplay == null || eGLSurface == null) {
                return;
            }
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            checkEglException("Error destroying surface");
        }

        public static void checkEglException(String str) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                return;
            }
            throw new GlException(str + ", error code: 0x" + Integer.toHexString(eglGetError));
        }
    }
}
