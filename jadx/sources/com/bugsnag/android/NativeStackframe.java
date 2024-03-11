package com.bugsnag.android;

import com.netflix.android.org.json.zip.JSONzip;
import o.C8627dsp;
import o.C9246lv;
import o.C9264mM;

/* loaded from: classes5.dex */
public final class NativeStackframe implements C9246lv.a {
    private String codeIdentifier;
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    public final String getFile() {
        return this.file;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final Boolean isPC() {
        return this.isPC;
    }

    public final void setCodeIdentifier(String str) {
        this.codeIdentifier = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setFrameAddress(Long l) {
        this.frameAddress = l;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(Long l) {
        this.loadAddress = l;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(Long l) {
        this.symbolAddress = l;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    public NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l;
        this.symbolAddress = l2;
        this.loadAddress = l3;
        this.isPC = bool;
        this.type = errorType;
        this.codeIdentifier = str3;
    }

    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3, int i, C8627dsp c8627dsp) {
        this(str, str2, number, l, l2, l3, bool, (i & 128) != 0 ? null : errorType, (i & JSONzip.end) != 0 ? null : str3);
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("method").e(this.method);
        c9246lv.c("file").e(this.file);
        c9246lv.c("lineNumber").a(this.lineNumber);
        Long l = this.frameAddress;
        if (l != null) {
            l.longValue();
            c9246lv.c("frameAddress").e(C9264mM.b.c(getFrameAddress()));
        }
        Long l2 = this.symbolAddress;
        if (l2 != null) {
            l2.longValue();
            c9246lv.c("symbolAddress").e(C9264mM.b.c(getSymbolAddress()));
        }
        Long l3 = this.loadAddress;
        if (l3 != null) {
            l3.longValue();
            c9246lv.c("loadAddress").e(C9264mM.b.c(getLoadAddress()));
        }
        c9246lv.c("codeIdentifier").e(this.codeIdentifier);
        c9246lv.c("isPC").b(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            c9246lv.c("type").e(errorType.getDesc$bugsnag_android_core_release());
        }
        c9246lv.d();
    }
}
