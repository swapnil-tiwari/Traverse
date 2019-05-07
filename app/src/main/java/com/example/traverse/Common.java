package com.example.traverse;

public class Common {

    private String name;
    private String description;
    private int imageResouceId;

    //drinks is an array
    public static final Common[] places = {
            new Common("Nahargarh Fort","Nice fort",R.drawable.back6),
            new Common("City Palace","Nice fort",R.drawable.exp),
            new Common("Hawa Mahal","Nice fort",R.drawable.back6),
            new Common("Lake Palace","Nice fort",R.drawable.back6)

    };

    public Common(String name,String description, int imageResouceId){
        this.name=name;
        this.description=description;
        this.imageResouceId=imageResouceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResouceId(){
        return imageResouceId;
    }
}
