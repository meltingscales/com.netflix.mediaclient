package com.netflix.ssdp;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C8458dmi;

/* loaded from: classes5.dex */
public class SsdpDevice implements Serializable {
    private static final Pattern c = Pattern.compile(".*MAC=([a-fA-F0-9:-]{17});Timeout=(\\d+).*", 2);
    private final String a;
    private final Map<String, String> b;
    private String d;
    private final String e;
    private int f = 60;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public String a() {
        return this.j;
    }

    public String b() {
        return this.e;
    }

    public Map<String, String> c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.h;
    }

    public int g() {
        return this.f;
    }

    public boolean h() {
        return this.d != null;
    }

    public String i() {
        return this.i;
    }

    public String j() {
        return this.g;
    }

    public SsdpDevice(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        this.a = str;
        this.e = str2;
        this.h = str3;
        this.g = str4;
        this.i = C8458dmi.d(str4);
        this.j = str5;
        this.b = map;
        b(str6);
    }

    private void b(String str) {
        if (str.isEmpty()) {
            return;
        }
        Matcher matcher = c.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            String group = matcher.group(1);
            this.d = group;
            if (group == null || group.length() != 17) {
                this.d = null;
                return;
            }
            String group2 = matcher.group(2);
            if (group2 != null) {
                try {
                    this.f = Integer.parseInt(group2);
                } catch (Exception unused) {
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof SsdpDevice) {
            SsdpDevice ssdpDevice = (SsdpDevice) obj;
            return Objects.equals(ssdpDevice.e(), e()) && Objects.equals(ssdpDevice.b(), b()) && Objects.equals(ssdpDevice.f(), f()) && Objects.equals(ssdpDevice.i(), i()) && Objects.equals(ssdpDevice.j(), j()) && Objects.equals(ssdpDevice.a(), a()) && Objects.equals(ssdpDevice.c(), c());
        }
        return false;
    }

    public String toString() {
        return getClass().getSimpleName() + "{hostName=" + e() + ",location=" + b() + ",server=" + f() + ",usn=" + j() + ",uuid=" + i() + ",searchTarget=" + a() + ",extendedHeaders=" + c() + ",macAddress=" + d() + ",wolTimeout=" + g() + "}";
    }
}
