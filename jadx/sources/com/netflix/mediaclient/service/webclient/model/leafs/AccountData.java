package com.netflix.mediaclient.service.webclient.model.leafs;

import java.util.List;
import o.InterfaceC5282bvn;
import o.InterfaceC5283bvo;

/* loaded from: classes4.dex */
public class AccountData {
    private String rawResponse;
    private InterfaceC5282bvn userAccount;
    private List<InterfaceC5283bvo> userProfiles;

    public String getRawResponse() {
        return this.rawResponse;
    }

    public InterfaceC5282bvn getUserAccount() {
        return this.userAccount;
    }

    public List<InterfaceC5283bvo> getUserProfiles() {
        return this.userProfiles;
    }

    public void setUserAccount(InterfaceC5282bvn interfaceC5282bvn) {
        this.userAccount = interfaceC5282bvn;
    }

    public void setUserProfiles(List<InterfaceC5283bvo> list) {
        this.userProfiles = list;
    }

    public AccountData(List<InterfaceC5283bvo> list, String str) {
        this.userProfiles = list;
        this.rawResponse = str;
    }

    public InterfaceC5283bvo getPrimaryProfile() {
        List<InterfaceC5283bvo> list = this.userProfiles;
        if (list == null || list.size() < 1) {
            return null;
        }
        for (InterfaceC5283bvo interfaceC5283bvo : this.userProfiles) {
            if (interfaceC5283bvo != null && interfaceC5283bvo.isPrimaryProfile()) {
                return interfaceC5283bvo;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountData{ userAccount= ");
        sb.append(this.userAccount);
        sb.append(", userProfiles= [");
        List<InterfaceC5283bvo> list = this.userProfiles;
        if (list != null) {
            boolean z = true;
            for (InterfaceC5283bvo interfaceC5283bvo : list) {
                if (z) {
                    z = !z;
                } else {
                    sb.append(", ");
                }
                sb.append(interfaceC5283bvo.toLoggingString());
            }
        }
        sb.append("], rawResponse= ");
        String str = this.rawResponse;
        if (str != null) {
            sb.append(str);
        } else {
            sb.append("null");
        }
        sb.append("}");
        return sb.toString();
    }
}
