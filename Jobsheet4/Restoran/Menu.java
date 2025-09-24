public class Menu {
    private String menuId;
    private String menuName;
    private int price;
    private String category;
    
    public Menu(String menuId, String menuName, int price, String category) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
        this.category = category;
    }
    public String getMenuId() {
        return menuId;
    }
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}