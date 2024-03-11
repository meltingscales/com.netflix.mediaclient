package org.linphone.mediastream.video.capture;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import org.linphone.mediastream.Log;

/* loaded from: classes6.dex */
public class AndroidVideoApi8JniWrapper {
    public static int detectCameras(int[] iArr, int[] iArr2, int[] iArr3) {
        return AndroidVideoApi5JniWrapper.detectCameras(iArr, iArr2, iArr3);
    }

    public static int[] selectNearestResolutionAvailable(int i, int i2, int i3) {
        return AndroidVideoApi5JniWrapper.selectNearestResolutionAvailable(i, i2, i3);
    }

    public static Object startRecording(int i, int i2, int i3, int i4, int i5, final long j) {
        Log.d("startRecording(" + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ", " + j + ")");
        Camera open = Camera.open();
        AndroidVideoApi5JniWrapper.applyCameraParameters(open, i2, i3, i4);
        int bitsPerPixel = ((i2 * i3) * ImageFormat.getBitsPerPixel(open.getParameters().getPreviewFormat())) / 8;
        open.addCallbackBuffer(new byte[bitsPerPixel]);
        open.addCallbackBuffer(new byte[bitsPerPixel]);
        open.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: org.linphone.mediastream.video.capture.AndroidVideoApi8JniWrapper.1
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (AndroidVideoApi5JniWrapper.isRecording) {
                    AndroidVideoApi5JniWrapper.putImage(j, bArr);
                    camera.addCallbackBuffer(bArr);
                }
            }
        });
        open.startPreview();
        AndroidVideoApi5JniWrapper.isRecording = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Returning camera object: ");
        sb.append(open);
        Log.d(sb.toString());
        return open;
    }

    public static void stopRecording(Object obj) {
        AndroidVideoApi5JniWrapper.isRecording = false;
        Log.d("stopRecording(" + obj + ")");
        Camera camera = (Camera) obj;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
            camera.stopPreview();
            camera.release();
            return;
        }
        Log.i("Cannot stop recording ('camera' is null)");
    }

    public static void setPreviewDisplaySurface(Object obj, Object obj2) {
        AndroidVideoApi5JniWrapper.setPreviewDisplaySurface(obj, obj2);
    }
}
