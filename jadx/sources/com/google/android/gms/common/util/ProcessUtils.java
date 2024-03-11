package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ProcessUtils {
    private static String zza;
    private static int zzb;

    public static String getMyProcessName() {
        String str;
        String str2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (zza == null) {
            if (Build.VERSION.SDK_INT < 28) {
                int i = zzb;
                if (i == 0) {
                    i = Process.myPid();
                    zzb = i;
                }
                String str3 = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        str2 = "/proc/" + i + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        str = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader3.readLine();
                            Preconditions.checkNotNull(readLine);
                            str = readLine.trim();
                        } catch (IOException unused2) {
                            str = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader3;
                            IOUtils.closeQuietly(bufferedReader2);
                            throw th;
                        }
                        bufferedReader = bufferedReader3;
                        IOUtils.closeQuietly(bufferedReader);
                        str3 = str;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                zza = str3;
            } else {
                processName = Application.getProcessName();
                zza = processName;
            }
        }
        return zza;
    }
}
