package AimsProject.src.tuan_dt.aims.media;

import java.util.Comparator;
import java.util.Objects;

public abstract class media {
  	public static final Comparator<media> COMPARE_BY_TITLE_COST = new mediaComparatorByTitle()
			.thenComparing(new mediaComparatorByCost());
	public static final Comparator<media> COMPARE_BY_COST_TITLE = new mediaComparatorByCost()
			.thenComparing(new mediaComparatorByTitle());
  private static int total = 0;
  protected int id;
  protected String title;
  protected String category;
  protected float cost;

  public media() {
    this.id = ++total;
  }

  public media(String title) {
    this.title = title;
    this.id = ++total;
  }

  public media(String title, String category, float cost) {
    this(title);
    this.category = category;
    this.cost = cost;
    this.id = ++total;
  }

  public boolean isMatch(String titleToMatch) {
    return this.title.equalsIgnoreCase(titleToMatch);
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getCategory() {
    return category;
  }

  public float getCost() {
    return cost;
  }

  public String getDetails() {
		return String.format("---Book---\nTitle: %s\nCategory: %s\nAuthor(s): %s\nCost: %.2f $\n", title,
				category, String.join(", ", title), cost).replaceAll(" null | 0 ", " Unknown ");
	}

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    media other = (media) obj;
    return Objects.equals(title, other.title);
  }
}
