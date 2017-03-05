package com.lsw.demo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/3/5 0005.
 */

public class ParcelablePerson implements Parcelable {
    private String name;
    private int age;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    public ParcelablePerson(int age,String name) {
        this.name = name;
        this.age = age;
    }

    protected ParcelablePerson(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Creator<ParcelablePerson> CREATOR = new Creator<ParcelablePerson>() {
        @Override
        public ParcelablePerson createFromParcel(Parcel source) {
            return new ParcelablePerson(source);
        }

        @Override
        public ParcelablePerson[] newArray(int size) {
            return new ParcelablePerson[size];
        }
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
