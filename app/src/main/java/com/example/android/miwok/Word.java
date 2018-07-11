package com.example.android.miwok;

public class Word {

   private String mMiwokTranslation;
   private String mDefaultTranslation;
   private int mImageResourceId = NO_IMAGE_PROVIDED;
   private int mAudioResourceId;

   private static  final  int NO_IMAGE_PROVIDED = -1;


    //Constructor
    public Word(String defaultTranslation, String miwokTranslation, int mAudioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;

   }

   public String getMiwokTranslation(){
        return mMiwokTranslation;
   }

    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public  boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

}




