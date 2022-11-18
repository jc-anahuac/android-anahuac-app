package mx.anahuac.anahuac.models;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;

public class TimelineGallery {

    private int image;
    private String code;

    public void setImage(int image){this.image = image;}

    public void setCode(String code) {
        this.code = code;
    }

    public int getImage() {
        return image;
    }

    public String getCode() {
        return code;
    }

    public static List<TimelineGallery> getTimelineGallery(){
        List<TimelineGallery> items = new ArrayList<>();

        TimelineGallery item1 = new TimelineGallery();
        item1.setImage(R.drawable.norte_1964);
        item1.setCode("1964 Norte");

        TimelineGallery item2 = new TimelineGallery();
        item2.setImage(R.drawable.tamaulipas_1974);
        item2.setCode("1974 Tamaulipas");

        TimelineGallery item3 = new TimelineGallery();
        item3.setImage(R.drawable.sur_1981);
        item3.setCode("1981 Sur");

        TimelineGallery item4 = new TimelineGallery();
        item4.setImage(R.drawable.mayab_1984);
        item4.setCode("1984 Mayab");

        TimelineGallery item5 = new TimelineGallery();
        item5.setImage(R.drawable.juanpablo_1992);
        item5.setCode("1992 Juan Pablo II");

        TimelineGallery item6 = new TimelineGallery();
        item6.setImage(R.drawable.veracruz_1993);
        item6.setCode("1993 Veracruz");

        TimelineGallery item7 = new TimelineGallery();
        item7.setImage(R.drawable.cancun_2000);
        item7.setCode("2000 Cancún");

        TimelineGallery item8 = new TimelineGallery();
        item8.setImage(R.drawable.oaxaca_2000);
        item8.setCode("2000 Oaxaca");

        TimelineGallery item9 = new TimelineGallery();
        item9.setImage(R.drawable.puebla_2003);
        item9.setCode("2003 Puebla");

        TimelineGallery item10 = new TimelineGallery();
        item10.setImage(R.drawable.queretaro_2005);
        item10.setCode("2005 Querétaro");

        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        items.add(item9);
        items.add(item10);


        return items;

    }
}
