package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes2.dex */
public class Person {
    IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    String mKey;
    CharSequence mName;
    String mUri;

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public String getKey() {
        return this.mKey;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.mName);
        IconCompat iconCompat = this.mIcon;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.mUri);
        bundle.putString(SignupConstants.Error.DEBUG_FIELD_KEY, this.mKey);
        bundle.putBoolean("isBot", this.mIsBot);
        bundle.putBoolean("isImportant", this.mIsImportant);
        return bundle;
    }

    public android.app.Person toAndroidPerson() {
        return Api28Impl.toAndroidPerson(this);
    }

    public String resolveToLegacyUri() {
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName != null) {
            return "name:" + ((Object) this.mName);
        }
        return "";
    }

    /* loaded from: classes5.dex */
    public static class Builder {
        IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        String mKey;
        CharSequence mName;
        String mUri;

        public Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        public Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        public Builder setKey(String str) {
            this.mKey = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public Builder setUri(String str) {
            this.mUri = str;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    /* loaded from: classes2.dex */
    static class Api28Impl {
        static Person fromAndroidPerson(android.app.Person person) {
            return new Builder().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        static android.app.Person toAndroidPerson(Person person) {
            return new Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? person.getIcon().toIcon() : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }
}
