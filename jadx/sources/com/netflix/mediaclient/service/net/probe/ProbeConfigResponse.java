package com.netflix.mediaclient.service.net.probe;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import o.C8071ddU;

/* loaded from: classes3.dex */
public class ProbeConfigResponse {
    @SerializedName("next")
    private Long a;
    @SerializedName("isolate_pool")
    private boolean b;
    @SerializedName("pulse_delays")
    private Long[] c;
    @SerializedName("logblob")
    private String d;
    @SerializedName("ctx")
    private JsonObject e;
    @SerializedName("pulse_delay")
    private Long f;
    @SerializedName("reqopts")
    private List<c> g;
    @SerializedName("pulse_timeout")
    private Long h;
    @SerializedName("pulses")
    private Integer i;
    private transient String j;
    @SerializedName("urls")

    /* renamed from: o  reason: collision with root package name */
    private List<b> f13208o;

    /* loaded from: classes3.dex */
    public enum RequestOptionsType {
        NONE,
        HEADER,
        URLPARAM,
        BODY
    }

    public JsonObject a() {
        return this.e;
    }

    public String b() {
        String str = this.d;
        return str == null ? "ftlProbe" : str;
    }

    public void c(String str) {
        this.j = str;
    }

    public String j() {
        return this.j;
    }

    public boolean o() {
        return this.b;
    }

    ProbeConfigResponse() {
    }

    public int e() {
        Integer num = this.i;
        if (num == null || num.intValue() < 0) {
            return 0;
        }
        return this.i.intValue();
    }

    public long g() {
        Long l = this.a;
        if (l == null || l.longValue() < 0) {
            return 0L;
        }
        return this.a.longValue();
    }

    public boolean f() {
        return g() > 0;
    }

    public List<b> c() {
        List<b> list = this.f13208o;
        return list == null ? Collections.emptyList() : list;
    }

    public long d() {
        Long l = this.h;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public long d(int i) {
        Long[] lArr = this.c;
        if (lArr != null && i < lArr.length && lArr[i].longValue() >= 0) {
            return this.c[i].longValue();
        }
        Long l = this.f;
        if (l == null || l.longValue() < 0) {
            return 0L;
        }
        return this.f.longValue();
    }

    public List<c> i() {
        List<c> list = this.g;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public long h() {
        try {
            return this.e.getAsJsonPrimitive("ts").getAsLong();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        @SerializedName(SignupConstants.Field.URL)
        private String a;
        @SerializedName("name")
        private String c;

        public String a() {
            return this.a;
        }

        public String c() {
            return this.c;
        }

        public boolean e() {
            Uri parse;
            return (TextUtils.isEmpty(this.a) || (parse = Uri.parse(this.a)) == null || parse.getScheme() == null || parse.getHost() == null) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.service.net.probe.ProbeConfigResponse$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RequestOptionsType.values().length];
            b = iArr;
            try {
                iArr[RequestOptionsType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[RequestOptionsType.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[RequestOptionsType.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[RequestOptionsType.URLPARAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        @SerializedName("type")
        private RequestOptionsType a = RequestOptionsType.NONE;
        @SerializedName("name")
        private String b;
        @SerializedName("value_size")
        private Integer c;
        @SerializedName("value")
        private String e;

        public String c() {
            return this.b;
        }

        private boolean d() {
            Integer num;
            Integer num2;
            RequestOptionsType requestOptionsType = this.a;
            if (requestOptionsType == null) {
                return false;
            }
            int i = AnonymousClass4.b[requestOptionsType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this.e != null || ((num = this.c) != null && num.intValue() >= 0);
                } else if ((i == 3 || i == 4) && this.b != null) {
                    return this.e != null || ((num2 = this.c) != null && num2.intValue() >= 0);
                } else {
                    return false;
                }
            }
            return true;
        }

        public RequestOptionsType e() {
            return !d() ? RequestOptionsType.NONE : this.a;
        }

        public String a() {
            String str;
            Integer num;
            synchronized (this) {
                if (this.e == null && (num = this.c) != null && num.intValue() > 0) {
                    byte[] bArr = new byte[this.c.intValue()];
                    new Random().nextBytes(bArr);
                    try {
                        this.e = C8071ddU.e(bArr, 16).substring(0, this.c.intValue());
                    } catch (IOException unused) {
                    }
                }
                str = this.e;
                if (str == null) {
                    str = "";
                }
            }
            return str;
        }
    }
}
