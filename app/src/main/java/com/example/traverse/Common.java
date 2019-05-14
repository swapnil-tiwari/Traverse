package com.example.traverse;

public class Common {

    private String name;
    private String placename;
    private int imageResouceId;
    private String mdescription;
    private int starResourceId;

    //drinks is an array
    public static final Common[] places = {
            new Common("Nahargarh Fort","Jaipur",R.drawable.ngarh_fort1,"Place holder data",R.drawable.star5),
            new Common("City Palace","Jaipur",R.drawable.city_palace1,"Place holder data",R.drawable.star3),
            new Common("Hawa Mahal","Jaipur",R.drawable.hawa_mahal2,"Place holder data",R.drawable.star4),
            new Common("Lake Palace","Jaipur",R.drawable.jal_mahal2,"Place holder data",R.drawable.star4)

    };

    public Common(String name,String placename, int imageResouceId, String mdescription, int starResourceId){
        this.name=name;
        this.placename=placename;
        this.imageResouceId=imageResouceId;
        this.mdescription=mdescription;
        this.starResourceId=starResourceId;
    }

    public String getPlacename(){
        return placename;
    }

    public String getName(){
        return name;
    }

    public int getImageResouceId(){
        return imageResouceId;
    }

    public String getMdescription(){ return mdescription; }

    public int getStarResourceId(){return starResourceId;}
}
