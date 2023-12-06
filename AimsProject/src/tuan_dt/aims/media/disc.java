package AimsProject.src.tuan_dt.aims.media;

public abstract class disc extends media{
  protected int length;
  protected String director;

  public disc() {
    super();
  }

  public disc(String title) {
    super(title);
  }

  public disc(String title, String category, float cost){
    super(title, category, cost);
  }

  public disc(String title, String category, String director, float cost ) {
    super(title, category, cost);
    this.director = director;
  }

  public disc(String title, String category, String director, int length, float cost) {
    super(title, category, cost);
    this.director = director;
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public String getDirector() {
    return director;
  }
}
