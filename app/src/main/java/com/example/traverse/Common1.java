package com.example.traverse;

public class Common1 {

    private String name;
    private int mImageResourceId;
    private String mMemory;

    public Common1(String name, int imageResouceId) {
        this.name = name;
        this.mImageResourceId = imageResouceId;
    }

    public Common1(String name, String memory){
        this.name=name;
        this.mMemory=memory;
    }

    public String getName() {
        return name;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmMemory(){
        return mMemory;
    }

}


