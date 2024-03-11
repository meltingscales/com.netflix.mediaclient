package o;

import android.view.TextureView;
import com.netflix.mediaclient.api.res.AssetType;
import o.bDC;

/* renamed from: o.cdL  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6437cdL extends bDC {
    public C6437cdL(TextureView textureView, boolean z, int i, float f, AssetType assetType, bDC.c cVar) {
        super(textureView, z, i, f, assetType, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    @Override // o.bDC, android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r9, int r10, int r11) {
        /*
            r8 = this;
            android.view.Surface r0 = new android.view.Surface
            r0.<init>(r9)
            r8.h = r0
            r9 = 1
            r8.f = r9
            java.lang.String r9 = r8.c
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L87
            java.io.File r9 = new java.io.File
            java.lang.String r0 = r8.c
            r9.<init>(r0)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            r1.<init>(r9)     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            java.io.FileDescriptor r3 = r1.getFD()     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            android.media.MediaMetadataRetriever r9 = new android.media.MediaMetadataRetriever     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            r9.<init>()     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            long r4 = r8.e     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            long r6 = r8.b     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            r2 = r9
            r2.setDataSource(r3, r4, r6)     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            r2 = 19
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.IllegalStateException -> L4e java.io.IOException -> L50
            r3 = 18
            java.lang.String r9 = r9.extractMetadata(r3)     // Catch: java.lang.IllegalStateException -> L48 java.io.IOException -> L4a
            float r0 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.IllegalStateException -> L48 java.io.IOException -> L4a
            r1.close()     // Catch: java.lang.IllegalStateException -> L48 java.io.IOException -> L4a
            goto L66
        L48:
            r9 = move-exception
            goto L4b
        L4a:
            r9 = move-exception
        L4b:
            r1 = r0
            r0 = r2
            goto L52
        L4e:
            r9 = move-exception
            goto L51
        L50:
            r9 = move-exception
        L51:
            r1 = r0
        L52:
            o.aHd r2 = new o.aHd
            java.lang.String r3 = "SPY-9199 Failed to retrieve MediaMetadata"
            r2.<init>(r3)
            r3 = 0
            o.aHd r2 = r2.b(r3)
            o.InterfaceC1598aHf.a(r2)
            r9.printStackTrace()
            r2 = r0
            r0 = r1
        L66:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r10 <= r11) goto L70
            float r1 = (float) r10
            float r1 = r1 / r0
            float r11 = (float) r11
            float r11 = r11 / r2
            float r1 = r1 / r11
            goto L71
        L70:
            r1 = r9
        L71:
            int r10 = r10 / 2
            r11 = 1053609165(0x3ecccccd, float:0.4)
            float r2 = r2 * r11
            int r11 = (int) r2
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            float r10 = (float) r10
            float r11 = (float) r11
            r0.setScale(r9, r1, r10, r11)
            android.view.TextureView r9 = r8.d
            r9.setTransform(r0)
        L87:
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6437cdL.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }
}
