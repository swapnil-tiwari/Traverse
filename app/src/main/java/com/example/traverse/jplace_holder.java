package com.example.traverse;

public class jplace_holder {
    private String name;
    private String placename;
    private int imageResouceId;
    private String mdescription;
    private int starResourceId;

    //drinks is an array
    public static final jplace_holder[] places = {
            new jplace_holder("Nahargarh Fort","Jaipur",R.drawable.ngarh_fort,"Place holder data",R.drawable.star5),
            new jplace_holder("City Palace","Jaipur",R.drawable.city_palace,"Place holder data",R.drawable.star3),
            new jplace_holder("Hawa Mahal","Jaipur",R.drawable.hawa_mahal,"Place holder data",R.drawable.star4),
            new jplace_holder("Lake Palace","Jaipur",R.drawable.jal_mahal,"Place holder data",R.drawable.star4)

    };

    public jplace_holder(String name,String placename, int imageResouceId, String mdescription, int starResourceId){
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
