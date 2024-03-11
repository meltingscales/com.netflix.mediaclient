package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: o.xK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9824xK {
    public static String d(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine + "\n");
                } catch (IOException e) {
                    C9862xw.a("Failed to read: ", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            C9862xw.d(e2, "failed to close inputStream", new Object[0]);
                        }
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        C9862xw.d(e3, "failed to close inputStream", new Object[0]);
                    }
                }
                throw th;
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                C9862xw.d(e4, "failed to close inputStream", new Object[0]);
            }
        }
        return sb.toString();
    }
}
