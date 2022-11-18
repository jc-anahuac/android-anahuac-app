package mx.anahuac.anahuac.models;

import java.util.ArrayList;
import java.util.List;

import mx.anahuac.anahuac.R;

public class UsGallery {

    private int image;
    private String code;

    public void setImage(int image){this.image = image;};

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

    public static List<UsGallery> getUsGallery() {
        List<UsGallery> items = new ArrayList<>();

        UsGallery item1 = new UsGallery();
        item1.setImage(R.drawable.us_gallery_1);
        item1.setCode("nosotros");

        UsGallery item2 = new UsGallery();
        item2.setImage(R.drawable.us_gallery_2);
        item2.setCode("nosotros");

        UsGallery item3 = new UsGallery();
        item3.setImage(R.drawable.us_gallery_3);
        item3.setCode("nosotros");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }
}
