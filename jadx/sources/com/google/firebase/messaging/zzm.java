package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzm implements Closeable {
    private final URL zza;
    private Task<Bitmap> zzb;
    private volatile InputStream zzc;

    public static zzm zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zzm(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private zzm(URL url) {
        this.zza = url;
    }

    public final void zza(Executor executor) {
        this.zzb = Tasks.call(executor, new Callable(this) { // from class: com.google.firebase.messaging.zzl
            private final zzm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final Task<Bitmap> zza() {
        return (Task) Preconditions.checkNotNull(this.zzb);
    }

    public final Bitmap zzb() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] zzc = zzc();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzc, 0, zzc.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.zza);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.zza);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(valueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return decodeByteArray;
    }

    private final byte[] zzc() {
        URLConnection openConnection = this.zza.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.zzc = inputStream;
            byte[] zza = com.google.android.gms.internal.firebase_messaging.zzj.zza(com.google.android.gms.internal.firebase_messaging.zzj.zza(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = zza.length;
                String valueOf = String.valueOf(this.zza);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(valueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (zza.length <= 1048576) {
                return zza;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.firebase_messaging.zzm.zza(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            com.google.android.gms.internal.firebase_messaging.zzk.zza(this.zzc);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}
