package spinnersCustom;

public class SpinnerData {

  private int icon;
  private String iconName;

  public SpinnerData(int icon, String iconName) {
    this.icon = icon;
    this.iconName = iconName;
  }

  public int getIcon() {
    return icon;
  }

  public void setIcon(int icon) {
    this.icon = icon;
  }

  public String getIconName() {
    return iconName;
  }

  public void setIconName(String iconName) {
    this.iconName = iconName;
  }

  @Override
  public String toString() {
    return "SpinnerData{" +
        "icon=" + icon +
        ", iconName='" + iconName + '\'' +
        '}';
  }
}
