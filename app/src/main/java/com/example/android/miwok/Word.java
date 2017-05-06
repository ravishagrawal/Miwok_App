package com.example.android.miwok;

/**
 * Created by deepak on 3/23/2017.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word (String defaultTranslation, String miwokTranslation, Integer AudioResourceId ) {

        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mAudioResourceId= AudioResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, Integer imageResourceId, Integer AudioResourceId ) {

        mDefaultTranslation= defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageResourceId= imageResourceId;
        mAudioResourceId= AudioResourceId;
    }

    public String getMiwokTranslation () {

        return mMiwokTranslation;
    }

    public String getDefaultTranslation () {

        return mDefaultTranslation;
    }

    public Integer getImageResourceId () {

        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
        }

    public Integer getAudioResourceId () {

        return mAudioResourceId;
    }

}
