package com.netflix.mediaclient.service.mdx;

/* loaded from: classes3.dex */
public enum MdxLoginPolicyEnum {
    LoginDisabled(0),
    LoginAndPair(1),
    LoginOnly(2),
    LoginOnlyRequestedByTarget(3),
    LoginAndPairRequestedByTarget(4);
    
    private final int h;

    public int a() {
        return this.h;
    }

    MdxLoginPolicyEnum(int i) {
        this.h = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.h);
    }

    public boolean d(MdxLoginPolicyEnum mdxLoginPolicyEnum) {
        return mdxLoginPolicyEnum != null && mdxLoginPolicyEnum.a() == this.h;
    }

    public static MdxLoginPolicyEnum e(int i) {
        MdxLoginPolicyEnum[] values;
        for (MdxLoginPolicyEnum mdxLoginPolicyEnum : values()) {
            if (mdxLoginPolicyEnum.a() == i) {
                return mdxLoginPolicyEnum;
            }
        }
        return null;
    }
}
