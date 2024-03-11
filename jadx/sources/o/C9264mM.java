package o;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import o.C9246lv;
import o.C9277mZ;
import o.C9337ng;

/* renamed from: o.mM  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9264mM {
    public static final C9264mM b = new C9264mM();
    private static final C9277mZ.a<Map<String, Object>> d;
    private static final C9277mZ<Map<String, Object>> e;

    private C9264mM() {
    }

    static {
        C9277mZ.a<Map<String, Object>> c = new C9277mZ.a().c(new C9252mA());
        d = c;
        C9277mZ<Map<String, Object>> c9277mZ = new C9277mZ<>(c);
        e = c9277mZ;
        c9277mZ.b(Date.class, new C9337ng.a() { // from class: o.mJ
            @Override // o.C9337ng.a
            public final void b(C9337ng c9337ng, Object obj) {
                C9264mM.a(c9337ng, (Date) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9337ng c9337ng, Date date) {
        if (date == null) {
            return;
        }
        C9302my c9302my = C9302my.d;
        c9337ng.a(C9302my.a(date));
    }

    public final byte[] d(C9246lv.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C9246lv c9246lv = new C9246lv(new PrintWriter(byteArrayOutputStream));
            aVar.toStream(c9246lv);
            dpR dpr = dpR.c;
            C8608drx.a(c9246lv, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C8608drx.a(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }

    public final void e(Object obj, OutputStream outputStream) {
        e.b(obj, outputStream);
    }

    public final Map<? super String, ? extends Object> a(InputStream inputStream) {
        Map<? super String, ? extends Object> map = (Map) e.e(Map.class, inputStream);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException("JSON document is invalid".toString());
    }

    public final Map<? super String, ? extends Object> b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Map<? super String, ? extends Object> a = b.a(fileInputStream);
            C8608drx.a(fileInputStream, null);
            return a;
        } catch (FileNotFoundException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new IOException(C8632dsu.d("Could not deserialize from ", file), e3);
        }
    }

    public final String c(Long l) {
        if (l == null) {
            return null;
        }
        if (l.longValue() >= 0) {
            String format = String.format("0x%x", Arrays.copyOf(new Object[]{l}, 1));
            C8632dsu.a(format, "");
            return format;
        }
        String format2 = String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l.longValue() >>> 8), Long.valueOf(255 & l.longValue())}, 2));
        C8632dsu.a(format2, "");
        return format2;
    }

    public final Long b(Object obj) {
        boolean i;
        long longValue;
        Long valueOf;
        int c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            try {
                valueOf = Long.decode((String) obj);
            } catch (NumberFormatException e2) {
                i = C8691duz.i(str, "0x", false, 2, null);
                if (i) {
                    if (str.length() != 18) {
                        throw e2;
                    }
                    int length = str.length() - 2;
                    String substring = str.substring(0, length);
                    C8632dsu.a(substring, "");
                    long longValue2 = Long.decode(substring).longValue();
                    String substring2 = str.substring(length, str.length());
                    C8632dsu.a(substring2, "");
                    c = C8672dug.c(16);
                    longValue = Long.parseLong(substring2, c) | (longValue2 << 8);
                } else if (str.length() < 19) {
                    throw e2;
                } else {
                    int length2 = str.length() - 3;
                    String substring3 = str.substring(0, length2);
                    C8632dsu.a(substring3, "");
                    String substring4 = str.substring(length2, str.length());
                    C8632dsu.a(substring4, "");
                    longValue = Long.decode(substring4).longValue() + (Long.decode(substring3).longValue() * 1000);
                }
                valueOf = Long.valueOf(longValue);
            }
            return valueOf;
        }
        throw new IllegalArgumentException("Cannot convert " + obj + " to long");
    }
}
