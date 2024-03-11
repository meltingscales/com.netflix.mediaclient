package org.linphone.mediastream.video.capture;

import android.hardware.Camera;
import android.view.SurfaceView;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Iterator;
import java.util.List;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.Version;
import org.linphone.mediastream.video.capture.hwconf.AndroidCameraConfiguration;

/* loaded from: classes6.dex */
public class AndroidVideoApi5JniWrapper {
    public static boolean isRecording = false;

    public static native void putImage(long j, byte[] bArr);

    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        Log.d("detectCameras\n");
        AndroidCameraConfiguration.AndroidCamera[] retrieveCameras = AndroidCameraConfiguration.retrieveCameras();
        int length = retrieveCameras.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AndroidCameraConfiguration.AndroidCamera androidCamera = retrieveCameras[i];
            if (i2 == 2) {
                Log.w("Returning only the 2 first cameras (increase buffer size to retrieve all)");
                break;
            }
            iArr[i2] = androidCamera.id;
            iArr2[i2] = androidCamera.frontFacing ? 1 : 0;
            iArr3[i2] = androidCamera.orientation;
            i2++;
            i++;
        }
        return i2;
    }

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        Log.d("mediastreamer", "selectNearestResolutionAvailable: " + i + ", " + i2 + InteractiveAnimation.ANIMATION_TYPE.X + i3);
        return selectNearestResolutionAvailableForCamera(i, i2, i3);
    }

    public static void activateAutoFocus(Object obj) {
        Log.d("mediastreamer", "Turning on autofocus on camera " + obj);
        Camera camera = (Camera) obj;
        if (camera != null) {
            if (camera.getParameters().getFocusMode() == "auto" || camera.getParameters().getFocusMode() == "macro") {
                camera.autoFocus(null);
            }
        }
    }

    public static Object startRecording(int i, int i2, int i3, int i4, int i5, final long j) {
        Log.d("mediastreamer", "startRecording(" + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + j + ")");
        Camera open = Camera.open();
        applyCameraParameters(open, i2, i3, i4);
        open.setPreviewCallback(new Camera.PreviewCallback() { // from class: org.linphone.mediastream.video.capture.AndroidVideoApi5JniWrapper.1
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (AndroidVideoApi5JniWrapper.isRecording) {
                    AndroidVideoApi5JniWrapper.putImage(j, bArr);
                }
            }
        });
        open.startPreview();
        isRecording = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Returning camera object: ");
        sb.append(open);
        Log.d("mediastreamer", sb.toString());
        return open;
    }

    public static void stopRecording(Object obj) {
        isRecording = false;
        Log.d("mediastreamer", "stopRecording(" + obj + ")");
        Camera camera = (Camera) obj;
        if (camera != null) {
            camera.setPreviewCallback(null);
            camera.stopPreview();
            camera.release();
            return;
        }
        Log.i("mediastreamer", "Cannot stop recording ('camera' is null)");
    }

    public static void setPreviewDisplaySurface(Object obj, Object obj2) {
        Log.d("mediastreamer", "setPreviewDisplaySurface(" + obj + ", " + obj2 + ")");
        try {
            ((Camera) obj).setPreviewDisplay(((SurfaceView) obj2).getHolder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int[] selectNearestResolutionAvailableForCamera(int i, int i2, int i3) {
        AndroidCameraConfiguration.AndroidCamera[] retrieveCameras;
        int i4 = i2;
        int i5 = i3;
        if (i5 <= i4) {
            i5 = i4;
            i4 = i5;
        }
        List<AndroidCameraConfiguration.AndroidCamera.Size> list = null;
        for (AndroidCameraConfiguration.AndroidCamera androidCamera : AndroidCameraConfiguration.retrieveCameras()) {
            if (androidCamera.id == i) {
                list = androidCamera.resolutions;
            }
        }
        if (list == null) {
            Log.e("mediastreamer", "Failed to retrieve supported resolutions.");
            return null;
        }
        Log.i("mediastreamer", list.size() + " supported resolutions :");
        for (AndroidCameraConfiguration.AndroidCamera.Size size : list) {
            Log.i("mediastreamer", "\t" + size.width + InteractiveAnimation.ANIMATION_TYPE.X + size.height);
        }
        int max = Math.max(i5, i4);
        int min = Math.min(i5, i4);
        try {
            AndroidCameraConfiguration.AndroidCamera.Size size2 = list.get(0);
            int i6 = max * min;
            Iterator<AndroidCameraConfiguration.AndroidCamera.Size> it = list.iterator();
            int i7 = Integer.MAX_VALUE;
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AndroidCameraConfiguration.AndroidCamera.Size next = it.next();
                int i9 = next.width;
                int i10 = next.height;
                int i11 = i9 * i10;
                int i12 = (i6 - i11) * (-1);
                if (((i9 >= max && i10 >= min) || (i9 >= min && i10 >= max)) && i12 < i7) {
                    i7 = i12;
                    i8 = 0;
                    size2 = next;
                }
                int i13 = (i6 - (i11 / 4)) * (-1);
                if (((i9 / 2 >= max && i10 / 2 >= min) || (i9 / 2 >= min && i10 / 2 >= max)) && i13 < i7) {
                    if (Version.hasFastCpuWithAsmOptim()) {
                        i7 = i13;
                        size2 = next;
                        i8 = 1;
                    } else {
                        i8 = 0;
                        size2 = next;
                    }
                }
                if (next.width == max && next.height == min) {
                    i8 = 0;
                    size2 = next;
                    break;
                }
            }
            int[] iArr = {size2.width, size2.height, i8};
            Log.i("mediastreamer", "resolution selection done (" + iArr[0] + ", " + iArr[1] + ", " + iArr[2] + ")");
            return iArr;
        } catch (Exception e) {
            Log.e(e, "mediastreamer", " resolution selection failed");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void applyCameraParameters(Camera camera, int i, int i2, int i3) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewSize(i, i2);
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates != null) {
            int i4 = Integer.MAX_VALUE;
            for (Integer num : supportedPreviewFrameRates) {
                int abs = Math.abs(num.intValue() - i3);
                if (abs < i4) {
                    parameters.setPreviewFrameRate(num.intValue());
                    i4 = abs;
                }
            }
            Log.d("mediastreamer", "Preview framerate set:" + parameters.getPreviewFrameRate());
        }
        camera.setParameters(parameters);
    }
}
