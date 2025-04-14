package th.hentsun.damviettrong_63135896_tgk;

public class Item {
    private String title;
    private int imageResId; // Hình ảnh dạng resource ID

    public Item(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
