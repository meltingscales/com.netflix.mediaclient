package com.netflix.model.leafs.social;

/* renamed from: com.netflix.model.leafs.social.$$AutoValue_FriendProfile  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_FriendProfile extends FriendProfile {
    private final String bigImageUrl;
    private final String firstName;
    private final String id;
    private final String imageUrl;
    private final String lastName;

    @Override // com.netflix.model.leafs.social.FriendProfile
    public String bigImageUrl() {
        return this.bigImageUrl;
    }

    @Override // com.netflix.model.leafs.social.FriendProfile
    public String firstName() {
        return this.firstName;
    }

    @Override // com.netflix.model.leafs.social.FriendProfile
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.social.FriendProfile
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.netflix.model.leafs.social.FriendProfile
    public String lastName() {
        return this.lastName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_FriendProfile(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null firstName");
        }
        this.firstName = str2;
        if (str3 == null) {
            throw new NullPointerException("Null lastName");
        }
        this.lastName = str3;
        if (str4 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.imageUrl = str4;
        if (str5 == null) {
            throw new NullPointerException("Null bigImageUrl");
        }
        this.bigImageUrl = str5;
    }

    public String toString() {
        return "FriendProfile{id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", imageUrl=" + this.imageUrl + ", bigImageUrl=" + this.bigImageUrl + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendProfile) {
            FriendProfile friendProfile = (FriendProfile) obj;
            return this.id.equals(friendProfile.id()) && this.firstName.equals(friendProfile.firstName()) && this.lastName.equals(friendProfile.lastName()) && this.imageUrl.equals(friendProfile.imageUrl()) && this.bigImageUrl.equals(friendProfile.bigImageUrl());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.firstName.hashCode();
        int hashCode3 = this.lastName.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.bigImageUrl.hashCode();
    }
}
